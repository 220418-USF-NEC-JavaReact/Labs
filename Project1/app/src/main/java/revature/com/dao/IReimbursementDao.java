package revature.com.dao;
// Coding by Bok-Man Victor Siu
import revature.com.models.ApproveOrDenyReimbursement;
import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;
import revature.com.utils.ConnectionSingleton;

import java.sql.Connection;
import java.util.List;

public interface IReimbursementDao {

    public void submitReimbursementRequest(SubmitReimbursement request);

    public List<Reimbursement> viewPendingReimbursement(int userId);

    public List<Reimbursement> viewResolvedReimbursement(int userId);


    // For manager
    public void approveReimbursement(int userId, ApproveOrDenyReimbursement approveOrDenyRequest);

    public List<Reimbursement> viewAllPendingRequests();

    public List<Reimbursement> viewAllResolvedRequests();

    public List<Reimbursement> viewAllSpecificRequests (int searchUserId);

}