package OOPS_Concepts;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessBoard {
    void moves();
}

class Queen implements ChessBoard {
    public void moves() {
        System.out.println("Queen can move in any direction(up, down, left, right and diagonal)");
    }
}

class Rook implements ChessBoard {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class Pawn implements ChessBoard {
    public void moves() {
        System.out.println("Pawn can move in up direction - by 1 step only");
    }
}

class King implements ChessBoard {
    public void moves() {
        System.out.println("King can move in any direction but by 1 step only.");
    }
}
