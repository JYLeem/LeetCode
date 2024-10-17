class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() <= 1) return true;
        int count = s.length();

        for (int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if (('a' <= tmp && 'z' >= tmp) || ('A' <= tmp && 'Z' >= tmp) || ('0' <= tmp && tmp <= '9')){
                sb.append(tmp);
            }
        }

        String mac = sb.toString().toLowerCase();

        int left = 0;
        int right = mac.length()-1;

        while (left < right){
            if (mac.charAt(left) != mac.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}