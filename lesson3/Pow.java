package lesson3;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Raising to the power of a number !!!");
        System.out.print("Enter the number you want to raise to the power: ");
        int x = scanner.nextInt();
        System.out.print("Enter the degree to which you want to raise the number: ");
        int n = scanner.nextInt();

        /* Решение через Math.pow */
        System.out.println("Number " + x + " in " + n + " degree = " + Math.pow(x, n));

        //Решение через for
        System.out.println("Number " + x + " in " + n + " degree = " + Exponentiation(x, n));
    }

    private static int Exponentiation(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}




