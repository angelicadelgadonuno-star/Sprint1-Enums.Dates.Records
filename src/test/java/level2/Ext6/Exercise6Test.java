package level2.Ext6;

import level2.Exercise6;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

    @Test
    void upcomingReturnsOnlyFutureAppointments() {
        Exercise6 agenda = new Exercise6();
        LocalDateTime now = LocalDateTime.now();

        agenda.add("Past",   now.minusDays(1));
        agenda.add("Future", now.plusDays(1));

        assertEquals(1, agenda.upcoming().size());
        assertEquals("Future", agenda.upcoming().get(0).getDescription());
    }

    @Test
    void appointmentFormatsCorrectly() {
        Appointment a = new Appointment("Dentist", LocalDateTime.of(2025, 3, 11, 9, 30));
        assertEquals("2025-03-11 09:30 — Dentist", a.format());
    }
}