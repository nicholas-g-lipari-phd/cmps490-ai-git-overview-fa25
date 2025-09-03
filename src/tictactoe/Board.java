package tictactoe;


/**
 * Represents a 3x3 TicTacToe board.
 * Team 1 responsibilities: store state and print board.
 */
public class Board {
    private char[][] grid;

    /** Initializes an empty board. */
    public Board() {
        // TODO: create 3x3 grid filled with spaces or '-'
    }

    /** Prints the board to the console. */
    public void printBoard() {
        // TODO: display rows and columns
    }

    /** Places a mark ('X' or 'O') at the given row and column. */
    public void placeMark(int row, int col, char mark) {
        // TODO: set grid[row][col]
    }

    /** Returns the mark at a given location. */
    public char getMark(int row, int col) {
        // TODO: return mark
        return ' ';
    }

    /** Clears the board for a new game. */
    public void reset() { /* ... */ }

    /** Returns true if the board is full. */
    public boolean isFull() { /* ... */ }

    /** Returns a deep copy of the board. */
    public Board copy() { /* ... */ }

    /** Returns a string representation of the board state. */
    public String serialize() { /* ... */ }

    /** Loads the board state from a string. */
    public void deserialize(String data) { /* ... */ }
}