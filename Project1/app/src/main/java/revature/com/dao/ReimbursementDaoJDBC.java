package revature.com.dao;
// Coding by Bok-Man Victor Siu
import revature.com.models.ApproveOrDenyReimbursement;
import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;
import revature.com.utils.ConnectionSingleton;

import java.sql.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ReimbursementDaoJDBC implements IReimbursementDao{
    private ConnectionSingleton cs = ConnectionSingleton.getConnectionSingleton();

    Connection c = cs.getConnection();


    @Override
    public void submitReimbursementRequest(SubmitReimbursement request) {
        Connection c = cs.getConnection();

        String sql = "insert into reimbursement(amount, submitted_date, description, reimbursement_author, reimbursement_status, reimbursement_type) values " +
                "('" + request.getAmount() +"','" + request.getSubmittedDate() +"','" + request.getDescription() +"','"  + request.getReimbursementAuthor() + "','" + request.getReimbursementStatus() + "','" + request.getReimbursementType() +"')";

        try {
            Statement s = c.createStatement();
            s.execute(sql);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Reimbursement> viewPendingReimbursement(int userId) {
        Connection c = cs.getConnection();

        String sql = "select * from reimbursement where reimbursement_author = ? and reimbursement_status = 1 ";


        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            List<Reimbursement> pendingReimbursementList = new ArrayList<>();
            while (rs.next()){
                Reimbursement viewPending = new Reimbursement(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getString(5), rs.getInt(6), rs.getInt(8), rs.getInt(9));
                pendingReimbursementList.add(viewPending);
            }


            return pendingReimbursementList;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Reimbursement> viewResolvedReimbursement(int userId) {
        Connection c = cs.getConnection();

        String sql = "select * from reimbursement where reimbursement_author = ? and (reimbursement_status = 2 or reimbursement_status = 3) ";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.execute();
            ResultSet rs = ps.getResultSet();



            List<Reimbursement> resolvedReimbursementList = new ArrayList<>();
            while (rs.next()){
                Reimbursement viewResolved = new Reimbursement(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                resolvedReimbursementList.add(viewResolved);
            }
            return resolvedReimbursementList;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void approveReimbursement(int userId, ApproveOrDenyReimbursement approveOrDenyRequest) {
        Connection c = cs.getConnection();


        String sql = "UPDATE reimbursement SET resolved_date = ?, reimbursement_resolver = ?, reimbursement_status = ?  WHERE reimbursement_id = ?";



        try {
            Date today = new Date(Instant.now().toEpochMilli());

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setDate(1, today);
            ps.setInt(2, userId);
            ps.setInt(3, approveOrDenyRequest.getApproveOrDeny());
            ps.setInt(4, approveOrDenyRequest.getReimbursementId());
            ps.execute();



        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Reimbursement> viewAllPendingRequests() {
        Connection c = cs.getConnection();

        String sql = "select * from reimbursement where reimbursement_status = 1";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            List<Reimbursement> pendingReimbursementList = new ArrayList<>();
            while (rs.next()){
                Reimbursement viewPending = new Reimbursement(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                pendingReimbursementList.add(viewPending);
            }
            return pendingReimbursementList;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Reimbursement> viewAllResolvedRequests() {
        Connection c = cs.getConnection();

        String sql = "select * from reimbursement where (reimbursement_status = 2 or reimbursement_status = 3)";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            List<Reimbursement> resolvedReimbursementList = new ArrayList<>();
            while (rs.next()){
                Reimbursement viewResolved = new Reimbursement(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                resolvedReimbursementList.add(viewResolved);
            }
            return resolvedReimbursementList;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Reimbursement> viewAllSpecificRequests(int searchUserId) {
        Connection c = cs.getConnection();

        String sql = "select * from reimbursement where reimbursement_author = ? ";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, searchUserId);
            ps.execute();
            ResultSet rs = ps.getResultSet();



            List<Reimbursement> getReimbursementList = new ArrayList<>();
            while (rs.next()){
                Reimbursement viewReimbursement = new Reimbursement(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                getReimbursementList.add(viewReimbursement);
            }
            return getReimbursementList;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
