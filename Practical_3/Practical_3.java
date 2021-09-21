import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  

public class Practical_3 {  
    JFrame f;  

    Practical_3(){  

        f=new JFrame();   

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
        f.add(jt);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);  
        f.setVisible(true);  
    }  

    public static void main(String[] args) {  
        new Practical_3();  
    }
}  