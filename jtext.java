import javax.swing.*;
import java.awt.*;
public class jtext
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setBounds(300,200,400,400);//(left,top,width,height);
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        JTextField mytext = new JTextField();
        mytext.setBounds(100,50,200,40);
        /** chage the size of the  font*/
        Font f= new Font("Arial",Font.PLAIN,25);
        mytext.setFont(f);
        
        /** to make a color with own */
        Color clr=new Color(120,100,50);//Color(R,G,B);
        
        
        mytext.setBackground(clr);//setBackground(Color.GREEN);
        mytext.setForeground(Color.RED);
        
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,150,200,40);
        
        Font f1 = new Font("Arial",Font.BOLD,33);
        pass.setFont(f1);
        
        pass.setBackground(Color.YELLOW);
        pass.setForeground(Color.RED);
        
        
        c.add(mytext);
        c.add(pass);
     
        
     
    }
    
}
