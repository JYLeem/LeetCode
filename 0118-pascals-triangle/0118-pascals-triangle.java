class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        
        for (int i = 0; i < numRows; i++){
            List<Integer> list = new LinkedList<>();

            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i){
                    list.add(1);
                }
                else {
                    int a = ans.get(i-1).get(j-1);
                    int b = ans.get(i-1).get(j);
                    list.add(a+b);
                }
            }
            ans.add(list);
        }

        return ans;
    }
}