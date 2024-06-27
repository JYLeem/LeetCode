class Solution {
    List<String> ret = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n, 0 ,0, "");
        return ret;
    }
    public void helper(int n, int open, int close, String s) {
        if(s.length() == n*2) {
            ret.add(s);
            return;
        }
        if(open<n) helper(n, open+1, close, s+"(");
        if(close<open) helper(n, open, close+1, s+")");
    }
}