package tictactoe;


/**
 * Represents a 3x3 TicTacToe board.
 * Team 1 responsibilities: store state and print board.
 */
public class Board {
    private char[][] grid;

    public static final char X_MARK = 'X';
    public static final char O_MARK = 'O';
    public static final char EMPTY_MARK = ' ';

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
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }


    /**
     * Places a mark ('X' or 'O') at the given row and column.
     *
     * @param row the row index (0-2)
     * @param col the column index (0-2)
     * @param mark the character to place ('X' or 'O')
     */
    public void placeMark(int row, int col, char mark) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (mark == X_MARK || mark == O_MARK) {
                grid[row][col] = mark;
            }
        }
    }


    /**
     * Returns the mark at a given location.
     *
     * @param row the row index (0-2)
     * @param col the column index (0-2)
     * @return the character at the specified location ('X', 'O', or empty)
     */
    public char getMark(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            return grid[row][col];
        }
        return EMPTY_MARK;
    }


    /**
     * Clears the board for a new game by resetting all cells to empty.
     */
    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = EMPTY_MARK;
            }
        }
    }


    /**
     * Checks if the board is completely filled (no empty cells).
     *
     * @return true if the board is full, false otherwise
     */
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == EMPTY_MARK) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * Returns a deep copy of the board.
     *
     * @return a new Board object with the same state as this board
     */
    public Board copy() {
        Board newBoard = new Board();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newBoard.grid[i][j] = this.grid[i][j];
            }
        }
        return newBoard;
    }


    /**
     * Returns a string representation of the board state for saving or debugging.
     *
     * @return a string encoding the current board state
     */
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(grid[i][j]);
            }
        }
        return sb.toString();
    }


    /**
     * Loads the board state from a string representation.
     *
     * @param data the string encoding of a board state
     */
    public void deserialize(String data) {
        if (data != null && data.length() == 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    grid[i][j] = data.charAt(i * 3 + j);
                }
            }
        }
    }
}