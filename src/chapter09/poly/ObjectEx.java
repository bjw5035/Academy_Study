package chapter09.poly;

import chapter08.GraphicCard;

public class ObjectEx {
    public static void main(String[] args) {
        allObject(new Amd());
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
