package lesson5;

public class Dog extends Pet {

    public Dog(int id, int age, int weight, String color, String name, String isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public void dogSay() {
        System.out.println("Hello, my name is " + getName().toString() + ", Woof Woof Woof!!!");
    }
}
