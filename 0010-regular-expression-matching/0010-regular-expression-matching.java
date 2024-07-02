class Solution {
    public boolean isMatch(String s, String p) {
        boolean ans = true;
        int i = 0;
        String[] S = s.split("");
        String[] P = p.split("");

        if (s.length() != p.length()) return false;
        
        while (i < s.length()) {
            String sTemp = S[i];
            String pTemp = P[i];

            if (sTemp.equals(pTemp))i++;
            else {
                if (sTemp.equals(".") || pTemp.equals("."))i++;
                else if (sTemp.equals("*")){
                    S[i] = S[i-1];
                    i--;
                }
                else if (pTemp.equals("*")){
                    P[i] = P[i-1];
                    i--;
                } else ans = false; break;
            }
        }

        return ans;
    }
}