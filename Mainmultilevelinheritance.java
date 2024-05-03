package multilevelinheritance;

public class Mainmultilevelinheritance {
public static void main(String[] args)
{
	multilevelchild2 obj=new multilevelchild2();
	obj.child2method();

	System.out.println(obj.child1method());
	obj.parentmethod();
	
}
}
