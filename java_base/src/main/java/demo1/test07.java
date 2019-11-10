package demo1;

import java.util.Calendar;

public class test07 {
	public static void main(String[] args) {
		long time = Calendar.getInstance().getTimeInMillis();
		System.out.println(time);//�����ַ��������Ի�ȡʱ�������
		System.out.println(System.currentTimeMillis());
		
		Calendar tt = Calendar.getInstance();
		int time2 = tt.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(time2);//��ȡ�������һ�������
		
	}
}
