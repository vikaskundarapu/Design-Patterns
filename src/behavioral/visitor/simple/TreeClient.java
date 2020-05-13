package behavioral.visitor.simple;

public class TreeClient {

	public static void main(String[] args) {
		System.out.println("HI");
		Tree<Integer> tree = Tree.branch(Tree.leaf(1), Tree.leaf(3));
		Tree<Integer> tree1 = Tree.leaf(50);
	}

}
