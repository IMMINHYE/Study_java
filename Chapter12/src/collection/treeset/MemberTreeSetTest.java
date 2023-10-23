package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member Lee = new Member(1001, "이지원");
		Member Son = new Member(1002, "손민국");
		Member Park = new Member(1003, "박서훤");
		
		memberTreeSet.addMember(Lee);
		memberTreeSet.addMember(Son);
		memberTreeSet.addMember(Park);
		memberTreeSet.showAllMember();
		
		//아이디 중복 회원 추가
		Member Hong = new Member(1003, "홍길동");
		memberTreeSet.addMember(Hong);
		memberTreeSet.showAllMember();
	}

}


//이지원 회원님의 아이디는 1001입니다
//손민국 회원님의 아이디는 1002입니다
//박서훤 회원님의 아이디는 1003입니다
//
//이지원 회원님의 아이디는 1001입니다
//손민국 회원님의 아이디는 1002입니다
//박서훤 회원님의 아이디는 1003입니다
