package chapter08.poly;

import chapter08.GraphicCard;

public class ObjectEx {
    public static void main(String[] args) {
        allObject(new GraphicCard());
    }
    public static void allObject(Object obj) {
        System.out.println(obj.toString());
        if (obj instanceof GraphicCard) {
//            obj = new GraphicCard(); // UpCasting
            GraphicCard gc = (GraphicCard)obj; // DownCasting
            gc.process();
        }
    }
}
