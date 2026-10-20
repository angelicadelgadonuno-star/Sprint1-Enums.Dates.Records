package level1.Exercise2_3_4;

public class Exercise4 {

    public static Level stringToEnum(String value) {
        if (value == null) {
            System.out.println("The value is null, LOW is assigned by default ");
            return Level.LOW;
        }
        try {
            return Level.valueOf(value.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Value '"+ value +"' LOW is assigned by default ");
            return Level.LOW;
        }
    }
}