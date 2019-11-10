package thread;

/**
 * https://blog.csdn.net/hebtu666/article/details/102696811
 * @author Administrator
 *
 */
public class ThreadDeom01 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	 public static void main(String[] args) {
		ThreadDeom01 TD1 = new ThreadDeom01();
		Thread t1 = new Thread(TD1);
		t1.setName("myThread");
		long start = System.currentTimeMillis();
		t1.start();
		long end = System.currentTimeMillis();
		System.out.println("aaaaaaaaaaaaaaaaaa:" + (end-start));
		System.out.println(Thread.currentThread());
		System.out.println(t1.getName());
	}

}
