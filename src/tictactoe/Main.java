package tictactoe;

/**
 * Entry point and menu for TicTacToe.
 * Team 5 will implement:
 * - CLI menu and interaction (play 2-player, play vs AI, quit)
 * - Board output: support both console (System.out) and a simple GUI (e.g., JOptionPane)
 * - Input: allow either CLI (Scanner) or GUI (JOptionPane.showInputDialog)
 *
 * For GUI, you may use javax.swing.JOptionPane for input/output dialogs.
 */
public class Main {
    /**
     * Launches the TicTacToe application and handles user interaction.
     * Shows the menu and starts the game loop.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("=== TicTacToe ===");
            System.out.println("1. Play 2-player");
            System.out.println("2. Play vs AI");
            System.out.println("3. Quit");
            System.out.print("Select an option: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Starting 2-player game...");
                    Game game2p = new Game(); // false: not vs AI
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("Starting game vs AI...");
                    Game gameAI = new Game(); // true: vs AI
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
        scanner.close();
    }
}
