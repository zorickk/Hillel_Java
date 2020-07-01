package lesson3;

import java.util.Arrays;

public class Mass {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for(int i = 0; i < 10; i++)
            mass[i] = 2 * i + 1;
        System.out.print(Arrays.toString(mass));
        }
    }

