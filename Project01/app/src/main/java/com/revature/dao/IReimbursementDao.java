package com.revature.dao;

import com.revature.models.Reimbursement;

import java.util.List;

public interface IReimbursementDao {
    List<Reimbursement> get(String username);
    List<Reimbursement> getAll(int userId, String status);
    List<Reimbursement> getAll(String status);

    void create(Reimbursement r, int userId);
    void update(int resolverId, int reimburseId, String status);

}
