import java.lang.*;
public class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  
  TreeNode (int val){
    this.val = val;
  }
}

public class HelloWorld
{
  public static void main(String[] args)
  {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    helper(root, 1);
  }
  
  public static int helper(TreeNode root, int depth){
    if(root == null) return depth;
    System.out.println(depth);
    return Math.max(helper(root.left, depth + 1), helper(root.right, depth + 1));
  }
}

// result: 1 2 3 3 2  from top =  1 to the deepest place

import java.lang.*;
public class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  
  TreeNode (int val){
    this.val = val;
  }
}

public class HelloWorld
{
  public static void main(String[] args)
  {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    System.out.println(helper(root));
  }
  
  public static int helper(TreeNode root){
    if(root == null) return 0;
    int left = helper(root.left);
    int right = helper(root.right);
    System.out.println(left + " " + right);
    return Math.max(left, right) + 1;
  }
}
//result: get each depth of every subtrees from deepest tree 1 to it's root
// 0 0
// 0 0
// 1 1
// 0 0
// 2 1
// 3


