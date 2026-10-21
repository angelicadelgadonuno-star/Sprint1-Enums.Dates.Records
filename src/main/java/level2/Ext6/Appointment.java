package level2.Ext6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private final String appointmentDescription;
    private final LocalDateTime appointmentDate;

    public Appointment(String whatAppointment, LocalDateTime whenAppointment) {
        this.appointmentDescription = whatAppointment;
        this.appointmentDate = whenAppointment;
    }

    public String getDescription() {
        return appointmentDescription;
    }

    public LocalDateTime getWhen() {
        return appointmentDate;
    }

    public String format() {
        return appointmentDate.format(FMT) + " — " + appointmentDescription;
    }
}



