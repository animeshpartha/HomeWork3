package OOP.abstraction;

public class TestCarPrice {

	public static void main(String[] args) {
		CarPrice car = new CarPrice();
		System.out.println(car.priceOfCar(5000, 5500));
		System.out.println("CarPrice: " +car.priceOfCar(5000, 5500, 6000));
		
		ModernCarPrice mcar = new ModernCarPrice();
		System.out.println("Modern Car:" +mcar.CarPrice(5000, 5500, 6000));
	}
}
