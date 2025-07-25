public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        System.out.println("Before U move:");
        cube.printCube(); 
        Move.moveU(cube);
        System.out.println("After U move:");
        cube.printCube();
    }
}