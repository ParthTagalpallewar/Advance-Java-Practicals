// Java Program to create a simple progress bar
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Practical_5 extends JFrame {
 
    static JFrame f;
 
    static JProgressBar b;
 
    public static void main(String[] args)
    {
 
        f = new JFrame("ProgressBar demo");
 
        JPanel p = new JPanel();
 
        b = new JProgressBar();
 
        b.setValue(0);
 
        b.setStringPainted(true);
 
        p.add(b);
 
        f.add(p);

        f.setLayout(new GridBagLayout());
 
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 
        //fill();
    }
 
   
}