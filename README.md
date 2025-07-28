# Rubik's Cube Simulator

A realistic 3x3 Rubik’s Cube simulator built in **Java**. This project features a custom **move engine** that adheres to real-world Rubik’s Cube mechanics and includes a solver that restores the cube to its solved state by reversing the scramble history using valid face rotations.

🎯 **Goal**: Accurately simulate a 3x3 Rubik’s Cube, scramble it with legal moves, and solve it by applying the inverse of those moves.

---

## Features 🚀

- ✅ **Full Cube Modeling**: Represents the cube with 6 faces, each a 3x3 matrix.
- ✅ **12 Real Moves Supported**: U, D, L, R, F, B and their inverses (e.g., U', F').
- ✅ **Scrambling**: Generates a random sequence of moves with a tracked history.
- ✅ **Reverse Solver**: Restores the cube to its solved state by applying inverse moves in reverse order.
- ✅ **Console Output**: Displays the cube state after each operation for clear visualization.
- ✅ **Extensible Design**: Modular and clean codebase for easy expansion.

---

## Tech Stack 🛠️

- **Language**: Java (Standard Edition)
- **IDE**: VS Code with Java extension
- **Dependencies**: None (pure Java)
- **Build Tool**: Not required

---

## Project Structure 📁

```plaintext
├── Cube.java       // Defines cube structure and state printing
├── Move.java       // Implements the move engine for 12 valid operations
├── Scrambler.java  // Handles random scrambling and tracks move history
├── Solver.java     // Solves the cube by reversing the scramble history
└── Main.java       // Entry point: demonstrates scramble and solve
```

---

## How It Works 🔍

1. The cube starts in a **solved state** (e.g., all white stickers on the U face).
2. The **Scrambler** applies a random sequence of valid moves, storing each move in a history list.
3. The **Solver** restores the cube by applying the inverse of each move in reverse order.
4. The cube’s state is printed to the console after each major step for visualization.

---

## Project Preview 🖼️

### Initial Cube
![Initial Cube](Images/Screenshot(1).png)
### Scrambled Cube
![Scrambled Cube](Images/Screenshot(2).png)
![Random Moves For Scrambling](Images/Screenshot(3).png)
### Solving
![Reverse Move for Solving](Images/Screenshot(4).png)
![Solved](Images/Screenshot(5).png)

---

## Getting Started ⚙️

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git (optional, for cloning the repository)

### Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Mahi014/Rubiks-Cube-Simulator.git
   cd Rubiks-Cube-Simulator
   ```

2. **Compile the Java Files**:
   ```bash
   javac *.java
   ```

3. **Run the Program**:
   ```bash
   java Main
   ```

---

## Future Scope 🔮

- Implement advanced solving algorithms (e.g., Beginner’s Method, CFOP).
- Add a visual simulation using JavaFX, Processing, or a web-based UI.
- Support additional cube types (e.g., 2x2, 4x4).
- Enable exporting cube states to files or images.

---

## Developed By 👨‍💻

**Mahender Singh**  
GitHub: [@Mahi014](https://github.com/Mahi014)
