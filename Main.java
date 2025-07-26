public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();

        System.out.println("Initial Cube:");
        cube.printCube();

        System.out.println("After moveU:");
        Move.moveU(cube);
        cube.printCube();

        System.out.println("After moveD:");
        Move.moveD(cube);
        cube.printCube();

        System.out.println("After moveL:");
        Move.moveL(cube);
        cube.printCube();

        System.out.println("After moveR:");
        Move.moveR(cube);
        cube.printCube();

        System.out.println("After moveF:");
        Move.moveF(cube);
        cube.printCube();

        System.out.println("After moveB:");
        Move.moveB(cube);
        cube.printCube();
    }
}
