package Practical_12;

//Aim - Aim: Write a Program to demonstrate the use of Bound and Constraints Property of Java Bean.

import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeListener;
import java.io.Serializable;
import java.util.Arrays;
import javax.swing.JComponent;

public class Practical_12 implements Serializable{
    public static void main(String args[]) {
        FaceBean s = new FaceBean();

        System.out.println("Previous Bean value is " + s.getMouthWidth());

        s.addPropertyChangeListener(event ->{
            System.out.println(
                "Property changed "+event.getPropertyName() + 
                " old value "+event.getOldValue() + 
                " New value "+ event.getNewValue());
        });

        s.addVetoableChangeListener(event ->{
            
            System.out.println(
                "Vetoreble Property changed "+event.getPropertyName() + 
                " old value "+event.getOldValue() + 
                " New value "+ event.getNewValue());
        });


        try {
            s.setMouthWidth(20);

            s.setMouthWidth(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        
    }
    
}

