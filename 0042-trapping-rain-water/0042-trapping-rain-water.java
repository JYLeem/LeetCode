class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int count = height.length;
        int ans = 0;

        int[] leftMax = new int[count];
        int[] rightMax = new int[count];

        leftMax[0] = height[0];
        for (int i = 1; i < count; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[count - 1] = height[count - 1];
        for (int i = count - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 1; i < count - 1; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            if (minHeight > height[i]) {
                ans += minHeight - height[i];
            }
        }

        return ans;
    }
}
