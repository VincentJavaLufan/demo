package pattern.singleton;
/**
 * 测试饿汉式单例模式
 * 1.私有化构造器，这样别人就无法访问。
 * 2.提供一个静态属性
 * 3.提供一个开放的方法
 * 
 * @author Administrator
 *
 */
public class SingletonDemo1 {
	private SingletonDemo1(){};//私有化构造器，这样别人就无法访问。
	
	//static变量从属于这个类
	//创建SingletonDemo1对象，类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的线程安全。
	private static SingletonDemo1 instance = new SingletonDemo1();//提供一个静态属性
	
	//方法没有同步，调用效率高。
	//整个类只提供一个公开的方法。别的类只能通过这个地方获取对象。无论取多少次，都只能取到同一个对象。
	public static SingletonDemo1 getInstance(){//提供一个开放的方法
		return instance;
	}
}
