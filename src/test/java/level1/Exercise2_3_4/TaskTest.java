package level1.Exercise2_3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void walkingLevelReturnsCorrectLevelLow() {
        Task level = new Task("Walking", Level.LOW);
        assertTrue(level.knowLevel().contains("low"));
    }

    @Test
    void joggingLevelReturnsCorrectLevelMedium() {
        Task level = new Task("Jogging", Level.MEDIUM);
        assertTrue(level.knowLevel().contains("medium"));
    }
    @Test
    void runningLevelReturnsCorrectLevelHigh() {
        Task level = new Task("Running", Level.HIGH);
        assertTrue(level.knowLevel().contains("high"));
    }

    @Test
    void eachLevelReturnsCorrectColor() {
        assertEquals("Green", Level.LOW.getColor());
        assertEquals("Yellow", Level.MEDIUM.getColor());
        assertEquals("Red", Level.HIGH.getColor());
    }

    @Test
    void convertStringValueToValidEnum() {
       assertEquals(Level.HIGH, Exercise4.stringToEnum("High"));
    }

    @Test
    void stringToEnumIsCaseInsensitive() {
        assertEquals(Level.HIGH,Exercise4.stringToEnum("high"));
        assertEquals(Level.MEDIUM, Exercise4.stringToEnum("Medium"));
    }

    @Test
    void eraseBlankSpaces() {
        assertEquals(Level.LOW, Exercise4.stringToEnum("  LOW  "));
    }

    @Test
    void invalidValueReturnsLow() {
        assertEquals(Level.LOW, Exercise4.stringToEnum("URGENT"));
    }

    @Test
    void nullValueReturnsLow() {
        assertEquals(Level.LOW, Exercise4.stringToEnum(null));
    }
}