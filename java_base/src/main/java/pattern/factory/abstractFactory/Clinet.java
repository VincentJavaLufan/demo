package pattern.factory.abstractFactory;

public class Clinet {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
		
		Seat s = factory.createSeat();
		s.massage();
		
		CarFactory factory2 = new LowCarFactory();
		Engine e2 = factory2.createEngine();
		e2.run();
		e2.start();
		
		Seat s2 = factory2.createSeat();
		s2.massage();
		
	}
}
