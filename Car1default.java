
/*DEFAULT CONSTRUCTOR*/ //used to initilize the values to private variable
package defaultconstructor;

public class Car1default {
	private String doors;
	private String engine;//private variabla
	private String driver;
	private int speed;//constructor dont have retrurn type and same method name as class name
	
	public Car1default()//in default the parameter doesnt pass by it contains inside the mathod
	{
		doors="closed";
		engine="on";
		driver="seated";
		speed=10;
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
	


