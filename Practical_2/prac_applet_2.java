import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("unchecked")
public class Prac_applet_2 extends JApplet {

    public void init() {
        add(new B()); 
    }

}
@SuppressWarnings("unchecked")
class B extends JPanel {


    B() {

        setLayout(new FlowLayout());

      
       
        //Config JFrame
        setVisible(true);
        setSize(400, 500);

        //Adding JComboBox
        String subjectArray[] = {"English", "Marathi", "Hindi", "Sanskrit"};
        JComboBox jComboBox = new JComboBox(subjectArray);
        jComboBox.setBounds(50, 50, 90, 20);
        jComboBox.setVisible(true);
        add(jComboBox);

    
      

    }

   
}