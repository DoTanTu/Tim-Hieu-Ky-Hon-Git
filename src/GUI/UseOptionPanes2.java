
package GUI;

import javax.swing.JOptionPane;


public class UseOptionPanes2 {
    public static void main(String[] args) {
    String ageText = JOptionPane.showInputDialog(null, "How old are you?"); 
        int age =0;
    try{
        age= Integer.parseInt(ageText); 
    }catch (NumberFormatException ef){
        JOptionPane.showMessageDialog(null,"Invalid Integer.");
                }
    String moneyText = JOptionPane.showInputDialog(null, "How much money do you have?"); 
        double money = 0;
    try{
         money = Double.parseDouble(moneyText); 
    }catch (NumberFormatException ef){
    JOptionPane.showMessageDialog(null, "If you can double your money each year,\n" + 
     "You'll have " + (money * 32) + "dollars at age " + (age + 5) + "!");
    }
    }
}
     
