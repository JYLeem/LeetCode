class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String result = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char currentChar = result.charAt(0);
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    count++;
                } else {
                    sb.append(count).append(currentChar);
                    currentChar = result.charAt(j);
                    count = 1;
                }
            }
            
            sb.append(count).append(currentChar);
            result = sb.toString();
        }
        
        return result;
    }
}
