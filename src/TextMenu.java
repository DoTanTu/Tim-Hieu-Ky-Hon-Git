
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TextMenu extends JFrame implements ActionListener{
    JMenu menu, submenu, exercise, help;
    JMenuItem i1,i2,i3,i4,i5,i6,i7;
    public TextMenu() {
        JFrame f = new JFrame("Application desktop");
        JMenuBar mb = new JMenuBar();// taoj thanh ngang
        mb.setFont(new Font(Font.SERIF, Font.BOLD,0 ));
        menu = new JMenu("Menu");
        menu.setFont(new Font(Font.SERIF, Font.BOLD, 20));

        exercise = new JMenu("Exercise");
        exercise.setFont(new Font(Font.SERIF, Font.BOLD, 20));

        help = new JMenu("help");
        help.setFont(new Font(Font.SERIF, Font.BOLD, 20));

        submenu = new JMenu("Item3");
        //tao ca menu item
        i1 = new JMenuItem("SubMenu");
        i2 = new JMenuItem("Calculator");
        i3 = new JMenuItem("OrderFood");
        i4 = new JMenuItem("Item4");
        i5 = new JMenuItem("Item5");
        i6 = new JMenuItem("program covert number");
        i7 = new JMenuItem("Item7");
        //dang ky bo lang nghe cho cac menu item
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        //dua cac menu item vao jmenu
        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        menu.add(i3);

        //
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        exercise.add(i6);
        exercise.add(i7);

        // dua cac jmenu vao thanh ngang
        mb.add(menu);
        mb.add(exercise);
        mb.add(help);
        //dua/gan thanh ngang vao frame
        f.setJMenuBar(mb);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        TextMenu textMenu = new TextMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(getSource() == i1)
            new GiaoDien();
        if(getSource() == i2)
            new GiaoDien();
        if(getSource() == i3)
            new GiaoDien();
        if(getSource() == i4)
            new GiaoDien();
         if(getSource() == i5)
            new GiaoDien();
        if(getSource() == i6)
            new GiaoDien();
    }

    private JMenuItem getSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
