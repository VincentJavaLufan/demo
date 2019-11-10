package pattern.strategy;

public class OldCustmerFewStrategy implements Strategy{
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("老客户打八五折折");
		return standardPrice * 0.85;
		
	}
}
