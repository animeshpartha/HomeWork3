package OOP.abstraction;

public interface Uni1 { 							//can declare --: void method but not {}--initialize it

	public void Virginia();  						// void method can declare and initialize
	
	
	public static void Boston() { 					//method can declare and initialize
		System.out.println("Good University"); 		//method can declare and initialize
	}
	
	public default void York() {
		System.out.println("Better University");	//method can declare and initialize
	}
	
	
}
