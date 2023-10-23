package generics;

public class GenericPrinter<T extends Material> {
	//T 자료형으로 선언한 변수
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	//상위 클래스 Material의 메서드 호출
	public void printing() {
		material.doPrinting();
	}
}
