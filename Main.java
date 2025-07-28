import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        Scrambler scrambler = new Scrambler();
        System.out.println("Original (Solved) Cube:");
        cube.printCube();
        //scramble
        scrambler.scramble(cube, 20);
        List<String> scrambleMoves = scrambler.getMoveHistory();
        System.out.println("Scrambled Cube:");
        cube.printCube();
        System.out.println("Scramble Moves:");
        System.out.println(scrambleMoves);
        //solve by reversing scramble
        Solver.reverseSolve(cube, scrambleMoves);
        System.out.println("Cube After Reverse Solving:");
        cube.printCube();
    }
}