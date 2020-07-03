package lesson3;

public class MassMin {
    public static void main(String[] args) {
        int min;
        int[] mass = {2, 5, 4, 3, 4, 9, 6, 2, 8};

        System.out.print("Array: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[(i)] + ",");
        }
        System.out.println();

        min = mass[0];
        System.out.print("Smallest array element: ");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (min == mass[i]) {
                System.out.print(min + ", ");
            }
        }
    }
}
