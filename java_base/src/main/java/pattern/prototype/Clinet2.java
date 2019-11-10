package pattern.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ����ƣ�
 * @author Administrator
 *
 */
public class Clinet2 {
	public static void main(String[] args) throws Exception {
		Date date = new Date(1231233123);
		Sheep2 s1 = new Sheep2("����",date);
		Sheep2 s2 = (Sheep2)s1.clone();   //ʵ����ƣ�s2�����birthday��һ���¶���
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(32323123);
		
		System.out.println(s1.getBirthday());
		
		s2.setSname("����");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
