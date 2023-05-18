//Using AWT, write a program using appropriate adapter class to display the message (“Typed character is: ”) in the frame window when user types any key. 

import java.awt.*;
import java.awt.event.*;

class Q11 extends Frame {
    
    String msg="Typed Character is: ";
    
    Q11()
    {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                    System.exit(0);
            }
        });
        
        
        addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
               msg += e.getKeyChar(); 
               repaint();
            }
        });
      
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        g.drawString(msg, 125, 200);
    }

    
     public static void main (String args[]){
        Q11 a1= new Q11();
    }
}

