/*
 * break
 */
package chapter05;

public class BreakEx {
    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(i==5) {
                    break;
                }
//				System.out.println(i);
                System.out.printf("(%s,%s)", i, j);
            }
            System.out.println();
            if(i==3) {
                break;
            }
        }
    }
}
