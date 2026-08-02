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
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0 ; i<size; i++){
                TreeNode current = q.poll();
                currentLevel.add(current.val);
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
            if(level%2 != 0){
                Collections.reverse(currentLevel);
            }
            level++;
            ans.add(currentLevel);
        }
        return ans;
    }
}