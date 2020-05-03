package visitor.simple;
/*
 * Often, a data structure is defined by case analysis and recursion. 
 * For example, a binary tree of type Tree<E> is one of the following:
 * A leaf, containing a single value of type E
 * A branch, containing a left subtree and a right subtree, both of type Tree<E>
 */
abstract class Tree<E> {

	abstract public String toString();
	abstract public Double sum();
	
	
	public static <E> Tree<E> leaf(E e){
		
		return  new Tree<E>() {

			@Override
			public String toString() {
				return e.toString();
			}

			@Override
			public Double sum() {
				return ((Number)e).doubleValue();
			}
		};
	}
	
	public static <E> Tree<E> branch(Tree<E> l, Tree<E> r){
		return new Tree<E>() {

			@Override
			public String toString() {
				return  "(" + l.toString() + "^" + r.toString() + ")";
			}

			@Override
			public Double sum() {
				return l.sum()+ r.sum();
			}
			
		};
	}
	}
