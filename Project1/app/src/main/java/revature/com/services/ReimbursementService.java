package revature.com.services;

import revature.com.dao.IReimbursementDao;
import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;

import java.util.List;

public class ReimbursementService {
    private IReimbursementDao rd;

    public ReimbursementService(IReimbursementDao rd){
        this.rd = rd;
    }

    // For employees
    public void submitReimbursementRequest(SubmitReimbursement request){
        rd.submitReimbursementRequest(request);
    }

    public Reimbursement viewPendingReimbursement(){
        return rd.viewPendingReimbursement();
    }

    public Reimbursement viewResolvedReimbursement(){
        return rd.viewResolvedReimbursement();
    }


    // For manager
    public void approveReimbursement(){
        rd.approveReimbursement();
    }

    public List<Reimbursement> viewAllPendingRequests(){
        return rd.viewAllPendingRequests();
    }

    public List<Reimbursement> viewAllResolvedRequests(){
        return rd.viewAllResolvedRequests();
    }
    // Method to view reimbursement requests of a specific employee
    public List<Reimbursement> viewAllSpecificRequests (){
        return rd.viewAllSpecificRequests();
    }



}
