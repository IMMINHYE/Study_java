//StirngBuilder 클래스 예제
package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		//인스턴스가 처음 생성됐을 때 메모리 주소
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		//String으로부터 StringBuilder 생성
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		//문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		//String 클래스로 반환
		javaStr = buffer.toString();
	    System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
	}

}
