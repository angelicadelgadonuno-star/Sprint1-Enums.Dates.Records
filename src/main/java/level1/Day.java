package level1;

public enum Day {

    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    public boolean isAWorkingDay() {
        return this != Saturday && this != Sunday;
    }

    public static void printDay(Day days) {
        if (days.isAWorkingDay()) {
            System.out.println(days + " is a working day.");
        } else {
            System.out.println(days + " is a weekend day.");
        }
    }

}



