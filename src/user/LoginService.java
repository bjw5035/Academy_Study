package user;

public class LoginService {
    private String id = "hong";
    private String pw = "0000";

    boolean isLogin(String id, String pw, String name) {
        boolean rs = false;

        if (id.equals(this.id)) {
            if (pw.equals(this.pw)) {
                System.out.println("Welcome!!! " + name);
                rs = true;
            } else {
                System.out.println("없는 pw 입니다.");
            }
        } else {
            System.out.println("없는 id 입니다.");
        }


        return rs;
    }

    boolean isLogin(UserVO user) {
        boolean rs = false;
        String id = user.getId();
        String pw = user.getPw();
        if (id.equals(this.id)) {
            if (pw.equals(this.pw)) {
                System.out.println("Welcome!!! " + user.getName());
                rs = true;
            } else {
                System.out.println("없는 pw 입니다.");
            }
        } else {
            System.out.println("없는 id 입니다.");
        }
        return rs;
    }

    public boolean isLogin() {
        return false;
    }
}
