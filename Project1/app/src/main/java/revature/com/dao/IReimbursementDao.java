package revature.com.dao;

import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;
import revature.com.utils.ConnectionSingleton;

import java.sql.Connection;
import java.util.List;

public interface IReimbursementDao {

    public void submitReimbursementRequest(SubmitReimbursement request);

    public Reimbursement viewPendingReimbursement();

    public Reimbursement viewResolvedReimbursement();


    // For manager
    public void approveReimbursement();

    public List<Reimbursement> viewAllPendingRequests();

    public List<Reimbursement> viewAllResolvedRequests();

    public List<Reimbursement> viewAllSpecificRequests ();

}