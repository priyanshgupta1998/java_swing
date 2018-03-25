import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class jcheckbutton
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,600,500);
        
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        JCheckBox cb1 = new JCheckBox("JButoon");
        cb1.setBounds(100,50,100,40);
        
        JCheckBox cb2 = new JCheckBox("JButoon");
        cb2.setBounds(200,50,100,40);
        
        /**to preselected acheckbutton*/
        cb1.setSelected(true);
        
        /**to  disable a checkbutton*/
        cb2.setEnabled(false);
        
        c.add(cb1);
        c.add(cb2);
    }
}
