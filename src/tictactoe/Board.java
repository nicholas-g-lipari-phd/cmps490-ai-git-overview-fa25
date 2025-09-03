package tictactoe;


/**
 * Represents a 3x3 TicTacToe board.
 * Team 1 responsibilities: store state and print board.
 */
public class Board {
    private char[][] grid;

    //! TODO: add a public static member to hold how X, O, and empty cells are represented (e.g., 'X', 'O', and ' ' or '-')

    /**
     * Initializes an empty 3x3 TicTacToe board.
     * Fills all cells with spaces or '-'.
     */
    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }


    /**
     * Prints the current board state to the console.
     * Displays rows and columns for user reference.
     */
    public void printBoard() {
        // Stub: print nothing for now
    }


    /**
     * Places a mark ('X' or 'O') at the given row and column.
     *
     * @param row the row index (0-2)
     * @param col the column index (0-2)
     * @param mark the character to place ('X' or 'O')
     */
    public void placeMark(int row, int col, char mark) {
        // Stub: do nothing
    }


    /**
     * Returns the mark at a given location.
     *
     * @param row the row index (0-2)
     * @param col the column index (0-2)
     * @return the character at the specified location ('X', 'O', or empty)
     */
    public char getMark(int row, int col) {
        // Stub: always return empty
        return ' ';
    }


    /**
     * Clears the board for a new game by resetting all cells to empty.
     */
    public void reset() {
        // Stub: do nothing
    }


    /**
     * Checks if the board is completely filled (no empty cells).
     *
     * @return true if the board is full, false otherwise
     */
    public boolean isFull() {
        // Stub: always return false
        return false;
    }


    /**
     * Returns a deep copy of the board.
     *
     * @return a new Board object with the same state as this board
     */
    public Board copy() {
        // Stub: return a new empty board
        return new Board();
    }


    /**
     * Returns a string representation of the board state for saving or debugging.
     *
     * @return a string encoding the current board state
     */
    public String serialize() {
        // Stub: return empty string
        return "";
    }


    /**
     * Loads the board state from a string representation.
     *
     * @param data the string encoding of a board state
     */
    public void deserialize(String data) {
        // Stub: do nothing
    }
}