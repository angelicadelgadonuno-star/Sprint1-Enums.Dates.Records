package level2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    private final Exercise2 service = new Exercise2();

    @Test
    void differentPeriods() {
        Period prd = service.differentPeriods(
                LocalDate.of(2023, 1, 15),
                LocalDate.of(2025, 6, 20));
        assertEquals(2, prd.getYears());
        assertEquals(5, prd.getMonths());
        assertEquals(5, prd.getDays());
    }

    @Test
    void differentDuration() {
        Duration drt = service.differentDuration(
                LocalDateTime.of(2025, 1, 1, 8, 0),
                LocalDateTime.of(2025, 1, 1, 17, 45));
        assertEquals(9, drt.toHours());
        assertEquals(45, drt.toMinutes() % 60);
    }

    @Test
    void sameDateGivesZeroPeriod() {
        LocalDate dt = LocalDate.of(2025, 1, 1);
        assertEquals(Period.ZERO, service.differentPeriods(dt,dt));
    }

    @Test
    void formatsPeriod() {
        assertEquals("2 years, 5 months, 5 days",
                service.formatedDayMonthOrYearPeriod(Period.of(2, 5, 5)));
    }

    @Test
    void formatsDuration() {
        assertEquals("9h 45m",
                service.formatedTimeDuration(Duration.ofHours(9).plusMinutes(45)));
        }
    }
