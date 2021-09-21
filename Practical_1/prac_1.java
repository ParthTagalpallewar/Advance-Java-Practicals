
import javax.swing.*;

public class prac_1 {
    public static void main(String[] args) {

        // Creating JFrame Object
        JFrame f = new JFrame("Password Field Example");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);

        final JTextField userName = new JTextField();
        userName.setBounds(100, 20, 100, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 75, 80, 30);

        final JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 75, 100, 30);

        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);

       

        f.add(passwordField);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(userName);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

      
    }
}