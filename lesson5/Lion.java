package lesson5;

public class Lion extends Wild {

    public Lion(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public void lionSay() {
        System.out.println("Hello, I am " + "\"" + getIsPredator().toString() + "\"" + " and I am angry");
    }
}
