package pattern.proxy.staticProxy;

public class ProxyStar implements Star{

	private Star star;
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}
	
	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

	/**
	 * 持有真实的star的引用
	 */
	@Override
	public void sing() {
		star.sing();//别的可以代理，但是唱歌必须由明星歌手自己来
	}
}
