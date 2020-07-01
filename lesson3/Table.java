package lesson3;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Таблица умножения на число X");
        System.out.print("Введите желаемое число: ");
        int a = scanner.nextInt();
        System.out.println("Таблица умножения на чило " + a + ":");
        for (int i = 1; i < 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}
