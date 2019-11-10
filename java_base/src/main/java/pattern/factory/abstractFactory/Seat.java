package pattern.factory.abstractFactory;

public interface Seat {
	void massage();//按摩
}

class LuxurySeat implements Seat{
	@Override
	public void massage(){
		System.out.println("可以自动按摩");
	}
}

class LowSeat implements Seat{
	@Override
	public void massage(){
		System.out.println("不能按摩");
	}
}
