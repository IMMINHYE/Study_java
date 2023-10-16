package array;

public class CharArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
		char[] alphabets2 = new char[26];
		char ch2 = 'a';
		
		for(int i=0; i<alphabets2.length; i++) {
			alphabets2[i] = ch2;
			ch2++;
		}
		for(int i=0; i<alphabets2.length; i++) {
			System.out.println(alphabets2[i] + ", " + (int)alphabets2[i]);
		}
	}

}
