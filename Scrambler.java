import java.util.*;

public class Scrambler {
    private static final String[] MOVES = {
        "U", "D", "L", "R", "F", "B",
        "U'", "D'", "L'", "R'", "F'", "B'"
    };

    private List<String> moveHistory = new ArrayList<>();
    private Random rand = new Random();
    public void scramble(Cube cube, int numMoves) {
        moveHistory.clear();//new start
        for (int i = 0; i < numMoves; i++) {
            String move = MOVES[rand.nextInt(MOVES.length)];
            applyMove(cube, move);
            moveHistory.add(move);
        }
    }
    public void applyMove(Cube cube, String move) {
        switch (move) {
            case "U": Move.moveU(cube); break;
            case "D": Move.moveD(cube); break;
            case "L": Move.moveL(cube); break;
            case "R": Move.moveR(cube); break;
            case "F": Move.moveF(cube); break;
            case "B": Move.moveB(cube); break;
            case "U'": Move.moveUPrime(cube); break;
            case "D'": Move.moveDPrime(cube); break;
            case "L'": Move.moveLPrime(cube); break;
            case "R'": Move.moveRPrime(cube); break;
            case "F'": Move.moveFPrime(cube); break;
            case "B'": Move.moveBPrime(cube); break;
            default: System.out.println("Invalid move: " + move);
        }
    }
    public List<String> getMoveHistory() {
        return moveHistory;
    }
}