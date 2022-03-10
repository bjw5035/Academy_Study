package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx1 {
    public static void main(String[] args) {
        Frame f = new Frame("Hello World");
        f.setLayout(new FlowLayout());
        Label label = new Label("Welcome to AWT!!");
        f.add(label);
        f.setSize(500, 500); // pixel
        f.setVisible(true); // 보여줘라
        f.addWindowListener(new WindowCloseHandler());
    }

    static class WindowCloseHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

    }
}