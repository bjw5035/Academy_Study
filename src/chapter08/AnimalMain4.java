package chapter08;

public class AnimalMain4 {
    public static <Mammalia> void main(String[] args) {

        // Animal 전체
        Animal tiger = new Tiger("포유류", "호랑이");
        // 포유류 처리
        Mammalia mTiger = (Mammalia) new Tiger("포유류", "호랑이");
        Mammalia mLion = (Mammalia) new Lion("포유류", "사자");
        Mammalia mShark = (Mammalia) new Shark("어류", "상어"); // 안됨
    }
}
