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
    public SubmitReimbursement(int amount,  String description, int reimbursementType){

        this.amount = amount;
        // Date would use
        // Date d = new Date(Instant.now().toEpochMilli());
        this.submittedDate = null;
        this.description = description;
        // Will set the author id in controller class
        this.reimbursementAuthor = 0;
        // 1 is Pending in status
        this.reimbursementStatus = 1;
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
