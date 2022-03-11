package memberFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddAction implements Action {
    @Override
    public void execute(Scanner sc) {
        // 회원 가입
        System.out.println("== 회원 정보 입력 ==");
        System.out.println("ID : ");
        String id = sc.next();
        System.out.println("PW : ");
        String pw = sc.next();
        System.out.println("NAME : ");
        String name = sc.next();
        System.out.println("AGE : ");
        int age = sc.nextInt();

        String member = id + "," + pw + "," + name + "," + age + "\r\n";
        System.out.println(member);
        // CSV형태 : id, pw, name, age
        // FileWrite
        FileWriter fw = null;
        try {
            fw = new FileWriter("members.txt", true);
            fw.write(member);
            System.out.println("입력완료!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
