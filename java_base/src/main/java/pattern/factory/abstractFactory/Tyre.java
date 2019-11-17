package pattern.factory.abstractFactory;

public interface Tyre {//轮胎
	void resolve();
	
}

class LuxuryTyre implements Tyre{
	@Override
	public void resolve(){
		System.out.println("旋转不磨损");
	}
}

class LowTyre implements Tyre{
	@Override
	public void resolve(){
		System.out.println("磨损块");
	}
}