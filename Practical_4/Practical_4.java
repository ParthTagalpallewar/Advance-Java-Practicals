package Practical_4;

import javax.swing.*;    

public class Practical_4 {    

   

    public static void main(String[] args) {    
        
        JFrame f = new JFrame();

        String data[][]={  
            {"1","Jay","Ram Maghe"},    
            {"2","Sachin","Sipna"},    
            {"3","Yash","GPA"}
        };    

        String column[]={"ID","NAME","COLLEGE"};  

        JTable jt = new JTable(data,column);    
        jt.setBounds(30,40,200,300);       

        JScrollPane sp=new JScrollPane(jt);    
        
        f.add(sp);          
        f.setSize(300,400);    
        f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}  