
//OOP ENCAPTULATION
package com.oop.encaptulation;   /*encaptulation is a process of hiding or wraping the information*/


public class Collegeencaptulation {
	private String dept;
	private String internal;//privite hiding the data inside
	private int mid;
	public int id;//public can access any where in entire program

	public String getDept() {//private variable cannot access outside of the block so by getter and setter its possible to access
		return dept;
	}
	public void setDept(String dept) {//set is used to assign the data to private variable
		this.dept = dept;
	}
	public String getInternal() {//get is used to dynamically changing data
		return internal;
	}
	public void setInternal(String internal) {
		this.internal = internal;//this keyword is used to dynamically changed the data to private variables
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void eligible()
	{
		if(dept=="cse"&&internal=="yes"&&mid>=15&&id>=0)//condition to print anything
		{
		System.out.println("eligible to write CSE sem exam");
	}
		else //condition not satisfied the prints the body of else condition
		{
			System.out.println("not eligible to write CSE sem exam");
		}
}

}
