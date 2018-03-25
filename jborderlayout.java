

/**
 layout is the way to arrange the componets according to user ,,,1.)null layout
 is used to set the location of the component on fixed means that when user resize the 
 frame or window the location of the component doesn't change.
 
 but2.)in the border layout is used five componets and width-height can be autoadjest 
 when frame is resized.
 
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class jborderlayout
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("my jpanel");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);//(left,top,width,height); 
        
        Container c = frame.getContentPane();
        BorderLayout b1 = new BorderLayout(10,5);//BorderLayout(horizontal-gap,vertical-gap);
        /** or we can set Hgap & Vgap by this manner also*/
        //b1.setHgap(100;
        //b1.setVgap(5);
        c.setLayout(b1);
        
        JButton btn1= new JButton("page_start");
        JButton btn2= new JButton("page_end");
        JButton btn3= new JButton("line_start");
        JButton btn4= new JButton("center");
        JButton btn5= new JButton("line_end");
        
        
        c.add(btn1,BorderLayout.PAGE_START);
        c.add(btn2,BorderLayout.PAGE_END);
        c.add(btn3,BorderLayout.LINE_START);
        c.add(btn4,BorderLayout.CENTER);
        c.add(btn5,BorderLayout.LINE_END);
        
        
        
        
    }
}










