package lesson5;

public class Fish extends Pet {

    public Fish(int id, int age, int weight, String color, String name, String isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public void fishSay() {
        System.out.println("Hello, my name is " + getName().toString() + ". I say: gigiti-gigiti-gu!!!");
    }
}
