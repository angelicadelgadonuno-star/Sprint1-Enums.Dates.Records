package level2;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    private Exercise5 dbt(String isoInstant) {
        Clock fixed = Clock.fixed(Instant.parse(isoInstant), ZoneId.of("UTC"));
        return new Exercise5(fixed);
    }
        @Test
        void pastDateIsBeforeToday () {
            assertTrue(dbt("2025-03-10T14:35:00Z")
                    .isTheDateBeforeToday(LocalDate.of(2020, 1, 1)));
        }

        @Test
        void futureDateIsNotBeforeToday () {
            assertFalse(dbt("2025-03-10T14:35:00Z")
                    .isTheDateBeforeToday(LocalDate.of(2099, 1, 1)));
        }

        @Test
        void sameDayIsNotBeforeToday () {
            assertFalse(dbt("2025-03-10T14:35:00Z")
                    .isTheDateBeforeToday(LocalDate.of(2025, 3, 10)));
        }
    }

