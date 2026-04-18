
import lombok.Data;

@Data
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public void SayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void Me(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
