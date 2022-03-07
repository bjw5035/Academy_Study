package chapter10;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int weekOfYear = today.get(Calendar.WEEK_OF_YEAR);
        // Calendar.DAY_OF_WEEK 요일 상수
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek); // 일요일 1, 월요일 2, 토요일 7

        // 조건문
        switch (dayOfWeek) {
//            case 1:
            case Calendar.SUNDAY: // 1
                System.out.println("일요일");
                break;
            case 2:
                System.out.println("월요일");
                break;
            case 3:
                System.out.println("화요일");
                break;
            case 4:
                System.out.println("수요일");
                break;
            case 5:
                System.out.println("목요일");
                break;
            case 6:
                System.out.println("금요일");
                break;
            case 7:
                System.out.println("토요일");
                break;
        }

        String[] days = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.println(days[dayOfWeek-1]); //2-1 == 1
    }
}
