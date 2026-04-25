
import lombok.Data;

@Data
public class Word {
    String word;
    int count;

    public Word(String word) {
        this.word = word;
        this.count = 0;
    }
}
