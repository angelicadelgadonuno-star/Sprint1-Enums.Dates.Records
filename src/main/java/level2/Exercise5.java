package level2;

import java.time.Clock;
import java.time.LocalDate;

public class Exercise5 {

    private final Clock clock;

    public Exercise5() {
        this(Clock.systemDefaultZone());
    }

    public Exercise5(Clock clock) {
        this.clock = clock;
    }

    public boolean isTheDateBeforeToday(LocalDate date) {
        return date.isBefore(LocalDate.now(clock));
    }
}
