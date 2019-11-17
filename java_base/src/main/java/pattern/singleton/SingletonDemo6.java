package pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式（如何防止反射和反序列化漏洞）
 * 反射和反序列化对于枚举是不起效的。
 * Client2
 *
 */
//public class SingletonDemo6 {
public class SingletonDemo6 implements Serializable{//
	private static SingletonDemo6 instance;//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）

	private SingletonDemo6(){//私有化构造器
		if(instance!=null){
			throw new RuntimeException();//ͨ通过抛出异常，防止反射和反序列化漏洞。
		}
	};
	
	public static synchronized SingletonDemo6 getInstance(){
		if(instance == null){
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象。
	private Object readResolve() throws ObjectStreamException{//
		return instance;
	}
	
}
