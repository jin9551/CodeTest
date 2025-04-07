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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 두개의 부모노드가 null이면 true
        if (p == null && q == null) {
            return true;
        }
        // p가 널이거나 q가 널이거나 p와 q의 값이 안 맞으면 false
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        
        // 재귀 함수로 오른쪽과 왼쪽에서도 똑같은걸 해주고
        // 둘 다 true면 true; 하나라도 false면 false.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}