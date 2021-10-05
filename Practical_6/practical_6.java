// Aim :- Write a Program to demonstrate the 
// status of key on Applet window such as  KeyPressed, KeyReleased, KeyUp, KeyDown.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class practical_6 extends Applet implements KeyListener
{
    Font f1;

    String msg = "";
 
    public void init()
    {
        addKeyListener(this);
        f1 = new Font("Arial",Font.BOLD,18); 
    }
 
    public void keyReleased(KeyEvent k)
    {
        showStatus("Key Released");
        msg = "Key Released";
        repaint();
    }
 
    public void keyTyped(KeyEvent k)
    {
        showStatus("Key Typed");
        msg = "Key Typed";
        repaint();
    }
 
    public void keyPressed(KeyEvent e)
    {
        int id = e.getID();
        String keyString;
        if (id == KeyEvent.KEY_TYPED) {
            char c = e.getKeyChar();
            keyString = "key character = '" + c + "'";
        } else {
            keyString =  KeyEvent.getKeyText(e.getKeyCode());        
        }
       
        showStatus("Key Pressed " + keyString);
        msg = "Key Pressed "+ keyString;
        repaint();
    }
 
    public void paint(Graphics g)
    {
        g.setFont(f1);     
        g.drawString(msg, 150, 300);
    }
}