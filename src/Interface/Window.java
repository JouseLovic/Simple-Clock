package Interface;

import javax.swing.*;
import Panels.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.*;

public class Window extends JFrame implements Runnable{

              PanelCronometro chronometer = new PanelCronometro();
              PanelTemporizador timer = new PanelTemporizador();

              SimpleDateFormat timerFormat;
              SimpleDateFormat dayFormat;
              SimpleDateFormat dateFormat;
              Calendar calendar;
              String time;
              String day;
              String date;

              private JButton Chrono, Temp, Main;
              
              private JLabel timeZone, dayZone, dateZone;

              private JPanel container, panelComponent, panelBackgroundButtons;

          public Window(){

             this.setSize(700,800);
             this.setLayout(new BorderLayout());
             this.setLocationRelativeTo(null);
             Init();
             this.setResizable(false);
             this.setDefaultCloseOperation(EXIT_ON_CLOSE);

         }


          private void Init(){
         
             panels();
             MenuButtons();
             labelTimer();

          }

          private void panels(){
           
              container = new JPanel();
                 container.setLayout(new BorderLayout());
                 this.getContentPane().add(container);

              panelComponent = new JPanel();
                 panelComponent.setBackground(new Color(59,83,202));
                 panelComponent.setLayout(null);
                 container.add(panelComponent, BorderLayout.CENTER);
  
              panelBackgroundButtons = new JPanel();
                 panelBackgroundButtons.setPreferredSize(new Dimension(700,50));
                 panelBackgroundButtons.setBackground(new Color(59,83,202));
                 panelBackgroundButtons.setLayout(new FlowLayout());
                 container.add(panelBackgroundButtons, BorderLayout.PAGE_START);

             JSeparator separator = new JSeparator(0);
             separator.setBounds(0,0,700,20);
             separator.setBackground(Color.WHITE);
             separator.setForeground(new Color(59,83,202));
             panelComponent.add(separator);

          }

         private void MenuButtons(){

             Temp = new JButton("Timer");
                Temp.setFocusable(false);
                Temp.setBorderPainted(false);
                Temp.setForeground(Color.WHITE);
                Temp.setBackground(new Color(59,83,202));
                Temp.setFont(new Font("Arial", Font.BOLD, 20));
                Temp.setBounds(0,0,120,40);
                panelBackgroundButtons.add(Temp, FlowLayout.LEFT);
                
             Chrono = new JButton("Chronometer");
                Chrono.setFocusable(false);
                Chrono.setBorderPainted(false);
                Chrono.setBackground(new Color(59,83,202));
                Chrono.setForeground(Color.WHITE);
                Chrono.setFont(new Font("Arial", Font.BOLD, 20));
                Chrono.setBounds(0,0,120,40);
                panelBackgroundButtons.add(Chrono, FlowLayout.CENTER);

             Main = new JButton("Hours");
                Main.setFocusable(false);
                Main.setBorderPainted(false);
                Main.setForeground(Color.WHITE);
                Main.setBackground(new Color(59,83,202));
                Main.setFont(new Font("Arial", Font.BOLD, 20));
                Main.setBounds(0,0,120,40);
                panelBackgroundButtons.add(Main);

                  //Actions

                  Temp.addActionListener(new actionChange());
                  Chrono.addActionListener(new actionChange());
                  Main.addActionListener(new actionChange());
          }


          private void labelTimer(){

             timeZone = new JLabel();
                timeZone.setBounds(260,280,180,40);
                timeZone.setForeground(Color.WHITE);
                timeZone.setFont(new Font("Times new roman", Font.BOLD, 30));
                panelComponent.add(timeZone);

             dayZone = new JLabel();
                dayZone.setBounds(310,315,180,40);
                dayZone.setForeground(Color.WHITE);
                dayZone.setFont(new Font("Times new roman", Font.PLAIN, 24));
                panelComponent.add(dayZone);

             dateZone = new JLabel();
                dateZone.setBounds(258,350,220,30);
                dateZone.setForeground(Color.WHITE);
                dateZone.setFont(new Font("Times new roman", Font.PLAIN, 22));
                panelComponent.add(dateZone);

                timerFormat = new SimpleDateFormat("hh:mm:ss a");
                dayFormat = new SimpleDateFormat("EEEE");
                dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

          }


        class actionChange implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==Temp){
                     if(panelComponent.isVisible()){
                            panelComponent.setVisible(false);
                            timer.setVisible(true);

                            container.add(timer, BorderLayout.CENTER);
                            container.validate();
                            container.repaint();
                          }      
                        if(chronometer.isVisible()){
                                 chronometer.setVisible(false);
                                 timer.setVisible(true);
  
                                 container.add(timer, BorderLayout.CENTER);
                                 container.validate();     
                                 container.repaint();
                    }
                  }
               if(e.getSource()==Chrono){
                     if(panelComponent.isVisible()){
                            panelComponent.setVisible(false);
                            chronometer.setVisible(true);

                            container.add(chronometer, BorderLayout.CENTER);
                            container.validate();
                            container.repaint();
                           
                    }
                      if(timer.isVisible()){
                              timer.setVisible(false);
                              chronometer.setVisible(true);

                              container.add(chronometer, BorderLayout.CENTER);
                              container.validate();
                              container.repaint();
                               
                     } 
                              
                }
                  if(e.getSource()==Main){
                        panelComponent.setVisible(true);
                        timer.setVisible(false);
                        chronometer.setVisible(false);
                  }
               }
            }
        @Override
        public void run() {
              
                   while(true){//mientras el thread este activo
                         time = timerFormat.format(Calendar.getInstance().getTime());
                         timeZone.setText(time);

                         day = dayFormat.format(Calendar.getInstance().getTime());
                         dayZone.setText(day);

                         date = dateFormat.format(Calendar.getInstance().getTime());
                         dateZone.setText(date);
              }

        }



}