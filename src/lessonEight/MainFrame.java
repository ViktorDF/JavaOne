package lessonEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private int firstValue = 0;
    private int secondValue = 0;
    private String operation = "+";

    public MainFrame() {
        setTitle("Calculator");
        setBounds(100, 100, 300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        add(top, BorderLayout.CENTER);
        top.setLayout(new GridLayout(4, 3));
        JPanel bottom = new JPanel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        DigitButtonListener digitButtonListener = new DigitButtonListener(inputField);
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitButtonListener);
            top.add(btn);
        }

        JButton add = new JButton("+");
        top.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.parseInt(inputField.getText());
                inputField.setText("");
                operation = "+";
            }
        });
        JButton minus = new JButton("-");
        top.add(minus);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.parseInt(inputField.getText());
                inputField.setText("");
                operation = "-";
            }
        });
        JButton multiple = new JButton("*");
        top.add(multiple);
        multiple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.parseInt(inputField.getText());
                inputField.setText("");
                operation = "*";
            }
        });
        JButton divide = new JButton("/");
        top.add(divide);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.parseInt(inputField.getText());
                inputField.setText("");
                operation = "/";
            }
        });
        JButton pow = new JButton("^");
        top.add(pow);
        pow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.parseInt(inputField.getText());
                inputField.setText("");
                operation = "^";
            }
        });
        JButton calc = new JButton("=");
        top.add(calc);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondValue = Integer.parseInt(inputField.getText());
                if ("+".equals(operation)) {
                    inputField.setText((firstValue + secondValue) + "");
                }
                if ("-".equals(operation)) {
                    inputField.setText((firstValue - secondValue) + "");
                }
                if ("/".equals(operation)) {
                    inputField.setText((double)(firstValue / secondValue) + "");
                }
                if ("*".equals(operation)) {
                    inputField.setText((firstValue * secondValue) + "");
                }
                if ("^".equals(operation)) {
                    int value = firstValue;
                    for (int i = 0; i < secondValue - 1; i++) {
                         value = value * firstValue;
                    }
                    inputField.setText((value) + "");
                }
            }
        });


        bottom.add(inputField, BorderLayout.CENTER);
        JButton clear = new JButton("C");
        clear.addActionListener(new ClearButtonListener(inputField));
        bottom.add(clear, BorderLayout.EAST);

        setVisible(true);

        new ClearButtonListener(inputField);
    }

    public static class ClearButtonListener implements ActionListener {
        private JTextField inputField;

        public ClearButtonListener(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
        }
    }

}
