package Panels;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import InitActions.initCrono;


public class PanelCronometro extends JPanel{

       public  static int seconds = 0, minutes = 0, hours = 0, mili = 0;
       public static boolean activatedC = false;

	      JButton start, Stop, restore, restart;
          JLabel time;
	    
       public PanelCronometro() {

          this.setSize(700,750);
          this.setBackground(new Color(59,83,202));
          initCrono();
          this.setLayout(null);

          JSeparator separator = new JSeparator(0);
          separator.setBounds(0,0,700,20);
          separator.setBackground(Color.WHITE);
          separator.setForeground(new Color(59,83,202));
          this.add(separator);
       }

      private void initCrono(){
    	  
    	   time();
           Buttons();
           
      }
      
      private void Buttons() {
    	  
    	   start = new JButton("Start");
    	   start.setBounds(110,380,120,50);
    	   start.setHorizontalAlignment(0);
    	   start.setFont(new Font("Arial", Font.PLAIN, 17));
    	   start.setForeground(Color.WHITE);
           start.setBorderPainted(false);
    	   start.setFocusable(false);
    	   start.setBackground(new Color(59,83,202));
    	   this.add(start);

    	   Stop = new JButton("Stop");
    	   Stop.setBounds(230,380,120,50);
    	   Stop.setHorizontalAlignment(0);
    	   Stop.setFont(new Font("Arial", Font.PLAIN, 17));
    	   Stop.setForeground(Color.WHITE);
    	   Stop.setFocusable(false);
           Stop.setBorderPainted(false);
    	   Stop.setBackground(new Color(59,83,202));
           Stop.setEnabled(false);
    	   this.add(Stop);
 
           restart = new JButton("Restart");
    	   restart.setBounds(350,380,120,50);
    	   restart.setHorizontalAlignment(0);
    	   restart.setFont(new Font("Arial", Font.PLAIN, 17));
    	   restart.setForeground(Color.WHITE);
    	   restart.setFocusable(false);
           restart.setBorderPainted(false);
    	   restart.setBackground(new Color(59,83,202));
           restart.setEnabled(false);
    	   this.add(restart);

           restore = new JButton("Restore");
    	   restore.setBounds(470,380,120,50);
    	   restore.setHorizontalAlignment(0);
    	   restore.setFont(new Font("Arial", Font.PLAIN, 17));
    	   restore.setForeground(Color.WHITE);
    	   restore.setFocusable(false);
           restore.setBorderPainted(false);
           restore.setBackground(new Color(59,83,202));
           restore.setEnabled(false);
    	   this.add(restore);

           restore.addActionListener(new actions());
           restart.addActionListener(new actions());
           Stop.addActionListener(new actions());
           start.addActionListener(new actions());
    	   
      }
      
       private void time(){

           time = new JLabel("00:00:00:"+mili);
           time.setBounds(230,250,260,90);
           time.setForeground(Color.WHITE);
           time.setHorizontalAlignment(0);
           time.setFont(new Font("Arial", Font.PLAIN, 40));
           this.add(time);
        
       }
       
       class actions implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==start) {
				 activatedC = true;
	                    if(activatedC==true) {
                            initCrono C = new initCrono(time);
	                          C.start();
                              Stop.setEnabled(true);
                              restart.setEnabled(true);
                              restore.setEnabled(true);
                              start.setEnabled(false);
	                    	}
	                    } if(e.getSource()==restart){
                             mili = 0;
                             time.setText("00:00:00:"+mili);
                             seconds = 0;
                             minutes = 0;
                             hours = 0;
                        }

                        if(e.getSource()==Stop){
                            activatedC = false;
                            Stop.setEnabled(false);
                            start.setText("reanude");
                            start.setEnabled(true);
                            
                        }
                       
                        if(e.getSource()==restore){
                              activatedC = false;
                              seconds = 0;
                              minutes = 0;
                              hours = 0;
                              mili = -1;
                              time.setText("00:00:00:0");
                              start.setText("Start");
                              restore.setEnabled(false);
                              start.setEnabled(true);
                              Stop.setEnabled(false);
                              restart.setEnabled(false);
                        }

			       }
		       }
   }


       
       
      
 

