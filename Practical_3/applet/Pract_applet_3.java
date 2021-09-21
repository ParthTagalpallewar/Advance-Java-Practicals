import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;  


@SuppressWarnings("unchecked")
public class Pract_applet_3 extends JApplet {

    public void init() {

    

        //tree config
        DefaultMutableTreeNode Student=new DefaultMutableTreeNode("Student");  
        DefaultMutableTreeNode College=new DefaultMutableTreeNode("College");  
        DefaultMutableTreeNode School=new DefaultMutableTreeNode("School");  

        Student.add(College);  
        Student.add(School);  

        DefaultMutableTreeNode GPA=new DefaultMutableTreeNode("GPA");  
        DefaultMutableTreeNode Sipna=new DefaultMutableTreeNode("Sipna");  
        DefaultMutableTreeNode RMeghe=new DefaultMutableTreeNode("RMeghe");  

        College.add(GPA); College.add(Sipna); College.add(RMeghe); 

        JTree jt=new JTree(Student);  
        add(jt);  
        jt.setVisible(true);


        setSize(200, 200);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        setVisible(true);
    }

}
