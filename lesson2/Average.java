package lesson2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("-------- H E L L O --------");
        System.out.println("---------------------------");
        System.out.println("Welcome to the program for determining the arithmetic mean value of 2 numbers");
        System.out.println("---------------------------");
        System.out.print("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();
        int c = a + b;
        double res = c/2;
        System.out.println();
        System.out.println("Arithmetic mean of two numbers: " + res);
    }
}

