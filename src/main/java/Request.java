
import lombok.Data;

@Data

class Request implements Comparable<Request> {
    String user;
    int priority; // Чим вище число, тим вищий пріоритет

    public Request(String user, int priority) {
        this.user = user;
        this.priority = priority;
    }

    @Override
    public int compareTo(Request other) {
        return Integer.compare(other.priority, this.priority);
    }
}

