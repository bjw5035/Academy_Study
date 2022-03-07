package chapter10;

import java.util.Calendar;

public class CalendarEx4 {
    public static void main(String[] args) {
        // 현재일
        int sYear = 2022;
        int sMonth = 3;
        int sDay = 7;
        // 이전일
        int eYear = 1993;
        int eMonth = 3;
        int eDay = 10;

        Calendar sCal = Calendar.getInstance();
        Calendar eCal = Calendar.getInstance();
        sCal.set(sYear, sMonth, sDay);
        eCal.set(eYear, eMonth, eDay);
        System.out.println(sCal.getTimeInMillis());
        System.out.println(eCal.getTimeInMillis());
        long diffSec = (sCal.getTimeInMillis() - eCal.getTimeInMillis()) / 1000;
        long diffDay = diffSec / (60 * 60 * 24);
        System.out.println("살아온날 : " + diffDay);

    }
}
