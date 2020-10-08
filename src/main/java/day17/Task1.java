package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> list = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            list.add(ChessPiece.PAWN_WHITE);
        for (int i = 0; i < 4; i++)
            list.add(ChessPiece.ROOK_BLACK);

        for (int i = 0; i < 8; i++) {
            System.out.print(list.get(i).getDescription() + " ");
        }
    }
}

