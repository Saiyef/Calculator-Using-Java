import javax.swing.*;
//import java.awt.*;  
import java.awt.event.*;  
public class ActionClass {
	JFrame f;
	int hh;
        boolean flag = true,plus = false,minus = false , multiply = false ,divide = false;
        private String ss="",ss1="";
	JButton b10 = new JButton("+");
	JButton b11 = new JButton("-");
	JButton b12 = new JButton("*");
	JButton b13 = new JButton("/");
	JButton b14 = new JButton("=");
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
        JButton ac = new JButton("CLEAR");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3  = new JTextField();
	JPasswordField p1 = new JPasswordField();
	
	JLabel l1 = new JLabel ("First Number : ");
	JLabel l2 = new JLabel ("Second Number : ");
	JLabel l3 = new JLabel ("Result : ");
	public void createFrame() {
		f = new JFrame("LOG IN WINDOW ");
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public void addToFrame() {
                f.add(ac);
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		hh=50;
		b0.setBounds(0,70+30,hh,hh);
		b1.setBounds(50,70+30,hh,hh);
		b2.setBounds(100,70+30,hh,hh);
		b3.setBounds(150,70+30,hh,hh);
		b4.setBounds(200,70+30,hh,hh);
		b5.setBounds(0,140+30,hh,hh);
		b6.setBounds(50,140+30,hh,hh);
		b7.setBounds(100,140+30,hh,hh);
		b8.setBounds(150,140+30,hh,hh);
		b9.setBounds(200,140+30,hh,hh);
		b10.setBounds(0,210+30,hh,hh);
		b11.setBounds(50,210+30,hh,hh);
		b12.setBounds(100,210+30,hh,hh);
		b13.setBounds(150,210+30,hh,hh);
		b14.setBounds(200,210+30,hh,hh);
                ac.setBounds(80,300,100,50);
		l1.setBounds(1,1,200,20);
		t1.setBounds(202,1,100,30);
		l2.setBounds(1,30,200,20);
		t2.setBounds(202,30,100,30);
		l3.setBounds(1,60,100,30);
		t3.setBounds(202,60,100,30);
                
        ac.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
       flag = true;
       plus = false;
       minus = false;
       multiply = false;
       divide = false;
       ss="";
       ss1="";
       t1.setText("");
       t2.setText("");
       t3.setText("");
       
    }  
    });  
                
		 b0.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
           if(flag){ ss = ss + b0.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b0.getText();
               t2.setText(ss1);
           }
    }  
    });  
	
                 b1.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
        if(flag){ ss = ss + b1.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b1.getText();
               t2.setText(ss1);
           } 
    }  
    });  
                 
                 b2.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b2.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b2.getText();
               t2.setText(ss1);
           } 
    }  
    });  
                 
                 b3.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b3.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b3.getText();
               t2.setText(ss1);
           }  
    }  
    });  
                 
                 b4.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b4.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b4.getText();
               t2.setText(ss1);
           }  
    }  
    });  
                 
                 b5.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b5.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b5.getText();
               t2.setText(ss1);
           }  
    }  
    });  
                 
                 b6.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b6.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b6.getText();
               t2.setText(ss1);
           } 
    }  
    });  
                 
                 b7.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b7.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b7.getText();
               t2.setText(ss1);
           }  
    }  
    });  
                 
                 b8.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b8.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b8.getText();
               t2.setText(ss1);
           }  
    }  
    });  
                 
                 b9.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            if(flag){ ss = ss + b9.getText();
            t1.setText(ss); }
           else{
               ss1 = ss1+b9.getText();
               t2.setText(ss1);
           } 
    }  
    });  
                
                 // END OF NUMBER ------------------------------------
                 
                 b10.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            ss1="";
            flag  = false;
            plus = true;
            
    }  
    });  
                 
                 b11.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            ss1="";
            flag  = false;
            minus = true;  
    }  
    });  
                 b12.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            ss1="";
            flag  = false;
            multiply = true;  
    }  
    });  
                 
                 b13.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            ss1="";
            flag  = false;
            divide = true;
    }  
    });  
                 
                 b14.addActionListener(new ActionListener(){  
    @Override
    public void actionPerformed(ActionEvent e){  
            int number1 = Integer.parseInt(ss);
            int number2 = Integer.parseInt(ss1);
            int result = 0;
            if(plus==true){
                result = number1 + number2;
            }
            else if(minus == true){
                result = number1 - number2;
            }
            else if(multiply == true){
                result = number1 * number2;
            }
            else if(divide == true){
                result = number1 / number2;
            }
            //String res = Integer.toString(result);
            t3.setText(": " +result);
    }  
    });  
                 
	}
        
}