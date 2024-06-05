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
    public int[] findMode(TreeNode root) {
       List<Integer> nodeList = new ArrayList<>();
        inOrderTraversal(root, nodeList);
         int[] ans=new int[1];
      int j=0;
        for (int i = 1; i < nodeList.size(); i++) {
            if (nodeList.get(i) == nodeList.get(i - 1)) {
              ans[j]=nodeList.get(i);
              j++;
              ans.length=ans.length+1;
            }
        }
        return ans;
    }
`

    public void inOrderTraversal(TreeNode node, List<Integer> nodeList) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, nodeList);
        nodeList.add(node.val);
        inOrderTraversal(node.right, nodeList);
    }
        
    
}