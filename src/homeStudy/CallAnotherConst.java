package homeStudy;

class Persons {
    String name;
    int age;

    Persons() {
        this("이름없음", 1);
    }

    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Persons returnItSelf() {
        return this;
    }
}
public class CallAnotherConst {
    public static void main(String[] args) {
        Persons noName = new Persons();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Persons p = noName.returnItSelf();
        System.out.println(p);
        System.out.println(noName);
    }
}
