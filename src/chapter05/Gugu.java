package chapter05;

public class Gugu {
    public static void main(String[] args) {

//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j <10; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println("===========");
//		}
        int dan = 2;

//		for(int i=0; i < 10; i++) {
//			System.out.printf("%s * %s = %s \n",dan,i,dan*i);
//		}

        int i = 1;
        while(i < 10) {
            System.out.println(dan + "*" + i + "=" + dan * i);
            i++;
        }
    }
}
