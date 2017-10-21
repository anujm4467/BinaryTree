class Node
{
   Node left,right;  // left and right child
   int data;  // data
   Node(int item)
   {
   	left = null;
   	right = null;
   	data = item;
   }
}
class ReverseLevelOrderInTree
{ 
  Node root;  // root 
  public int height(Node node)
  {
    if(node == null)  // base case no node is their 
    	return 0;
    else
    {
      int lefth = height(node.left);  // finding for left tree 
      int righth = height(node.right); // finding for right tree
      if(lefth > righth)     // comparing left and right and return it 
      	return (lefth+1);
      else
      	return (righth+1);
    }
  }

  public void reverseLevelOrderInTree(Node node)
  {
     int h = height(node);
     for(int i=h; i>=1; i--)  // loop to run till the height of tree
     {
     	printRLO(node , i);
     }
  }
  public void printRLO(Node node, int level)
  {
    if(node == null)  //  base case 
    	return;
    if(level == 1)      
    	System.out.print(node.data+" ");
    else if(level >1)
    {
      printRLO(node.left, level-1);
      printRLO(node.right, level-1);	
    }
  }

  public static void main(String[] args) 
  {
    ReverseLevelOrderInTree tree = new ReverseLevelOrderInTree();
     tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
          
        System.out.println("Level Order traversal of binary tree is : ");
        tree.reverseLevelOrderInTree(tree.root);
  }
}
