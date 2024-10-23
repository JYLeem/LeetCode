class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int temp : nums) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                ans = entry.getKey();
                break;
            }
        }

        return ans;
    }
}
