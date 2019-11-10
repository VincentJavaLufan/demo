package pattern.singleton;
/**
 * 静态内部类实现单例模式（也是一种懒加载方式）
 * 外部类没有static属性，则不会像饿汉式那样立即加载对象。
 * 只有真正调用getInstance()，才会加载静态内部类。加载类时是线程安全的。
 * instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性。
 * 兼备了并发高效调用和延迟加载的优势。
 */
public class SingletonDemo4 {//相对于类SingletonClassInstance来说，类SingletonDemo4是外部类
	
	private SingletonDemo4(){};
	
	//静态内部类
	private static class SingletonClassInstance{//SingletonClassInstance是内部类
		private static final SingletonDemo4 instance = new SingletonDemo4();//定义单例对象。
	}
	
	public static SingletonDemo4 getInstance(){
		//通过调用静态内部类的私有静态属性
		//只有调用getInstance()方法的时候，才会加载静态内部类SingletonClassInstance.实现了延时加载。
		//类加载的过程是天然的线程安全的，所以
		return SingletonClassInstance.instance;
	}
}
