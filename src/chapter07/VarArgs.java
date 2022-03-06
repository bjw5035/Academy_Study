package chapter07;

public class VarArgs {
    void printInfo(String... infos) {
        if (infos.length != 0) {
            for (int i = 0; i < infos.length; i++) {
                System.out.println(infos[i]);
            }
        } else {
            System.out.println("Data Not Found~~");
        }
    }
    void printInfoArr(String[]... infos) {
        if (infos.length != 0) {
            for (String[] s : infos) {
                System.out.println(s);
            }
        } else {
            System.out.println("Data Not Found~~");
        }
    }
    public static void main(String[] args) {
        VarArgs varags = new VarArgs();
        varags.printInfo();
//        varags.printInfo("aaa");
//        varags.printInfo("aaa","bbb");
        varags.printInfo("aaa","bbb","ccc");
        String[] sArr = {"111", "222", "333"};
//        VarArgs.printInfoArr(sArr);
    }
}
