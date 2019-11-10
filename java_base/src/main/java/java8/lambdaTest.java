package java8;
/**
 * java 8 新特征
 * https://blog.csdn.net/yitian_66/article/details/81010434
 * @author Administrator
 *
 */

import java.util.Random;

public class lambdaTest {
	public static void main(String args[]) {
        int num = 1;
//        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
//        s.convert(2);
//        num = 5;//lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有final 的语义）
        
        Random random = new Random();
//        random.ints().limit(5).forEach(System.out::println);
        random.ints().limit(5).sorted().forEach(System.out::println);
    }
    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
