
import lombok.Data;

@Data
public class Person {
    String name;
    int priority;

    public Person(String name, int age) {
        this.name = name;
        this.priority = age;
    }


}
