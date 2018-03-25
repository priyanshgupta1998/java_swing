import javax.swing.*;
import java.awt.*;
class jlableimagetext
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
       /** to set a image as a label with  string*/
        ImageIcon icon=new ImageIcon("Active Home.png");
        
        JLabel label1 = new JLabel("text",icon,JLabel.CENTER);
        label1.setBounds(100,50,400,40);
        
        
        JLabel label2 = new JLabel("text",icon,JLabel.LEFT);
        label2.setBounds(100,100,400,40);
        
        JLabel label3 = new JLabel("text",icon,JLabel.RIGHT);
        label3.setBounds(100,100,400,40);
       
        c.add(label1);
        c.add(label2);
        c.add(label3);
      
        
    }
    
}