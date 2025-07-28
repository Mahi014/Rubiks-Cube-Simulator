import java.util.*;

public class Solver {
    public static void reverseSolve(Cube cube, List<String> scrambleMoves) {
        List<String> reverseMoves = new ArrayList<>();
        for (int i = scrambleMoves.size() - 1; i >= 0; i--) {
            String move = scrambleMoves.get(i);
            String inverse = invertMove(move);
            reverseMoves.add(inverse);
            applyMove(cube, inverse);
        }

        System.out.println("Reverse Moves Applied:");
        System.out.println(reverseMoves);
    }
    private static String invertMove(String move) {
        return move.endsWith("'") ? move.substring(0, 1) : move + "'";
    }
    private static void applyMove(Cube cube, String move) {
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
        }
    }
}
