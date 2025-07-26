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
        String[] temp = cube.U[2].clone();
        for (int i = 0; i < 3; i++) {
            cube.U[2][i] = cube.L[2 - i][2];
            cube.L[2 - i][2] = cube.D[0][i]; // Corrected line
            cube.D[0][i] = cube.R[2 - i][0]; // Corrected line
            cube.R[i][0] = temp[i];
        }
    }
    public static void moveB(Cube cube) {
        rotateFaceClockwise(cube.B);
        String[] temp = cube.U[0].clone();
        for (int i = 0; i < 3; i++) {
            cube.U[0][i] = cube.R[2 - i][2]; // Corrected line
            cube.R[2 - i][2] = cube.D[2][i]; // Corrected line
            cube.D[2][i] = cube.L[i][0]; // Corrected line
            cube.L[i][0] = temp[2 - i]; // Corrected line
        }
    }
    public static void moveL(Cube cube) {
        rotateFaceClockwise(cube.L);
        String[] temp = new String[3];
        for (int i = 0; i < 3; i++) {
            temp[i] = cube.F[i][0];
        }
        for (int i = 0; i < 3; i++) {
            cube.F[i][0] = cube.U[i][0];
            cube.U[i][0] = cube.B[2 - i][2];
            cube.B[2 - i][2] = cube.D[i][0];
            cube.D[i][0] = temp[i];
        }
    }
    public static void moveR(Cube cube) {
        rotateFaceClockwise(cube.R);
        String[] temp = new String[3];
        for (int i = 0; i < 3; i++) {
            temp[i] = cube.F[i][2];
        }
        for (int i = 0; i < 3; i++) {
            cube.F[i][2] = cube.D[i][2];
            cube.D[i][2] = cube.B[2 - i][0];
            cube.B[2 - i][0] = cube.U[i][2];
            cube.U[i][2] = temp[i];
        }
    }
}