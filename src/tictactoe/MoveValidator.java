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
        // Check if row and col are within bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        // Check if the cell is empty
        return board.getMark(row, col) == ' ';
    }


    /**
     * Checks if there is a winner on the board.
     *
     * @param board the current game board
     * @return 'X' if X has won, 'O' if O has won, or ' ' if no winner
     */
    public char checkWinner(Board board) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            // Check row
            char rowMark = board.getMark(i, 0);
            if (rowMark != ' ' && rowMark == board.getMark(i, 1) && rowMark == board.getMark(i, 2)) {
                return rowMark;
            }
            // Check column
            char colMark = board.getMark(0, i);
            if (colMark != ' ' && colMark == board.getMark(1, i) && colMark == board.getMark(2, i)) {
                return colMark;
            }
        }
        // Check diagonals
        char center = board.getMark(1, 1);
        if (center != ' ') {
            // Top-left to bottom-right
            if (center == board.getMark(0, 0) && center == board.getMark(2, 2)) {
                return center;
            }
            // Top-right to bottom-left
            if (center == board.getMark(0, 2) && center == board.getMark(2, 0)) {
                return center;
            }
        }
        return ' ';
    }


    /**
     * Checks if the board is completely filled (draw condition).
     *
     * @param board the current game board
     * @return true if the board is full and there is no winner
     */
    public boolean isDraw(Board board) {
    // If the board is full and there is no winner, it's a draw
    return board.isFull() && checkWinner(board) == ' ';
    }
}
