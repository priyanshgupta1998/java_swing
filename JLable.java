import javax.swing.*;
import java.awt.*;
import java.lang.String.*;
class JLable
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
        JLabel label = new JLabel("USER NAME");
        label.setText("password");//to do override placeof previous string;
        label.setBounds(100,50,200,100);
        /**set the style of font */
        Font f = new Font("Arial",Font.BOLD,30);//Font(textstyle,'text varient(such as BOLD,PLAIN)',size of the text);
        label.setFont(f);
        
        
        c.add(label);
        
    }
    
}














