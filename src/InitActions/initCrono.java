package InitActions;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Panels.PanelCronometro;

public class initCrono extends Thread{

	    
         JLabel eti;
		public initCrono(JLabel chronometer){
			this.eti = chronometer;
		}

      @Override
		public void run(){
			try {
				 while(PanelCronometro.activatedC==true){
                   Thread.sleep(9);
                     runChrono();
                    
				 }
              
			 } catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
			 }

		}

		private void runChrono(){
          PanelCronometro.mili++;
			 String seconds ="", minutes = "", hours="", mili = "";
			 mili += PanelCronometro.mili;
          seconds += PanelCronometro.seconds;
			 minutes += PanelCronometro.minutes;
			 hours += PanelCronometro.hours;

          if(PanelCronometro.mili == 100){
				    PanelCronometro.mili=0;
					 PanelCronometro.seconds++;
			 }
			 if(PanelCronometro.seconds==60){
                PanelCronometro.seconds=0;
					 PanelCronometro.minutes++;
			 }
			 if(PanelCronometro.minutes==60){
               PanelCronometro.minutes=0;
					PanelCronometro.hours++;
			 }
			 if(PanelCronometro.hours==25){
				PanelCronometro.hours=0;
			 }
          
			 if(PanelCronometro.mili<10){
				mili = "0"+PanelCronometro.mili;
			}
			else{
				mili = ""+PanelCronometro.mili;
			}
			
         if(PanelCronometro.seconds<10){
				seconds = "0"+PanelCronometro.seconds;
			}
			else{
				seconds = ""+PanelCronometro.seconds;
			}
			if(PanelCronometro.minutes<10){
				minutes = "0"+PanelCronometro.minutes;
			}
			else{
				minutes = ""+PanelCronometro.minutes;
			}
			if(PanelCronometro.hours<10){
				hours = "0"+PanelCronometro.hours;
			}
			else{
				hours = ""+PanelCronometro.hours;
			}

         String watchChrono = hours+":"+minutes+":"+seconds+":"+mili;
         eti.setText(watchChrono);

		}

   

}