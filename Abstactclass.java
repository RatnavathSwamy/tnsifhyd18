
/* ABSTRACT CLASS*/  
package abstactmethod;   //no implemention in the method

abstract class Abstactclass {
	abstract void fun();//abstract method no implementation

	}
	 class Child extends Abstactclass //it can implemetns in child class by inheritance 
	 {
		 void fun()
		 {
			 System.out.println("this is abstract class");
		 }

}
