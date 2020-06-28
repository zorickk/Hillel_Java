package lesson2;

import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count, sum = 0;
        System.out.println("---- Hello ----");
        System.out.println("---- Enter numbers one by one, pressing Enter ----");
        System.out.println("---- To display the result, enter any letter and press Enter ----");
        for (count = 0; scanner.hasNextInt(); count++) {
            sum += scanner.nextInt();
        }
        double res = (sum / count);
        System.out.println("Arithmetic mean of numbers: " + res);
    }
}
