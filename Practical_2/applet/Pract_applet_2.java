import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("unchecked")
public class Pract_applet_2 extends JApplet {

    public void init() {
        setLayout(null);

        setVisible(true);
        setSize(400, 500);

        JLabel jLabel = new JLabel("Select Subject");
        jLabel.setBounds(20, 30, 100, 50);
        add(jLabel);
      
        String subjectArray[] = {"English", "Marathi", "Hindi", "Sanskrit"};
        JComboBox jComboBox = new JComboBox(subjectArray);
        jComboBox.setBounds(150, 40, 150, 30);
        jComboBox.setVisible(true);

        add(jComboBox);
    }

}
