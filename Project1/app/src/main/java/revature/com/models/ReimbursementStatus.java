package revature.com.models;

public class ReimbursementStatus {
    private int statusId;
    private String status;

    public ReimbursementStatus(){

    }
    public ReimbursementStatus(int statusId, String status){
        this.statusId = statusId;
        this.status = status;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return "ReimbursementStatus{\n\t" +

        "}";
    }
}
