package classpart;

public class Person {
    // 멤버 변수
    int age;
    String name;
    boolean isMarried;
    int childNumber;

    // 사람의 정보 출력하는 메서드
    public String showPersonInfo() {
        String str = "나이 : " + age
                + " 이름 : " + name
                + " 결혼 여부 : " + isMarried
                + " 자녀 수 : " + childNumber
                ;

        return str;
    }

    public static void main(String[] args) {
        // Person 클래스 생성
        Person james = new Person();
        james.age = 40;
        james.name = "James";
        james.isMarried = true;
        james.childNumber = 3;

        System.out.println(james.showPersonInfo());
    }
}
