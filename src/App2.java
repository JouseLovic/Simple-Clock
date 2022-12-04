import Interface.Window;

public class App2 {
    public static void main(String[] args){
    	
       Window I = new Window();
       I.setVisible(true);
       
             Thread Inter = new Thread(I);
             Inter.start();
     }
}
