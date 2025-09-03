package tictactoe;
import java.util.Random;

/**
 * Provides moves for an AI opponent.
 * Team 4 responsibilities.
 */
public class AiPlayer {
    private Random rand = new Random();


    /**
     * Chooses a move for the AI player.
     *
     * @param board the current game board
     * @return an int array {row, col} representing the AI's chosen move
     */
    public int[] chooseMove(Board board) {
        // TODO: pick a random valid square (later: implement minimax)
        return randomValidMove(board);
    }


    /**
     * Picks a random valid move from available spots.
     *
     * @param board the current game board
     * @return an int array {row, col} for a random valid move
     */
    private int[] randomValidMove(Board board) {
        // TODO: implement random valid move selection
        return new int[]{0, 0};
    }


    /**
     * Picks a weighted random move (stub for future strategies).
     *
     * @param board the current game board
     * @return an int array {row, col} for a weighted random move
     */
    private int[] weightedRandomMove(Board board) {
        // TODO: implement weighted random move selection
        return new int[]{0, 0};
    }


    /**
     * Stub for minimax or other advanced AI algorithms.
     *
     * @param board the current game board
     * @return an int array {row, col} for the best move found by the algorithm
     */
    private int[] minimaxMove(Board board) {
        // TODO: implement minimax or other AI
        return new int[]{0, 0};
    }
}