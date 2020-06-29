package lesson3;

public class oddNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}