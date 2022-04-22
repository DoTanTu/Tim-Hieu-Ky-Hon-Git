
package EVENt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Implements extends JFrame implements ActionListener {
//1: khai bao cac thanh phan (textField, frame)
JTextField textField;
JFrame frame;
JButton b1, b2;
//2: tao constructor
public Implements() {
//2.1: tao components
frame = new JFrame(" Test event handling for within class");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400, 200);
frame.setLocation(100, 100);
frame.setLayout(null);

textField = new JTextField();
textField.setBounds(60, 50, 170, 30);
frame.add(textField);

b1 = new JButton("Show");
b1.setBounds(60, 80, 80, 30);
frame.add(b1);

b2 = new JButton("Show2");
b2.setBounds(150, 80, 80, 30);
frame.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

frame.setVisible(true);
}

public static void main(String[] args) {
new Implements();
}
    void display(){
        System.out.println("Hello DHSP ky thuat");
    }
    void display2(){
        System.out.println("Hello ute");
    }


@Override
public void actionPerformed(ActionEvent e) {
//textField.setText("Hello Student UTE");
        if(e.getActionCommand() == "Show") {
        display();
        }

        if(e.getActionCommand() == "Show2") {
        display2();
}
}
} 

