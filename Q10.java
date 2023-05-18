//Using AWT, write a program to create two buttons named “Red” and “Blue”. When a button is pressed the background color should be set to the color named by the button’s label.

import java.awt.*;
import java.awt.event.*;

public class Q10 extends Frame implements ActionListener {

    Button r;
    Button b;
    
    Q10(){
    
    	addWindowListener(new WindowAdapter(){
    		public void windowClosing(WindowEvent we){
        			System.exit(0);
   		 }
   	 });

       	 setSize(400,400);
        	setLayout(null);
        	r= new Button ("RED");
        	r.setBounds(80,100,80,30);
        	b= new Button ("BLUE");
       	 b.setBounds(180,100,80,30);
       	 setVisible(true);
     	   add(r);
      	  add(b);
        	b.addActionListener(this);
        	r.addActionListener(this);
    }
   
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand()=="RED")
            setBackground(Color.red);
        else 
            setBackground(Color.blue);
            
    }
    public static void main (String args[]){
        Q10 a1= new Q10 ();
    }
}

