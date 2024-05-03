
/*OVERRIDE THE STSTIC  MEMBERS*/
package com.override.ststic;

public class overredestatic {
	static void display()//static method
	{
		System.out.println("\n override the parent class");
	}

}
public class Child extends overredestatic        //NOTE:static method never extends so it show error
{
	static void display()
	{
	System.out.println("\n override the child class");
	
}
}
