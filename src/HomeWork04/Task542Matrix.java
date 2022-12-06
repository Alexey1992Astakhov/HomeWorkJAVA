package HomeWork04;

import java.util.LinkedList;
import java.util.Queue;

public class Task542Matrix {
    public static void main(String[] args) {
        class Solution {
            static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            public int[][] updateMatrix(int[][] mat) {


                Queue<int[]> q = new LinkedList<>();
                boolean[][] seen = new boolean[mat.length][mat[0].length];

                for (int row = 0; row < mat.length; row++) {
                    for (int col = 0; col < mat[0].length; col++) {
                        if (mat[row][col] == 0) {
                            q.offer(new int[]{row, col});
                            seen[row][col] = true;
                        }
                    }
                }

                while (!q.isEmpty()) {
                    int[] curPoint = q.poll();
                    int curRow = curPoint[0];
                    int curCol = curPoint[1];
                    for (int[] direction : DIRECTIONS) {
                        int newRow = curRow + direction[0];
                        int newCol = curCol + direction[1];
                        if (newRow < 0 || newCol < 0 ||
                                newRow == mat.length || newCol == mat[0].length ||
                                mat[newRow][newCol] <= mat[curRow][curCol] + 1) continue;
                        if (seen[newRow][newCol]) continue;
                        mat[newRow][newCol] = mat[curRow][curCol] + 1;
                        q.offer(new int[]{newRow, newCol});
                        seen[newRow][newCol] = true;

                    }
                }
                return mat;

            }
        }
    }
}

