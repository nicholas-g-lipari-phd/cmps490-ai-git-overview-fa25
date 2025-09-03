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
}