package chapter08.poly;

import chapter08.GraphicCard;

public class Computer {
    public static void main(String[] args) {

        GraphicCard gc = new GraphicCard();
        gc.process();
        gc = new Amd();
        gc.process();
        gc = new Nvidia();
        gc.process();
    }
}
