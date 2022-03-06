package chapter08;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {

        Tiger[] tArr = new Tiger[3];
        Lion[] lArr = new Lion[3];
        Animal eagle = new Eagle("조류", "독수리");
        Animal tiger = new Tiger("포유류", "호랑이");
        Animal lion = new Lion("포유류", "사자");
        Animal shark = new Shark("어류", "상어");
//        Animal[] animal = new Animal[4];
//        ArrayList animal = new ArrayList();
        ArrayList<Animal> animal = new ArrayList<Animal>();
        animal.add(eagle); // Eagle에서 => Object UpCasting(자동)
        animal.add(tiger); // Object
        animal.add(lion); // Object
        animal.add(shark); // Object
//        animal[0] = eagle;
//        animal[1] = tiger;
//        animal[2] = lion;
//        animal[3] = shark;
//        for (int i = 0; i < animal.length; i++) {
//            animal[i].sleep();
//        }
        for (int i = 0; i < animal.size(); i++) {
//            Animal a = (Animal) animal.get(i); // Object -> A (DownCasting)
            Animal a = animal.get(i);
            a.sleep();
        }
        for (Object o : animal) {
            Animal a = (Animal) o;
            a.sleep();
        }

    }
}
