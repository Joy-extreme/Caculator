
package Calculator2;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
public class Matrix_Multiplication extends JFrame{
    Container c;
    JTextArea jtext1,jtext2;
    JComboBox jbox1,jbox2,jbox3,jbox4;
    int row1,col1,row2,col2;
    JLabel label1,label2,label3,label4;
    JPanel panel1,panel2,panel3,panel4;
    int r1,r2,c1,c2,n=0,i=0,j=0,k=0,l=0,condition=1,number3=0,p=0,q=0,number4=0,number5=0,del_disable=0;
    double number1,number2,sum=0;
     ImageIcon icon1; 
    double array1[][]=new double[9][9];
     double array2[][]=new double[9][9];
     double result[][]=new double[9][9];
     
    Matrix_Multiplication(){
        
    container();
    }
    
    public void container(){
       
        
    c=this.getContentPane();
    icon1=new ImageIcon(getClass().getResource("Calculator.png"));
     this.setIconImage(icon1.getImage());
    c.setLayout(null);
    String s[]={"1","2","3","4","5","6","7","8","9"};
    label1=new JLabel("Enter row Of 1st matrix :");
    label1.setBounds(10,10,150,30);
    c.add(label1);
   
    label2=new JLabel("Enter col Of 1st matrix  :");
    label2.setBounds(10,40,150,30);
    c.add(label2);
    
    label3=new JLabel("Enter row Of 2nd matrix :");
    label3.setBounds(10,70,150,30);
    c.add(label3);
    
    label4=new JLabel("Enter col Of 2nd matrix  :");
    label4.setBounds(10,100,150,30);
    c.add(label4);
    
    panel1=new JPanel();
    panel1.setBounds(160,15,40,110);
    panel1.setLayout(new GridLayout(4,1,0,10));
    
    jbox1= new JComboBox(s);
    jbox1.setBounds(160,15,40,20);
    panel1.add(jbox1);
    
    jbox2= new JComboBox(s);
    panel1.add(jbox2);
    
    jbox3= new JComboBox(s);
    panel1.add(jbox3);
    
    jbox4= new JComboBox(s);
    panel1.add(jbox4);
    
    c.add(panel1);
    
    panel2 =new JPanel();
    panel2.setBounds( 222,120,65,35);
    JButton button1=new JButton("Enter");
   
    panel2.add(button1);
    c.add(panel2);
     button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number3=1;
                jtext1.setText("");
                String row1 = (String) jbox1.getSelectedItem();
           r1=Integer.parseInt(row1);
           
              String row2 = (String) jbox3.getSelectedItem();
           r2=Integer.parseInt(row2);
           
              String col1 = (String) jbox2.getSelectedItem();
           c1=Integer.parseInt(col1);
           
              String col2 = (String) jbox4.getSelectedItem();
           c2=Integer.parseInt(col2);
           if(col1==row2){
           jbox1.setEnabled(false);
            jbox2.setEnabled(false);
             jbox3.setEnabled(false);
              jbox4.setEnabled(false);
              button1.setEnabled(false);}
                       else {jtext1.setText("col 1 and row 2 are not same");
                             number3=0;
                             del_disable=1;
           }

            } 
            
        });
     
    
     
    jtext1=new JTextArea("");
    jtext1.setBounds( 10,165,280,30);
    Font font1 = new Font("SansSerif", Font.BOLD, 15);
    Font font2 = new Font("SansSerif", Font.BOLD, 12);
    jtext1.setFont(font1);
    c.add(jtext1);
    panel3=new JPanel();
    panel3.setBounds(10,205,280,95);
    panel3.setLayout(new GridLayout(3,5,5,10));
    
    JButton button2=new JButton("7");

    panel3.add(button2);
    
     button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if(number3==1) {if( condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("7");}
            else 
            {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button3=new JButton("8");

    panel3.add(button3);
     button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if(number3==1) {if(condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("8");}
            else 
                 {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button4=new JButton("9");
  
    panel3.add(button4);
     button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if(number3==1) {if( condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("9");}
            else 
                  {jtext1.setText("Give upper values and press Enter");
                  del_disable=1;
            }
            } 
            
        });
    
    JButton button5=new JButton("-");
   
    panel3.add(button5);
     button5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            try{ if(number3==1) {if( condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("-");}
            else
                {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            catch(Exception E){
             
                    }
            } 
            
        });
    
    
    JButton button6=new JButton("Del");

    panel3.add(button6);
     button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           try{ 
               if(del_disable==0)
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
               
                str="";
                }
                 }
           
           catch(Exception E){}
            }
        });
       
    
    
    JButton button7=new JButton("4");

    panel3.add(button7);
     button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if(number3==1) {if( condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("4");}
            else
                 {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button8=new JButton("5");

    panel3.add(button8);
     button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if(number3==1) {if(condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("5");}
            else 
                 {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button9=new JButton("6");
    panel3.add(button9);
     button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if(number3==1) {if(condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("6");}
            else
                  {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button10=new JButton("0");
    panel3.add(button10);
     button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if(number3==1) {if(condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("0");}
            else
               {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button11=new JButton(".");
   
    panel3.add(button11);
     button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if(number3==1) {if(condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append(".");}
            else 
                {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button12=new JButton("1");
   
    panel3.add(button12);
     button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if(number3==1) {if(condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("1");}
            else
                  {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
    
    JButton button13=new JButton("2");
    
    panel3.add(button13);
    button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if(number3==1) {if( condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("2");}
            else
                  {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
     
    
    JButton button14=new JButton("3");
    //button15.setBounds( 130,285,52,30);
    panel3.add(button14);
     button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if(number3==1) {if( condition==0){
               jtext1.setText("");condition=1;
             }
             jtext1.append("3");}
            else
                 {jtext1.setText("Give upper values and press Enter");
             del_disable=1;
            }
            } 
            
        });
     
    JButton button15=new JButton("get");
    
    panel3.add(button15);
    c.add(panel3);
      jtext2=new JTextArea();
    jtext2.setBounds( 10,325,280,190);
    jtext2.setFont(font2);
    c.add(jtext2);
     
     
     
     button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
               try{ 
                int v=((r1*c1)*(r2*c2));
              condition=0;  
           
            
           if(i<r1){
               if(number4==0){number4=1;
               jtext2.append("First Matrix:\n");
               }
           if(j<c1){
          number1=Double.parseDouble(jtext1.getText());
           p=p+1;  
           array1[i][j]= number1;
           jtext1.setText("");
           jtext2.append(array1[i][j]+"  ");
             j=j+1;                   
            }
            if(j==c1){i=i+1;j=0;   jtext2.append("\n");}
            }
       
            else if(k<r2){
                if(number5==0){
                jtext2.setText("");
                number5=1;
               jtext2.append("The second matrix:\n"); }
            if(l<c2){
            double number=Double.parseDouble(jtext1.getText());
             p=p+1;
             array2[k][l]= number; jtext1.setText("");
              jtext2.append( array2[k][l]+"  ");
             l=l+1;
            }
            if(l==c2){k=k+1;l=0;jtext2.append("\n");}
            }
            
          
            else{jtext1.setText("Your matrices are full. Press '='");}
          
            
            
               }
            catch(Exception ex){}
            } 
            
        });
     
      JButton button16=new JButton("=");
    //button19.setBounds( 250,285,52,30);
    panel3.add(button16);
      button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
  jtext2.setText("");
  jtext2.append("The result matrix:\n");
      
        for (int c = 0; c < r1; c++) {
        for (int d = 0; d < c2; d++) {
          for (int k = 0; k < r1; k++)
            sum = sum + array1[c][k]*array2[k][d];
 
          result[c][d] = sum;
          sum = 0;
        }
      }
      
      for(int n1=0;n1<r1;n1++){
           for(int n2=0;n2<c2;n2++){
           String number=String.valueOf( result[n1][n2]);
           jtext2.append(number+"  ");
           }  jtext2.append("\n");}
      
      
 
    
            } 
            
        });
     
    
   panel4=new JPanel();
   panel4.setBounds( 113,525,180,25);
   panel4.setLayout(new GridLayout(1,2,3,0));
    
   JButton button17=new JButton("Refresh");   
    panel4.add(button17);
      
     button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        jbox1.setEnabled(true);
                jbox2.setEnabled(true); 
             jbox3.setEnabled(true);
              jbox4.setEnabled(true);
                button1.setEnabled(true);
            button2.setEnabled(true);
          button3.setEnabled(true);
           button2.setEnabled(true);
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
            number3=0;
            i=0;
            j=0;
            k=0;
            l=0;
            number4=0;
            number5=0;
            del_disable=0;
            jtext1.setText("");
            jtext2.setText("");
            } 
            
                      
        });
    
    JButton button18=new JButton("Back");    
    panel4.add(button18);
    
    c.add(panel4);
    button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            dispose();
            Calculator_Structure frame = new Calculator_Structure();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(550,200,292,400);
            frame.setResizable(false);
            frame.setTitle("Simple calculator");
            frame.setVisible(true);
             
            }
        });
    }
    
    
   
}
