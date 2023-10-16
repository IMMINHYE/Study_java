package array;

public class practice {
	public static void main(String[] args) {
		char[][] alphabets = new char[13][2];
		char start = 'a';
		
		for (int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = start;
				System.out.print(alphabets[i][j]+", ");
				start++;
			}
			System.out.println();
		}
		// 향상된 for문 사용	
		for(char[] arr : alphabets) {
			for(char ch : arr) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
