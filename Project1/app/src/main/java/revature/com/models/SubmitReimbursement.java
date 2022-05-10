package revature.com.models;

import java.util.Date;

public class SubmitReimbursement {
    private int amount;
    private Date submittedDate;
    private String description;
    private int reimbursementAuthor;
    private int reimbursementStatus;
    private int reimbursementType;

    public SubmitReimbursement(){

    }
    public SubmitReimbursement(int amount, Date submittedDate, String description, int reimbursementAuthor, int reimbursementStatus, int reimbursementType){

        this.amount = amount;
        this.submittedDate = submittedDate;

        this.description = description;
        this.reimbursementAuthor = reimbursementAuthor;

        this.reimbursementStatus = reimbursementStatus;
        this.reimbursementType = reimbursementType;

    }

    public int getAmount() {
        return amount;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }


    public String getDescription() {
        return description;
    }

    public int getReimbursementAuthor() {
        return reimbursementAuthor;
    }


    public int getReimbursementStatus() {
        return reimbursementStatus;
    }

    public int getReimbursementType() {
        return reimbursementType;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReimbursementAuthor(int reimbursementAuthor) {
        this.reimbursementAuthor = reimbursementAuthor;
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
