package pattern.strategy;

public class NewCustmerFewStrategy implements Strategy{
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("普通客户不打折");
		return standardPrice ;
		
	}
}
