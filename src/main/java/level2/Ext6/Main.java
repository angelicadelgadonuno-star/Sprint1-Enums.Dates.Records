package level2.Ext6;

import level2.Exercise6;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Exercise6 agenda = new Exercise6();
        LocalDateTime now = LocalDateTime.now();

        agenda.add("Pickup Mila from School ", now.plusHours(1));
        agenda.add("Take Mila to basketball", now.plusHours(3));
        agenda.add("Dentist", now.plusDays(2));
        agenda.add("Finish Sprint 1", now.minusDays(15));

        System.out.println("--- Upcoming Events ---");
        agenda.upcoming().forEach(a-> System.out.println(a.format()));

    }
}
