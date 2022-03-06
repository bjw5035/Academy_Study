package user;

public class UserLoginTest {
    public static void main(String[] args) {
        // 1. 기본생성자로 사용하는 법
        UserVO user1 = new UserVO();
        user1.setId("hong");
        user1.setPw("1111");
        user1.setName("홍길동");
        //System.out.println(user1.toString()); // Object꺼
//		System.out.println(user1.toString2()); // 내꺼
        // 2. 오버로딩된 생성자로 사용하는 법
        UserVO user2 = new UserVO("hong", "0000", "홍길동");
        String id = user2.getId();
        String pw = user2.getPw();
        String name = user2.getName();
        //System.out.println(user2);
        // 3. 서비스 실행
        LoginService ls = new LoginService();
        boolean isLogin = ls.isLogin(id, pw, name);
        boolean isLogin2 = ls.isLogin();

    }
}
