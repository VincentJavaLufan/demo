package thread;

/**
 * https://blog.csdn.net/hebtu666/article/details/102696811
 * @author Administrator
 *
 */
public class ThreadDemo02 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("current Thread name:" + Thread.currentThread().getName());
			System.out.println("current Thread name:" + Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) {
		Thread t1 = new ThreadDemo02();
		Thread t2 = new ThreadDemo02();
		t1.setName("1111");
		t2.setName("2222");
		t1.start();
		t2.start();
		
		
	}

}
