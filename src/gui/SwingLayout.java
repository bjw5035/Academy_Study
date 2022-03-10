package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingLayout extends JFrame {
    JButton button1 = new JButton("button 1");
    JButton button2 = new JButton("button 2");
    JButton button3 = new JButton("button 3");
    JButton button4 = new JButton("button 4");
    JButton button5 = new JButton("button 5");

    Panel p1 = new Panel();
    Panel p2 = new Panel();

    public void flowLayout() {
        p1.setLayout(new FlowLayout());
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
    }

    public void gridLayout() {
        p1.setLayout(new GridLayout(2, 2));
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
    }

    public void borderLayout() {
        p1.setLayout(new BorderLayout());
        p1.add(button1, BorderLayout.NORTH);
        p1.add(button2, BorderLayout.WEST);
        p1.add(button3, BorderLayout.EAST);
        p1.add(button4, BorderLayout.SOUTH);
        p1.add(button5, BorderLayout.CENTER);
    }

    public void cardLayout() {
        final CardLayout card = new CardLayout();
        setLayout(card);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p2.add(button4);
        p2.add(button5);
        add("p1", p1);
        add("p2", p2);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 내가 할일
                card.show(getContentPane(), "p2");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(getContentPane(), "p1");
            }
        });

    }

    public SwingLayout() {
        super("Layout Showcase");
        getContentPane().add(p1);
//        flowLayout();
//        gridLayout();
        cardLayout();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingLayout app = new SwingLayout();
    }
}
