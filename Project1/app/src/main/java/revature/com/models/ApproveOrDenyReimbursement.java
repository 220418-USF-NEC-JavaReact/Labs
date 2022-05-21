package revature.com.models;

public class ApproveOrDenyReimbursement {
    private int reimbursementId;
    private int approveOrDeny;

    public ApproveOrDenyReimbursement(){

    }
    public ApproveOrDenyReimbursement(int reimbursementId, int approveOrDeny){
        this.reimbursementId = reimbursementId;
        this.approveOrDeny = approveOrDeny;
    }

    public int getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(int reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public int getApproveOrDeny() {
        return approveOrDeny;
    }

    public void setApproveOrDeny(int approveOrDeny) {
        this.approveOrDeny = approveOrDeny;
    }
}
