
/**
there are two types of components 
1.)light weight component=those component which can be added in some other component;
ex.-JButton ,JRadioButton
JButton--->JFrame
2.)heavy weight component = can't be added in some other component
ex.-JFrame,Jdialog
 * 
 * 
 * Container= is a component which may contain some other light weight component . ex.-JFrame
 * 
 * JPanel is light weight component which can contain some other light weigh component...is used in grouping of some other component;
 * ex.--JButton--->JPanel--->JFrame
 * JButton--->Jpanel1----->JPanel2--->JFrame
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jpanel
{
   public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("my jpanel");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);//(left,top,width,height); 
        
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        JPanel panel = new JPanel();
        panel.setBounds(50 ,50 , 500, 300 );
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(0,50 , 300, 200 );
        panel2.setBackground(Color.RED);
        panel2.setLayout(null);
        
        JButton button = new JButton("on");
        button.setBounds(100,100,100,40);
        
        JButton btn = new JButton("off");
        btn.setBounds(150,200,100,40);
        
        panel.add(btn);
        panel.add(panel2);
        
        c.add(panel);
        panel2.add(button);
        
    }
}













