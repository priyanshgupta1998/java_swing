import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class action_listener_using_separateclass

{
    static Container c;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,1000,500);//(left,top,width,height);
        c = frame.getContentPane();
        
        c.setLayout(null);
       
        
        JButton btn1 = new JButton(" RED");
        btn1.setBounds(100,50,70,30);
        
        btn1ListnerClass btn1listener = new btn1ListnerClass();
        btn1.addActionListener(btn1listener);
        
        JButton btn2 = new JButton(" BLUE ");
        btn2.setBounds(250,50,100,30);
        
        btn2ListnerClass btn2listener = new btn2ListnerClass();
        btn2.addActionListener(btn2listener);
        
        
        
        c.add(btn1);
        c.add(btn2);
        
    }
   
}
    
class btn1ListnerClass implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        action_listener_using_separateclass.c.setBackground(Color.RED);
        
    }
}
class btn2ListnerClass implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        action_listener_using_separateclass.c.setBackground(Color.BLUE);
 
    }
}



















