package revature.com.models;

public class UserRoles {
    private int roleId;
    private String role;
    public UserRoles(){

    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserRoles(int roleId, String role){
        this.roleId = roleId;
        this.role = role;
    }
}
