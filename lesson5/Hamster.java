package lesson5;

public class Hamster extends Pet {

    public Hamster(int id, int age, int weight, String color, String name, String isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public void hamsterSay() {
        System.out.println("Hello, my name is " + getName().toString() + ". I am \"" + getIsVaccinated().toString() + "\"" + ", pew pew pew pew!!!");
    }

}
