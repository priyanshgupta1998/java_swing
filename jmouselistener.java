import javax.swing.*;//for  frame 

import java.awt.*;//for container 
import java.awt.event.*;//for listener event

class myframe extends JFrame implements MouseListener
{
    Container c;
    
    JTextArea area = new JTextArea();
    JTextArea text = new JTextArea();
    myframe()//create a constructor of class
    {
       c=this.getContentPane();
       c.setLayout(null);
            
       Font f = new Font("arial",Font.BOLD,25);
       
       
       
       area.setBounds(50,50,250,250);
       area.setFont(f);
       
       text.setBounds(320,50,350,300);
       
       area .addMouseListener(this);  
       
       c.add(area);
       c.add(text);
       
    }
    public void mouseEntered(MouseEvent e)
    {
        text.append("mouseentered\n"); 
    }
    public void mouseExited(MouseEvent e)
    {
        text.append("mouseExited\n"); 
    }
    public void mousePressed(MouseEvent e)
    {
        text.append("mousePressed\n"); 
    }
    public void mouseClicked(MouseEvent e)
    {
        text.append("mouseClicked\n"); 
    }
    public void mouseReleased(MouseEvent e)
    {
        text.append("mouseReleased\n"); 
    }
    
}



public class jmouselistener
{
   public static void main(String[] args)
    {
        myframe frame=new myframe();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,1000,700);//(left,top,width,height);
        
        
    } 
}
