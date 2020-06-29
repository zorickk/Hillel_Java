package lesson3;

import java.util.Scanner;

public class whileFactorial {
    public static void main(String[] args) {


        System.out.println("Calculate the Factorial of a Number: ");
        System.out.print("Enter the number to calculate the factorial: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 1;
        int i = 1;
        while (i <= n) {
            if (i != n) {
                i++;
                res *= i;
                continue;
            }
            System.out.println("Factorial numbers: " + n + " = " + res);
            break;
        }
    }
}