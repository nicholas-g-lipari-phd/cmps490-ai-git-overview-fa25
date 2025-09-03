package tictactoe;

/**
 * Controls the two-player game loop and manages game state.
 * Team 3 responsibilities: alternate turns, collect moves, and check for game end.
 */
public class Game {
    private Board board;
    private MoveValidator validator;


    /**
     * Constructs a new Game with a fresh board and move validator.
     */
    public Game() {
        this.board = new Board();
        this.validator = new MoveValidator();
    }


    /**
     * Runs a two-player game loop, alternating turns until a win or draw is detected.
     * Handles user input, board updates, and win/draw checking.
     */
    public void playTwoPlayer() {
        // TODO: alternate turns between 'X' and 'O'
        // TODO: read moves from Scanner
        // TODO: check winner/draw using validator
        // TODO: print board each turn
    }
}
