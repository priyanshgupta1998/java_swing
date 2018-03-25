import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class actionlistener_anonymous_innerclass
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
        c.setBackground(Color.BLUE);
        
        JButton btn1 = new JButton(" RED");
        btn1.setBounds(100,50,70,30);
        
        JButton btn2 = new JButton(" GREEN");
        btn2.setBounds(250,50,100,30);
        
        /** to make a ActionListener for button 1 and button 2 which was implemented by a annoymous class and we have to override actionperform method for it*/
       
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              btn1ButtonAction(e);  
            }
        });
   
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              btn2ButtonAction(e);  
            }
        });
        
        c.add(btn1);
        c.add(btn2);
        
    }
    static void btn1ButtonAction(ActionEvent e)
    {
        c.setBackground(Color.RED);
    }
     static void btn2ButtonAction(ActionEvent e)
    {
        c.setBackground(Color.GREEN);
    }
}
    
    
    
