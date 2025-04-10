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
    public int maxDepth(TreeNode root) {

        // BFS 알고리즘
        // if(root == null) {
        //     return 0;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();

        // int depth = 0;

        // queue.offer(root);

        // while(!queue.isEmpty()){
        //     depth += 1;
        //     int q_size = queue.size();

        //     for(int i=0; i< q_size; i++){
        //         TreeNode node = queue.poll();
        //         if(node.left != null)
        //             queue.offer(node.left);
        //         if(node.right != null)
        //             queue.offer(node.right);
        //     }
        // }

        // return depth;

        int depth = 0;
        if(root == null){
            return 0;
        }
        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);

        depth = Math.max(leftdepth,rightdepth)+1;
        return depth;

    }
}