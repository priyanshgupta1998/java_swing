import javax.swing.*;
import java.awt.*;//import to run container
import java.awt.event.*;//import to perform a action
public class jcombobox
{
    static Container c;
    static JComboBox cb1;
    static JButton  btn;
    static JLabel msg;
    static JLabel msg1;
    
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,700,600);
        
        c = frame.getContentPane();
        
        c.setLayout(null);
        
        String[] arr={"A","B","C","D"};
        
        cb1 =new JComboBox(arr);
        
        cb1.setBounds(100,50,100,30);
    
        cb1.setEditable(true);//to wrute on small pan bytyping but typed element or string should be available there in drop down list ;
        
        cb1.setSelectedIndex(2);//to  preselect a stuff on pane according to own;
        
        cb1.setSelectedItem("D");//to override of preselected value by putting item 
        
        btn=new JButton("ok");
        btn.setBounds(220,50,70,30);
        
        /**to make a actionlistener to perform the command*/
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                btnAction(e);//call the method to perform a action;
            }
        });
        
        /** to show the index number after press the ok button*/
        msg=new JLabel("index");
        msg.setBounds(250,100,70,30);
        
        /** to show the item after the press button which are present inthe textblock*/
        msg1=new JLabel("item");
        msg1.setBounds(250,100,70,80);
        
        /** to add the item externaly in the java combo list*/
        cb1.addItem("E");
        cb1.addItem("F");
        
        
        /**to removethe item from list*/
        cb1.removeItem("A");
        
        /** add the text or stuff in the container */
        c.add(cb1);
        c.revalidate();//to update contentpane
        c.add(btn);
        c.add(msg);
        c.add(msg1);
         
    
    
    }
   static void btnAction(ActionEvent e)
   {
       msg.setText(Integer.toString(cb1.getSelectedIndex()));//to  find the index position by calling this action event;
       
       String item = (String)cb1.getSelectedItem();
       msg1.setText(item);
       
    }
}












