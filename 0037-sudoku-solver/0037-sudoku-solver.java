class Solution {
    public void solveSudoku(char[][] board) {
        backTracking(board, 0, 0);
    }

    private boolean backTracking(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }

        if (col == 9) {
            return backTracking(board, row + 1, 0);
        }

        if (board[row][col] != '.') {
            return backTracking(board, row, col + 1);
        }

        for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (backTracking(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }

        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num || 
                board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == num) {
                return false;
            }
        }
        return true;
    }
}
