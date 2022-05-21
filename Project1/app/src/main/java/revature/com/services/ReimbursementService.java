package revature.com.services;
// Coding by Bok-Man Victor Siu
import revature.com.dao.IReimbursementDao;
import revature.com.models.ApproveOrDenyReimbursement;
import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class ReimbursementService {
    private IReimbursementDao rd;

    public ReimbursementService(IReimbursementDao rd){
        this.rd = rd;
    }

    // For employees
    public void submitReimbursementRequest(SubmitReimbursement request){
        Date today = new Date(Instant.now().toEpochMilli());
        request.setSubmittedDate(today);
        // 1 is pending status
        request.setReimbursementStatus(1);
        rd.submitReimbursementRequest(request);
    }

    public List<Reimbursement> viewPendingReimbursement(int userId){
        return rd.viewPendingReimbursement(userId);
    }

    public List<Reimbursement> viewResolvedReimbursement(int userId){
        return rd.viewResolvedReimbursement(userId);
    }


    // For manager
    public void approveReimbursement(int userId, ApproveOrDenyReimbursement approveOrDenyRequest){
        rd.approveReimbursement(userId, approveOrDenyRequest);
    }

    public List<Reimbursement> viewAllPendingRequests(){
        return rd.viewAllPendingRequests();
    }

    public List<Reimbursement> viewAllResolvedRequests(){
        return rd.viewAllResolvedRequests();
    }
    // Method to view reimbursement requests of a specific employee
    public List<Reimbursement> viewAllSpecificRequests (int searchUserId){
        return rd.viewAllSpecificRequests(searchUserId);
    }



}
