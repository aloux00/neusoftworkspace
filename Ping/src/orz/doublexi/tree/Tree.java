package orz.doublexi.tree;

public class Tree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.show();
	}
	private Node root;

	private class Node {
		Node left;
		Node right;
		Integer data;

		public Node(int data) {
			this.data = data;
		}

		public Node find(int key) {
			if (this.data == key) {
				return this;
			} else if (key < this.data) {
				return this.left.find(key);
			} else if (key > this.data) {
				return this.right.find(key);
			}
			return null;
		}

		public boolean add(int key) {
			if (key < data) {
				if (left == null) {
					left = new Node(key);
					return true;
				} else {
					return left.add(key);
				}
			} else if (key > data) {
				if (right == null) {
					right = new Node(key);
					return true;
				} else {
					return right.add(key);
				}
			} else {
				return false;
			}

		}

		public void show() {//中序;
			if(left!=null) {
				left.show();
			}
System.out.println(data);
if(right!=null) {
right.show();
}
		}
		
	}

	public Node find(int key) {
		return root == null ? null : root.find(key);
	}

	public boolean add(int key) {
		if (root == null) {
			root = new Node(key);
			return true;
		} else {
			return root.add(key);
		}
	}
	public void show() {
		if(root==null) {
			System.out.println("木有");
		}else {
			root.show();
		}
		
	}
}
