package revature.com.models;

public class ReimbursementType {

    private int typeId;
    private String type;

    public ReimbursementType(){

    }
    public ReimbursementType(int typeId, String type){
        this.typeId = typeId;
        this.type = type;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
