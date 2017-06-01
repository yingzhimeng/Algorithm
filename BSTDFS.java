import java.util.*;
public class BSTDFS
{
  public static void main(String[] args)
  {
   Node root = new Node(1); 
    root.left = new Node(2); 
	root.left.left = new Node(4); 
    root.left.right = new Node(5); 
	root.right = new Node(3); 
    root.right.left = new Node(6); 
	root.right.right = new Node(7);  		 
    BSTDFS b = new BSTDFS(); 
	System.out.println("Depth-First-Search : "); 
    b.DFS(root); 

  }
  
  public void DFS(Node root){
    Stack<Node> s = new Stack<Node>();
    s.push(root);
    while(s.isEmpty() == false){
      Node x = s.pop();
      if(x.right != null) s. push(x.right);
      if(x.left != null) s.push(x.left);
      System.out.println(" " + x.data);
    }
  }
}

class Node{
  int data;
  Node left;
  Node right;
  public Node(int data){
    this.data = data;
  }
}

