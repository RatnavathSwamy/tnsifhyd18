/*instancestaticmember main class*/

package com.in.sts;

public class mainofinstancestaticmembers {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			accessinginstancestaticmembers  b=new accessinginstancestaticmembers();   //object created only to access instace member
			System.out.println(b.a);
			b.get();   //accessed through objects
		
			accessinginstancestaticmembers .meth();   //accessed through class name
			
			

		}

	}


