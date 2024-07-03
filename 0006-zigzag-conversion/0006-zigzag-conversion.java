class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        char mat[][] = new char[numRows][1000];
        boolean visited[][] = new boolean[numRows][1000];
        int row = 0, col = 0, total = 0;
        boolean flag = true;

        while(total < s.length()){
            if(row < numRows && flag){
                mat[row++][col] = s.charAt(total++);
                visited[row-1][col] = true;
                if (row == numRows) {
                    flag = false;
                    row--;
                }
            } 
            else if (flag == false) {
                mat[--row][++col] = s.charAt(total++);
                visited[row][col] = true;

                if (row == 0) {
                    flag = true;
                    row++;
                }
            }
        }

        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < col+1; j++){
                if ( visited[i][j] ){
                    sb.append(mat[i][j]);
                }
            }
        }

        return sb.toString();
    }
}