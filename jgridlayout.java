/** in grid layout every component has same width-height */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jgridlayout
{
    static JButton btn1 = new JButton(" JButton 1 " );
    static JButton btn2 = new JButton(" JButton 2 " );
    static JButton btn3 = new JButton(" JButton 3 " );
    static JButton btn4 = new JButton(" JButton 4 " );
    
  public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("flow layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);//(left,top,width,height); 
        
        Container c = frame.getContentPane();
        
        GridLayout g1 =new GridLayout();
        //GridLayout g1 =new GridLayout(number of rows,number of columns,horizontal gap size,vertical gap size);       
        c.setLayout(g1);
        
        c.add(btn1);
        c.add(btn2,0);//here (btn,position) or index number wher user want to put btn2;
        c.add(btn3);
        c.add(btn4);
    }
}
