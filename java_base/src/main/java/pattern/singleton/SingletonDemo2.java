package pattern.singleton;
/**
 * 测试懒汉式单例模式,延时加载，懒加载，真正用的时候再加载。
 * 1.私有化构造器
 * 2.提供静态属性
 * 3.提供静态同步方法
 * 
 * 资源利用效率高，用的时候再加载（new一个对象）。
 * 但是每次调用getInstance方法的时候都要同步，并发效率低。不同线程调用的时候都需要等待，调用效率低。
 * 多个线程调用的时候需要等待
 * @author Administrator
 *
 */
public class SingletonDemo2{
	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private SingletonDemo2(){};//私有化构造器
	
	private static SingletonDemo2 instance;
	
	public static synchronized SingletonDemo2 getInstance(){
		if(instance == null){
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
