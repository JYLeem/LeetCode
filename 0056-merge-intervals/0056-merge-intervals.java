class Solution {
    public int[][] merge(int[][] intervals) {
        int count = intervals.length;
        int[][] ans = new int[count][2];
        int j = 0;

        if (count == 1){
            return intervals;
        }

        for (int i = 0; i < count - 1; i+=2){
            if (intervals[i][1] >= intervals[i+1][0]){
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i+1][1];
            }
            else {
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
                j++;
                ans[j][0] = intervals[i+1][0];
                ans[j][1] = intervals[i+1][1];
            }
            j++;
        }
        
        int[][] fin = Arrays.copyOf(ans, j);

        return fin;
    }
}