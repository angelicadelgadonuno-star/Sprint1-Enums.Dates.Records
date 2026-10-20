package level2;

public class Main {
    public static void main(String[] args) {

        Exercise1 currentDateService = new Exercise1();

        System.out.println("Date: " + currentDateService.getToday());
        System.out.println(("Time: " + currentDateService.getCurrentTime()));
        System.out.println("Date & Time: " + currentDateService.getCurrentDateTime());
    }
}
