public class Move {
    public static void rotateFaceClockwise(String[][] face) {
        int n = face.length;
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String temp = face[i][j];
                face[i][j] = face[j][i];
                face[j][i] = temp;
            }
        }
        //reverse
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                String temp = face[i][left];
                face[i][left] = face[i][right];
                face[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    //clockwise
    public static void moveU(Cube cube) {
        rotateFaceClockwise(cube.U);
        String[] temp = cube.F[0].clone();
        cube.F[0] = cube.R[0].clone();
        cube.R[0] = cube.B[0].clone();
        cube.B[0] = cube.L[0].clone();
        cube.L[0] = temp;
    }
    public static void moveD(Cube cube) {
        rotateFaceClockwise(cube.D);
        String[] temp = cube.F[2].clone();
        cube.F[2] = cube.L[2].clone();
        cube.L[2] = cube.B[2].clone();
        cube.B[2] = cube.R[2].clone();
        cube.R[2] = temp;
    }
    public static void moveF(Cube cube) {
        rotateFaceClockwise(cube.F);
        String[] temp = new String[3];
        for (int i = 0; i < 3; i++) temp[i] = cube.U[2][i];
        for (int i = 0; i < 3; i++) cube.U[2][i] = cube.L[2 - i][2];
        for (int i = 0; i < 3; i++) cube.L[i][2] = cube.D[0][i];
        for (int i = 0; i < 3; i++) cube.D[0][i] = cube.R[2 - i][0];
        for (int i = 0; i < 3; i++) cube.R[i][0] = temp[i];
    }
    public static void moveB(Cube cube) {
        rotateFaceClockwise(cube.B);
        String[] temp = new String[3];
        for (int i = 0; i < 3; i++) temp[i] = cube.U[0][i];
        for (int i = 0; i < 3; i++) cube.U[0][i] = cube.R[i][2];
        for (int i = 0; i < 3; i++) cube.R[i][2] = cube.D[2][2 - i];
        for (int i = 0; i < 3; i++) cube.D[2][i] = cube.L[i][0];
        for (int i = 0; i < 3; i++) cube.L[i][0] = temp[2 - i];
    }
    public static void moveL(Cube cube) {
        rotateFaceClockwise(cube.L);
        String[] temp = new String[3];
        for (int i = 0; i < 3; i++) temp[i] = cube.U[i][0];
        for (int i = 0; i < 3; i++) cube.U[i][0] = cube.B[2 - i][2];
        for (int i = 0; i < 3; i++) cube.B[i][2] = cube.D[2 - i][0];
        for (int i = 0; i < 3; i++) cube.D[i][0] = cube.F[i][0];
        for (int i = 0; i < 3; i++) cube.F[i][0] = temp[i];
    }
    public static void moveR(Cube cube) {
        rotateFaceClockwise(cube.R);
        String[] temp = new String[3];
        for (int i = 0; i < 3; i++) temp[i] = cube.U[i][2];
        for (int i = 0; i < 3; i++) cube.U[i][2] = cube.F[i][2];
        for (int i = 0; i < 3; i++) cube.F[i][2] = cube.D[i][2];
        for (int i = 0; i < 3; i++) cube.D[i][2] = cube.B[2 - i][0];
        for (int i = 0; i < 3; i++) cube.B[i][0] = temp[2 - i];
    }
    //anticlockwise = 1 anticlockwise = 3 clockwise
    public static void moveUPrime(Cube cube) {
        moveU(cube); 
        moveU(cube); 
        moveU(cube);
    }

    public static void moveDPrime(Cube cube) {
        moveD(cube); 
        moveD(cube); 
        moveD(cube);
    }
    public static void moveFPrime(Cube cube) {
        moveF(cube); 
        moveF(cube); 
        moveF(cube);
    }
    public static void moveBPrime(Cube cube) {
        moveB(cube); 
        moveB(cube); 
        moveB(cube);
    }
    public static void moveLPrime(Cube cube) {
        moveL(cube); 
        moveL(cube); 
        moveL(cube);
    }

    public static void moveRPrime(Cube cube) {
        moveR(cube); 
        moveR(cube); 
        moveR(cube);
    }
}