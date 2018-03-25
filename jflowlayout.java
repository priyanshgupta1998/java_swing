/** in flow layout component can adjust self */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jflowlayout
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
        FlowLayout f1 =new FlowLayout(FlowLayout.LEFT,10,20);
        /** FlowLayout(FlowLayout.RIGHT)**//**FlowLayout(FlowLayout.CENTER)*/
        //WE CAN USE OTHER METHOD TO PASS THE Hgap and Vgap
        //f1.setHgap(10);
        //f1.setVgap(20);
        c.setLayout(f1);
        
        c.add(btn1);
        c.add(btn2,0);//here (btn,position) or index number wher user want to put btn2;
        c.add(btn3,3);
        c.add(btn4);
        
        
        
    }
}












