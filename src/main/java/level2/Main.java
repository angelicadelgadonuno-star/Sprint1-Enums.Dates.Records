package level2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Exercise1 currentDateService = new Exercise1();

        System.out.println("--- Exercise 1 ---");
        System.out.println("Date: " + currentDateService.getToday());
        System.out.println(("Time: " + currentDateService.getCurrentTime()));
        System.out.println("Date & Time: " + currentDateService.getCurrentDateTime());

        Exercise2 plusMinus = new Exercise2();

        LocalDate start = LocalDate.of(2023, 1, 15);
        LocalDate end   = LocalDate.of(2025, 6, 20);
        Period period   = plusMinus.differentPeriods(start, end);

        System.out.println("--- Exercise 2 ---");
        System.out.println("Period: " + plusMinus.formatedDayMonthOrYearPeriod(period));

        LocalDateTime t1 = LocalDateTime.of(2025, 1, 1, 8, 0);
        LocalDateTime t2 = LocalDateTime.of(2025, 1, 1, 17, 45);
        Duration duration = plusMinus.differentDuration(t1, t2);
        System.out.println("Duration: " + plusMinus.formatedTimeDuration(duration));
    }

}
