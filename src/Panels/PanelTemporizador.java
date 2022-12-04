package Panels;

import InitActions.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class PanelTemporizador extends JPanel implements ActionListener{
   
        public static boolean activatedTimer = false;
        public static int hours = 0, minutes = 0, seconds = 0;

        private JSeparator separator;
        private JLabel time;
        private JButton start, stop, delete, addMinute;
        private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
        private JButton button0, button03, button04;
      

        public PanelTemporizador() {

          this.setSize(700,750);
          this.setBackground(new Color(59,83,202));
          initTempo();
          this.setLayout(null);

          JSeparator separator2 = new JSeparator(0);
          separator2.setBounds(0,0,700,20);
          separator2.setBackground(Color.WHITE);
          separator2.setForeground(new Color(59,83,202));
          this.add(separator2);
      }

      private void initTempo(){
        Buttons();
        label();

     }
     
      private void label(){

            time = new JLabel("00:00:00");
            time.setBounds(250, 20, 200, 50);
            time.setForeground(Color.WHITE);
            time.setFont(new Font("Times new roman", Font.PLAIN, 35));
            time.setHorizontalAlignment(0);
            this.add(time);

            separator = new JSeparator(0);
            separator.setBackground(Color.WHITE);
            separator.setForeground(new Color(59,83,202));
            separator.setBounds(200,70,300,30);
            this.add(separator);

     }

       private void Buttons(){

         button1 = new JButton("5 minutes");
         button1.setBounds(100,250,160,70); button1.setFont(new Font("Arial", Font.PLAIN, 20)); button1.setHorizontalAlignment(0);
         button1.setFocusable(false); this.add(button1);
         button1.setBackground(new Color(59,83,202));
         button1.setBorderPainted(false);
         button1.setForeground(Color.WHITE);
         
         button2 = new JButton("10 minutes");
         button2.setBounds(260,250,160,70); button2.setFont(new Font("Arial", Font.PLAIN, 20)); button2.setHorizontalAlignment(0);
         button2.setFocusable(false); this.add(button2);
         button2.setBackground(new Color(59,83,202));
         button2.setBorderPainted(false);
         button2.setForeground(Color.WHITE);

         button3 = new JButton("15 minutes");
         button3.setBounds(420,250,160,70); button3.setFont(new Font("Arial", Font.PLAIN, 20)); button3.setHorizontalAlignment(0);
         button3.setFocusable(false); this.add(button3);
         button3.setBackground(new Color(59,83,202));
         button3.setBorderPainted(false);
         button3.setForeground(Color.WHITE);

         button4 = new JButton("20 minutes");
         button4.setBounds(100,320,160,70); button4.setFont(new Font("Arial", Font.PLAIN, 20)); button4.setHorizontalAlignment(0);
         button4.setFocusable(false); this.add(button4);
         button4.setBackground(new Color(59,83,202));
         button4.setBorderPainted(false);
         button4.setForeground(Color.WHITE);

         button5 = new JButton("25 minutes");
         button5.setBounds(260,320,160,70); button5.setFont(new Font("Arial", Font.PLAIN, 20)); button5.setHorizontalAlignment(0);
         button5.setFocusable(false); this.add(button5);
         button5.setBackground(new Color(59,83,202));
         button5.setBorderPainted(false);
         button5.setForeground(Color.WHITE);

         button6 = new JButton("30 minutes");
         button6.setBounds(420,320,160,70); button6.setFont(new Font("Arial", Font.PLAIN, 20)); button6.setHorizontalAlignment(0);
         button6.setFocusable(false); this.add(button6);
         button6.setBackground(new Color(59,83,202));
         button6.setBorderPainted(false);
         button6.setForeground(Color.WHITE);

         button7 = new JButton("40 minutes");
         button7.setBounds(100,390,160,70); button7.setFont(new Font("Arial", Font.PLAIN, 20)); button7.setHorizontalAlignment(0);
         button7.setFocusable(false); this.add(button7);
         button7.setBackground(new Color(59,83,202));
         button7.setBorderPainted(false);
         button7.setForeground(Color.WHITE);

         button8 = new JButton("50 minutes");
         button8.setBounds(260,390,160,70); button8.setFont(new Font("Arial", Font.PLAIN, 20)); button8.setHorizontalAlignment(0);
         button8.setFocusable(false); this.add(button8);
         button8.setBackground(new Color(59,83,202));
         button8.setBorderPainted(false);
         button8.setForeground(Color.WHITE);

         button9 = new JButton("60 minutes");
         button9.setBounds(420,390,160,70); button9.setFont(new Font("Arial", Font.PLAIN, 20)); button9.setHorizontalAlignment(0);
         button9.setFocusable(false); this.add(button9);
         button9.setBackground(new Color(59,83,202));
         button9.setBorderPainted(false);
         button9.setForeground(Color.WHITE);

           button0 = new JButton("2 hours");
           button0.setBounds(100,460,160,70); button0.setFont(new Font("Arial", Font.PLAIN, 20)); button0.setHorizontalAlignment(0);
           button0.setFocusable(false); this.add(button0);
           button0.setBackground(new Color(59,83,202));
           button0.setBorderPainted(false);
           button0.setForeground(Color.WHITE);

           button03 = new JButton("3 hours");
           button03.setBounds(260,460,160,70); button03.setFont(new Font("Arial", Font.PLAIN, 20)); button03.setHorizontalAlignment(0);
           button03.setFocusable(false); this.add(button03);
           button03.setBackground(new Color(59,83,202));
           button03.setBorderPainted(false);
           button03.setForeground(Color.WHITE);

           button04 = new JButton("4 hours");
           button04.setBounds(420,460,160,70); button04.setFont(new Font("Arial", Font.PLAIN, 20)); button04.setHorizontalAlignment(0);
           button04.setFocusable(false); this.add(button04);
           button04.setBackground(new Color(59,83,202));
           button04.setBorderPainted(false);
           button04.setForeground(Color.WHITE);

           stop = new JButton("Stop");
           stop.setBounds(430,600,130,50);
           stop.setFont(new Font("Arial", Font.PLAIN, 20));
           stop.setHorizontalAlignment(0);
           stop.setFocusable(false);
           stop.setBackground(new Color(59,83,202));
           stop.setForeground(Color.WHITE);
           stop.setBorderPainted(false);

           delete = new JButton("Delete Time");
           delete.setBounds(110,600,145,50);
           delete.setFont(new Font("Arial", Font.PLAIN, 20));
           delete.setHorizontalAlignment(0);
           delete.setFocusable(false);
           delete.setBackground(new Color(59,83,202));
           delete.setForeground(Color.WHITE);
           delete.setBorderPainted(false);
          
           addMinute = new JButton("+1 minute");
           addMinute.setBounds(260,520,160,45);
           addMinute.setFont(new Font("Arial", Font.PLAIN, 18));
           addMinute.setHorizontalAlignment(0);
           addMinute.setFocusable(false);
           addMinute.setBackground(new Color(59,83,202));
           addMinute.setForeground(Color.WHITE);
           addMinute.setBorderPainted(false);

         start = new JButton("Start");
           start.setBounds(270,600,140,50);
           start.setFont(new Font("Arial", Font.PLAIN, 20));
           start.setHorizontalAlignment(0);
           start.setFocusable(false);
           start.setBackground(new Color(59,83,202));
           start.setForeground(Color.WHITE);
           start.setBorderPainted(false);
           this.add(start);

        start.addActionListener(this);  stop.addActionListener(this); delete.addActionListener(this); addMinute.addActionListener(this);
        button1.addActionListener(this); button2.addActionListener(this); button03.addActionListener(this);
        button3.addActionListener(this); button4.addActionListener(this); button04.addActionListener(this);
        button5.addActionListener(this); button6.addActionListener(this); 
        button7.addActionListener(this); button8.addActionListener(this);
        button9.addActionListener(this); button0.addActionListener(this);
       }

    @Override
    public void actionPerformed(ActionEvent e) {
               if(e.getSource()==start){
                   activatedTimer = true;
                     
                       if(time.getText().equals("00:00:00")){
                              activatedTimer = false;
                              JOptionPane.showMessageDialog(null,"You have not placed any quantity of those available");
                       }
                       else if(!time.getText().equals("00:00:00")){
                             if(activatedTimer == true){
                                  
                                 InitTempo Temp = new InitTempo(time);
                                  Temp.start();
                                  start.setEnabled(false);
                                  remove(button1); remove(button2); remove(button3); remove(button4); 
                                  remove(button5); remove(button6); remove(button7); remove(button8); 
                                  remove(button9); remove(button0); remove(button03); remove(button04);
                                  add(stop); add(delete); add(addMinute);
                                  time.setLocation(250,250);
                                  separator.setLocation(200,300);
                                  repaint();
                              }
                       }
               } 
               if(e.getSource()==addMinute){
                   if(minutes < 60){
                       minutes += 1;
                    }
                    if(minutes == 60){
                      minutes -= 59;
                      hours +=1;
                    }

              }
                if(e.getSource()==stop){
                    start.setText("Reanude");
                    start.setEnabled(true);
                    activatedTimer = false;
               }
                if(e.getSource()==delete){
                      activatedTimer = false;
                      hours = 0;
                      minutes = 0;
                      seconds = 1;
                      start.setText("Start");
                      start.setEnabled(true);
                      time.setText("00:00:00");
                      time.setLocation(250,20);
                      separator.setLocation(200,70);
                     remove(stop); remove (delete); remove(addMinute);
                     add(button1); add(button2); add(button3); add(button4); add(button5); add(button6);
                     add(button7); add(button8); add(button9); add(button0); add(button03); add(button04);
                     repaint();

                }

               if(e.getSource()==button1){
                      hours = 0;
                      minutes = 5;
                      seconds = 0;
                      time.setText("00:05:00");
               }
               if(e.getSource()==button2){
                    hours = 0;
                    minutes = 10;
                    seconds = 0;
                    time.setText("00:10:00");
               }
               if(e.getSource()==button3){
                    hours = 0;
                    minutes = 15;
                    seconds = 0;
                    time.setText("00:15:00");
               }
               if(e.getSource()==button4){
                hours = 0;
                minutes = 20;
                seconds = 0;
                time.setText("00:20:00");
               }
               if(e.getSource()==button5){
                hours = 0;
                minutes = 25;
                seconds = 0;
                time.setText("00:25:00");
               }
               if(e.getSource()==button6){
                hours = 0;
                minutes = 30;
                seconds = 0;
                time.setText("00:30:00");
               }  
               if(e.getSource()==button7){
                hours = 0;
                minutes = 40;
                seconds = 0;
                time.setText("00:40:00");
               }
               if(e.getSource()==button8){
                hours = 0;
                minutes = 50;
                seconds = 0;
                time.setText("00:50:00");
               }  
               if(e.getSource()==button9){
                hours = 1;
                minutes = 0;
                seconds = 0;
                time.setText("01:00:00");
               }
               if(e.getSource()==button0){
                hours = 2;
                minutes = 0;
                seconds = 0;
                time.setText("02:00:00");
               }  
               if(e.getSource()==button03){
                hours = 3;
                minutes = 0;
                seconds = 0;
                time.setText("03:00:00");
               }
               if(e.getSource()==button04){
                hours = 4;
                minutes = 0;
                seconds = 0;
                time.setText("04:00:00");
               }  
    } 




}
