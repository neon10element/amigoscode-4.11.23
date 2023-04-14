package college;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Crew {
    private String message;
    private ZonedDateTime timestamp;
    public Crew(String message, ZonedDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "Crew{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crew crew = (Crew) o;
        return message.equals(crew.message) && timestamp.equals(crew.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, timestamp);
    }
}
