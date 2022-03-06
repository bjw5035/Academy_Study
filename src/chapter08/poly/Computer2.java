package chapter08.poly;

import chapter08.GraphicCard;

public class Computer2 {
    public static void main(String[] args) {

        Game g = new Game();
        Amd gc = new Amd();
        g.display(gc);
        Nvidia gc2 = new Nvidia();
        g.display(gc2);
        GraphicCard[] gcArr = new GraphicCard[3];
        GraphicCard[] gcArr1 = {new Intel(), new Intel(), new Amd()}; // 가능
//        GraphicCard gca = new GraphicCard();
        GraphicCard gca1 = new Amd(); // 가능
        GraphicCard gca2 = new Nvidia(); // 가능
        GraphicCard gca3 = new Intel(); // 가능
//        gcArr[0] = new Amd();
        gcArr[0] = gca1;
        gcArr[0] = new Amd(); // 가능
        gcArr[1] = new Nvidia(); // 가능
        gcArr[2] = new Intel(); // 가능
    }
}
