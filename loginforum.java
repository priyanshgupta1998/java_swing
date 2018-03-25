import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class loginFrame extends JFrame implements ActionListener//add hirarchy
{
    Container c;
    JLabel userlabel = new JLabel("username");
    JLabel passlabel = new JLabel("password");
    
    JTextField text=new JTextField();
    JPasswordField pass=new JPasswordField();
    
    JButton login_btn = new JButton("Log");
    
    JLabel wrn = new JLabel(" wrong username or password");
    
    loginFrame()//made a constructer
    {
        c=this.getContentPane();
        c.setLayout(null);
        Color color = new Color(0,191,255);
        /**
           Color Name	       RGB CODE	
        Dodger Blue	      30-144-255	
       Deep Sky Blue	      0-191-255	
         Sky Blue	      135-206-250	
       Light Sky Blue          135-206-250	
        
         */
        c.setBackground(color);
        
        userlabel.setBounds(100,50,100,40);
        passlabel.setBounds(100,150,100,40);
        
        Font f = new Font("Arial",Font.BOLD,20);
        
        userlabel.setFont(f);
        passlabel.setFont(f);
        text.setFont(f);
        pass.setFont(f);
        
        text.setBounds(250,50,150,40);
        pass.setBounds(250,150,150,40);
        
        login_btn.setBounds(200,250,100,40);
        login_btn.addActionListener(this);
        
        c.add(userlabel);
        c.add(passlabel);
        c.add(text);
        c.add(pass);
        c.add(login_btn);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==login_btn)
        {
           String username = text.getText();
           String password = pass.getText();
           
           if(username.equals("ABC") && password.equals("123"))
           {
               c.setBackground(Color.RED);
               c.remove(wrn);
            }
            else
            {
                c.setBackground(Color.GREEN);
                wrn.setBounds(100,300,200,50);
                c.add(wrn);
            } 
        }
    }
  
}

public class loginforum
{
    public static void main(String[] args)
    {
        loginFrame frame=new loginFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,600,500);
    }
}















