/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class UseOptionPanes {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?"); 
        int choice = JOptionPane.showConfirmDialog(null,"Do you like cake, " + name + "?");
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Of course! Who doesn't?");
        }
        else { 
            JOptionPane.showMessageDialog(null,  "We'll have to agree to disagree."); 
}
    }
}
