package pattern.singleton;
/**
 * 双重检查锁实现单例模式---可以避免懒汉式和饿汉式的弊端
 * 1.提供静态属性
 * 2.提供静态方法
 * 
 * 这个模式将同步内容放到if内部，提高了执行效率，不必每次获取对象时都进行同步，只有第一次才同步，创建了以后就没必要。
 * 但是，由于编译器优化的原因和JVM底层内部模型原因，偶尔会出现问题，不建议使用。
 */
public class SingletonDemo3 {
	private SingletonDemo3(){};
	private static SingletonDemo3 instance = null;
	
	//private volatile static SingletonDemo3 instance;
	public static SingletonDemo3 getInstance(){
		 if(instance == null){//第一次的时候是空的，这个时候需要同步。
			 SingletonDemo3 sc;//实例化一个对象
			 synchronized (SingletonDemo3.class){
				 sc = instance;
				 if(sc == null){
					 synchronized (SingletonDemo3.class){
						 if(sc == null){
							 sc = new SingletonDemo3();
						 }
					 }
					 instance = sc;
				 }
			 }
		 }
		 return instance;//如果不为空（第一次以后），则直接接返回。不需要同步。
	}
}
