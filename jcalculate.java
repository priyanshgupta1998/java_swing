import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jcalculate 
{
    static Container c;
    
    static JLabel num1=new JLabel("number1");
    static JLabel num2=new JLabel("number2");
    
    static JTextField text1;
    static JTextField text2;
    
    static JButton sum;
    static JButton sub;
    static JButton mul;
    static JButton div;
    
    
    static JLabel ans;
    static JTextField text3;
    static JLabel wrn = new JLabel("message");
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,800,600);
        
        c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        text1=new JTextField();
        text2=new JTextField();
        
        sum=new JButton("sum");
        sub=new JButton("sub");
        mul=new JButton("mul");
        div=new JButton("div");
        
        ans =new JLabel("answer");
        text3= new JTextField();
        num1.setBounds(50,50,120,30);
        num2.setBounds(50,90,120,30);
        text1.setBounds(180,50,120,30);
        text2.setBounds(180,90,120,30);
        
        sum.setBounds(50,130,80,30);
        sub.setBounds(140,130,80,30);
        mul.setBounds(230,130,80,30);
        div.setBounds(320,130,80,30);
        
        sum.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                sumaction(e);
            }
                
        });
        
        
        
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                subaction(e);
            }
                
        });
        
        
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                mulaction(e);
            }
                
        });
        
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                divaction(e);
            }
                
        });
        
        ans.setBounds(50,170,120,30);
        text3.setBounds(180,170,120,30);
        
        wrn.setBounds(50,210,300,30);
        
        c.add(num1);
        c.add(num2);
        c.add(text1);
        c.add(text2);
        c.add(sum);
        c.add(sub);
        c.add(mul);
        c.add(div);
        c.add(ans);
        c.add(text3);
        c.add(wrn);
    }
    
    public static void sumaction(ActionEvent e)
    {
        String s1 = text1.getText();
        String s2 = text2.getText();
         
        try//used for pass the statements throught if not any error in it;
           {
                float n1 = Float.parseFloat(s1);//Float is a rapper class used in typecasting one data type to other data type
                float n2 = Float.parseFloat(s2);
                float an = n1 + n2;
                String result = Float.toString( an);
                text3.setText(result);
                wrn.setText("Message");
            }
        catch(Exception ex )//if error find then catch method becomes active;
        {
            wrn.setText(" please enter a valid number ");
            float an = 0;
            String result = Float.toString( an);
            text3.setText(result);
             
        }
        
    }
    
    public static void subaction(ActionEvent e)
    {
        String s1 = text1.getText();
        String s2 = text2.getText();
        try//used for pass the statements throught if not any error in it;
           {
                float n1 = Float.parseFloat(s1);//Float is a rapper class used in typecasting one data type to other data type
                float n2 = Float.parseFloat(s2);
                float an = n1 - n2;
                String result = Float.toString( an);
                text3.setText(result);
                wrn.setText("Message");
            }
        catch(Exception ex )//if error find then catch method becomes active;
        {
            wrn.setText(" please enter a valid number ");
            float an = 0;
                String result = Float.toString( an);
                text3.setText(result);
             
        }
    }
    
    public static void mulaction(ActionEvent e)
    {
        String s1 = text1.getText();
        String s2 = text2.getText();
        try//used for pass the statements throught if not any error in it;
           {
                float n1 = Float.parseFloat(s1);//Float is a rapper class used in typecasting one data type to other data type
                float n2 = Float.parseFloat(s2);
                float an = n1 *n2;
                String result = Float.toString( an);
                text3.setText(result);
                wrn.setText("Message");
            }
        catch(Exception ex )//if error find then catch method becomes active;
        {
            wrn.setText(" please enter a valid number ");
            float an = 0;
                String result = Float.toString( an);
                text3.setText(result);
             
        }
    }
    public static void divaction(ActionEvent e)
    {
        String s1 = text1.getText();
        String s2 = text2.getText();
        try//used for pass the statements throught if not any error in it;
           {
                float n1 = Float.parseFloat(s1);//Float is a rapper class used in typecasting one data type to other data type
                float n2 = Float.parseFloat(s2);
                
                float an = n1 /n2;
                String result = Float.toString( an);
                text3.setText(result);
                wrn.setText("Message");
            }
        catch(Exception ex )//if error find then catch method becomes active;
        {
            wrn.setText(" please enter a valid number ");
            float an = 0;
                String result = Float.toString( an);
                text3.setText(result);
             
        }
    }
      
}











