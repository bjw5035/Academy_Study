package memberArray;

import java.util.Scanner;

public class ListAction implements Action{

	@Override
	public void execute(Scanner sc) {
		// 목록 보여주기
		MemberVO[] members = MemberMain.members;
		System.out.printf("=== Count : %s명 ===\n",members.length);
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println("==========================");
		for(int i=0;i<members.length;i++) {
			MemberVO member = members[i];
			System.out.print("ID :" + member.getId()+",");
			System.out.print("PW :" + member.getPw()+",");
			System.out.print("NAME :" + member.getName()+",");
			System.out.print("AGE :" + member.getAge());
			System.out.println();
		}
		System.out.println("==========================");
		for(MemberVO member:members) {
			System.out.print("ID :" + member.getId()+",");
			System.out.print("PW :" + member.getPw()+",");
			System.out.print("NAME :" + member.getName()+",");
			System.out.print("AGE :" + member.getAge());
			System.out.println();
		}
		
	}

}
