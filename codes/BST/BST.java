class BST{

	Node root = null;
	
	class Node{
		int key;
		Node left, right;

		Node(int inKey)
		{
			key = inKey;
			left = null;
			right = null;
		}
	}

	public void insert (int inVal)
	{
		root = insertVal(root, inVal);
	}

	public Node insertVal(Node root, int inVal)
	{
		if (root==null){
			root = new Node(inVal);
			return root;
		}

		if (root.key > inVal){
			root.left = insertVal(root.left, inVal);
		}else{
			root.right = insertVal(root.right, inVal);
		}

		return root;

	}

	public static void main (String args [])
	{
		BST bst = new BST();

		bst.insert(3);
		bst.insert(4);
		bst.insert(2);

		System.out.println(" Left : "+ bst.root.left.key);

	}
}