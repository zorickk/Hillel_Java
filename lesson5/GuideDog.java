package lesson5;

public class GuideDog extends Pet {

    private String isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, String isVaccinated, String isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained;
    }

    public void guideDogSay() {
        System.out.println("Hello, my name is " + getName().toString() + ", I can take you home.");
    }

    public void takeHome() {
        System.out.println(getName().toString() + ", Take me Home!!!");
    }

}
