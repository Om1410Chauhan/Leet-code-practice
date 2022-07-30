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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> li=new ArrayList();
        String s="";
         binaryTree(root,li,s);
        return li;
    }
    void binaryTree(TreeNode root,List<String>li,String s){
        if(root==null){
            return ;
        }
        s+=root.val; 
           
        if(root.left==null &&root.right==null){
            li.add(s);
            return;
        }
        s+="->";      

    
        binaryTree(root.left,li,s);
        binaryTree(root.right,li,s);
        s=s.substring(0,s.length()-1);    
        
    }
}