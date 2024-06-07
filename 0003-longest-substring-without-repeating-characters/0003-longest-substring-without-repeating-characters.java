class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cnt = 1;
        HashSet<Character> temp2 = new HashSet<>();
        LinkedList<Integer> ans = new LinkedList<>();

        for (int i = 0; i < s.length(); i++){
            temp2.add(s.charAt(i));
            ans.add(cnt);
            for (int j = i+1; j < s.length(); j++) {
                if (!(temp2.contains(s.charAt(j)))) {
                    temp2.add(s.charAt(j));
                    ans.add(++cnt);
                } else {
                    ans.add(cnt);
                    break;
                }
            }
            cnt = 1;
            temp2.clear();
        }

        ans.sort(Collections.reverseOrder());
        if (ans.isEmpty()) return 0;
        else return (ans.get(0));
    }
}