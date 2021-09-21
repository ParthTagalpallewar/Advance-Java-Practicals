import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;  


@SuppressWarnings("unchecked")
public class Pract_applet_4 extends JApplet {

    public void init() {

    
        String data[][]={  
            {"1","Jay","Ram Maghe"},    
            {"2","Sachin","Sipna"},    
            {"3","Yash","GPA"}
        };    

        String column[]={"ID","NAME","COLLEGE"};  

        JTable jt = new JTable(data,column);    
        jt.setBounds(30,40,200,300);       
        JScrollPane sp=new JScrollPane(jt);    
        add(sp);          
        setSize(300,400);    
        setVisible(true);    
       
      

        setSize(600, 600);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        setVisible(true);
    }

}
