class Solution {
    public boolean isValid(String s) {
        boolean flag = false;
        ArrayList <Character> in = new ArrayList<>();
        in.add('{');
        in.add('(');
        in.add('[');
        Stack <Character> arr = new Stack<>();
        if (s.length() % 2 == 1) return flag;

        for (int i = 0; i < s.length(); i++){
            if (in.contains(s.charAt(i))){
                arr.push(s.charAt(i));
            } else {
                if (arr.empty()) return false;
                flag = (s.charAt(i) == '}' && arr.peek() == '{') || (s.charAt(i) == ')' && arr.peek() == '(') || (s.charAt(i) == ']' && arr.peek() == '[');
                if (!flag) return flag;
                else arr.pop();
            }
        }
        if (!arr.empty()) return false;
        return flag;
    }
}