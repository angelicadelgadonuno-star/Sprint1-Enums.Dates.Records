package level1.Exercise2;

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
    }
}
