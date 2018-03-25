import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**  create a actionlistener ''MyFrame'' to call the Button*/
class MyFrame extends JFrame implements ActionListener ///here JFrame method is inherited by myframe interface;
{
    JButton btn1= new JButton("click");
    JButton btn2= new JButton("ok");
    JButton btn3= new JButton("submit");
    Container c;
    
    MyFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        btn1.setBounds(100,50,100,50);
        btn2.setBounds(250,50,100,50);
        btn3.setBounds(400,50,100,50);
        
        btn1.addActionListener(this); 
        btn2.addActionListener(this); 
        btn3.addActionListener(this); 
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
    }
    
    
    
    /** to do override actionPerformed method */
    
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource()==btn1)
       {
        c.setBackground(Color.RED);
        }
        if (e.getSource()==btn2)
       {
        c.setBackground(Color.YELLOW);
        }
        if (e.getSource()==btn3)
       {
        c.setBackground(Color.GREEN);
        }
    
    }
    
    
     
    
}





public class actionlistener
{
    public static void main(String[] args)
    {
        MyFrame frame=new MyFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,1000,500);//(left,top,width,height);
        Container c = frame.getContentPane();
        
    }
}
       
    