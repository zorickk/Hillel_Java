package lesson5;

public class Cat extends Pet {

    public Cat(int id, int age, int weight, String color, String name, String isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public void catSay() {
        System.out.println("Hello, my name is " + getName().toString() + ", Meow Meow Meow!!!");
    }

}
