import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.lang.String[];

public class registrationform
{  
    static Container c;
    
    static JTextField nam;
    static JTextField mob;
    static JComboBox day;
    static JComboBox month;
    static JComboBox year;
    static JRadioButton male;
    static JRadioButton female;
    static JTextArea area;
    static JTextArea box;
    static JButton submit;
    static JCheckBox check;
    
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("Action demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,950,650);
        
        c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        
        JLabel name= new JLabel("NAME");
        name.setBounds(100,50,100,50);
        
        nam= new JTextField();
        nam.setBounds(220,50,150,40);
        
        JLabel mobile= new JLabel("MOBILE");
        mobile.setBounds(100,110,100,50);
      
        mob= new JTextField();
        mob.setBounds(220,110,150,40);
        
        
        JLabel dob= new JLabel("DOB");
        dob.setBounds(100,220,100,50);
        
        
        /**fill the day of the birth */
        String[] day_arr = new String[31];
        
        for(int i=1;i<=31;i++)
        {
            day_arr[i-1]=Integer.toString(i);
        }
        day = new JComboBox(day_arr);
        day.setBounds(220,220,40,30);
        
        
        /** to fill  the month of birth */
        String[] month_arr = {"jan","feb","mar","april","may","june","july","august","sep","oct","nov","dec"};
       
        month = new JComboBox(month_arr);
        month.setBounds(290,220,100,50);
        
        /** fillthe yearof the birth */
        
        String[] year_arr = new String[100];
        
        for(int i=1919;i<=2018;i++)
        {
            year_arr[i-1919]=Integer.toString(i);
        }
        year = new JComboBox(year_arr);
        year.setBounds(400,220,100,50);
         /** fill gender */
        JLabel sex= new JLabel("GENDER");
        sex.setBounds(100,330,100,50);
        
         male = new JRadioButton("male");
         male.setBounds(220,330,70,40);
         
         female = new JRadioButton("female");
         female.setBounds(300,330,70,40);
           /** defien the property of radio button */
     
         ButtonGroup gender = new ButtonGroup();
         gender.add(male);
         gender.add(female);
         
        JLabel address= new JLabel("ADDRESS");
        address.setBounds(100,440,100,50);
        
        area = new JTextArea();
        area.setBounds(220,440,240,60);
        
        
       
        
        /** ask to accpet terms and conditions */
        check = new JCheckBox("i accept all terms and conditions");
        check.setBounds(60,520,250,30);
        
        /** to  create  a submit button */
        submit = new JButton("SUBMIT");
        submit.setBounds(110,570,80,30);
        
        /** to make a text area where data can be show that we have entered */
        box= new JTextArea();
        box.setBounds(550,50,400,500);
        
        /** make a actionlistener event to show data on bos when user press the submit button*/
        
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                submit_action(e);
            }
                
        });
        
        
        
        
        c.add(name);
        c.add(mobile);
        c.add(mob);
        c.add(day);
        c.add(sex);
        c.add(address);
        c.add(dob);
        c.add(nam);
        c.add(month);
        c.add(year);
        c.add(male);
        c.add(female);
        c.add(area);
        c.add(check);
        c.add(submit);
        c.add(box);
        
        
    }
    
    public static void submit_action(ActionEvent e)
    {
        if(check.isSelected()==true)
        {
            String name = nam.getText();//to  get data 
            String mobi = mob.getText();
            String day_name = (String)day.getSelectedItem();
            String month_name = (String)month.getSelectedItem();
            String year_name = (String)year.getSelectedItem();
            String gen="MALE";//default value assign;
            if(female.isSelected()==true)
               gen="FEMALE";
               
            String addr = area.getText();
            box.setText("NAME : "+name+"\nMobile : "+mobi+"\n DOB : "+day_name+
            " "+month_name+" " +year_name+" " +"\ngender : " +gen+
            "\naddress : "+addr+" ");
            
        }
        else
        {
           box.setText("please accept the terms and conditions"); 
        }
        
    }
}













