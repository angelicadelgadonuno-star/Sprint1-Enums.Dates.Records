package level2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercise1 {

    private static final DateTimeFormatter DATE_FMT     = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter TIME_FMT     = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter DATETIME_FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
    private final Clock clock;

    public Exercise1() {
        this(Clock.systemDefaultZone());
    }

    public Exercise1(Clock clock) {
        this.clock = clock;
    }

    public String getToday() {
        return LocalDate.now(clock).format(DATE_FMT);
    }

    public String getCurrentTime() {
        return LocalTime.now(clock).format(TIME_FMT);
    }

    public String getCurrentDateTime() {
        return LocalDateTime.now(clock).format(DATETIME_FMT);
    }

}
