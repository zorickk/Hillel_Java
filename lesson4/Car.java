package lesson4;

public class Car {

    public final double volumeOfTheTank;
    public double balance;
    public final double consumption;
    public final double priceGasoline = 24;
    public double distanceOdessaKiev = 474;
    public double allFuel;
    public double allPrice;

    public Car(int volumeOfTheTank, int balance, int consumption) {
        this.volumeOfTheTank = volumeOfTheTank;
        this.balance = balance;
        this.consumption = consumption;
    }

    public void printCarInformation() {
        System.out.println("Volume of the tank: " + volumeOfTheTank + " l.");
        System.out.println("Residue in the tank: " + balance + " l.");
        System.out.println("Consumption per 100 km: " + consumption + " l.");
    }

    public void fullBak() {
        if (balance < volumeOfTheTank) {
            double zalili = volumeOfTheTank - balance;
            System.out.println("Filled a full tank on >>>> " + zalili + " l.");
            balance = volumeOfTheTank;
        }
    }

    public void ostatokTopliva(int distancia) {
        double b = 100;
        double a = consumption * distancia / b;
        balance = balance - a;
    }

    public void priceDrive() {
        double a = 100;
        double price = distanceOdessaKiev / a * consumption * priceGasoline;
        System.out.println("The cost of the trip is >>>> " + price + " UAH");
    }

    public void allFuel() {
        double allGasoline = volumeOfTheTank - balance;
        allFuel = allFuel + allGasoline;
        allPrice = allFuel * priceGasoline;
    }

    public void loading() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print("#");
        }
        System.out.print(" ");
    }
}

class RunCar {
    public static void main(String[] args) throws InterruptedException {
        lesson4.Car car = new lesson4.Car(40, 15, 6);
        System.out.println("");
        System.out.println("---- Odessa-Kiev-Road ----");
        System.out.println("");
        System.out.println("-Odessa-----------------Krivoe-Ozero-----------------Zhashkov----------------------Kiev");

        System.out.print("0 KM ");
        car.loading();
        System.out.print("179 KM ");
        car.loading();
        System.out.print("331 KM ");
        car.loading();
        System.out.print("474 KM ");


        System.out.println("");
        System.out.println("");
        car.printCarInformation();
        car.allFuel();
        System.out.println("");
        System.out.println("The rest of the gas in the tank >>>> " + car.balance + " l.");
        car.fullBak();
        System.out.println("");
        System.out.println("-------- We drove from Odessa to Krivoe Ozero  179 km --------");
        car.ostatokTopliva(179);
        System.out.println("The rest of the gas in the tank >>>> " + car.balance + " l.");
        car.allFuel();
        car.fullBak();
        System.out.println("");
        System.out.println("-------- We drove from Krivoe Ozero to Zhashkova 152 km --------");
        car.ostatokTopliva(152);
        System.out.println("The rest of the gas in the tank >>>> " + car.balance + " l.");
        car.allFuel();
        car.fullBak();
        System.out.println("");
        System.out.println("-------- Arrived in Kiev --------");
        System.out.print("The rest of the fuel in the tank upon arrival in Kiev >>>> ");
        car.ostatokTopliva(150);
        System.out.println("The rest of the gas in the tank >>>> " + car.balance + " l.");
        car.allFuel();
        car.priceDrive();
        System.out.println("");
        System.out.print("But they spent more, since initially, before leaving, they filled a full tank >>>> ");
        System.out.println(car.allFuel + " l.");
        System.out.println("What in total >>>> " + car.allPrice + " UAH");
    }
}



