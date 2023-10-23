package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member Lee = new Member(1001, "이지원");
		Member Son = new Member(1002, "손민국");
		Member Park = new Member(1003, "박서훤");
		Member Hong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(Lee);
		memberHashMap.addMember(Son);
		memberHashMap.addMember(Park);
		memberHashMap.addMember(Hong);
		
		memberHashMap.showAllMember();
		
		//회원 아이디(key값)가 1004인 회원 삭제
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}

//이지원 회원님의 아이디는 1001입니다
//손민국 회원님의 아이디는 1002입니다
//박서훤 회원님의 아이디는 1003입니다
//홍길동 회원님의 아이디는 1004입니다
//
//이지원 회원님의 아이디는 1001입니다
//손민국 회원님의 아이디는 1002입니다
//박서훤 회원님의 아이디는 1003입니다