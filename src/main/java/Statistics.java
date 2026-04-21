import java.time.LocalDateTime;
import lombok.Data;

@Data
class Statistics {
    String user;
    LocalDateTime time;

    public Statistics(String user) {
        this.user = user;
        this.time = LocalDateTime.now();
    }

}
