//Using GUI, write a program using appropriate adapter class to display the message (“Typed character is: ”) in the frame window when user types any key. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing11 extends JFrame {
    
    	Swing11()
    	{
        
        	setSize(400,400);
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
        	setLayout(null);
        	setVisible(true);
        
        	JLabel l = new JLabel("");
        
        	Font f = new Font("sans serif",Font.BOLD,20);
        	l.setFont(f);
        	l.setBounds(50,100,200,100);
        	add(l);
        
          	addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
               char msg = e.getKeyChar(); 
               l.setText("Typed character is: "+ msg);
            }
        });
    }
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(
                new Runnable(){
                    public void run(){
                         Swing11 s = new Swing11();
                }
               });
     }
}

