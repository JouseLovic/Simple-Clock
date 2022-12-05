package InitActions;

import javax.swing.*;

import Panels.PanelTemporizador;

import java.awt.*;

public class InitTempo extends Thread{

         JLabel etiTimer;
         public InitTempo(JLabel timer){
               this.etiTimer = timer;
         }

         @Override
         public void run(){
              try {
                
                  while(PanelTemporizador.activatedTimer==true){
                          runTimer();
                         Thread.sleep(900);
                  }

              } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());

              }


         }

      private void runTimer(){
             String seconds ="", minutes = "", hours="";
             seconds += PanelTemporizador.seconds;
             minutes += PanelTemporizador.minutes;
             hours += PanelTemporizador.hours;
        
      
        if(PanelTemporizador.minutes==0 && PanelTemporizador.hours!=0){   
                 PanelTemporizador.minutes=60;
                 PanelTemporizador.hours--;

           }
            
         if(PanelTemporizador.seconds==0 && PanelTemporizador.minutes != 0){
                 PanelTemporizador.seconds=60;
                  PanelTemporizador.minutes--;
         }

            PanelTemporizador.seconds--;
            
              if(PanelTemporizador.seconds<10){
                 seconds = "0"+PanelTemporizador.seconds;
               }
                else{
                   seconds = ""+PanelTemporizador.seconds;
                 }

             if(PanelTemporizador.minutes<10){
              minutes = "0"+PanelTemporizador.minutes;
           }
               else{
                   minutes = ""+PanelTemporizador.minutes;
                 }
             if(PanelTemporizador.hours<10){
              hours = "0"+PanelTemporizador.hours;
           }
               else{
                  hours = ""+PanelTemporizador.hours;
                }

                    
                      String watchTimer = hours+":"+minutes+":"+seconds;
                      etiTimer.setText(watchTimer);
                     
                  if(PanelTemporizador.seconds == 0 && PanelTemporizador.minutes == 0 && PanelTemporizador.hours == 0){
                     JOptionPane.showMessageDialog(null, "¡Time is up!");
                     stop();
                  }
        }

      
   }
 