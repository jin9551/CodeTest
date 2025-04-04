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
    public List<Integer> inorderTraversal(TreeNode root) {
                
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }
    
    public void traversal(TreeNode root, List<Integer> result) {
        // 끝에 닿았을 경우 부모노드로 돌아간다.
        if(root == null) {
            return;
        }
        // inorder 중위순회로 처리하는 방식이다.
        // 좌 부 우
        // 왼쪽으로 쭉 내려가서 끝을 만나면 올라와서
        // 부모노드 탐색하고 오른쪽으로 내려가는것을 반복
        traversal(root.left, result);
        result.add(root.val);
        traversal(root.right, result);

        /* preorder 전위순회 방식이다. 
        부 좌 우 순으로 탐색
        result.add(root.val);
        traversal(root.left, result);
        traversal(root.right, result);
        */

        /* postorder 후위순회 방식이다. 
        좌 우 부 순으로 탐색
        traversal(root.left, result);
        traversal(root.right, result);
        result.add(root.val);
        */
        
    }


}
