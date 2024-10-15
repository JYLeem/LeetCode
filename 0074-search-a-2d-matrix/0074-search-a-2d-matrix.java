class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int result = -1;

        for (int[] tmp : matrix){
            result = Arrays.binarySearch(tmp, target);
            if (result >= 0) return true;
        }

        return false;

    }
}