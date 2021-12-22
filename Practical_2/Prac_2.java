package Practical_2;

import javax.swing.*;
import java.awt.FlowLayout;  

public class Prac_2{

   
     

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        
       
        //Config JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new FlowLayout());

       

        //jLabel
        JLabel jLabel = new JLabel("Select Subject");
        jLabel.setBounds(20, 30, 100, 50);
        frame.add(jLabel); //adding jLabel

        //Adding JComboBox
        String subjectArray[] = {"English", "Marathi", "Hindi", "Sanskrit"};
        JComboBox<String> jComboBox = new JComboBox<String>(subjectArray);
        jComboBox.setBounds(150, 40, 150, 30);
        frame.getContentPane().add(jComboBox);
        jComboBox.setVisible(true); //adding JCombo box

      
        
        frame.setVisible(true);
    }
}