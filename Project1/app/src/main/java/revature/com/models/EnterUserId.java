package revature.com.models;

public class EnterUserId {
    private int userId;
    public EnterUserId(){

    }
    public EnterUserId(int userId){
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
