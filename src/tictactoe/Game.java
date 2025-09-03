package tictactoe;

/**
 * Controls the two-player game loop.
 * Team 3 responsibilities.
 */
public class Game {
    private Board board;
    private MoveValidator validator;

    public Game() {
        this.board = new Board();
        this.validator = new MoveValidator();
    }

    /** Runs a two-player game until win or draw. */
    public void playTwoPlayer() {
        // TODO: alternate turns between 'X' and 'O'
        // TODO: read moves from Scanner
        // TODO: check winner/draw using validator
        // TODO: print board each turn
    }
}
