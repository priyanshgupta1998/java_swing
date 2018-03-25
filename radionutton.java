import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class radionutton
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
        
        JRadioButton male=new JRadioButton("male");
        male.setBounds(100,50,100,50);
        
        JRadioButton female=new JRadioButton("female");
        female.setBounds(250,50,100,50);
        
        ButtonGroup sex =new ButtonGroup();
        sex.add(male);
        sex.add(female);
        
        JRadioButton gen=new JRadioButton("general");
        gen.setBounds(100,100,100,50);
        
        JRadioButton obc=new JRadioButton("obc");
        obc.setBounds(200,100,100,50);
        
        JRadioButton sc=new JRadioButton("sc");
        sc.setBounds(300,100,100,50);
        
        JRadioButton st=new JRadioButton("st");
        st.setBounds(400,100,100,50);
        
        ButtonGroup cat = new ButtonGroup();
        cat.add(gen);
        cat.add(obc);
        cat.add(st);
        cat.add(sc);
        
        /** set a radio button preselected */
        male.setSelected(true);
        st.setSelected(true);
        
        /** set a radio button disabled*/
        obc.setEnabled(false);
        male.setEnabled(false);
        
        /** set a size or font style of text*/
        Font f = new Font("Arial",Font.BOLD,20);
        female.setFont(f);
        
        
        
        c.add(male);
        c.add(female);
        c.add(gen);
        c.add(obc);
        c.add(sc);
        c.add(st);
        
    }
}


































