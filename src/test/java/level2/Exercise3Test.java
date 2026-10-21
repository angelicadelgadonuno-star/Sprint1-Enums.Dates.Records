package level2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    private final Exercise3 service = new Exercise3();

    @Test
    void addsDaysReturnsDaysPlusAddedDays() {
        assertEquals(LocalDate.of(2025, 3, 20), service
                .addDays(LocalDate.of(2025, 3, 10), 10));
    }

    @Test
    void subtractsMonthsReturnsRemainingMonths() {
        assertEquals(LocalDate.of(2025, 2, 10), service
                .substracMonths(LocalDate.of(2025, 3, 10), 1));
    }

    @Test
    void addsYearsReturnsYearsPlusAddition() {
        assertEquals(LocalDate.of(2027, 3, 10), service
                .addYears(LocalDate.of(2025, 3, 10), 2));
    }

    @Test
    void addsHoursReturnsHoursPlusAddedHours() {
        assertEquals(LocalDateTime.of(2025, 3, 10, 19, 0), service
                .addHours(LocalDateTime.of(2025, 3, 10, 14, 0), 5));
    }

    @Test
    void subtractsMinutesReturnsRemainingMinutes() {
        assertEquals(LocalDateTime.of(2025, 3, 10, 13, 30), service
                .substracMinutes(LocalDateTime.of(2025, 3, 10, 14, 0), 30));
    }

}
