package pattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 
 */
public class Clinet3 {
	public static void main(String[] args) throws Exception{
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);//��final   ʹ֮��Ϊ������
		
		for(int i=0;i<threadNum;i++){//
			new Thread(new Runnable(){
				@Override
				public void run(){
					//
					for(int i=0;i<10000;i++){//
						Object o = SingletonDemo3.getInstance();
//						Object o = SingletonDemo5.INSTANCE;
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱ��"+(end-start));
	}
}
