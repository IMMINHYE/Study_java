package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collection.Member;

public class MemberTreeSet {
	//TreeSet 선언
	private TreeSet<Member> treeSet;
	
	//TreeSet 생성
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	//TreeSet에 회원추가
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	//매개변수로 받은 회원 아이디에 해당하는 회원 삭제
	public boolean removeMember(int memberId) {
		//Iterator를 활용해 순회함
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();	//회원을 하나씩 가져와서
			int tempId = member.getMemberId();	//아이디 비교
			if (tempId == memberId) {	//같은 아이디인 경우
				treeSet.remove(member);		//회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	//모든 회원 출력
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}