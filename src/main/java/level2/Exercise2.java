package level2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Exercise2 {

    public Period differentPeriods(LocalDate from, LocalDate to) {
        return Period.between(from, to);
    }

    public Duration differentDuration(LocalDateTime from, LocalDateTime to) {
        return Duration.between(from, to);
    }

    public String formatedDayMonthOrYearPeriod(Period pd) {
        return pd.getYears() + " years, "
                + pd.getMonths() + " months, "
                + pd.getDays() + " days";
    }

    public String formatedTimeDuration(Duration dy) {
        long hours = dy.toHours();
        long minutes = dy.toMinutes() % 60;
        return hours + "h " + minutes + "m";
    }
}

