public class Cube {
    public String[][] U = new String[3][3]; //up face
    public String[][] D = new String[3][3]; //down face
    public String[][] L = new String[3][3]; //left face
    public String[][] R = new String[3][3]; //right face
    public String[][] F = new String[3][3]; //front face
    public String[][] B = new String[3][3]; //back face

    public void fillFace(String[][] face, String color) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                face[i][j] = color;
            }
        }
    }
    public Cube() {
        fillFace(U, "W"); //white on up
        fillFace(D, "Y"); //yellow on down
        fillFace(L, "O"); //orange on left
        fillFace(R, "R"); //red on right
        fillFace(F, "G"); //green on front
        fillFace(B, "B"); //blue on back
    }
    public void printFace(String name, String[][] face) {
        System.out.println(name + " face:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(face[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printCube() {
        printFace("U", U);
        printFace("D", D);
        printFace("L", L);
        printFace("R", R);
        printFace("F", F);
        printFace("B", B);
    }
}