package homeStudy;

public class switchStudy {
    public static void main(String[] args) {

        // rank
        // 순위에 따라 선수에게 수여하는 메달색을 정해줌
        // 순위에 들지 못하면 'A' 값을 부여
//        int rank = 0;
//        char medalColor = ' ';
//
//        switch(rank) {
//            case 1 : medalColor = 'G';
//            break;
//            case 2 : medalColor = 'S';
//            break;
//            case 3 : medalColor = 'B';
//            break;
//            default: medalColor = 'A';
//        }

        // 예제

//        String medal = "Gold";
//
//        switch (medal) {
//            case "Gold" :
//                System.out.println("금메달입니다.");
//                break;
//            case "Silver":
//                System.out.println("은메달입니다.");
//                break;
//            case "Bronze":
//                System.out.println("동메달입니다.");
//                break;
//            default:
//                System.out.println("메달이 없습니다.");
//                break;
//        }

        // 예제 : 5층 건물이 있다. 1층은 약국, 2층은 정형외과, 3층은 피부과, 4층은 치과, 5층은 헬스클럽입니다.
        // 건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있다고 할 때 그 층이 어떤곳인지 출력하시오.
        // 답 : 5인 경우 5층은 헬스클럽 입니다.
        int a = 5;
        String grountFloor;

        switch (a) {
            case 1:
                grountFloor = "약국";
                System.out.printf("%s층은 %s 입니다.", a, grountFloor);
                break;
            case 2:
                grountFloor = "정형외과";
                System.out.printf("%s층은 %s 입니다.", a, grountFloor);
                break;
            case 3:
                grountFloor = "피부과";
                System.out.printf("%s층은 %s 입니다.", a, grountFloor);
                break;
            case 4:
                grountFloor = "치과";
                System.out.printf("%s층은 %s 입니다.", a, grountFloor);
                break;
            case 5:
                grountFloor = "헬스클럽";
                System.out.printf("%s층은 %s 입니다.", a, grountFloor);
                break;

        }

    }
}
