package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member Lee = new Member(1001, "이지원");
		Member Son = new Member(1002, "손민국");
		Member Park = new Member(1003, "박서훤");
		
		memberHashSet.addMember(Lee);
		memberHashSet.addMember(Son);
		memberHashSet.addMember(Park);
		memberHashSet.showAllMember();
		
		//아이디 중복 회원 추가
		Member Hong = new Member(1003, "홍길동");
		memberHashSet.addMember(Hong);
		memberHashSet.showAllMember();
	}

}

//이지원 회원님의 아이디는 1001입니다
//박서훤 회원님의 아이디는 1003입니다
//손민국 회원님의 아이디는 1002입니다
//
//이지원 회원님의 아이디는 1001입니다
//박서훤 회원님의 아이디는 1003입니다
//손민국 회원님의 아이디는 1002입니다
//홍길동 회원님의 아이디는 1003입니다