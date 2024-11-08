/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        bfs(root, ans, 0);
        return ans;
    }

    private void bfs(TreeNode cur, List<List<Integer>> ans, int lev){
        if (cur == null) return;

        if (ans.size() <= lev){
            List<Integer> temp = new LinkedList<>();
            ans.add(temp);
        }

        List<Integer> col = ans.get(lev);
        if (lev % 2 == 0) col.add(cur.val);
        else col.add(0, cur.val);

        bfs(cur.left, ans, lev + 1);
        bfs(cur.right, ans, lev + 1);
        
    }
}