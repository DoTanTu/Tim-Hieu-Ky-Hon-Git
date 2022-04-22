
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class GiaoDien extends JFrame implements ActionListener{
	JLabel l, type, number, cpr, me;
	JCheckBox cb1, cb2, cb3, cb4, cb5;
	JComboBox cbb1, cbb2, cbb3, cbb4, cbb5;
	JButton b;
	JRadioButton rb1, rb2;
	String num[]= {"1","2","3","4","5"};
	GiaoDien(){
		setTitle("ORDER FOOD SYSTEM OF VKU");
		l = new JLabel("Food Ordering System");
		l.setBounds(50,30,300,20);
		type = new JLabel("Food Type");
		type.setBounds(50,70,200,20);
		
		number = new JLabel("Number");
		number.setBounds(300,70,200,20);

		cb1 = new JCheckBox("Pizza cost 50 USD");
		cb1.setBounds(50,100,150,20);	
		cbb1 = new JComboBox(num);
		cbb1.setBounds(300,100,100,20);
		
		cb2 = new JCheckBox("Burger cost 40 USD");
		cb2.setBounds(50,150,150,20);	
		cbb2 = new JComboBox(num);
		cbb2.setBounds(300,150,100,20);
		
		cb3 = new JCheckBox("Tea cost 30 USD");
		cb3.setBounds(50,200,150,20);
		cbb3 = new JComboBox(num);
		cbb3.setBounds(300,200,100,20);
		
		cb4 = new JCheckBox("Milk cost 20 USD");
		cb4.setBounds(50,250,150,20);
		cbb4 = new JComboBox(num);
		cbb4.setBounds(300,250,100,20);
		
		cb5 = new JCheckBox("Coffee cost 10 USD");
		cb5.setBounds(50,300,150,20);
		cbb5 = new JComboBox(num);
		cbb5.setBounds(300,300,100,20);
		
		rb1 = new JRadioButton("YES");
		rb1.setBounds(100,350,100,30);
		rb2 = new JRadioButton("NO");
		rb2.setBounds(300,350,100,30);
		
		me = new JLabel("Member");
		me.setBounds(20,350,60,30);
		
		b = new JButton("Order");
		b.setBounds(200,400,80,30);	
		b.addActionListener(this);
		
		
		//cpr = new JLabel("");
		//cpr.setBounds(150,430,300,20);
			
		add(l);
		add(type);
		add(number);

		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(b);
		add(cbb1);
		add(cbb4);
		add(cbb2);
		add(cbb3);
		add(cbb5);
		//add(cpr);
		//add(cbb5);
		//add(cb5);
		add(rb1);
		add(rb2);
		add(me);
		
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		this.setLocationRelativeTo(null);
		
		int index = cbb1.getSelectedIndex();
		String  St = cbb1.getSelectedItem().toString();
		
	}
	
		@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float amount1 = 0, amount2 = 0, amount3 = 0, amount4 = 0, amount = 0, amount5 = 0;
		String msg = "";
		
		if(cb1.isSelected()) {
			String data1 = (String) cbb1.getItemAt(cbb1.getSelectedIndex());	
			int re = Integer.parseInt(data1);	
			amount1 += 50 * re;
			msg = "Pizza: 50 x" + re + " = " + amount1 + "\n";
		}
		if(cb2.isSelected()) {
			String data2 = "" + cbb2.getItemAt(cbb2.getSelectedIndex());	
			int re2 = Integer.parseInt(data2);	
			amount2 += 40 * re2;
			msg += "Burger: 40 x" + re2 + " = " + amount2 + "\n";
		}
		if(cb3.isSelected()) {
			String data3 = "" + cbb3.getItemAt(cbb3.getSelectedIndex());		
			int re3 = Integer.parseInt(data3);	
			amount3 += 30 * re3;
			msg += "Tea: 30 x" + re3 + " = " + amount3 + "\n";
		}
		if(cb4.isSelected()) {
			String data4 = "" + cbb4.getItemAt(cbb4.getSelectedIndex());
			
			int re4 = Integer.parseInt(data4);
			
			amount4 += 20 * re4;
			msg += "Milk: 20 x" + re4 + " = " + amount4 + "\n";
		}
		if(cb5.isSelected()) {
			String data5 = "" + cbb5.getItemAt(cbb5.getSelectedIndex());		
			int re5 = Integer.parseInt(data5);		
			amount5 += 10 * re5;
			msg += "Coffee: 10 x" + re5 + " = " + amount5 + "\n";
		}
		//-------------------
		amount = amount1 + amount2 + amount3 + amount4 + amount5 ;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		msg +="----------------\n";	
		LocalDateTime now = LocalDateTime.now();		
		if(rb1.isSelected()) {
			float a2 = amount - amount*0.1f;	
			JOptionPane.showMessageDialog(this, msg + "Total: " + a2 + "\n date :" + dtf.format(now) + "\n YES");
			}
			if(rb2.isSelected()) {
				JOptionPane.showMessageDialog(this, msg + "Total: " + amount + "\n date :" + dtf.format(now) + "\n NO");
			}
		}// the end of ActionPerform()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GiaoDien();
	}
}

