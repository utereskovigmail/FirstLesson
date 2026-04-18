public class Builder extends Person{
    private String name;
    private int age;

    private int salary;
    private int experience;

    public Builder(String name, int age, int salary, int experience) {
        this(name, age);
        this.salary = salary;
        this.experience = experience;
    }

    public Builder(String name, int age) {
        super(name, age);
    }

    public Builder(String name) {
        super(name);
    }

    public Builder(int age) {
        super(age);
    }
}
