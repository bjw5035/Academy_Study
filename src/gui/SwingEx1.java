package gui;

import javax.swing.*;
import java.awt.*;

public class SwingEx1 extends JFrame {

    public SwingEx1() {
        super("Title:Hello Swing");
        getContentPane().setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome to Swing");
        getContentPane().add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingEx1 app = new SwingEx1();
    }
}
