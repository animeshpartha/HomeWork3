package OOP.abstraction;

public class TestUni {

	public static void main(String[] args) {
		
		Uni1 a = new UniConcrete();
		a.Virginia();
		a.York();
		Uni1.Boston();
		
		Uni2 b = new UniConcrete();
		b.NewYork();
		b.Washington();
		Uni2.Atlanta();
		
		UniAbst c = new UniConcrete();
		c.Maryland();
		UniConcrete.Amazon();
		
		UniConcrete d = new UniConcrete();
		d.Maryland();
		d.Virginia();
		d.Washington();
		UniConcrete.Amazon();
		
		UniConcrete.Amazon();
		
		UniAbst2 e = new UniConcrete();
		e.Florida();
	
	}

}
