import java.time.LocalDateTime;

public class Reservation {
    private Person person;
    private LocalDateTime from;
    private LocalDateTime to;

    public Reservation(Person person, LocalDateTime from, LocalDateTime to) {
        this.person = person;
        this.from = from;
        this.to = to;
    }

    public Person getPerson() {
        return person;
    }
    public LocalDateTime getFrom() {
        return from;
    }
    public LocalDateTime getTo() {
        return to;
    }
}
