package demo1;
import java.util.Arrays;
import java.util.Random;
/**
 * ��һ�����飬������100������ÿ������1-1000���������
 * ���������������������ȣ�дһ���㷨�������ҳ���
 */
public class Sort02 {
	public static void main(String[] args) {
		int [] arr = new int[100];
		for(int i=0;i<arr.length;i++) {
			Random rand = new Random();
			arr[i]=rand.nextInt(1000);
		}
		System.out.println(Arrays.toString(arr));
		//冒泡排序
		for(int m=0;m<arr.length-1;m++) {
			for(int n=0;n<arr.length-1-m;n++) {
				if(arr[n]>arr[n+1]) {
					arr[n] = arr[n]+arr[n+1];
					arr[n+1] = arr[n]-arr[n+1];
					arr[n] = arr[n]-arr[n+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//找出相等的
		for(int a=0;a<arr.length-1;a++) {
			for(int b=a+1;b<arr.length-1;b++) {
				if(arr[a]==arr[b]) {
					System.out.println(a+"/"+b+"/"+arr[a]);
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		int i = 1000;
		String ee = String.valueOf(i);
		System.out.println(ee);
		
		String ss = "1111";
		int aa = Integer.parseInt(ss);
		System.out.println(aa);
		
		Integer vvv = 122;
		Integer ccc = 32432;
		System.out.println(vvv+ccc);
	}
}
