package com.revature.services;

import com.revature.dao.IReimbursementDao;
import com.revature.models.Reimbursement;

import java.util.List;

public class ReimbursementService {
    private IReimbursementDao rDao;
    public ReimbursementService(IReimbursementDao rDao){
        this.rDao = rDao;
    }
    public void submitReimburse(Reimbursement r, int userId){
        rDao.create(r, userId);
    }
    public List<Reimbursement> getSingleUserReimbursement(String username){
        return rDao.get(username);
    }
    public List<Reimbursement> getAllUsersReimbursement(String status){
        return rDao.getAll(status);
    }
    public void updateRequest(int resolverId, int reimburseId, String status){
        rDao.update(resolverId, reimburseId,status);
    }
}
