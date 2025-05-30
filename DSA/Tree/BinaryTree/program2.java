class Node{

	int data;
	Node left=null;
	Node right=null;

	Node(int data){
		this.data=data;
	}
}

class BinaryTree{
	int index=-1;
	Node constructBt(int[] arr){
		index++;
		if(arr[index]==-1){
			return null;
		}
		Node newNode=new Node(arr[index]);
		newNode.left=constructBt(arr);
		newNode.right=constructBt(arr);

		return newNode;
	}

	void preOrder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);

	}

	int countNode(Node root){
		if(root==null){
			return 0;
		}

		int leftCount=countNode(root.left);
		int rightCount=countNode(root.right);

		return leftCount+rightCount+1;
	}

	int sumNode(Node root){
		if(root==null){
			return 0;
		}
			
		int leftSum = sumNode(root.left);
    		int rightSum = sumNode(root.right);

		return leftSum+rightSum+root.data;
	}
	int heightNode(Node root){
                if(root==null){
                        return 0;
                }

                int leftheight = heightNode(root.left);
                int rightheight = heightNode(root.right);

                return Math.max(leftheight,rightheight)+1;
        }
	public static void main(String[] args){
		int arr[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree Bt=new BinaryTree();
		Node root=Bt.constructBt(arr);
		Bt.preOrder(root);
		System.out.println("");
		int count=Bt.countNode(root);
		System.out.println("Count : "+count);
		int sum=Bt.sumNode(root);
		System.out.println("Sum : "+sum);
		int height=Bt.heightNode(root);
		System.out.println("height : "+height);
	
	}

}
