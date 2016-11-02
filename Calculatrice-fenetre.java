package formation.reponse

import java.awt.*;
import java.awt.event.*;
 
public class Calculatricefenetre extends JFrame{
 
    public int chiffre = 0;
    public int exponsant = 1;
    public String equation = 0;
 
    Calculatricefenetre(){  
        /* JFrame is a top level container (window)
         * where we would be adding our button
         */
        JFrame frame = new JFrame();  
                          
        // Creating Button  
       JButton JB7 = new JButton("7");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 7;
        }
       });        
      JButton JB8 = new JButton("8");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 8;
        }
       }); 
     
      JButton JB3 = new JButton("9");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 9;
        }
       }); 
     
      JButton JB4 = new JButton("4");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 4;
        }
       });
     
      JButton JB5 = new JButton("5");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 5;
        }
       });
     
      JButton JB6 = new JButton("6");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 6;
        }
       });
     
      JButton JB1 = new JButton("1");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 1;
        }
       });
     
      JButton JB2 = new JButton("2");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 2;
        }
       });
     
      JButton JB3 = new JButton("3");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 3;
        }
       });
     
        JButton JB+ = new JButton("+");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          equation = "+";
        }
       });
     
       JButton JB0 = new JButton("0");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          chiffre = 0;
        }
       });
     
       JButton JB- = new JButton("-");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          equation = "-"
        }
       });
     
       JButton JB* = new JButton("*");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          equation = "*"
        }
       });
     
       JButton JB/ = new JButton("/");
       showDialogButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          // display/center the jdialog when the button is pressed
          equation = "/"
        }
       });
             
        //Adding button onto the frame
        frame.add(JB1);  
        frame.add(JB2);  
        frame.add(JB3);  
        frame.add(JB4);  
        frame.add(JB5);  
        frame.add(JB6);  
        frame.add(JB7);  
        frame.add(JB8);  
        frame.add(JB9);  
        frame.add(JB0);  
        frame.add(JB-);  
        frame.add(JB+);  
        frame.add(JB*);  
        frame.add(JB/);  
                  
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
