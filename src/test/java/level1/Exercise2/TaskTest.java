package level1.Exercise2;

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
}