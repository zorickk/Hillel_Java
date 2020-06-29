package lesson3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Calculate the Factorial of a Number: ");
        System.out.print("Enter the number to calculate the factorial: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println("Factorial numbers: " + n + " = " + res);
    }

}