package level2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise3 {

    public LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

    public LocalDate substracMonths(LocalDate date, int months) {
        return date.minusMonths(months);
    }

    public LocalDate addYears(LocalDate date, int years) {
        return date.plusYears(years);
    }

    public LocalDateTime addHours(LocalDateTime hour, int hours) {
        return hour.plusHours(hours);
    }

    public LocalDateTime substracMinutes(LocalDateTime minute, int minutes) {
        return minute.minusMinutes(minutes);
    }


}
