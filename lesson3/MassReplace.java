package lesson3;


public class MassReplace {

    public static void main(String[] args) {

        int min;
        int max;
        int[] mass = {4, 8, 0, 6, -5};

        System.out.print("Array: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[(i)] + ",");
        }
        System.out.println();

        max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }

        min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == min) {
                if (mass[i] == max) {
                    mass[i] = min;
                }
                if (mass[i] == min) {
                    mass[i] = max;
                }
            } else {
                if (mass[i] == max) {
                    mass[i] = min;
                }
            }
        }

        System.out.print("Array after changing the largest and smallest elements in places: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[(i)] + ",");
        }
        System.out.println();
    }
}
