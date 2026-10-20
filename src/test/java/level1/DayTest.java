package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    @Test
    void isAWorkingDayReturnsAWorkingDay() {
        assertTrue(Day.Monday.isAWorkingDay(), "Monday IS a working day");
        assertTrue(Day.Tuesday.isAWorkingDay(), "Tuesday IS a working day");
        assertTrue(Day.Wednesday.isAWorkingDay(), "Wednesday IS a working day");
        assertTrue(Day.Thursday.isAWorkingDay(), "Thursday IS a working day");
        assertTrue(Day.Friday.isAWorkingDay(), "Friday IS a working day");

        assertFalse(Day.Saturday.isAWorkingDay(), "Saturday is NOT a working day");
        assertFalse(Day.Sunday.isAWorkingDay(), "Sunday is NOT a working day");
    }

    @Test
    void weekIS7Days() {
        assertEquals(7, Day.values().length);
    }

}