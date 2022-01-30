package binary_tree;

import java.util.LinkedList;
import java.util.Queue;



public class BinaryTreeMain {
	
	
	
	
	static void displayOddNodes(Node root)
	{
		
		if (root == null) return;

		
		Queue<Node> q = new LinkedList<Node> ();

		
		q.add(root);
		boolean isOdd = true;
        System.out.println("Nodes at odd level of binary tree:");
		while (true)
		{
			// nodeCount (queue size) indicates
			// number of nodes at current level.
			int nodeCount = q.size();
			if (nodeCount == 0)
				break;

			// Dequeue all nodes of current level
			// and Enqueue all nodes of next level
			
			while (nodeCount > 0)
			{
				Node node = q.peek();
				if (isOdd == true)
				System.out.print(node.data + " ");
				q.remove();
				if (node.leftChild != null)
					q.add(node.leftChild);
				if (node.rightChild != null)
					q.add(node.rightChild);
				nodeCount--;
			}

			isOdd = !isOdd;
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Node root = new Node(11);
	    root.leftChild = new Node(12);
	    root.rightChild = new Node(13);
	    
	    root.leftChild.leftChild = new Node(14);
	    root.leftChild.rightChild = new Node(15);
	    root.rightChild.rightChild = new Node(16);
	    
	    root.leftChild.rightChild.leftChild = new Node(17);
	    root.leftChild.rightChild.rightChild = new Node(18);
	    root.rightChild.rightChild.leftChild = new Node(19);
	    
	    displayOddNodes(root);
		
	}

}
