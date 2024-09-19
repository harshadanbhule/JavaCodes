//swap required


public class MatrixSwaps {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1}
        };
        int targetRow = 2;
        int targetCol = 2;
        // Find the current position of the 1
        int currentRow = -1, currentCol = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    currentRow = i;
                    currentCol = j;
                    break;
                }
            }
            if (currentRow != -1) break;  // Break out of outer loop if 1 is found
        }
        int swapsRequired = (currentRow - targetRow) +(currentCol - targetCol);
        System.out.println( swapsRequired);
    }
}
