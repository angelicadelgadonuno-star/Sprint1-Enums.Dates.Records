package level1.Exercise2_3_4;

public enum Level {

   LOW("Green", 1),
   MEDIUM("Yellow", 2),
   HIGH("Red", 3);

   private String color;
   private int priority;

   Level(String color, int priority) {
      this.color = color;
      this.priority = priority;
   }

   public String getColor() {
      return color;
   }

   public String showMessage() {
      return name() + "," + " color: " + color + ", " + "Intensity: " + priority;
   }

}
