package chapter09;

public class ComplexerMain {
    public static void main(String[] args) {
        Complexer complexer = new Complexer();
//        complexer.print();
//        complexer.scan();
//        complexer.send("02-1234-5678");
//        complexer.receive("02-2222-3333");
        Fax fax = new Fax() {
            @Override
            public void send(String tel) {
            }
            @Override
            public void receive(String tel) {
            }
        };
        fax.send("");
        fax.receive("");
    }
}
