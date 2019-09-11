
package com.pwc.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pwc.dao.mapper.UserMapper;
import com.pwc.pojo.User;

/**
 * https://blog.csdn.net/chuanke1344/article/details/100755353
 * Mapper接口开发方法只需要程序员编写Mapper接口（相当于Dao接口），由Mybatis框架根据接口定义创建接口的动态代理对象，代理对象的方法体同上边Dao接口实现类方法。
 * 
 * @author 
 * @category Mapper接口开发需要遵循以下规范：
 *         1.Mapper.xml文件中的namespace与mapper接口的类路径相同。
 *         2.Mapper接口方法名和Mapper.xml中定义的每个statement的id相同
 *         3.Mapper接口方法的输入参数类型和mapper.xml中定义的每个sql 的parameterType的类型相同
 *         4.Mapper接口方法的输出参数类型和mapper.xml中定义的每个sql的resultType的类型相同
 * 
 */
public class Test {
	public static void main(String[] args) {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(Test.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		SqlSession session = factory.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setName("bbb");
		user.setAge(234);
		mapper.insert(user);
		System.out.println(user.toString());

		List<User> list = mapper.findByAge(234);
		String str = list.toString();
		System.out.println(str);
		session.close();
	}
}