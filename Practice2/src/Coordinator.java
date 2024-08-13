public class Coordinator extends Staff{

    private String role;
    private String name;
    private int age;

    public Coordinator(int id, String role, String name, int age) {
        super(id);
        this.role = role;
        this.name = name;
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
