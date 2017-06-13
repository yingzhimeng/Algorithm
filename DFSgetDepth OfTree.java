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

