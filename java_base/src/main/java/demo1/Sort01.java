package demo1;

import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序
 * @author FANFANER
 *
 */
public class Sort01 {
	public static void main(String[] args) {
		int [] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			Random rand = new Random();
			arr[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int m=0; m<arr.length-1; m++) {
			for(int n=0; n<arr.length-1-m;n++) {
				if(arr[n]>arr[n+1]) {
					arr[n+1] = arr[n+1]+arr[n];
					arr[n] = arr[n+1]-arr[n];
					arr[n+1] = arr[n+1]-arr[n];
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
