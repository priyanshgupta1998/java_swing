import javax.swing.*;
import java.awt.*;
public class Jbutton
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        frame.setBounds(100,100,1000,600);//(left,top,width,height);
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        /** to set a image instead of text on button */
        ImageIcon icon = new ImageIcon ("Active Home.png");
        
        JButton btn = new JButton(" click me");
        //btn.setText("Another");  // to overeride previous content on button;
        JButton make = new JButton(icon);
        btn.setLocation(100,50);
        btn.setSize(200,40);
        //btn.setBounds(100,50,100,40);
        make.setBounds(100,150,100,40);//setBounds(100,150,icon.getIconWidth(),icon.getIconHeight());
        /** to set the size ofthe text on the button*/
        Font f= new Font("Arial",Font.PLAIN,25);
        
        btn.setFont(f);
        /**TO SET THE COLOROF BUTTON BLOCK OR OF TEXT IN IT*/
        btn.setBackground(Color.YELLOW);
        btn.setForeground(Color.RED);
        
        /**CHAGE THE CURSOR SIGN in hand sign when mouse hover on button*/
        Cursor cur= new Cursor(Cursor.HAND_CURSOR);//we can use here (Cursor.CROSSHAIR_CURSOR),,,(Cursor.WAIT_CURSOR);
       
     
        btn.setCursor(cur);
       
        c.add(btn);
        c.add(make);
   
    }
    
}
