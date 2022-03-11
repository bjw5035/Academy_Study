package memberArrayList;

import java.util.List;
import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 목록 보여주기
		List<MemberVO> members = MemberMain.members;
		System.out.printf("=== Count : %s명 ===\n",members.size());
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println("==========================");
		for(int i=0;i<members.size();i++) {
			MemberVO member = members.get(i);
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
