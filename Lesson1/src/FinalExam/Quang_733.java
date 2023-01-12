package FinalExam;

import java.io.FilterOutputStream;

public class Quang_733 {
    public static void main(String[] args) {
//        System.out.println();
        System.out.println("Kết Quả");
        printArray2D(floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
    }

    public static void printArray2D(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // time complextity: O(n)
    // space comlexity: O(n)
    // sử dụng DFS đổi màu 4 ô kế cận
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }

    public static void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        // nếu image tại start == oldColor => đổi màu 4 ô trên dưới trái phải
        if (image[row][col] == oldColor) {
            image[row][col] = newColor;
            // top
            if (row >= 1)
                dfs(image, row - 1, col, oldColor, newColor);
            // left
            if (col >= 1)
                dfs(image, row, col - 1, oldColor, newColor);
            // bottom
            if (row + 1 < image.length)
                dfs(image, row + 1, col, oldColor, newColor);
            // right
            if (col + 1 < image[0].length)
                dfs(image, row, col + 1, oldColor, newColor);
        }
    }
}
