package demo1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CountWords {
	public static void main(String[] args) throws IOException {
		System.out.println(countWords("c:/Users/Administrator/Desktop/","password.txt"));
	}
	public static int countWords(String file,String find) throws IOException {
		int count = 0;
		Reader in = new FileReader(file);
		int c;
		while ((c = in.read()) != -1) {
			while(c ==find.charAt(0)) {
				for(int i=1;i<find.length();i++) {
					c = in.read();
					if(c != find.charAt(i))
						break;
					if(i == find.length() - 1)
						count ++;
				}
			}
		}
		return count;
	}
}
