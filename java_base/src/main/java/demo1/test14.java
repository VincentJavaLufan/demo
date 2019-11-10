package demo1;
//������λʵ�ֽ�һ��ʮ������ת���ɶ�����
public class test14 {
	int m = 1011;
	int n = 1;
	public void binaryToDecimal(int n){
		for(int i = 31;i >= 0; i--)
			System.out.print(n >>> i & 1);
	};
	
//	public void toBinary(int m) {
//		String str  = Integer.toBinaryString(m);
//		System.out.println(str);
//	};
}
