

//all kind of listener is a type of interface 
  //for two cases for JComboBox and JCheckBox .....
  
import javax.swing.*;//for  frame 

import java.awt.*;//for container 
import java.awt.event.*;//for listener event

class myframe extends JFrame implements ItemListener
{
    Container c;
    //JComboBox cbi= new JComboBox();
    JCheckBox[] sq = new JCheckBox[5];
    JTextArea text = new JTextArea();
    myframe()//create a constructor of class
    {
       c=this.getContentPane();
       c.setLayout(null);
        
       Font f = new Font("arial",Font.BOLD,25);
       /**
       Color[] clr = {Color.YELLOW,Color.RED,Color.GREEN,Color.CYAN};
       cbi = new JComboBox(clr);
       
       cbi.setBounds(50,50,150,40);
       cbi.addItemListener(this);
       */
      
       for (int i=0;i<5;i++)
       {
         
           sq[i] = new JCheckBox("CheckBox"+ Integer.toString(i+1));
           sq[i].setBounds(50,50+(50*i),100,40);
          
           sq[i].addItemListener(this);
           c.add(sq[i]);
        }
       
       text.setBounds(230,50,150,200);
       
       //c.add(cbi);
       c.add(text);
       
    }
    
    /** this actionlistener is made for JComboBox  list ....
     * 
     * 
     * 
    public void itemStateChanged(ItemEvent e)
    {
        Color selectedColor=(Color)cbi.getSelectedItem();
        c.setBackground(selectedColor);
        
    }
    */
   
   
    /** this method is called by checkbox itemlistener */
    public void itemStateChanged(ItemEvent e)
    {
        text.setText(" ");
        for(int i=0; i<sq.length; i++)
        {
         if(sq[i].isSelected())//if(sq[i].isSelected()==true)
         {
             text.append(sq[i].getText()+" \n");
            }
        }
    }
}

public class jitemlistener
{
    public static void main(String[] args)
    {
        myframe frame=new myframe();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,1000,700);//(left,top,width,height);
        Container c = frame.getContentPane();
        
    }
    
}
