
/*FINAL METHOD*/
package com.Final;

public class Finalmethod {

		// TODO Auto-generated method stub
		final void method() //final keyword used for method so it can't be override
		{
			System.out.println("you buetiful");
		}

	

}
class Child extends Finalmethod
{
	void method() {  //throws error message becouse final means can't override
		System.out.println("kittu here");
	}
}
