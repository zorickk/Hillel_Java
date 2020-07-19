package lesson5;

public class Wild extends Animal {

    private String isPredator;


    public Wild(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public String getIsPredator() {
        return isPredator;
    }

    public void setIsPredator(String isPredator) {
        this.isPredator = isPredator;
    }
}
