import javax.swing.*;
import java.awt.*;
class jlableimage
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,1000,500);//(left,top,width,height);
        Container c = frame.getContentPane();
       
       /**set a labelto collect row information of user  */
        c.setLayout(null);
       /** to set a image as a label instead of  string*/
        ImageIcon icon=new ImageIcon("Active Home.png");
        JLabel label = new JLabel(icon);
        label.setBounds(100,30,icon.getIconWidth(),icon.getIconHeight());
        c.add(label);
      
        
    }
    
}