import javax.swing.*;
import java.awt.*;
class demo
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);//size(width,height);
        //frame.setLocation(100,300);//location(left,top):
        frame.setBounds(300,200,400,400);//(left,top,width,height);
        frame.setTitle("my jframe");
        
        /** set the icon of window frame intop corner of frame */
        ImageIcon icon = new ImageIcon("Active Home.png");
        frame.setIconImage(icon.getImage());
        
        /**   fill a selectable color  in content pane of frame*/
        Container c = frame.getContentPane();
        c.setBackground(Color.RED);
        
        frame.setResizable(false);
   
    }
    
}
