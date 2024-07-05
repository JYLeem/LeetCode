class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        
        while (left < right) {
            int hg = height[right] >= height[left] ? height[left] : height[right];
            int width = right - left;
            int currentArea = hg * width;

            area = area >= currentArea ? area : currentArea;

            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return area;
    
    }
}