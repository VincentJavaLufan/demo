package pattern.strategy;

public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("新客户打九折");
		return standardPrice * 0.9;
		
	}
}
