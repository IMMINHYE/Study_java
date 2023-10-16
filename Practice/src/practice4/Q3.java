package practice4;

public class Q3 {

	public static void main(String[] args) {
		int [] array = new int[5];
		int num = 2;
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			array[i] = num;
			num += 2;
			sum += array[i];
		}
		System.out.println(sum);
	}

}
