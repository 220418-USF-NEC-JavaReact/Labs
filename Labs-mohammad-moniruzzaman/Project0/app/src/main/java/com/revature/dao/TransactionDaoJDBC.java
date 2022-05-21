package com.revature.dao;

import com.revature.models.Transaction;
import com.revature.utils.ConnectionSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TransactionDaoJDBC implements ITransactionDao{
    private Connection con = ConnectionSingleton.getConnectionSingleton().getConnection();
    @Override
    public void createTransaction(Transaction t) {
        String sql = "insert into transactions (amount,description,account_number) "+
                "values(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1,t.getAmount());
            ps.setString(2, t.getDescription());
            ps.setInt(3,t.getAcNumber());
            ps.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Transaction> getTransaction(int acNumber) {
        String sql = "select * from transactions where account_number = " + acNumber + " order by transaction_id desc";
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            List<Transaction> transList = new ArrayList<>();
            while (rs.next()){
                Transaction trans = new Transaction(rs.getInt(1),rs.getDouble(2),rs.getString(3),rs.getInt(4));
                transList.add(trans);
                System.out.println(trans);
            }
            return transList;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
