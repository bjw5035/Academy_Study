package practice_problem;

public class ForExercise {
    public static void main(String[] args) {

        //        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        int j=0;
//        while (j < 10) {
//            if (j % 2 == 0) {
//                System.out.println(j);
//            }
//            j++;
//        }

//        int i = 10;
//
//        do {
//            System.out.println(i);
//        } while (i < 10);

//        for (int i = 0; i < 6; i++) {
//            for (int j = 1; j < 6; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i*j);
//            }
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (j == 3) {
//                    break;
//                }
//                System.out.println("i="+i + " " + "j = "+j);
//            }
//        }

        target:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break target;
                }
                System.out.println("i="+i + " " + "j = "+j);
            }
        }
    }
}
