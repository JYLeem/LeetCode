class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++){
            int[] checkArr1 = new int[10];
            int[] checkArr2 = new int[10];
            for (int j = 0; j < 9; j++){
                char temp = board[i][j];
                char temp2 = board[j][i];

                if (Character.isDigit(temp)){
                    if (checkArr1[temp - '0'] > 0) return false;
                    checkArr1[temp - '0']++;
                }
                if (Character.isDigit(temp2)){
                    if (checkArr2[temp2 - '0'] > 0) return false;
                    checkArr2[temp2 - '0']++;
                }
            }
        }

        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                int[] checkArr = new int[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char temp = board[row + i][col + j];
                        if (Character.isDigit(temp)) {
                            if (checkArr[temp - '0'] > 0) return false;
                            checkArr[temp - '0']++;
                        }
                    }
                }
            }
        }

        return true;
    }
}
