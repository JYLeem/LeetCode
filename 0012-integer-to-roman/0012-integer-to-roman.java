class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            if (num >= 1000){
                sb.append("M");
                num -= 1000;
            }
            else if (num < 1000 && num >= 900){
                sb.append("CM");
                num -= 900;
            }
            else if (num < 900 && num >= 500){
                sb.append("D");
                num -= 500;
            }
            else if (num < 500 && num >= 400){
                sb.append("CD");
                num -= 400;
            }
            else if (num < 400 && num >= 100){
                sb.append("C");
                num -= 100;
            }
            else if (num < 100 && num >= 90){
                sb.append("XC");
                num -= 90;
            } 
            else if (num < 90 && num >= 50){
                sb.append("L");
                num -= 50;
            }
            else if (num < 50 && num >= 40){
                sb.append("XL");
                num -= 40;
            }
            else if (num < 40 && num >= 10){
                sb.append("X");
                num -= 10;
            }
            else if (num < 10 && num >= 9){
                sb.append("IX");
                num -= 9;
            }
            else if (num < 9 && num >= 5){
                sb.append("V");
                num -= 5;
            }
            else if (num < 5 && num >= 4){
                sb.append("IV");
                num -= 4;
            }
            else {
                sb.append("I");
                num -= 1;
            }
        }
        return sb.toString();
    }
}