package applet;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;  


@SuppressWarnings("unchecked")
public class Pract_applet_5 extends JApplet {

    public static JProgressBar jProgressBar;

    public void init() 
    {

    
        JPanel jPanel = new JPanel();
 
    
        //initializing progress bar
        jProgressBar = new JProgressBar();
        jProgressBar.setStringPainted(true);
        jProgressBar.setValue(0);

        //adding progress bar to panel
        jPanel.add(jProgressBar);
        jProgressBar.setVisible(true);


        add(jPanel);
        setSize(600, 600);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        setVisible(true);

        progress();
    }


    public static void progress()
    {
        try {
           for(int i= 0; i <= 100; i+=20){
                
                jProgressBar.setValue(i);

                Thread.sleep(1000);
               
            }
        }
        catch (Exception e) {
        }
    }
   

}
