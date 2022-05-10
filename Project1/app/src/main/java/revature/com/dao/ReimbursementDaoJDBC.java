package revature.com.dao;

import revature.com.models.Reimbursement;
import revature.com.models.SubmitReimbursement;
import revature.com.utils.ConnectionSingleton;

import java.sql.*;
import java.util.List;

public class ReimbursementDaoJDBC implements IReimbursementDao{
    private ConnectionSingleton cs = ConnectionSingleton.getConnectionSingleton();

    Connection c = cs.getConnection();


    @Override
    public void submitReimbursementRequest(SubmitReimbursement request) {
        Connection c = cs.getConnection();

        String sql = "insert";

        try {
            Statement s = c.createStatement();
            s.execute(sql);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Reimbursement viewPendingReimbursement() {
        Connection c = cs.getConnection();

        String sql = "select ";

        try {
            PreparedStatement ps = c.prepareStatement(sql);

            Reimbursement viewPending = null;
            ResultSet rs = ps.executeQuery();

            return viewPending;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Reimbursement viewResolvedReimbursement() {
        Connection c = cs.getConnection();

        String sql = "select ";

        try {
            PreparedStatement ps = c.prepareStatement(sql);

            Reimbursement viewRequest = null;
            ResultSet rs = ps.executeQuery();

            return viewRequest;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void approveReimbursement() {

    }

    @Override
    public List<Reimbursement> viewAllPendingRequests() {
        return null;
    }

    @Override
    public List<Reimbursement> viewAllResolvedRequests() {
        return null;
    }

    @Override
    public List<Reimbursement> viewAllSpecificRequests() {
        return null;
    }
}
