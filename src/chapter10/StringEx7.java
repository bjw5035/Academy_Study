package chapter10;

public class StringEx7 {
    public static void main(String[] args) {

        String str = " Hello My Name is Hong Gil Dong "; // 문자열값 비교
        String str2 = "";
        int i = str.indexOf("Hong ");
        if (i > -1) {
//            str2 = str.replace("Hong", "kim");
            str2 = str.replace(" ", " ");
        }
//        System.out.println(str);
//        System.out.println(str2);
        str2 = str.substring(6, 12);
        System.out.println(str.length());
        str2 = str.trim();
        System.out.println(str2.length());
//        System.out.println(str2);
        str = "abcdef";

        str = "홍길동,이순신,유관순,안중근"; // CSV
        String[] strArr = str.split(",");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
