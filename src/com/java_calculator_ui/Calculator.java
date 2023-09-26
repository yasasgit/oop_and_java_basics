package com.java_calculator_ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleBinaryOperator;

public class Calculator {
    private JTextField results;
    private JButton clearBtn;
    private JButton signBtn;
    private JButton percentBtn;
    private JButton divideBtn;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton multiplyBtn;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton subtractBtn;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton addBtn;
    private JButton btn0;
    private JButton dotBtn;
    private JButton equalBtn;
    private JPanel calculatorView;
    private Double leftOperand;
    private Double rightOperand;
    private Operation calcOperation;

    public Calculator() {
        btn7.addActionListener(new NumberBtnClicked(btn7.getText()));
        btn8.addActionListener(new NumberBtnClicked(btn8.getText()));
        btn9.addActionListener(new NumberBtnClicked(btn9.getText()));
        btn4.addActionListener(new NumberBtnClicked(btn4.getText()));
        btn5.addActionListener(new NumberBtnClicked(btn5.getText()));
        btn6.addActionListener(new NumberBtnClicked(btn6.getText()));
        btn1.addActionListener(new NumberBtnClicked(btn1.getText()));
        btn2.addActionListener(new NumberBtnClicked(btn2.getText()));
        btn3.addActionListener(new NumberBtnClicked(btn3.getText()));
        btn0.addActionListener(new NumberBtnClicked(btn0.getText()));

        percentBtn.addActionListener(new OperationBtnClicked(Operation.PERCENTAGE));
        multiplyBtn.addActionListener(new OperationBtnClicked(Operation.MULTIPLICATION));
        divideBtn.addActionListener(new OperationBtnClicked(Operation.DIVISION));
        subtractBtn.addActionListener(new OperationBtnClicked(Operation.SUBTRACTION));
        addBtn.addActionListener(new OperationBtnClicked(Operation.ADDITION));
        equalBtn.addActionListener(new EqualBtnClicked());
        clearBtn.addActionListener(new ClearBtnClicked());
        signBtn.addActionListener(new SignBtnClicked());
        dotBtn.addActionListener(new DigitBtnClicked());
    }

    private class NumberBtnClicked implements ActionListener {
        private String value;
        public NumberBtnClicked(String value) {
            this.value = value;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (leftOperand == null || leftOperand == 0.0) {
                value = results.getText() + value;
            } else {
                rightOperand = Double.valueOf(value);
            }
            results.setText(value);
        }
    }

    private class OperationBtnClicked implements ActionListener {

        private Operation operation;

        public OperationBtnClicked(Operation operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            calcOperation = operation;
            leftOperand = Double.valueOf(results.getText());
        }
    }

    private class ClearBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            results.setText("");
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class DigitBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            results.setText(results.getText() + "");

        }
    }

    private class EqualBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double output = calcOperation.getOperator().applyAsDouble(leftOperand, rightOperand);
            results.setText(output%1==0?String.valueOf(output.intValue()):String.valueOf(output));
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class SignBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            results.setText("-"+ results.getText());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().calculatorView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public enum Operation {
        ADDITION((x, y) -> x+y),
        SUBTRACTION((x, y) -> x-y),
        DIVISION((x, y) -> x/y),
        MULTIPLICATION((x, y) -> x*y),
        PERCENTAGE((x, y) -> x%y);

        private DoubleBinaryOperator operator;

        Operation(DoubleBinaryOperator operator) {
            this.operator = operator;
        }

        public DoubleBinaryOperator getOperator() {
            return operator;
        }
    }
}
