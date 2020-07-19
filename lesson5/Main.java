package lesson5;

public class Main {
    public static void main(String[] args) {

        GuideDog guideDog = new GuideDog(1, 5, 10, "grey", "Maylo", "Vaccinated", "Trained");
        Cat cat = new Cat(2, 4, 5, "redhead", "Vasya", "Vaccinated");
        Dog dog = new Dog(3, 2, 6, "Black", "Boris", "Vaccinated");
        Crocodile crocodile = new Crocodile(4, 4, 80, "green", "Predator");
        Fish fish = new Fish(5, 1, 10, "Gold", "Perec", "not vaccinated");
        Giraffe giraffe = new Giraffe(6, 20, 200, "yellow-black", "not predator");
        Hamster hamster = new Hamster(7, 1, 1, "redhead", "Barsuk", "not vaccinated");
        Lion lion = new Lion(8, 10, 100, "redhead", "Predator");
        Wolf wolf = new Wolf(9, 10, 80, "grey", "Predator");

        dog.dogSay();
        System.out.println();

        cat.setName("Murzik");
        cat.catSay();
        System.out.println();

        guideDog.guideDogSay();
        guideDog.takeHome();
        System.out.println();

        crocodile.crocodileSay();
        System.out.println();

        fish.fishSay();
        System.out.println();

        giraffe.giraffeSay();
        System.out.println();

        hamster.hamsterSay();
        System.out.println();

        lion.lionSay();
        System.out.println();

        wolf.wolfSay();

    }
}
