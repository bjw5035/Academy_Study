package homeStudy;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        System.out.println(personKim.name);
        System.out.println(personKim.weight);
        System.out.println(personKim.height);

//        Person personLee = new Person("이순신", 150, 13);
    }
}
