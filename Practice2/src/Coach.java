public class Coach extends Staff{

    private String name;
    private int age;

    public Coach(int id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Coordinator[Name: " + name + ",\n" + "Age: " + age + ",\n" + "Id: " +getId();
    }
    @Override
    public int hashCode(Object obj){
        return obj.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {return true;}
        else{return false;}

    }
}
