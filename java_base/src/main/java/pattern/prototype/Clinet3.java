package pattern.prototype;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * ԭ��ģʽ����ƣ�ʹ�����л��ͷ����л��ķ�ʽʵ����ƣ�
 */
import java.util.Date;

public class Clinet3 {
	public static void main(String[] args) throws CloneNotSupportedException,Exception{
		Date date = new Date(1231233123);
		Sheep s1 = new Sheep("����",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
//		Sheep s2 = (Sheep) s1.clone();
//		ʹ�����л��ͷ����л��ķ�ʽʵ����ƣ�
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Sheep s2 = (Sheep) ois.readObject();   //��¡�õĶ���
		
		System.out.println("�޸�ԭ�Ͷ��������ֵ");
		date.setTime(32323123);
		
		System.out.println(s1.getBirthday());
		
		s2.setSname("����");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	
	}
}