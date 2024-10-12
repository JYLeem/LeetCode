class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    q.add(new Point(i, j));
                }
            }
        }
        
        while (!q.isEmpty()){
            Point temp = q.poll();
            int left = temp.y, right = temp.y;
            int top = temp.x, bottom = temp.x;
            while (right != matrix[0].length-1){
                matrix[temp.x][++right] = 0;
            }
            while (left != 0){
                matrix[temp.x][--left] = 0;
            }
            while (top != 0){
                matrix[--top][temp.y] = 0;
            }
            while (bottom != matrix.length-1){
                matrix[++bottom][temp.y] = 0;
            }
        }
        
    }

    static class Point {
        int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
