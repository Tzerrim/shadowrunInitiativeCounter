package com.nox.ui.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui {

    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);

    public gui(){
        //Создадим окно и установим заголовок
        final JFrame window = new JFrame("Caption");

        //Подключаем иконку из корня папки проекта
        ImageIcon img = new ImageIcon("java.png");
        window.setIconImage(img.getImage());

        //Событие "закрыть" при нажатии по крестику окна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Текстовое поле
        JTextField textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setColumns(14);


        //Создадим панель
        JPanel panel = new JPanel();

        //Создадим кнопки
        JButton minButton = new JButton("Свернуть");
        JButton maxButton = new JButton("Растянуть");
        JButton normalButton = new JButton("Оригинал");
        JButton exitButton = new JButton("Выход");
        JButton helloButton = new JButton("Hello");


        //Событие для кнопки "Свернуть"
        minButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setState(JFrame.ICONIFIED);
            }
        });

        //Событие для кнопки "Растянуть"
        maxButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });


        //Событие для кнопки "Оригинал"
        normalButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setExtendedState(JFrame.NORMAL);
            }
        });


        //Событие для кнопки "Выход"
        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setVisible(false);
                System.exit(0);
            }
        });

        //Событие для кнопки "Hello"
        helloButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                textField.setText("Hello World!");
            }
        });


        //Добавим кнопки и поля на панель
        panel.add(minButton);
        panel.add(maxButton);
        panel.add(normalButton);
        panel.add(exitButton);
        panel.add(textField);
        panel.add(helloButton);


        //Добавим панель в окно
        window.getContentPane().add(panel);

        window.pack();

        //Разместим программу по центру
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
