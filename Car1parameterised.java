
/*PAREMETERIZED CONSTRUCTOR*/
package parameterised.constructor;

public class Car1parameterised {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public  Car1parameterised(String doors,String engine,String driver,int speed)//getting paremeters from the main method
	{
		this.doors=doors;
		this.engine=engine;   //dynamically store the values in private variable by"this" keyword
		this.driver=driver;
		this.speed=speed;
	}

	public void run()
	{
		if(doors=="closed"&&engine=="on"&&driver=="seated"&&speed>=0)
		{
			System.out.println("CAR IS RUNNING");
			
		}
		else
		{
			System.out.println("\n car is not running");
			

}
	}
}



