package tictactoe;

/**
 * Checks whether moves are valid and detects win/draw conditions.
 * Team 2 responsibilities.
 */
public class MoveValidator {


    /**
     * Checks if the given move is valid (within bounds and on an empty cell).
     *
     * @param board the current game board
     * @param row the row index (0-2)
     * @param col the column index (0-2)
     * @return true if the move is valid, false otherwise
     */
    public boolean isValidMove(Board board, int row, int col) {
        // TODO: check 0 <= row, col <= 2 and that spot is empty
        return false;
    }


    /**
     * Checks if there is a winner on the board.
     *
     * @param board the current game board
     * @return 'X' if X has won, 'O' if O has won, or ' ' if no winner
     */
    public char checkWinner(Board board) {
        // TODO: check rows, columns, diagonals
        return ' ';
    }


    /**
     * Checks if the board is completely filled (draw condition).
     *
     * @param board the current game board
     * @return true if the board is full and there is no winner
     */
    public boolean isDraw(Board board) {
        // TODO: check grid for empties
        return false;
    }
}
