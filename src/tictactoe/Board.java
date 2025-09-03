package tictactoe;


/**
 * Represents a 3x3 TicTacToe board.
 * Team 1 responsibilities: store state and print board.
 */
public class Board {
    private char[][] grid;


    /**
     * Initializes an empty 3x3 TicTacToe board.
     * Fills all cells with spaces or '-'.
     */
    public Board() {
        // TODO: create 3x3 grid filled with spaces or '-'
    }


    /**
     * Prints the current board state to the console.
     * Displays rows and columns for user reference.
     */
    public void printBoard() {
        // TODO: display rows and columns
    }


    /**
     * Places a mark ('X' or 'O') at the given row and column.
     *
     * @param row the row index (0-2)
     * @param col the column index (0-2)
     * @param mark the character to place ('X' or 'O')
     */
    public void placeMark(int row, int col, char mark) {
        // TODO: set grid[row][col]
    }


    /**
     * Returns the mark at a given location.
     *
     * @param row the row index (0-2)
     * @param col the column index (0-2)
     * @return the character at the specified location ('X', 'O', or empty)
     */
    public char getMark(int row, int col) {
        // TODO: return mark
        return ' ';
    }


    /**
     * Clears the board for a new game by resetting all cells to empty.
     */
    public void reset() { /* ... */ }


    /**
     * Checks if the board is completely filled (no empty cells).
     *
     * @return true if the board is full, false otherwise
     */
    public boolean isFull() { /* ... */ }


    /**
     * Returns a deep copy of the board.
     *
     * @return a new Board object with the same state as this board
     */
    public Board copy() { /* ... */ }


    /**
     * Returns a string representation of the board state for saving or debugging.
     *
     * @return a string encoding the current board state
     */
    public String serialize() { /* ... */ }


    /**
     * Loads the board state from a string representation.
     *
     * @param data the string encoding of a board state
     */
    public void deserialize(String data) { /* ... */ }
}