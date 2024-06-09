class Solution {
    static String ans;
    static int cnt = 0;

    public String longestPalindrome(String s) {
        ans = "";
        cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                Checker(substring);
            }
        }
        return ans;
    }

    public static void Checker(String s) {
        if (s.length() <= cnt) return;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return;
            }
            left++;
            right--;
        }
        cnt = s.length();
        ans = s;
    }
}