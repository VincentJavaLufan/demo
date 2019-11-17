package pattern.singleton;
/**
 * 通过枚举实现单例模式
 * 反射和反序列化对于枚举是不起效的。
 * 优点，避免了反序列化漏洞
 * 缺点，没有延时加载
 * 
 * 即使构造器私有了，仍然还可以通过反射和反序列化去调用。
 * 反射和反序列化漏洞
 * 通过类Client.java测试
 */
public enum SingletonDemo5 {//枚举元素本身就是单例的
	
	//定义一个枚举元素，本身就是单例对象。它本身就代表了Singleton的一个实例。
	INSTANCE;
	
	//添加自己需要的操作
	public void singletonOperation(){
		System.out.println("通过枚举实现单例模式");
	}
	//外部类可以通过      SingletonDemo5.INSTANCE   来调用
}
