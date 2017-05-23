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
        //Create window with a title
        final JFrame window = new JFrame("Initiative counter");
        //OnClose event when you push cross
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Текстовое поле
        JTextField textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setColumns(14);
        // Panel and toolbar
        JPanel panel = new JPanel();
        JToolBar toolbar = new JToolBar();
        //Buttons
        JButton minButton = new JButton("Свернуть");
        JButton maxButton = new JButton("Растянуть");
        JButton normalButton = new JButton("Оригинал");
        JButton exitButton = new JButton("Выход");
        JButton helloButton = new JButton("Hello");
        //Buttons for panel
        JButton newBattle = new JButton("New battle");
        JButton safeLog = new JButton("Safe log");
        JButton endBattle = new JButton("End battle");
        //Buttons for battle control


        JMenuBar jmb = new JMenuBar(); // Top menu

        JMenu file = new JMenu("File");

        JMenuItem open = new JMenuItem("open");
        file.add(open);

        JMenuItem save = new JMenuItem("save");
        file.add(save);

        JMenuItem printLog = new JMenuItem("Print log");
        file.add(printLog);

        jmb.add(file);



        JMenu about = new JMenu("About");
        jmb.add(about);

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
        panel.add(jmb);
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
