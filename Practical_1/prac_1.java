package Practical_1;


import javax.swing.*;

public class prac_1 {
    public static void main(String[] args) {



        // Creating JFrame Object
        JFrame f = new JFrame("Password Field Example");

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

       

        f.add(passwordField);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(userName);
        f.add(imageLabel);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}