
package EVENt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AEvent extends JFrame implements ActionListener{
    //Khai bao cac thành phan (textFiled, Frame)
    JTextField textFiled;
    JFrame frame;
    JButton b1;
    JButton b2;
    //Tao constructeor
    AEvent(){
    //Tao create components
        frame = new JFrame("Test event handling for withthin class");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLocation(100,100);
        frame.setLayout(null);

        textFiled = new JTextField();
        textFiled.setBounds(60, 50, 170, 30);
        frame.add(textFiled);
        
    
        b1 = new JButton("Show");
        b1.setBounds(60, 80,80, 30);
        frame.add(b1);

        textFiled = new JTextField();
        b2 = new JButton("Show2");
        b2.setBounds(150, 80,80,30);
        frame.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        frame.setVisible(true);
        
    }
    void display(){
       
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Show") {
        textFiled.setText("Hello Student UTE");
        }

        if(e.getActionCommand() == "Show2") {
        textFiled.setText("Hello Student DSK");
}
    }

    public static void main(String[] args) {
        new AEvent();
    }

}
