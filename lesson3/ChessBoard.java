package lesson3;

public class ChessBoard {

    public static void main(String[] args) {

        char[][] chess = new char[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if ((i + j) % 2 == 0) chess[i][j] = 'W';
                else chess[i][j] = 'B';
                System.out.print(" " + chess[i][j]);
            }
            System.out.println();
        }
    }
}
