public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        
        Scrambler scrambler = new Scrambler();
        System.out.println("Initial solved cube:");
        cube.printCube();
        scrambler.scramble(cube, 15);
        System.out.println("\nScramble moves:");
        System.out.println(String.join(" ", scrambler.getMoveHistory()));
        System.out.println("\nCube after scrambling:");
        cube.printCube();
    }
}