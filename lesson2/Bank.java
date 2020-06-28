package lesson2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the deposit amount in UAH :");
        double money = in.nextDouble();

        System.out.println("Enter the desired percentage :");
        double percent = in.nextDouble();

        System.out.println("Enter deposit term in years :");
        int year = in.nextInt();

        double income = (percent * money / 100) * year;
        double sum = income + money * year;

        System.out.println("Amount received during deposit storage: " + sum + " UAH");
        System.out.println("Accumulated interest on deposit: " + income + " UAH");

    }
}
