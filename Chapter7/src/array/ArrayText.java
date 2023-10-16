package array;

import java.util.Arrays;

public class ArrayText {

	public static void main(String[] args) {
		int[] array = new int[4];	//0~9 인덱스 생성
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		int array2 [] = new int[10];
		int[] array3 = {1, 2, 3, 4};
		System.out.println(array == array3);
		
		for (int i=0; i<4; i++) {
			System.out.println(array[i]);
		}
		
		int [] array4 = {1,3,5,7,9,11,13,15};
		for(int i=0; i<array4.length; i++) {
			System.out.println(array4[i]);
		}
		System.out.println(array4.toString());
		System.out.println(Arrays.toString(array4));
		
	}

}
