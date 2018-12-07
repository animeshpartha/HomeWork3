package OOP.abstraction;

public interface Uni2 { //can declare void method but not initialize it

	public void Washington();
	
	
	public static void Atlanta() {
		System.out.println("Very Good University");
	}
	
	public default void NewYork() {
		System.out.println("Very Better University");
	}
}
