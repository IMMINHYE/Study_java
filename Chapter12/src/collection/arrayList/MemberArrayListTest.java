package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member Lee = new Member(1001, "이지원");
		Member Son = new Member(1002, "손민국");
		Member Park = new Member(1003, "박서훤");
		Member Hong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(Lee);
		memberArrayList.addMember(Son);
		memberArrayList.addMember(Park);
		memberArrayList.addMember(Hong);
		
		memberArrayList.showAllmember();
		
		memberArrayList.removeMember(Hong.getMemberId());
		memberArrayList.showAllmember();
	}

}

//이지원 회원님의 아이디는 1001입니다
//손민국 회원님의 아이디는 1002입니다
//박서훤 회원님의 아이디는 1003입니다
//홍길동 회원님의 아이디는 1004입니다

//이지원 회원님의 아이디는 1001입니다
//손민국 회원님의 아이디는 1002입니다
//박서훤 회원님의 아이디는 1003입니다
