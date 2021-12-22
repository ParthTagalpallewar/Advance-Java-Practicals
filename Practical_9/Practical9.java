package Practical_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Practical9  extends WindowAdapter
{
    public static void main(String[] args) 
    {
         // Creating JFrame Object
        JFrame f = new JFrame("Password Field Example");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);

        final JTextField userName = new JTextField();
        userName.setBounds(100, 20, 100, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 60, 80, 30);

        final JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 60, 100, 30);

        JButton b = new JButton("Login");
        b.setBounds(100, 100, 80, 30);
        b.addActionListener(e -> {
            String strUserName = userName.getText();
            String strPassword = passwordField.getText();

            System.out.println(strUserName + " :- " + strPassword);
            
        });

        f.addWindowListener(new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                System.out.println("closing windows"); 
            }  
            
            public void windowActivated(WindowEvent e){
                System.out.println("Activated"); 
            }

            public void windowOpened(WindowEvent e){
                System.out.println("Opened"); 
            }
        });    

       

        f.add(passwordField);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(userName);
       

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}