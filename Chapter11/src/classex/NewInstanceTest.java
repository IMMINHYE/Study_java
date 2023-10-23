package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//생성자로 생성하기
		NewInstanceTest instance1 = new NewInstanceTest();
		System.out.println(instance1);
		
		Class pClass = Class.forName("classex.NewInstanceTest");
		//Class 클래스의 newInstance() 메서드로 생성하기
		NewInstanceTest instance2 = (NewInstanceTest)pClass.newInstance();
		System.out.println(instance2);
	}

}
