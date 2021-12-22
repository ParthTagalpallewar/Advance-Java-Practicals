package Practical_7;

// Aim :- Write a Program to demonstrate the various Mouse events 
//        using MouseListener  and MouseMotionListener Interface.

import java.awt.*;  
import java.awt.event.*;  
public class practical_7 extends Frame implements MouseListener{  
    Label l;  
    practical_7(){  
        addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);
        
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
    public static void main(String[] args) {  
        new practical_7();  
    }  
}  