// 54. Spiral Matrix

import java.util.Arrays;
public class SpiralMatrix {

    public static int[] spiralMatrix(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m * n];
        int index = 0;

        int startRow = 0;
        int startCol = 0;
        int endRow = m - 1;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top row
            for (int j = startCol; j <= endCol; j++) {
                result[index++] = matrix[startRow][j];
            }

            // Right column
            for (int i = startRow + 1; i <= endRow; i++) {
                result[index++] = matrix[i][endCol];
            }

            // Bottom row
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break;
                result[index++] = matrix[endRow][j];
            }

            // Left column
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) break;
                result[index++] = matrix[i][startCol];
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return result;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(spiralMatrix(matrix)));
    }
}
