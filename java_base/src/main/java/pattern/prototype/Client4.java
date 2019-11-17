package pattern.prototype;
/**
 * ������ͨnew��ʽ���������clone��ʽ������Ч�ʲ���
 * �����Ҫ��ʱ���ڴ����������󣬲���new�Ĺ��̱ȽϺ�ʱ������Կ���ʹ��ԭ��ģʽ
 * 
 * ԭ��ģʽ���ٵ������֣�һ���Ǻ͹�������ģʽһ����֣�ͨ��clone�ķ�������һ������Ȼ���ɹ��������ṩ�������ߡ�
 * �ڹ���ģʽ�������ʹ��clone������������
 * @author Administrator
 *
 */
public class Client4 {
	public static void testNew(int size){
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++){
			Laptop t = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new�ķ�ʽ������ʱ"+(end-start));
	}
	
	public static void testClone(int size) throws CloneNotSupportedException{
		long start = System.currentTimeMillis();
		Laptop t = new Laptop();//ԭ�Ͷ���
		for(int i=0;i<size;i++){
			Laptop temp = (Laptop) t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone�ķ�ʽ������ʱ"+(end-start));
	}
	
	public static void main(String[] args) throws Exception{
		testNew(1000);//Խ�Ǻ�ʱ��Ч�ʲ��Խ��
		testClone(1000);
	}
}

class Laptop implements Cloneable{
	public Laptop(){
		try {//ģ�ⴴ������ĺ�ʱ����
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();  //ֱ����object�����clone()����
		return obj;
	}
}