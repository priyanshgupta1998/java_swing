/**The basic purpose of the Key Listener interface is for when an operation is performed on the keyboard, 
   when a key is pressed or released 
 * 
 * This is particularly useful when you want to add some key functionality to your app and 
 * it’s very important you want to monitor that has a very intensive  keyboard activity.
 * 
 */
import javax.swing.*;//for  frame 

import java.awt.*;//for container 
import java.awt.event.*;//for listener event

class myframe extends JFrame implements KeyListener
{
    Container c;
    
    JTextField tf = new JTextField();
    JTextArea text = new JTextArea();
    myframe()//create a constructor of class
    {
       c=this.getContentPane();
       c.setLayout(null);
            
       Font f = new Font("arial",Font.BOLD,25);
       
       tf.setBounds(50,50,150,40);
       tf.setFont(f);
       text.setBounds(220,50,350,300);
       tf.addKeyListener(this);  
       c.add(tf);
       c.add(text);
    }
    /**create three key listener */
    
    public void keyTyped(KeyEvent e)
    {
      text.append("keytyped: "+e.getKeyChar()+"\n");  
    }
    public void keyPressed(KeyEvent e)
    {
      text.append("keyPressed: "+e.getKeyChar()+"\n");  
    }
    public void keyReleased(KeyEvent e)
    {
      text.append("keyReleased: "+e.getKeyChar()+"\n");  
    }
    
}


public class jkeylistener
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
