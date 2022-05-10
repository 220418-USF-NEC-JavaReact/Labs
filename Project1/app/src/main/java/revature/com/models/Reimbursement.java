package revature.com.models;

import java.util.Date;

public class Reimbursement {
    private int reimbursementId;
    private int amount;
    private Date submittedDate;
    private Date resolvedDate;
    private String description;
    private int reimbursementAuthor;
    private int reimbursementResolver;
    private int reimbursementStatus;
    private int reimbursementType;

    public Reimbursement(){

    }
    public Reimbursement(int reimbursementId, int amount, Date submittedDate, Date resolvedDate, String description, int reimbursementAuthor, int reimbursementResolver, int reimbursementStatus, int reimbursementType){
        this.reimbursementId = reimbursementId;
        this.amount = amount;
        this.submittedDate = submittedDate;
        this.resolvedDate = resolvedDate;
        this.description = description;
        this.reimbursementAuthor = reimbursementAuthor;
        this.reimbursementResolver = reimbursementResolver;
        this.reimbursementStatus = reimbursementStatus;
        this.reimbursementType = reimbursementType;

    }

    public int getReimbursementId() {
        return reimbursementId;
    }

    public int getAmount() {
        return amount;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public String getDescription() {
        return description;
    }

    public int getReimbursementAuthor() {
        return reimbursementAuthor;
    }

    public int getReimbursementResolver() {
        return reimbursementResolver;
    }

    public int getReimbursementStatus() {
        return reimbursementStatus;
    }

    public int getReimbursementType() {
        return reimbursementType;
    }

    public void setReimbursementId(int reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReimbursementAuthor(int reimbursementAuthor) {
        this.reimbursementAuthor = reimbursementAuthor;
    }

    public void setReimbursementResolver(int reimbursementResolver) {
        this.reimbursementResolver = reimbursementResolver;
    }

    public void setReimbursementStatus(int reimbursementStatus) {
        this.reimbursementStatus = reimbursementStatus;
    }

    public void setReimbursementType(int reimbursementType) {
        this.reimbursementType = reimbursementType;
    }

    @Override
    public String toString() {
        return "Reimbursement{\t\n" +
                "}";
    }
}
