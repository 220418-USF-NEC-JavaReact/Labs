package com.revature.dao;

import com.revature.models.Account;
import com.revature.models.User;
import com.revature.utils.ConnectionSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoJDBC implements IAccountDao{

    private Connection con = ConnectionSingleton.getConnectionSingleton().getConnection();
    @Override
    public void createAccount(Account account) {
        String sql = "insert into accounts values(?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,account.getAcNumber());
            ps.setString(2, account.getAcType());
            ps.setString(3,account.getAcStatus());
            ps.setDouble(4,account.getBalance());
            ps.setInt(5,account.getUserId());
            ps.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Account> getAllAccount() {
        String sql = "select * from accounts";
        try{
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            List<Account> accountList = new ArrayList<>();
            while (rs.next()){
                Account account = new Account(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
                System.out.println(account);
                accountList.add(account);
            }
            return accountList;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Account getAccountById(int userId) {
        String sql = "select * from accounts where user_id = " + userId;
        String sql2 = "select * from users where id = " + userId;
        try {
            Statement s = con.createStatement();
            Statement s2 = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            ResultSet rs2 = s2.executeQuery(sql2);
            User user = null;
            while (rs2.next()){
                user = new User(userId, rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6),rs2.getString(7));
            }
            Account account = null;
            while (rs.next()){
                account = new Account(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),user);
            }
            return account;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public Account getAccountByAccountNumber(int acNumber) {
        String sql = "select * from accounts where account_number = " + acNumber;
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            Account account = null;
            while (rs.next()){
                account = new Account(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
            }
            return account;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public int updateAccountStatus(Account account) {
        String sql = "update accounts set status=? where account_number=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, account.getAcStatus());
            ps.setInt(2, account.getAcNumber());
            int successful = ps.executeUpdate();
            return successful;

        } catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateAccountBalance(int acNumber, double balance) {
        String sql = "update accounts set balance=? where account_number=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, balance);
            ps.setInt(2, acNumber);
            int successful = ps.executeUpdate();
            return successful;

        } catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
