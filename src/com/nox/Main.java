package com.nox;

import com.nox.classes.interruptAction;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;

import static com.nox.constants.Strings.action;
import static com.nox.constants.Strings.columnNames;
import static com.nox.constants.interruptActions.interruptList;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("SR5 Initiative counter");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        String IP = "";
        //Создается панель, которая будет содржать информацию о IP адресе
        JPanel panel = new JPanel();
        //добавление границы к панели
        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", new Integer(5), new Boolean(false)},
                {"John", "Doe",
                        "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black",
                        "Knitting", new Integer(2), new Boolean(false)},
                {"Jane", "White",
                        "Speed reading", new Integer(20), new Boolean(true)},
                {"Joe", "Brown",
                        "Pool", new Integer(10), new Boolean(false)}
        };
        panel.setBorder(BorderFactory.createTitledBorder("  SR5 Initiative counter"));
                panel.add(new JLabel("          " + IP + "          "));
                panel.add( new JTable( data, columnNames));
                panel.setSize(800, 600);
                panel.add(new JButton("New battle", null));
                JComboBox interruptActionsCB = new JComboBox();
                for(interruptAction I : interruptList){
                    interruptActionsCB.addItem(I.getInterruptName());
                }
                panel.add(interruptActionsCB);
        //Добавление панели к фрейму
        frame.getContentPane().add(panel);
        //метод рack(); сообщает Swing о том, что нужно придать компонентам необходимые размеры для правильного помещения их в форму.
        //Другой способ - вызвать setSize(int width, int height).
        frame.pack();
        //Для того, чтобы увидеть окно на экране вы должны вызвать метод setVisible(true)
        frame.setVisible(true);

    }
}
