import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe extends JFrame implements ActionListener
{
    Container c;
    JTextField tf= new JTextField();
    myframe()//create a constructor of class
    {
       c=this.getContentPane();
       c.setLayout(null);
        
       Font f = new Font("arial",Font.BOLD,25);
       
       tf.setBounds(50,50,100,40);
       tf.addActionListener(this);
       c.add(tf);
       
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String text = tf.getText();
        String newText = text.toUpperCase();// by this when we press enter the value typed on textblock .it's converted into uppercaseall character.
        tf.setText(newText);
        
    }
}


public class jactionlistener
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
