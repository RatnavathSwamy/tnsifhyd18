/*SUPER KEYWORD*/


/*FIRST APPROCH*/
package Superkeyword;

public class supervariablemethod {
public static void main(String[] args) {
	Child d=new Child();//crating object to child class
	d.display();
		
	}

}
class Parent   /*super keyword used to access parent class variables and methods*/
{
	int k=24;
	public void fun()
	{
		System.out.println("i am from sri indu college");
	}
}
class Child extends Parent
{
	public void display()
	{
		System.out.println("i am swamy");
		super.fun();//calling parent class method through super keyword
		int a=27;
		System.out.println("sum of child and parent class values:"+(a+super.k));//calling parent class variables through superkeyword
	}
}



