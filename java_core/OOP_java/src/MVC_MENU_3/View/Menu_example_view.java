package MVC_MENU_3.View;

import MVC_MENU_3.Controller.Menu_controller_example;

import javax.swing.*;
import java.awt.*;

public class Menu_example_view extends JFrame {
    private JLabel jLabel_display  ;
    public Menu_example_view(){
        this.setTitle("Menu function");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jMenuBar = new JMenuBar()  ;
        Font font = new Font("Arial",Font.BOLD,25) ;
        Menu_controller_example ac = new Menu_controller_example(this) ;


        JMenu jMenu_1 = new JMenu("Selection 1") ;
        JMenuItem jMenuItem_funtion_1 = new JMenuItem("function 1");
        jMenuItem_funtion_1.setFont(font);
        jMenuItem_funtion_1.addActionListener(ac);
        JMenuItem jMenuItem_funtion_2 = new JMenuItem("function 2");
        jMenuItem_funtion_2.setFont(font);
        jMenuItem_funtion_2.addActionListener(ac);
        jMenu_1.add(jMenuItem_funtion_1);
        jMenu_1.addSeparator();
        jMenu_1.add(jMenuItem_funtion_2);

        JMenu jMenu_2 = new JMenu("Selection 2 ") ;
        JMenuItem jMenuItem_funtion_3 = new JMenuItem("function 3");
        jMenuItem_funtion_3.setFont(font);
        jMenuItem_funtion_3.addActionListener(ac);

        JMenuItem jMenuItem_funtion_4 = new JMenuItem("function 4");
        jMenuItem_funtion_4.setFont(font);
        jMenuItem_funtion_4.addActionListener(ac);

        JMenuItem jMenuItem_funtion_5 = new JMenuItem("function 5");
        jMenuItem_funtion_5.setFont(font);
        jMenuItem_funtion_5.addActionListener(ac);

        JMenuItem jMenuItem_funtion_6 = new JMenuItem("function 6");
        jMenuItem_funtion_6.setFont(font);
        jMenuItem_funtion_6.addActionListener(ac);

        jMenu_2.add(jMenuItem_funtion_3);
        jMenu_2.addSeparator();
        jMenu_2.add(jMenuItem_funtion_4);
        jMenu_2.addSeparator();
        jMenu_2.add(jMenuItem_funtion_5);
        jMenu_2.addSeparator();
        jMenu_2.add(jMenuItem_funtion_6);




        jMenuBar.add(jMenu_1);
        jMenuBar.add(jMenu_2);
        this.setJMenuBar(jMenuBar);


        jLabel_display = new JLabel("Viết gì đó đi ạ? ") ;
        jLabel_display.setFont(font);





        this.setLayout(new BorderLayout());
        this.add(jLabel_display,BorderLayout.CENTER);


        this.setVisible(true);
    }
     public void setText_jlabel(String s){
          this.jLabel_display.setText(s);
     }
}
