package day17;

public class ChessBoard {
    ChessPiece[][] arr;

    public ChessBoard(ChessPiece[][] arr) {
        this.arr = arr;
    }

    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j].getDescription());
            }
            System.out.println("");
        }

    }
}
