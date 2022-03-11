package memberFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 목록 보여주기 FileRead

		FileReader fr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		try {
			fr = new FileReader("members.txt");
			bfr = new BufferedReader(fr);
			String member = "";
			while ((member = bfr.readLine()) != null) {
				st = new StringTokenizer(member, ","); //,
//				while (st.hasMoreTokens()) {
//					System.out.print(st.nextToken() + " ");
//				}
//				System.out.println();
				String fm = "ID : %s, PW : %s, Name : %s, Age : %s";
				System.out.printf(fm, st.nextToken(), st.nextToken(), st.nextToken(),st.nextToken());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
