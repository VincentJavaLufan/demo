package pattern.strategy;

public class Client {

	public static void main(String[] args) {
		Strategy s1 = new OldCustomerManyStrategy();
		Strategy s2 = new NewCustmerFewStrategy();
		Context context = new Context(s1);
		Context context2 = new Context(s2);
		
		context.printPrice(100);
		context2.printPrice(100);
	}
}
