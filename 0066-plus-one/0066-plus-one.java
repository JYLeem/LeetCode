import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder numStr = new StringBuilder();
        for (int digit : digits) {
            numStr.append(digit);
        }
        
        BigInteger val = new BigInteger(numStr.toString());
        
        val = val.add(BigInteger.ONE);
        
        String resultStr = val.toString();
        int[] ansArr = new int[resultStr.length()];
        
        for (int i = 0; i < resultStr.length(); i++) {
            ansArr[i] = resultStr.charAt(i) - '0';
        }
        
        return ansArr;
    }
}
