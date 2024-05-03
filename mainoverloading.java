
/*OVERLOADING MAIN CLASS*/
package overloading.statc.instan;  /*NOTE:it can overload both instance and static members*/

public class mainoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyoverloadingstaticinstancemembers k=new polyoverloadingstaticinstancemembers();
		k.Member();
		k.Member(5,6);//passing parameters to instance method by objects
		k.Member(10,7);
		System.out.println(polyoverloadingstaticinstancemembers.foo());
		System.out.println(polyoverloadingstaticinstancemembers.foo(3,5));//passing paremeters to static  method by class name and print values
		

	}

}
