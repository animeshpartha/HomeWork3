package OOP.abstraction;

public class CarPrice {
	
	public int priceOfCar(int a , int b) {
		int total = a + b;
		return total;
	}
	
	public int priceOfCar(int a , int b , int c) {
		int total = a + b + c;
		return total;
	}
	
	public int priceOfCar(char a , int b , int c) {
		int total = a + b + c;
		return total;
	}
	
	public int priceOfCar(String CarPrice, char a , int b) {
		int total = a + b ;
		return total;
	}

}