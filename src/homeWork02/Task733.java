package homeWork02;

public class Task733 {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void dfs(int[][] grid, int i, int j, int oldColor, int newColor) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != oldColor)
            return;
        grid[i][j] = newColor;
        dfs(grid, i, j + 1, oldColor, newColor);
        dfs(grid, i, j - 1, oldColor, newColor);
        dfs(grid, i + 1, j, oldColor, newColor);
        dfs(grid, i - 1, j, oldColor, newColor);
    }
}
