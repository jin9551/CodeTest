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
    public boolean isSymmetric(TreeNode root) {

        if(root == null) {
            return true;
        }
        // 좌우측 출발
        return check(root.left,root.right);
    }

    public boolean check(TreeNode left, TreeNode right){
        // 좌우측 둘 다 끝이라면 ok
        if(left == null && right==null){
            return true;
        } 
        // 둘 중 하나만 끝이라면 no
        if(left == null || right ==null){
            return false;
        }
        // 좌우측 값이 같고 좌측의 왼쪽1, 우측의 오른쪽1          그리고        좌측의 오른쪽2 우측의 왼쪽2 탐색 결과
        /*               좌                        우
        *          왼쪽1    오른쪽2             왼쪽2     오른쪽1                            
        *                           이거 반복                                                    */
        return left.val==right.val && check(left.left, right.right) && check(left.right, right.left);
    }
 
}