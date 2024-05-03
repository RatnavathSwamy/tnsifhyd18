package instance.co;

public class overrideinstance {
	public class Parent {
		void display()//override instance method
		{
			System.out.println("\n this is a parent class info");
			
		}

	}
	class child extends Parent//extending features from parents class
	{
		void display()
		{
			
		
		System.out.println("\n this contain child class info");
		
		
	}

}
}
	//override always have same return type and parameters and method name
