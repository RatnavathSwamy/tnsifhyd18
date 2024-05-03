
/*SWITCH CASE*/
package com.conditionalif;

import java.util.Scanner;  /*IT PRINT ONE STATEMENT AMONG ALL THE EXPRESSTIONS*/


public class switchcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the dept code");//asking user to enter the value
		Scanner d=new Scanner(System.in);
		int k=d.nextInt();//reading value and store in variable from user
		switch(k)
		{
			case 02:System.out.println("EEE");
			break;
			case 04:System.out.println("ECE");
			break;
			case 05:System.out.println("CSE");
			break;
			case 12:System.out.println("SPICILIZATION");
			break;
default:System.out.println("enter the corect dept code");
	}

	}}
