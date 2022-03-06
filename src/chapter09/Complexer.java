package chapter09;

import java.lang.*;

//public class Complexer implements Printer, Scanner, Fax { // error
public class Complexer implements Printer, Fax { // error
//    @Override
//    public void scan() {
//        System.out.println("스캔 실행");
//
//    }

    @Override
    public void print() {
        System.out.println("출력 실행");

    }

    @Override
    public void send(String tel) {
        System.out.println(FAX_NUMBER + "에서 "+tel+"로 FAX 전송");

    }

    @Override
    public void receive(String tel) {
        System.out.println(tel + "에서 "+FAX_NUMBER+"로 FAX 수신");

    }

//    @Override
//    public void price() {
//        System.out.println("가격은 6만 오천원");
//
//    }
}
