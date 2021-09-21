import javax.swing.*;
import java.awt.FlowLayout;  

@SuppressWarnings("unchecked")
public class Prac_2{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Practical No 2");
       
        //Config JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.getContentPane().setLayout(new FlowLayout());

        //Adding JComboBox
        String subjectArray[] = {"English", "Marathi", "Hindi", "Sanskrit"};
        JComboBox jComboBox = new JComboBox(subjectArray);
        jComboBox.setBounds(50, 50, 90, 20);
        jComboBox.setVisible(true);
        frame.getContentPane().add(jComboBox);

      
        

    }
}