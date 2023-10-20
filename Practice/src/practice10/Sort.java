package practice10;

public interface Sort {
	void ascending(int[] ascending);
	void descending(int [] descending);
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
}
