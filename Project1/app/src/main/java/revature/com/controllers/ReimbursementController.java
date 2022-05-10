package revature.com.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
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
            rs.submitReimbursementRequest(request);
            ctx.result("You must login to submit request");
        }

    };




}
