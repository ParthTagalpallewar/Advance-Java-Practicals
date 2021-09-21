import java.applet.*;  
import javax.swing.*;  
import java.awt.event.*;  

public class Prac_1_applet extends JApplet{  
     
    
    public void init(){  


        ImageIcon imageIcon = new ImageIcon("img.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(100, 0, 100, 100);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 120, 80, 30);

        final JTextField userName = new JTextField();
        userName.setBounds(100, 120, 100, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 160, 80, 30);

        final JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 160, 100, 30);

        JButton b = new JButton("Login");
        b.setBounds(100, 200, 80, 30);

        add(imageLabel);
        add(userName);
        add(passwordField);
        add(l1);
        add(l2);
        add(b);
        

        setSize(300, 300);
        setLayout(null);
     
      
    }  
}  