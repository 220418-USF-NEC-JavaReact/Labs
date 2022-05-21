package revature.com.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import revature.com.models.ApproveOrDenyReimbursement;
import revature.com.models.EnterUserId;
import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;
import revature.com.services.ReimbursementService;

import io.javalin.http.Handler;
import java.util.List;




public class ReimbursementController {

    private ReimbursementService rs;

    private ObjectMapper om;

    public ReimbursementController(ReimbursementService rs){

        this.rs = rs;

        this.om = new ObjectMapper();
    }

    public Handler handlerReimbursementRequest = (ctx) -> {

        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login to submit request");
        } else {
            SubmitReimbursement request = om.readValue(ctx.body(), SubmitReimbursement.class);
            // Setting author user id before sending request

            String userId = (String) ctx.req.getSession().getAttribute("id");
            int userIdNum = Integer.parseInt(userId);
            request.setReimbursementAuthor(userIdNum);

            rs.submitReimbursementRequest(request);
            ctx.result("Your request has been submitted. ");
        }

    };

    public Handler handlerViewPendingReimbursement = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login to submit request");
        } else {
            String username = (String) ctx.req.getSession().getAttribute("username");
            String userId = (String) ctx.req.getSession().getAttribute("id");
            int userIdNum = Integer.parseInt(userId);
            ctx.result(om.writeValueAsString(rs.viewPendingReimbursement(userIdNum)));

        }
    };
    public Handler handlerViewResolvedReimbursement = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login to submit request");
        } else {
            String userId = (String) ctx.req.getSession().getAttribute("id");
            int userIdNum = Integer.parseInt(userId);


            ctx.result(om.writeValueAsString(rs.viewResolvedReimbursement(userIdNum)));

        }
    };

    // Handles For manager
    public Handler handlerApproveReimbursement = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login to submit request");
        } else {
            if (ctx.req.getSession().getAttribute("manager") == null){
                ctx.status(401);
                ctx.result("You must be manager. ");
            } else {
                // If manager

                String userId = (String) ctx.req.getSession().getAttribute("id");
                int userIdNum = Integer.parseInt(userId);


                ApproveOrDenyReimbursement approveOrDenyRequest = om.readValue(ctx.body(), ApproveOrDenyReimbursement.class);
                if (approveOrDenyRequest.getApproveOrDeny() == 2){

                    rs.approveReimbursement(userIdNum, approveOrDenyRequest);
                    ctx.result("The request has been approved. ");
                } else if(approveOrDenyRequest.getApproveOrDeny() == 3){
                    rs.approveReimbursement(userIdNum, approveOrDenyRequest);
                    ctx.result("The request has been deny. ");
                } else {
                    ctx.result("Wrong number to approve/deny request. ");
                }

            }

        }
    };
    public Handler handlerViewAllPendingRequests = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login to submit request");
        } else {
            if (ctx.req.getSession().getAttribute("manager") == null){
                ctx.status(401);
                ctx.result("You must be manager. ");
            } else {
                ctx.result(om.writeValueAsString(rs.viewAllPendingRequests()));

            }
        }
    };

    public Handler handlerViewAllResolvedRequests = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login to submit request");
        } else {
            if (ctx.req.getSession().getAttribute("manager") == null){
                ctx.status(401);
                ctx.result("You must be manager. ");
            } else {
                ctx.result(om.writeValueAsString(rs.viewAllResolvedRequests()));
            }
        }
    };
    public Handler handlerViewAllSpecificRequests = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login to submit request");
        } else {
            if (ctx.req.getSession().getAttribute("manager") == null){
                ctx.status(401);
                ctx.result("You must be manager. ");
            } else {
                // If manager
                EnterUserId getUserId = om.readValue(ctx.body(), EnterUserId.class);
                int searchUserId = getUserId.getUserId();
                ctx.result(om.writeValueAsString(rs.viewAllSpecificRequests(searchUserId)));
            }
        }
    };




}
