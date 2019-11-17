package pattern.strategy;

public class OldCustomerManyStrategy implements Strategy{
	@Override
	public double getPrice(double standardPrice) {
		System.out.println("老客户大批量打八折");
		return standardPrice * 0.8;
		
	}
}
