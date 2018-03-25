/** here are two method which we have to override*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class myframe extends JFrame implements FocusListener
{
    Container c;
    JTextField tf= new JTextField("hy");
    JTextArea area = new JTextArea();
    
    myframe()//create a constructor of class
    {
       c=this.getContentPane();
       c.setLayout(null);
       this.addFocusListener(this);
       
       tf.setBounds(50,50,150,40);
       
       area.setBounds(50,100,450,400);
       
       tf.addFocusListener(this);
       c.add(tf);
       c.add(area);
    }
    
    public void focusGained(FocusEvent e)
    {
        area.append("focus gained \n");
    }
    
    public void focusLost(FocusEvent e)
    {
        area.append("focus lost \n");
    }
    
    
}

public class jfocuslistener
{
    
    public static void main(String[] args)
    {
        myframe frame=new myframe();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,1000,500);//(left,top,width,height);   
    }
    
}


