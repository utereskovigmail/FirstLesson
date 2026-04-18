public class Pilot extends Person{

    private String name;
    private int age;
    private int hoursInTheAir;

    public Pilot(String name, int age, int hoursInTheAir) {
        this(name, age);
        this.hoursInTheAir = hoursInTheAir;
    }
    public Pilot(String name, int age) {
        super(name, age);
    }

    public Pilot(String name) {
        super(name);
    }

    public Pilot(int age) {
        super(age);
    }
}
