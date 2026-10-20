package level1.Exercise2_3_4;

import static level1.Exercise2_3_4.Exercise4.stringToEnum;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Activity level ---");
        System.out.println(new Task("Walking ", Level.LOW).knowLevel());
        System.out.println(new Task("Jogging ", Level.MEDIUM).knowLevel());
        System.out.println(new Task("Running ", Level.HIGH).knowLevel());

        System.out.println("--- Priority Color ---");
        for (Level l : Level.values()) {
            System.out.println(l.showMessage());
        }

        System.out.println("---String to Enum ---");
        System.out.println(stringToEnum("high"));
        System.out.println(stringToEnum("MEDIUM"));
        System.out.println(stringToEnum("urgent"));
        System.out.println(stringToEnum(null));
    }
}
