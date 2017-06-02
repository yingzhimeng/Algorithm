import java.util.*;
public class BSTBFS
{
  public void levelOrderQueue(Node root){
    Queue<Node> q = new LinkedList<Node>();
    if(root == null) return;
    q.add(root);
    while(!q.isEmpty()){
      Node n = q.remove();
      System.out.print(" " + n.val);
      if(n.left != null){
        q.add(n.left);
      }
      if(n.right != null){
        q.add(n.right);
      }
    }
  }
  public static void main(String[] args)
  {
    Node root = new Node(5);
	root.left = new Node(10);
	root.right = new Node(15);
	root.left.left = new Node(20);
	root.left.right = new Node(25);
	root.right.left = new Node(30);
	root.right.right = new Node(35);

	BSTBFS i = new BSTBFS();
	System.out.println("Breadth First Search : ");
	i.levelOrderQueue(root);
  }
}

public class Node{
  int val;
  Node left;
  Node right;
  public Node(int val){
    this.val = val;
    this.left = null;
    this.right = null;
  }
} 

