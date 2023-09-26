package com.oop_java_a.L1021;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestG {
    private JTextField textField1;
    private JButton clickMeButton;
    private JPanel panel1;

    public TestG() {
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textField1.setText("HELLO");

            }
        });
    }

    public void show() {
        JFrame frame = new JFrame("Click Count");
        frame.setContentPane(new TestG().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        TestG hello = new TestG();
        hello.show();

    }
}
