/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField displayField;
    private Calculator calculator;

    public CalculatorGUI() {
        super("Simple Calculator");
        calculator = new Calculator();
        displayField = new JTextField(10);
        displayField.setEditable(false);
        JPanel panel = new JPanel(new GridLayout(5, 4));

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        for (int i = 7; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            panel.add(button);
        }

        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this);
        panel.add(divideButton);

        for (int i = 4; i <= 6; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            panel.add(button);
        }

        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton);

        for (int i = 1; i <= 3; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            panel.add(button);
        }

        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        panel.add(subtractButton);

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(this);
        panel.add(zeroButton);

        JButton decimalButton = new JButton(".");
        decimalButton.addActionListener(this);
        panel.add(decimalButton);

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        panel.add(addButton);

        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(equalsButton);

        add(displayField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

  @Override
public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();
    switch (actionCommand) {
        case "=":
            calculator.setSecondOperand(Double.parseDouble(displayField.getText()));
            double result = calculator.calculateResult();
            displayField.setText(String.valueOf(result));
            break;
        case "C":
            displayField.setText("");
            calculator = new Calculator();
            break;
        case "+":
        case "-":
        case "*":
        case "/":
            calculator.setOperator(actionCommand.charAt(0));
            calculator.setFirstOperand(Double.parseDouble(displayField.getText()));
            displayField.setText("");
            break;
        default:
            displayField.setText(displayField.getText() + actionCommand);
            break;
    }
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI();
            }
        });
    }
}
