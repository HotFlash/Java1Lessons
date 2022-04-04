package ru.geekbrains.lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterAppNew extends JFrame{
    private int counter = 0;

    public CounterAppNew() {
        //Отрисовка окна
        JFrame frame = new JFrame("Counter");
        Font font = new Font("Arial", Font.BOLD, 30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panelBottom= new JPanel(); //Добавление Групп для эллементов
        JPanel panelTop = new JPanel();
        JButton increment10Button = new JButton("10 >");
        JButton decrement10Button = new JButton("< 10");
        JButton incrementButton = new JButton(">");
        JButton decrementButton = new JButton("<");
        JButton resetButton = new JButton("Reset");
        panelBottom.add(decrementButton);// добавление компонентов по группам используя Flow Layout
        panelBottom.add(decrement10Button);
        panelBottom.add(increment10Button);
        panelBottom.add(incrementButton);
        panelTop.add(resetButton);

        // Отрисовка счетчика по центру
        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);

        //Добавление компонентов в окно
        frame.getContentPane().add(BorderLayout.SOUTH, panelBottom);
        frame.getContentPane().add(BorderLayout.NORTH, panelTop);
        frame.getContentPane().add(BorderLayout.CENTER, counterView);

        ActionListener actionListener = e -> {
            if (e.getSource() == incrementButton) {
                counter++;
            } else if (e.getSource() == decrementButton) {
                counter--;
            } else if (e.getSource() == decrement10Button) {
                counter -= 10;
            } else if (e.getSource() == increment10Button) {
                counter += 10;
            } else if (e.getSource() == resetButton) {
                counter = 0;
            }
            refreshCounterView(counterView);
        };
        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        decrement10Button.addActionListener(actionListener);
        increment10Button.addActionListener(actionListener);
        resetButton.addActionListener(actionListener);
        frame.setVisible(true);
    }
    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }
}
