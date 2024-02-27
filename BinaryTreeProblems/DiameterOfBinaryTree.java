package BinaryTreeProblems;


/*
543. Diameter of Binary Tree

Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.

 

Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:
Input: root = [1,2]
Output: 1
 */
public class DiameterOfBinaryTree {
    public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    //     public static int height(TreeNode root) {
    //         if(root==null){
    //             return 0;
    //         }
    //         int leftHeight = height(root.left);
    //         int rightHeight = height(root.right);
    
    //         return  1 + Math.max(leftHeight,rightHeight);
    
    
    //     }
    //     public int diameterOfBinaryTree(TreeNode root) {
    //         	if(root==null){
    // 			return 0;
    // 		}
    
    
    // 		int ld = diameterOfBinaryTree(root.left);
    // 		int rd = diameterOfBinaryTree(root.right);
    
    // 		int lh = height(root.left);
    // 		int rh = height(root.right);
    
            
    // 		return Math.max(Math.max(ld,rd),(lh+rh));
            
    //     }
        int ans=0;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root==null )return 0;
            height(root);
            return ans;
        }
        
        public int height(TreeNode root){
            //if root==null height==0
            if(root==null)return -1;
            
            int L=height(root.left);
            int R=height(root.right);
            //ans signfies(no. of nodes farthest apart) or the DIAMETER
            ans=Math.max(ans,L+R+2);
            //height of the tree is max of LST & RST +1
            return 1+Math.max(L,R);
        }
    }
    
    // // faster approch with another taking class with height and diameter
    // class maxDiameter{
    
    //     int maxD;
    //     int height;
    // }
    // public class Solution {
    
    // 	public static int diameterOfBinaryTree(TreeNode root){
    // 		//Your code goes here
            
    //         int d=maxDiameter1(root).maxD;
    //         return d;
    // 	}
        
    //     public static maxDiameter maxDiameter1(TreeNode root){
    
    //         if(root==null){
    
    //             maxDiameter o1 = new maxDiameter();
    //             o1.height=0;
    //             o1.maxD=0;
    //             return o1;
    //         }
    
    //         maxDiameter l1=maxDiameter1(root.left);
    //         maxDiameter r1=maxDiameter1(root.right);
    //         int h=1+Math.max(l1.height,r1.height);
    //         int d=l1.height+r1.height;
    //         int maxd=Math.max(d,Math.max(l1.maxD,r1.maxD));
    //         maxDiameter ans=new maxDiameter();
    //         ans.height=h;
    //         ans.maxD=maxd;
    //         return ans;
    //     }
        
    // }