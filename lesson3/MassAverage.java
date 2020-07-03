package lesson3;

public class MassAverage {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[(i)] + ",");
        }
        System.out.println();
        double average = 0;
        if (mass.length > 0) {
            double sum = 0;
            for (int i = 0; i < mass.length; i++) {
                sum += mass[i];
            }
            average = sum / mass.length;
        }
        System.out.println("Arithmetic mean of array elements: = " + average);
    }
}
