package level2;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import static org.junit.Assert.assertEquals;

class Exercise1Test {

    @Test
    void getCurrentDateAndTimeReturnsCurrentDateAndTime() {
        Clock fix = Clock.fixed(Instant.parse("2025-03-10T14:35:00Z"),
                ZoneId.of("UTC"));
        Exercise1 dateService = new Exercise1(fix);

        assertEquals("2025-03-10", dateService.getToday());
        assertEquals("14:35:00", dateService.getCurrentTime());
        assertEquals("2025-03-10T14:35", dateService.getCurrentDateTime());

    }
}