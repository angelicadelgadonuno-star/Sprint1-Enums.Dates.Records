package level1;

public enum Day {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isAWorkingDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public static void printDay(Day days) {
        if (days.isAWorkingDay()) {
            System.out.println(days + " is a working day.");
        } else {
            System.out.println(days + " is a weekend day.");
        }
    }

}



