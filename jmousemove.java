
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe extends JFrame implements MouseMotionListener
{
    Container c;
    
    
    JTextField tf= new JTextField();
    JTextArea area = new JTextArea();
    
    
    myframe()//create a constructor of class
    {
       c=this.getContentPane();
       c.setLayout(null);
        
       Font f = new Font("arial",Font.BOLD,25);
       
       tf.setBounds(20,50,280,40);
       tf.setFont(f);
       
       area.setBounds(310,50,300,400);
       area.setEditable(false);//text area resizable 
      
       
       
       area.addMouseMotionListener(this);
       c.add(tf);
       c.add(area);
       
    }
    
    public void mouseMoved(MouseEvent e)
    {
        tf.setText("mouse moved at"+e.getX()+ " "+e.getY());
        
    }
    public void mouseDragged(MouseEvent e)
    {
        tf.setText("mouse dragged at"+e.getX()+ " "+e.getY());
        
    }
    
}


public class jmousemove
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

