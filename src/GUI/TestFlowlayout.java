/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class TestFlowlayout {
    public static void main(String[] args) {
       JFrame fr = new JFrame("Test Flowlayer");
       fr.setSize(300,300);
       fr.setVisible(true);
       fr.setLocation(100,100);
       fr.setLayout(new FlowLayout());
       
       JLabel label = new JLabel("type your Zip code: ");
       JTextField field = new JTextField(5);
       JButton button = new JButton("Submit");
    }
}
