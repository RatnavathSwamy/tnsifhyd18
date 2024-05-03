package com.in.sts;

public class accessinginstancestaticmembers {
	int a=10;//instance variable
	static String name="hello there";//static variable
	void get()//instance method
	{
		System.out.println("value of a is:"+a);//NOTE:instance and static both members can accessed by the instance method
		System.out.println("\n name is"+name);
	
	}
	static void meth()//static method
	{
		System.out.println("-------------------------------");
		/*System.out.println("value of a is:"+a);*/
		
		//NOTE:instance member can't accessed by static method
		System.out.println("\n name is:"+name);
	}

}
