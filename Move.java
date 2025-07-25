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
        //shifting top rows
        cube.F[0] = cube.L[0].clone();
        cube.L[0] = cube.B[0].clone();
        cube.B[0] = cube.R[0].clone();
        cube.R[0] = temp;
    }
}
