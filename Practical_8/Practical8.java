package Practical_8;

import javax.swing.*;
public class Practical8 {
    public static void main(String[] args) {

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