# CMPS Gen-AI &amp; Git Overview [Fall 2025]

```
tic-tac-toe/
 └─ src/
    └─ tictactoe/
        Main.java
        Board.java
        MoveValidator.java
        Game.java
        AiPlayer.java
```

## Tic-Tac-Toe (Java Console Project)

This repository contains starter code for a **console-based Tic-Tac-Toe game**.  
The project is split into **five teams**, each responsible for one component.  
The class period will demonstrate **GitHub branch protection** and **AI-assisted coding**.

---

### Project Setup
- Language: **Java 17+**
- Build tool: none (just `javac` / `java`)
- Source root: `src`
- Package: `tictactoe`

### Compile and Run
```bash
cd src/
javac tictactoe/*.java
java tictactoe.Main
```



## Team Assignments

### Team 1 – `Board.java`
- Store a 3×3 grid of characters.
- Implement methods:
    - `printBoard()`
    - `placeMark(row, col, mark)`
    - `getMark(row, col)`

### Team 2 – `MoveValidator.java`
- Check if moves are valid.
- Detect win conditions (rows, columns, diagonals).
- Detect draw conditions.

### Team 3 – `Game.java`
- Manage two-player game loop.
- Alternate turns, collect moves from input.
- Use `MoveValidator` to determine when game ends.

### Team 4 – `AiPlayer.java`
- Provide moves for an AI opponent.
- Start with random valid moves.
- Extend with various algorithms such as minimax (full tree search).


### Team 5 – `Main.java`
- Build a simple menu (CLI or GUI):
    - Play 2-player
    - Play vs AI
    - Quit
- Output the board to either the console or a simple GUI (e.g., using `JOptionPane`).
- Accept input from either the command line (Scanner) or GUI dialogs (`JOptionPane.showInputDialog`).
- Launch Game and connect with other classes.


## Workflow

### Branches
- Each team works on their own branch (e.g., `team1-board`, `team2-validator`, etc.).
- Direct pushes to `main` are blocked (branch protection).

### Pull Requests
- When a team finishes their part, open a Pull Request (PR) into `main`.
- At least one review by the instructor is required before merging.

### Integration
- After merging, run the program from `Main.java`.
- By the end of class, all pieces should work together.

## Using GenAI

- Ask an AI tool to generate method stubs, unit tests, or menu code.
- Use AI responsibly: always review and test before committing.
- Commit messages should state if AI was used (e.g., "Added printBoard() (AI-generated, edited for clarity)").

## Stretch Goals (if time allows)

- Add score tally across multiple games.
- Add replay option.
- Improve AI difficulty.