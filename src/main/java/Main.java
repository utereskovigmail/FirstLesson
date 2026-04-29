import javax.xml.transform.Source;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.function.IntPredicate;
import java.util.function.BinaryOperator;
public class Main{
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();
        int s = 10;
        int min = 1;
        int max = 100;
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < s; i++) {
                int randomNum = new Random().nextInt(max - min + 1) + min;
                list.add(randomNum);
            }
            System.out.println("List: " + list);
        });
        AtomicInteger sum = new AtomicInteger(0);
        Thread t2 = new Thread(() -> {
            list.forEach(item -> sum.addAndGet(item));
            System.out.println("Total: " + sum.get());
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Average: " + (int) (sum.get() / list.size()));
        });


        t1.start();
        t1.join();

        t2.start();
        t2.join();
        t3.start();

        t3.join();
        System.out.println("Done");


    }
}
