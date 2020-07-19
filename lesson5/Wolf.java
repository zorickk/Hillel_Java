package lesson5;

public class Wolf extends Wild {

    public Wolf(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public void wolfSay() {
        System.out.println("Hello, i am " + "\"" + getIsPredator().toString() + "\"" + " and I am angry!!! WOOOOF WOOOOF WOOOF!!!");
    }

}
