package demo1;
/**
 * 多线程编程
 * @author FANFANER
 *
 */
public class MultiThread {
	public static void main(String[] args) {
		Testthread1 tr1 = new Testthread1();
		tr1.start();
		Testthread2 tr2 = new Testthread2();
		Thread tr3 = new Thread(tr2);
		tr3.start();
	}
}
	
	class Testthread1 extends Thread{
		public void run() {
			char [] ch = {'h','e','l','l','o'};
			try {
				for(int i=0;i<ch.length;i++) {
					System.out.println(ch[i]);
					sleep(1000);
				}
				System.out.println("");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	};
	
	class Testthread2 implements Runnable{
		@Override
		public void run() {
			char [] ch = {'h','e','l','l','o'};
			try {
				for(int i=0;i<ch.length;i++) {
					System.out.println(ch[i]);
					Thread.sleep(1000);
				}
				System.out.println("");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
