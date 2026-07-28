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
    private void dfs(TreeNode root, int depth , List<Integer> ans){
        if(root == null) return;
        if(ans.size() == depth){
            ans.add(root.val);
        }
        dfs(root.right, depth+1, ans);
        dfs(root.left, depth+1, ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0 , ans);
        return ans;




        // Queue<TreeNode> q = new LinkedList<>();
        // List<Integer> ans = new ArrayList<>();
        // if(root == null) return ans;
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     for(int i = 0; i< size; i++){
        //         TreeNode current = q.poll();
        //         if(i == size-1){
        //             ans.add(current.val);
        //         }

        //         if(current.left != null){
        //             q.offer(current.left);
        //         }
        //         if(current.right != null){
        //             q.offer(current.right);
        //         }
        //     }
        // }
        // return ans;
    }
}