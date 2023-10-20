package practice10;

public class QuickSort implements Sort{
	private String name = "QuickSort";
	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(name + " ascending");
	}

	@Override
	public void descending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(name + " descending");
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println(name + " 입니다.");
	}
}


