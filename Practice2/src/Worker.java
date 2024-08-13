public class Worker extends Staff{
    private String role;
    public Worker(int id,String role) {
        super(id);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
