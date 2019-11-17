package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class list {
	public static void main(String[] args) {
		LinkedList<Integer> numIntegers = new LinkedList<Integer>();
		numIntegers.add(1);
		numIntegers.add(22);
		numIntegers.add(333);
		numIntegers.add(4444);
		for(Integer integer : numIntegers ) {
			System.out.println(integer);
		}
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("1243");
		strings.add("sdf");
		strings.add("124f435g3");
		for(String ssString : strings) {
			System.err.println(ssString);
		}
		
		
		
	}
}
