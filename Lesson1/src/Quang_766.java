public class Quang_766 {
    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;//1
        int col = matrix[0].length;//1
        // check is Toeplitz ?
        // loop
        for (int i = 0; i < row-1; i++) { // 1 + (row-1) + row = 2row
            for (int j = 0; j < col-1; j++) { // 1 + (col-1) + col =2col
                if(matrix[i][j] != matrix[i+1][j+1]) // 3
                    return false; // 1
            }
        }
        // time: 2 + 2*row*(2col*4)+row-1 = 16*row*col+row+1
        // time complexity: O(n^2)
        // space complexity: O(1)
        return true;
    }
}
