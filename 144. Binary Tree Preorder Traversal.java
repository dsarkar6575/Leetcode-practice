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
    List<Integer> l=new ArrayList<>();
    public void preorder(TreeNode root,List<Integer>l)
    {
         if(root==null) return;

         l.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
       preorder(root,l);
        return l;
    }

}
