
package Calculator2;



import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator_Structure extends JFrame{
   Container c,c2;
   JTextArea jtext1;
  String first_operator= null, second_operator=null, show_ans=null;
   double fnum,lnum,result,radian; 
   int oprator=0,number=0,num2=0,number2, dot_repeater=0,syntax_error_showoff=0, del_disable=0;
    ImageIcon icon1;
    JPanel panel1,panel2,panel3;
    
    Calculator_Structure(){
    
    components();
    }
    
    public void components(){
    c=this.getContentPane();
    icon1=new ImageIcon(getClass().getResource("Calculator.png"));
 this.setIconImage(icon1.getImage());
    c.setLayout(null);
   
    panel1=new JPanel();
    panel1.setBounds(10,10,265,40);
    panel1.setLayout(new GridLayout(1,1));
    jtext1= new JTextArea();
    Font font1 = new Font("SansSerif", Font.BOLD, 15);
   jtext1.setFont(font1);
    
panel1.add(jtext1);
    c.add(panel1);
    
    
    panel2=new JPanel();
    panel2.setBounds(10,80,265,235);
     panel2.setLayout(new GridLayout(6,4,5,5));
    JButton button1=new JButton("On");
    button1.setBounds(10,80,55,30);
    panel2.add(button1);
    
   
    JButton button2=new JButton("Off");
    button2.setBounds(80,80,55,30);
    panel2.add(button2);
    JButton button3=new JButton("clr");
    button3.setBounds(150,80,55,30);
    panel2.add(button3);
      button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number=0;
             jtext1.setText(" "); 
             oprator=0;
             
             num2=0;
             dot_repeater=0;
             syntax_error_showoff=0;
             del_disable=0;
            }
        });
    JButton button4=new JButton("Del");
    button4.setBounds(220,80,55,30);
    panel2.add(button4);
    
    JButton button5=new JButton("7");
    button5.setBounds(10,120,55,30);
    panel2.add(button5);
    
    
    JButton button6=new JButton("8");
    button6.setBounds(80,120,55,30);
    panel2.add(button6);
    
    JButton button7=new JButton("9");
    button7.setBounds(150,120,55,30);
    panel2.add(button7);
    
    JButton button8=new JButton("+");
    button8.setBounds(220,120,55,30);
    panel2.add(button8);
    
       

    JButton button9=new JButton("4");
     button9.setBounds(10,160,55,30);
    panel2.add(button9);
    
    JButton button10=new JButton("5");
    button10.setBounds(80,160,55,30);
    panel2.add(button10);
    
    JButton button11=new JButton("6");
    button11.setBounds(150,160,55,30);
    panel2.add(button11);
    
    JButton button12=new JButton("-");
    button12.setBounds(220,160,55,30);
    panel2.add(button12);
    
    JButton button13=new JButton("1");
    button13.setBounds(10,200,55,30);
    panel2.add(button13);
    
    JButton button14=new JButton("2");
    button14.setBounds(80,200,55,30);
    panel2.add(button14);
    
    JButton button15=new JButton("3");
    button15.setBounds(150,200,55,30);
    panel2.add(button15);
    
    JButton button16=new JButton("*");
    button16.setBounds(220,200,55,30);
    panel2.add(button16);
    
     JButton button17=new JButton(".");
    button17.setBounds(10,240,55,30);
    panel2.add(button17);
    
    JButton button18=new JButton("0");
    button18.setBounds(80,240,55,30);
    panel2.add(button18);
    
    JButton button19=new JButton("=");
    button19.setBounds(150,240,55,30);
    panel2.add(button19);
    
    JButton button20=new JButton("/");
    button20.setBounds(220,240,55,30);
    panel2.add(button20);
    panel3=new JPanel();
    panel3.setBounds(10,320,265,30);
    panel3.setLayout(new GridLayout(1,1));  
    
    JButton button21=new JButton("Matrix Multiply");  
    panel3.add(button21);
    
    
    JButton button22=new JButton("sin");
    button22.setBounds(80,280,55,30);
    panel2.add(button22);
    
    JButton button23=new JButton("cos");
    button23.setBounds(150,280,55,30);
    panel2.add(button23);
    
    JButton button24=new JButton("tan");
    button24.setBounds(220,280,55,30);
    panel2.add(button24);
    
    JButton button25=new JButton("ans");
    button25.setBounds(10,280,55,30);
   
    panel2.add(button25);
    c.add(panel2);
    c.add(panel3);
    
    button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             button2.setEnabled(false);
             button3.setEnabled(false);
             button4.setEnabled(false);
             button5.setEnabled(false);
             button6.setEnabled(false);
             button7.setEnabled(false);
             button8.setEnabled(false);
             button9.setEnabled(false);
             button10.setEnabled(false);
             button11.setEnabled(false);
             button12.setEnabled(false);
             button13.setEnabled(false);
             button14.setEnabled(false);
             button15.setEnabled(false);
             button16.setEnabled(false);
             button17.setEnabled(false);
             button18.setEnabled(false);
             button19.setEnabled(false);
             button20.setEnabled(false);
             button21.setEnabled(false);
             button22.setEnabled(false);
             button23.setEnabled(false);
             button24.setEnabled(false);
             button25.setEnabled(false);
             //result=0;
             show_ans=null;
             
           number=0;
             jtext1.setText(" "); 
             oprator=0;
             
             num2=0;
             dot_repeater=0;
             syntax_error_showoff=0;
             del_disable=0;
            }
        });
                 
             
             button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             button2.setEnabled(true);
             button3.setEnabled(true);
             button4.setEnabled(true);
             button5.setEnabled(true);
             button6.setEnabled(true);
             button7.setEnabled(true);
             button8.setEnabled(true);
             button9.setEnabled(true);
             button10.setEnabled(true);
             button11.setEnabled(true);
             button12.setEnabled(true);
             button13.setEnabled(true);
             button14.setEnabled(true);
             button15.setEnabled(true);
             button16.setEnabled(true);
             button17.setEnabled(true);
             button18.setEnabled(true);
             button19.setEnabled(true);
             button20.setEnabled(true);
             button21.setEnabled(true);
             button22.setEnabled(true);
             button23.setEnabled(true);
             button24.setEnabled(true);
              button25.setEnabled(true);
            }
        });
 
    
       
       button21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             dispose();
             Matrix_Multiplication frame2 = new Matrix_Multiplication ();
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setBounds(550,100,307,600);
    frame2.setResizable(false);
    frame2.setTitle("Matrix_multiply");
             frame2.setVisible(true);
            }
        });
       
      button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           try{ if (del_disable==0)
           {
                String str=jtext1.getText();
                int n=str.length();
                char[] inputArray = str.toCharArray();
                str="";
                for(int i=inputArray.length-1; i>=0; i--)
            {
                str = str+inputArray[i];
            }
                str=str.substring(1);
                 inputArray = str.toCharArray();
                 str="";
                for(int i=inputArray.length-1; i>=0; i--)
            {
                str = str+inputArray[i];
            }
                jtext1.setText(str);
                if(str==""){number=0;}
                str="";
                
           } 
           }
           catch(Exception E){}
            }
        });
       
       
    button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
             if(number==0 && syntax_error_showoff==0){jtext1.append("7");}
             
            }
        });
    button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
            if(number==0 && syntax_error_showoff==0) jtext1.append("8");
            }
            
        });
    button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
            if(number==0 && syntax_error_showoff==0) jtext1.append("9");
            }
            
        });
    button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
             if(number==0 && syntax_error_showoff==0)jtext1.append("4");
            }
            
        });
    button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
            if(number==0 && syntax_error_showoff==0) jtext1.append("5");
            }
            
        });
    button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
            if(number==0 && syntax_error_showoff==0)  jtext1.append("6");
            }
            
        });
    button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
           if(number==0 && syntax_error_showoff==0)  jtext1.append("1");
            }
            
        });
    button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
          if(number==0 && syntax_error_showoff==0)   jtext1.append("2");
            }
            
        });
    button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
           if(number==0 && syntax_error_showoff==0)  jtext1.append("3");
            }
            
        });
    
     button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
          if(number==0 && dot_repeater==0 && syntax_error_showoff==0) 
          {  jtext1.append(".");
             dot_repeater=1;
          }
            }
            
        });
    
     button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if("Enter radian value and press '='".equals(jtext1.getText())  ){
                 jtext1.setText("");
             }
            if(number==0 && syntax_error_showoff==0)  jtext1.append("0");
            }
            
        });
     
    
     button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            try{ 
                 oprator=1;
                first_operator= jtext1.getText();
                 fnum=Double.parseDouble(jtext1.getText());
                 jtext1.setText("");
             
            }
             catch(Exception E){
                 if(  number==0){jtext1.setText("+");}
             
             }
             
            }
        });
   
     button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         try{   
                 oprator=2;
                 first_operator= jtext1.getText();
                 
                 fnum=Double.parseDouble(jtext1.getText());
                 jtext1.setText("");
             }
             catch(Exception E){
                 if(  number==0){
                     if(num2==1){jtext1.setText("-");oprator=3;
                     }
                     else if(num2==2){jtext1.setText("-");oprator=4;}
                     else if(radian==1 ) {jtext1.setText("-");oprator=5;}
                     else if(radian==2 ) {jtext1.setText("-");oprator=6;}
                     else if(radian==3 ) {jtext1.setText("-");oprator=7;}
                     else jtext1.setText("-");
                 }
             
             }
             
            
            
            
            }
        });
     button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            try{ 
                oprator=3;
                first_operator= jtext1.getText();
                 fnum=Double.parseDouble(jtext1.getText());
                 jtext1.setText("");
                num2=1;
                
                 
             }
             catch(Exception E){
                if(number==0)
                {  jtext1.setText("Syntax error 'press clr button'");
                    syntax_error_showoff=1;
                    del_disable=1;
                }
           
             }
            
            }
        });
     button20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             try{
                 oprator=4;
                  num2=2;
                  first_operator= jtext1.getText();
                 fnum=Double.parseDouble(jtext1.getText());
                 jtext1.setText("");
             }
              catch(Exception F){
            if(number==0)
            {  jtext1.setText("Syntax error 'press clr button'");
                syntax_error_showoff=1;
            }
             }             
            }
        });
     button22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             try{
                 if(number==0 && syntax_error_showoff==0){
               jtext1.setText("Enter radian value and press '='");
                //jtext1.setText("");
               
              oprator=5;
              radian=1;
              number2=1;
             
                
             }
             }
             catch(Exception E){
             }}
             
            
            
        });
      button23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             try{
                 if(number==0 && syntax_error_showoff==0){
               jtext1.setText("Enter radian value and press '='");
                //jtext1.setText("");
               
              oprator=6;
              radian=2;
              number2=1;
             
                
             }
             }
             catch(Exception E){
             }}
             
            
            
        });
       button24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             try{
                 if(number==0 && syntax_error_showoff==0){
               jtext1.setText("Enter radian value and press '='");
                //jtext1.setText("");
               
              oprator=7;
              radian=3;
              number2=1;
             
                
             }
             }
             
             catch(Exception E){
             }}
             
            
            
        });
     
     button19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             try{if((radian==1 || radian==2 || radian==3)&&number2==1){first_operator="yes";}
             number2=0;
            second_operator= jtext1.getText();
                 lnum=Double.parseDouble(jtext1.getText());
                
         String f= String.valueOf(fnum);
         String l= String.valueOf(lnum);
         
         if(oprator!=0 && first_operator!=null && second_operator!=null)
         {number=1; del_disable=1;
                     switch (oprator) {
                         case 1:
                             {
                                 result=fnum + lnum;
                                 show_ans="Something";
                                 String s= String.valueOf(result);
                                 jtext1.setText("");
                                 jtext1.append("("+f+") + ("+l+") = \n"+s);
                                 break;
                             }
                         case 2:
                             {
                                 result=fnum - lnum;
                                 show_ans="Something";
                                 String s= String.valueOf(result);
                                 jtext1.setText("");
                                 jtext1.append("("+f+") - ("+l+") = \n"+s);
                                 break;
                             } 
                         case 3:
                             {
                                 result=fnum * lnum;
                                 show_ans="Something";
                                 String s= String.valueOf(result);
                                 jtext1.setText("");
                                 jtext1.append("("+f+") * ("+l+") = \n"+s);
                                 break;
                             }
                             case 4:
                             {
                                result=fnum / lnum;
                                show_ans="Something";
                                 String s= String.valueOf(result);
                                 if(s=="Infinity" || s=="NaN")
                                 {    jtext1.setText("");
                                     jtext1.append("("+f+") / ("+l+") = Infinity\n press 'clr' button"); 
                                     syntax_error_showoff=1;
                                     show_ans=null;
                                 }
                                 else{jtext1.setText("");
                                 jtext1.append("("+f+") / ("+l+") = \n"+s);;
                                 }}
                                
                               break;
                             case 5:
                             {
                              result=Math.sin(lnum);
                              show_ans="Something";
                                 String s= String.valueOf(result);
                                
                                 jtext1.setText("");
                                 jtext1.append("Sin("+lnum+") = \n"+s);  
                                 radian=0;
                 }
                            
                               break;
                               case 6:
                             {
                              result=Math.cos(lnum);
                              show_ans="Something";
                                 String s= String.valueOf(result);
                                
                                 jtext1.setText("");
                                 jtext1.append("Cos("+lnum+") = \n"+s); 
                                 radian=0;
                 }
                            
                               break;
                                 
                             case 7:
                             {
                              result=Math.tan(lnum);
                              show_ans="Something";
                                 String s= String.valueOf(result);
                                
                                 jtext1.setText("");
                                 jtext1.append("Tan("+lnum+") = \n"+s);  
                                 radian=0;
                 }
                            
                               break;   
                              
                         default:
                             {
                                
                             }
                     }
         }
         
         
         first_operator=null; second_operator=null;
         
            
            
             }
             catch(Exception E){
             
           String s=jtext1.getText();
            jtext1.setText(s);
            }
            
            
             
            }
            
        });
      button25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
                  String str2= String.valueOf(result);
                  if(str2=="Infinity")
                  {
                    str2="0.0";
                  }
          
                     number=0; 
             
                 if(show_ans != null){
                      jtext1.setText("");
                     jtext1.append(str2);
                 }
              
             
             
            }
            
        });
      
       
    
    }
             
             
              
      
   

             
              
      
    
}
