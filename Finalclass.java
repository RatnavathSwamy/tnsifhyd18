/*FINAL CLASS*/

package com.Final;

public class Finalclass {
	public static void main(String[] args)
	{
		Child k=new Child();
		k.fun();//final class can't be extends to access from child class object
		
	}

}
final class Parent//final class
{
	public  void fun()
	{
		System.out.println("i am from sri indu");
	}
}
class Child extends Parent/*ERROR*/ //final class can't extends to the child class 
{
	public void display()
	{
		System.out.println("this is final class");
	}
}

