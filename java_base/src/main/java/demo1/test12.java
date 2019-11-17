package demo1;
/**
 * ����׳�
 * @author Administrator
 *
 */
public class test12 {
    public static void main(String[] args) {
    	long n =12;
    	System.out.println(totest(n));
    };
    public static long totest(long n) {
    	if(n<0) {
    		System.out.println("error");
    		return 0;
    	}else if(n==1|n==2) {
    		return n;
    	}else {
    		return n * totest(n-1);
    	}
    }
    
}
