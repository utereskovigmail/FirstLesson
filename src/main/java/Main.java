import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> dict = new HashMap<>(Map.of(
                "hello",new ArrayList<>(List.of("привіт", "дарова")),
                 "good",new ArrayList<>(List.of("хороший")),
                 "bad", new ArrayList<>(List.of("поганий"))
        ));
        HashMap<String, Integer> frequency = new HashMap<>();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter you choice - 1) show all words, 2) translate, 3) add word translation, 4) add word, 5) delete word, 6) top 10 words, 7) least popular words");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    dict.forEach((k,v)-> System.out.println(k + " - " + v));
                    break;
                case 2:
                    System.out.println("enter word to translate");
                    String word = sc.next();
                    if(dict.containsKey(word)){
                        System.out.println(dict.get(word));
                        int count = frequency.getOrDefault(word, 0);
                        frequency.put(word, count + 1);
                    }
                    break;
                case 3:
                    System.out.println("Type a word to add translation");
                    String wordToAdd = sc.next();
                    System.out.println("Type a translation");
                    String translation = sc.next();
                    dict.get(wordToAdd).add(translation);
                    break;
                case 4:
                    System.out.println("Type a word to add:");
                    String wordToAdd2 = sc.next();
                    dict.put((wordToAdd2), new ArrayList<>());
                    break;
                case 5:
                    System.out.println("Type a word to delete:");
                    String wordToDelete = sc.next();
                    dict.remove(wordToDelete);
                    break;
                case 6:
                    System.out.println("Top 10 words:");
                    frequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10).forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Least popular words:");
                    frequency.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(10).forEach(System.out::println);
                    break;
                default:
            }
        }
    }
}
