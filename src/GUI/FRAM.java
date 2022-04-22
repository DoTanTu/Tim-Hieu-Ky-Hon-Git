
package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
public class FRAM {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Text");
        fr.setSize(300,200);
        fr.setVisible(true);
        fr.setLocation(100,100);
        fr.setLayout(new BorderLayout());
        
        JPanel p1;
        p1 = new JPanel((LayoutManager) new GridLayout(4,3));
        for(int i=1; i<=9;i++){
           p1.add(new JButton("" + i));
        }
        p1.add(new JButton("*"));
        p1.add(new JButton("0"));
        p1.add(new JButton("#"));
        fr.add(p1, BorderLayout.CENTER);
        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new JLabel("Number to dial: "));
        p2.add(new JTextField(10));
        fr.add(p2, BorderLayout.SOUTH);
  
    }
}
