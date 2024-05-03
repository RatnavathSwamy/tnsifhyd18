package hybridinheritance;

public class Mainhybridinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n ----MULTILEVEL INHERITANCE-----");
		hybridchild2 n=new hybridchild2();
		n.child2method();
		n.child1method();
		n.parentmethod();
		System.out.println("\n ------HIERARCHICAL INHERITANCE---------");
		hybridparentchild3 m=new hybridparentchild3 ();
		m.child3method();
		m.parentmethod();

	}

}
