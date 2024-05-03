
/*******USER DEFINED PACKAGE******/
package ipl;  //same package created so no need to import
import subipl.*;//imported userdefined package becouse which have different package name in same project


public class userdefinedpackagemain {
	
	public static void main(String[] args) {
			Srh obj=new Srh();
			Rcb obj1=new Rcb();   //creating objects to respective classes
			Csk obj2=new Csk();
			obj.bowler();
			obj.batsman();
			obj.Allrounder();
			obj1.bowler();
			obj1.batsman();     //calling to method with respect to object
			obj1.Allrounder();
			obj2.bowler();
			obj2.batsman();
			obj2.Allrounder();


		}

	}


