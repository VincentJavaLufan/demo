package pattern.prototype;

import java.util.Date;

/**
 * ����ԭ��ģʽ(ǳ��¡)
 * ��¡�����ԭ�Ͷ��󱣳�һ����ֵ�����ǿ��Ըı�ġ�
 * @author Administrator
 *
 */
public class Clinet {
	public static void main(String[] args) throws Exception {
		Date date = new Date(1231233123);
		Sheep s1 = new Sheep("����",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(32323123);
		
		Sheep s2 = (Sheep)s1.clone();
		s2.setSname("����");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
