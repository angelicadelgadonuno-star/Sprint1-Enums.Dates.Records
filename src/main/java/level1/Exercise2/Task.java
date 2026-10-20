package level1.Exercise2;

public class Task {

    private String name;
    private Level level;

    public Task(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public String knowLevel() {
        return switch (level) {
            case LOW -> name + " is 'low' level";
            case MEDIUM -> name + " is 'medium' level";
            case HIGH -> name + " is 'high' level";
        };
    }

}
