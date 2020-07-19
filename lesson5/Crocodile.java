package lesson5;

public class Crocodile extends Wild {

    public Crocodile(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public void crocodileSay() {
        System.out.println("Hello, i am " + "\"" + getIsPredator().toString() + "\"" + " and I am angry!!!");
    }
}
