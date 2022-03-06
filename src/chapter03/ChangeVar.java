package chapter03;
public class ChangeVar {
    public static void main(String[] args) {
        String cupA = "red";
        String cupB = "blue";
        String cupT = "";

        int n = 0;
        n = cupA.length();
        cupT = cupA;
        cupA = cupB;
        cupB = cupT;

        cupA = "blue";
        cupB = "red";
        System.out.printf("(%s, %s)", cupA, cupB);

        String cups;
        String cuping;

        cups = "red";
        cuping = "blue";

        System.out.printf("(%s, %s)", cups, cuping);
    }
}
