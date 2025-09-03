package tictactoe;
import java.util.Random;

/**
 * Provides moves for an AI opponent.
 * Team 4 responsibilities.
 */
public class AiPlayer {
    private Random rand = new Random();

    /** Returns an int[2] {row, col} representing AI move. */
    public int[] chooseMove(Board board) {
        // TODO: pick a random valid square (later: implement minimax)
        return new int[]{0, 0};
    }
}