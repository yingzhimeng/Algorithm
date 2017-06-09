// Using stack to implement
import java.util.*;
public class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int val){
    this.val = val;
  }
}

public class BTIT
{
  public static ArrayList<Integer> inorder(TreeNode root){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<>();
    
    while(root != null || !stack.isEmpty()){
      while(root != null){
        stack.push(root);
        root = root.left;
      }
      
      root = stack.pop();
      list.add(root.val);
      root = root.right;
    }
    
    return list;
  }
  
  public static void main(String[] args)
  {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    list = inorder(root);
    for(Integer i : list){
      System.out.print(i + "  ");
    }
  }
}

// Using recursive
import java.util.*;
public class TreeNode{ 
  int val;  
  TreeNode left;  
  TreeNode right;  
  TreeNode(int val){   
    this.val = val;  
  }
}
public class BTIT{ 
  public static List<Integer> list = new ArrayList<Integer>();  
  public static void inorder(TreeNode root){   
    if(root == null) return;   
    inorder(root.left); 
    list.add(root.val);   
    inorder(root.right);   
  }   
  public static void main(String[] args)  {  
    TreeNode root = new TreeNode(1); 
    root.left = new TreeNode(2);  
    root.right = new TreeNode(3);   
    root.left.left = new TreeNode(4);   
    root.left.right = new TreeNode(5);      
    inorder(root);   
    for(Integer i : list){    
      System.out.print(i + "  ");  
    }  
  }
}
