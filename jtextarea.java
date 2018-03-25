import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jtextarea
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,600,500);
        
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        
        JTextArea textarea=new JTextArea();
        textarea.setBounds(100,50,200,200);
        
        Font f =new Font("Arial",Font.BOLD,20);
        textarea.setFont(f);
        frame.setResizable(true);
        
        c.add(textarea);
        
        
    }
    
}
