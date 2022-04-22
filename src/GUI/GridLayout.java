
package GUI;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GridLayout {
    public static void main(String[] args) {
    JFrame fr  = new JFrame("Text");
    fr.setSize(300,200);
    fr.setVisible(true);
    fr.setLocation(100,100);
    fr.setLayout(new BorderLayout());
//    fr.pack();
//    fr.setResizable(false);
    
    JButton b1 = new JButton("North");
    JButton b2 = new JButton("South");
    JButton b3 = new JButton("West");
    JButton b4 = new JButton("East");
    JButton b5 = new JButton("Center");
    
    fr.add(b1, BorderLayout.NORTH);
    fr.add(b2, BorderLayout.SOUTH);
    fr.add(b3, BorderLayout.WEST);
    fr.add(b4, BorderLayout.EAST);
    fr.add(b5, BorderLayout.CENTER);
    
    
    }

    GridLayout(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
