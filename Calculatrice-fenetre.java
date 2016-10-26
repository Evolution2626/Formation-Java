package formation.reponse

import java.awt.*;
import java.awt.event.*;
 
public class Calculatricefenetre extends JFrame{
 
    JButtonExample(){  
        /* JFrame is a top level container (window)
         * where we would be adding our button
         */
        JFrame frame=new JFrame();  
                          
        // Creating Button  
       JButton showDialogButton = new JButton("7");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 7;
        }
       });        
      JButton showDialogButton = new JButton("8");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 8;
        }
       }); 
      JButton showDialogButton = new JButton("9");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 9;
        }
       }); 
             
        //Adding button onto the frame
        frame.add(b);  
                  
        // Setting Frame size. This is the window size
        frame.setSize(300,200);  
        
        frame.setLayout(null);  
        frame.setVisible(true);  
                  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  

 
              
     public static void main(String[] args) {  
            new JButtonExample();  
     }  
}
