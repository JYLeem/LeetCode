class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        Arrays.sort(words);

        for (int i = 0; i <= s.length() - totalLength; i++) {
            List<String> temp = new ArrayList<>();

            for (int j = 0; j < totalLength; j += wordLength) {
                temp.add(s.substring(i + j, i + j + wordLength));
            }

            Collections.sort(temp);
            
            if (Arrays.equals(temp.toArray(), words)) {
                ans.add(i);
            }
        }

        return ans;
    }
}