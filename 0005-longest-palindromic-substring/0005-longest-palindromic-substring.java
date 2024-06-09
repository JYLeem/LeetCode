import java.util.*;

class Solution {
    static String ans = "";
    static int cnt = 0;

    public static String longestPalindrome(String s) {
        ans = "";
        cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            // 홀수 길이 팰린드롬 체크
            expandAndCheck(s, i, i);
            // 짝수 길이 팰린드롬 체크
            expandAndCheck(s, i, i + 1);
        }

        return ans;
    }

    public static void expandAndCheck(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            Checker(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static boolean Checker(String s) {
        if (s.length() > cnt) {
            cnt = s.length();
            ans = s;
            return true;
        }
        return false;
    }
}
