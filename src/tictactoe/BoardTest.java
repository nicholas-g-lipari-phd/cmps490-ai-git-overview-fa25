package tictactoe;

public class BoardTest {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println("Initial board:");
        board.printBoard();

        // Place marks
        board.placeMark(0, 0, Board.X_MARK);
        board.placeMark(1, 1, Board.O_MARK);
        board.placeMark(2, 2, Board.X_MARK);
        System.out.println("\nAfter placing marks:");
        board.printBoard();

        // Get marks
        System.out.println("\nGet mark at (1,1): " + board.getMark(1, 1));
        System.out.println("Get mark at (0,2): " + board.getMark(0, 2));

        // Check if full
        System.out.println("\nIs board full? " + board.isFull());
        // Fill the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.placeMark(i, j, Board.O_MARK);
            }
        }
        System.out.println("After filling board:");
        board.printBoard();
        System.out.println("Is board full? " + board.isFull());

        // Reset
        board.reset();
        System.out.println("\nAfter reset:");
        board.printBoard();

        // Serialize/Deserialize
        board.placeMark(0, 0, Board.X_MARK);
        board.placeMark(1, 1, Board.O_MARK);
        String data = board.serialize();
        System.out.println("\nSerialized: " + data);
        Board board2 = new Board();
        board2.deserialize(data);
        System.out.println("Deserialized board:");
        board2.printBoard();

        // Copy
        Board boardCopy = board.copy();
        System.out.println("\nCopied board:");
        boardCopy.printBoard();
    }
}
