package level2;

import level2.Ext6.Appointment;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise6 {

    private final List<Appointment> appointments = new ArrayList<>();
    private final Clock clock;

    public Exercise6() {
        this(Clock.systemDefaultZone());
    }

    public Exercise6(Clock clock) {
        this.clock = clock;
    }

    public void add(String description, LocalDateTime when) {
        appointments.add(new Appointment(description, when));
    }

    public List<Appointment> upcoming() {
        LocalDateTime now = LocalDateTime.now(clock);
        return appointments.stream()
                .filter(a -> a.getWhen().isAfter(now))
                .sorted(Comparator.comparing(Appointment::getWhen))
                .toList();
    }
}