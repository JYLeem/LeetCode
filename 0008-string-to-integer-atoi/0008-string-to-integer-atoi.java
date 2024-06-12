class Solution {
        public int myAtoi(String s) {
        if (s.isBlank()) return 0;
        int ans = 0;
        s = s.strip();
        int sign = (s.charAt(0) == '-') ? -1 : 1;
        int i = ((sign == -1) || s.charAt(0) == '+') ? 1 : 0;
        if (!Character.isDigit(s.charAt(0)) && i == 0) return 0;

        /*
            문제가 생기는 경우
            ans * 10 + digit > MAX;
            -(ans * 10 + digit) < MIN;

            digit > MAX - ans * 10 ;
            -digit < ( MIN + ans * 10 ) ;
         */

        while (s.length() > i){
            if (Character.isDigit(s.charAt(i))){
                int digit = Integer.parseInt(String.valueOf(s.charAt(i)));

                if ( ans * sign > (Integer.MAX_VALUE - digit) /10) return Integer.MAX_VALUE;
                else if ( ans * sign < (Integer.MIN_VALUE + digit) /10) return Integer.MIN_VALUE;

                ans = ans*10 + digit;
                i++;

            }
            else {
                break;
            }
        }
        return ans * sign;
    }
 }