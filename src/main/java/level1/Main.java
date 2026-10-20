package level1;

import static level1.Day.printDay;

public class Main {
    public static void main(String[] args) {

        System.out.println("---The days of the week ---");
        for (Day d : Day.values()) {
            printDay(d);
        }

    }
}
