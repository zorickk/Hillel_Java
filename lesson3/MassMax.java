package lesson3;

import java.sql.SQLOutput;

public class MassMax {
    public static void main(String[] args) {
        int max;
        int[] mass = {2, 5, 4, 3, 4, 9, 6, 2, 8};

        System.out.print("Array: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[(i)] + ",");
        }
        System.out.println();

        max = mass[0];
        System.out.print("Largest array element: ");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println(max);
    }
}
