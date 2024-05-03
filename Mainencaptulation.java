
/*main class of dataencaptulation*/

package com.oop.encaptulation;

public class Mainencaptulation {

	public static void main(String[] args) {
		Collegeencaptulation ob=new Collegeencaptulation();//creating object to the class
		ob.setDept("cse");
		System.out.println(ob.getDept());
		ob.setInternal("yes");//passing values to dynamic changing
		System.out.println(ob.getInternal());
		ob.setMid(22);
		System.out.println(ob.getMid());//call the function t update and print
		ob.setId(34);
		System.out.println(ob.getId());
		
		System.out.println("-----------------------------------");
		ob.eligible();//prints the statementes what ever this method contains
	

	}

}
