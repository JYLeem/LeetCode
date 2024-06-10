class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> dic = new HashMap<>();
        dic.put('I', 1);
        dic.put('V', 5);
        dic.put('X', 10);
        dic.put('L', 50);
        dic.put('C', 100);
        dic.put('D', 500);
        dic.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && dic.get(s.charAt(i)) < dic.get(s.charAt(i + 1))) {
                ans -= dic.get(s.charAt(i));
            } else {
                ans += dic.get(s.charAt(i));
            }
        }
        return ans;
    
    }
}