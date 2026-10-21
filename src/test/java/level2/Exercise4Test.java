package level2;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    private final Exercise4 timeFormats = new Exercise4();
    private final LocalDateTime dt = LocalDateTime.of(2025, 3, 10, 10, 14, 35);

    @Test
    void formatIsoReturnsFormatIso() {
        assertEquals("2025-03-10T10:14:35", timeFormats.formatIso(dt));
    }

    @Test
    void formatClassicReturnsFormatClassic() {
        assertEquals("10/03/2025", timeFormats.formatClassic(dt));
    }

    @Test
    void formatClassicTimeReturnsFormatClassicTime() {
        assertEquals("10/03/2025", timeFormats.formatClassic(dt));
    }

    @Test
    void formatLongEnglishReturnsLongEnglishFormat() {
        assertEquals("Monday, 10 March 2025", timeFormats.formatLongEnglish(dt));
    }
}