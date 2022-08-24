class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) continue;
                mat[i][j] = row + col;
                if (i > 0) mat[i][j] = Math.min(mat[i][j], mat[i - 1][j] + 1);
                if (j > 0) mat[i][j] = Math.min(mat[i][j], mat[i][j - 1] + 1);
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (mat[i][j] == 0) continue;
                if (i < row - 1) mat[i][j] = Math.min(mat[i][j], mat[i + 1][j] + 1);
                if (j < col - 1) mat[i][j] = Math.min(mat[i][j], mat[i][j + 1] + 1);
            }
        }
        
        return mat;
    }
}