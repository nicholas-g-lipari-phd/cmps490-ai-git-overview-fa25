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

#### Using Gradle (recommended)
```bash
# Compile the project
./gradlew build

# Run the application
./gradlew run
```

#### Manual (javac/java)
```bash
cd src/
javac tictactoe/*.java
java tictactoe.Main
```



## Team Assignments


### Team 1 – `Board.java`
- Manage the 3×3 board state  *(Dependency)*
- Print the board (`printBoard()`)  *(MVP)*
- Place and get marks (`placeMark()`, `getMark()`)  *(Dependency)*
- Reset and check if the board is full (`reset()`, `isFull()`)  *(Stretch)*
- Copy and serialize/deserialize the board (`copy()`, `serialize()`, `deserialize()`)  *(Stretch)*

### Team 2 – `MoveValidator.java`
- Check if moves are valid.  *(Dependency)*
- Detect win conditions (rows, columns, diagonals).  *(Dependency)*
- Detect draw conditions.  *(Dependency)*

### Team 3 – `Game.java`
- Manage two-player game loop.  *(MVP)*
- Alternate turns, collect moves from input.  *(MVP)*
- Use `MoveValidator` to determine when game ends.  *(Dependency)*

### Team 4 – `AiPlayer.java`
- Provide moves for an AI opponent.  *(Dependency)*
- Start with random valid moves.  *(MVP)*
- Extend with various algorithms such as minimax (full tree search).  *(Stretch)*


### Team 5 – `Main.java`
- Build a simple menu and interface using the command line (CLI):  *(MVP)*
    - Play 2-player  *(MVP)*
    - Play vs AI  *(MVP)*
    - Quit  *(MVP)*
- Output the board to the console and accept input using Scanner.  *(MVP)*
- Launch Game and connect with other classes.  *(Dependency)*
- (Stretch) Add a GUI interface using `JOptionPane`:
    - Output the board using GUI dialogs.  *(Stretch)*
    - Accept input using `JOptionPane.showInputDialog`.  *(Stretch)*


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