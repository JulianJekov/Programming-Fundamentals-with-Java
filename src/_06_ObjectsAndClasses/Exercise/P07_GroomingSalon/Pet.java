package _06_ObjectsAndClasses.Exercise.P07_GroomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public String toString(){
        return this.name + " " + this.age + " - (" + this.owner + ")";
    }

//    @Override
//    public String toString() {
//        return name + " " + age + " - " +"("+ owner + ")";
//    }
}