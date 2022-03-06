package chapter09.poly;

public class PolyEx {
    // 하나의 참조(레퍼런스) 변수가 여러 타입의 객체 참조
    // 부모 클래스 타입의 참조 변수로 자식 클래스 참조
    // 참조된 자식 클래스는 자동으로 부모 클래스 타입으로 변환(UpCasting)
    // 다시 자식 클래스가 부모 클래스 참조 시는 명시적으로 캐스팅 해야함(DownCasting)
    Parent parent = new Child();
//    parent.walk(); // p
//    parent.run(); // c override
    //    parent.game(); // 안된다
    Child child = (Child)parent;
//    child.walk();
//    child.run();
//    child.game();
}
