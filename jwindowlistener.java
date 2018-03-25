/** seven method are here which we have to override */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class myframe extends JFrame implements WindowListener
{
    Container c;
    
    myframe()//create a constructor of class
    {
       c=this.getContentPane();
       c.setLayout(null);
       this.addWindowListener(this);
    }
    
    public void windowOpened(WindowEvent e)
    {
         System.out.println("window opened  \n ");
        
    }
    public void windowClosing(WindowEvent e)
    {
         System.out.println("window closing  \n ");
        
    }
    public void windowClosed(WindowEvent e)
    {
         System.out.println("window closed  \n ");
        
    }
    public void windowIconified(WindowEvent e)
    {
         System.out.println("window iconified  \n ");
        
    }
    public void windowDeiconified(WindowEvent e)
    {
         System.out.println("window deiconified \n ");
        
    }
    public void windowActivated(WindowEvent e)
    {
         System.out.println("window activate  \n ");
        
    }
    public void windowDeactivated(WindowEvent e)
    {
         System.out.println("window deactivated  \n ");
        
    }
    
}


public class jwindowlistener
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