package lesson5;

public class Giraffe extends Wild {

    public Giraffe(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public void giraffeSay() {
        System.out.println("Hello, I am " + "\"" + getIsPredator().toString() + "\"" + ". I am a wild animal!!!");
    }

}
