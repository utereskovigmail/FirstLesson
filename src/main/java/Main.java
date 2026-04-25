import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.IntPredicate;
import java.util.function.BinaryOperator;
public class Main{
    public static void main(String[] args) {
        //homework first
//        HashMap<String, ArrayList<String>> dict = new HashMap<>(Map.of(
//                "hello",new ArrayList<>(List.of("привіт", "дарова")),
//                 "good",new ArrayList<>(List.of("хороший")),
//                 "bad", new ArrayList<>(List.of("поганий"))
//        ));
//        HashMap<String, Integer> frequency = new HashMap<>();
//
//        while(true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter you choice - 1) show all words, 2) translate, 3) add word translation, 4) add word, 5) delete word, 6) top 10 words, 7) least popular words");
//
//            int choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    dict.forEach((k,v)-> System.out.println(k + " - " + v));
//                    break;
//                case 2:
//                    System.out.println("enter word to translate");
//                    String word = sc.next();
//                    if(dict.containsKey(word)){
//                        System.out.println(dict.get(word));
//                        int count = frequency.getOrDefault(word, 0);
//                        frequency.put(word, count + 1);
//                    }
//                    break;
//                case 3:
//                    System.out.println("Type a word to add translation");
//                    String wordToAdd = sc.next();
//                    System.out.println("Type a translation");
//                    String translation = sc.next();
//                    dict.get(wordToAdd).add(translation);
//                    break;
//                case 4:
//                    System.out.println("Type a word to add:");
//                    String wordToAdd2 = sc.next();
//                    dict.put((wordToAdd2), new ArrayList<>());
//                    break;
//                case 5:
//                    System.out.println("Type a word to delete:");
//                    String wordToDelete = sc.next();
//                    dict.remove(wordToDelete);
//                    break;
//                case 6:
//                    System.out.println("Top 10 words:");
//                    frequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10).forEach(System.out::println);
//                    break;
//                case 7:
//                    System.out.println("Least popular words:");
//                    frequency.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(10).forEach(System.out::println);
//                    break;
//                default:
//            }
//        }













        //homework2:
        //1
        int year = 2022;


        IntPredicate isLeap = (int y) -> {
            if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
                return true;
            }
            return false;
        };

        // Call the lambda using the .test() method
        System.out.println(year + " is a leap year? " + isLeap.test(year));


        //2

        Fraction f1 = new Fraction(1, 2); // 1/2
        Fraction f2 = new Fraction(1, 3); // 1/3

        BinaryOperator<Fraction> add = (a, b) ->
                new Fraction(a.num * b.den + b.num * a.den, a.den * b.den);

        BinaryOperator<Fraction> subtract = (a, b) ->
                new Fraction(a.num * b.den - b.num * a.den, a.den * b.den);

        BinaryOperator<Fraction> multiply = (a, b) ->
                new Fraction(a.num * b.num, a.den * b.den);

        System.out.println("Сума: " + add.apply(f1, f2));        // 5/6
        System.out.println("Різниця: " + subtract.apply(f1, f2)); // 1/6
        System.out.println("Множення: " + multiply.apply(f1, f2)); // 1/6

    }
}
