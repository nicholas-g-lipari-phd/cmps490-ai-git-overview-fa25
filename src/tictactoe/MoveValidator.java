package tictactoe;

/**
 * Checks whether moves are valid and detects win/draw conditions.
 * Team 2 responsibilities.
 */
public class MoveValidator {

    /** Returns true if the given position is empty and inside bounds. */
    public boolean isValidMove(Board board, int row, int col) {
        // TODO: check 0 <= row, col <= 2 and that spot is empty
        return false;
    }

    /** Returns 'X' if X has won, 'O' if O has won, or ' ' otherwise. */
    public char checkWinner(Board board) {
        // TODO: check rows, columns, diagonals
        return ' ';
    }

    /** Returns true if board is completely filled. */
    public boolean isDraw(Board board) {
        // TODO: check grid for empties
        return false;
    }
}
