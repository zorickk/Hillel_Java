package lesson3;

public class whileOddNumbers {
    public static void main(String[] args) {

        int a = 0;
        int b = 100;

        while (a < b) {
            if (a % 2 == 0) {
                a++;
                continue;
            }
            System.out.print(a++ + " ");
        }
    }
}