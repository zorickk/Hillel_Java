package lesson3;

public class doWhileOddNumbers {
    public static void main(String[] args) {

        int a = 0;

        do {
            if (a % 2 == 0) {
                a++;
                System.out.print(a++ + " ");
            }
        }
        while (a < 100);
    }
}
