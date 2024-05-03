
/*overloading program//compile time polymerphism*/

package overloading.statc.instan;   /*same return type and method name but diferent parameters*/


public class polyoverloadingstaticinstancemembers {
	void Member() {//instance method 
		System.out.println("no parameters");
	}
	void Member(int a,int b)//passing different variable values with same datatype
	{
		int sum=a+b;//calculating sum of those values
		System.out.println("\n sum is "+sum);
	}
	void Member(int k,float b)//passing parameters with diferent data type
	{
		System.out.println("\n subtraction"+(k-b));
	}
	static int foo() {//static method
		return 1;
	}
	static int foo(int a,int y)//static method with different parameters
	{
		int sum=a+y;
		return sum;
		
	}

}
