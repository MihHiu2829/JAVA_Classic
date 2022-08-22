package MVC_color_1.View;

import MVC_color_1.Controller.control_color;
import MVC_color_1.Model.model_color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view_color extends JFrame {
    private model_color modelColor  ;
    private JLabel jLabel ;
    public view_color(){
        modelColor = new model_color() ;
        this.init() ;
         this.setVisible(true);
    }
    public void init(){
        this.setTitle("Color customer");
        this.setSize(1280,720) ;
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new control_color(this) ;
        Font font = new Font("Arial",Font.BOLD,40);
        Font text = new Font("Times New Roman",Font.BOLD,60) ;

        jLabel = new JLabel("Minh Hiếu đang học code, làm ơn hãy học code :)") ;
         jLabel.setFont(text);


        JButton jButton_text_red = new JButton("to red") ;
        jButton_text_red.setFont(font);
        jButton_text_red.addActionListener(ac);

        JButton jButton_text_blue = new JButton("to blue") ;
        jButton_text_blue.setFont(font);
        jButton_text_blue.addActionListener(ac);

        JButton jButton_text_yellow = new JButton("to yellow") ;
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.addActionListener(ac);

        JButton jButton_text_while = new JButton("to while") ;
        jButton_text_while.setFont(font);
        jButton_text_while.addActionListener(ac);

        JButton jButton_text_black = new JButton("to black") ;
        jButton_text_black.setFont(font);
        jButton_text_black.addActionListener(ac);

        JButton jButton_background_red = new JButton("background to red") ;
        jButton_background_red.setFont(font);
        jButton_background_red.addActionListener(ac);

        JButton jButton_background_blue = new JButton("background to blue") ;
        jButton_background_blue.setFont(font);
        jButton_background_blue.addActionListener(ac);

        JButton jButton_background_yellow = new JButton("background to yellow") ;
        jButton_background_yellow.setFont(font);
        jButton_background_yellow.addActionListener(ac);

        JButton jButton_background_while = new JButton("background to while") ;
        jButton_background_while.setFont(font);
        jButton_background_while.addActionListener(ac);


        JButton jButton_background_black = new JButton("background to black") ;
        jButton_background_black.setFont(font);
        jButton_background_black.addActionListener(ac);


        JPanel jPanel = new JPanel() ;
        jPanel.setLayout(new GridLayout(5,1));

         jPanel.add(jButton_text_red);
         jPanel.add(jButton_text_blue);
         jPanel.add(jButton_text_yellow);
         jPanel.add(jButton_text_while);
         jPanel.add(jButton_text_black);

         JPanel jPanel1 = new JPanel() ;
         jPanel1.setLayout(new GridLayout(5,1));
        jPanel1.add(jButton_background_red);
        jPanel1.add(jButton_background_blue);
        jPanel1.add(jButton_background_yellow);
        jPanel1.add(jButton_background_while);
        jPanel1.add(jButton_background_black);

          JPanel jPanelM =  new JPanel() ;
          jPanelM.setLayout(new GridLayout(1,1));
           jPanelM.add(jPanel);
           jPanelM.add(jPanel1);
        this.setLayout(new BorderLayout());
         this.add(jPanelM,BorderLayout.CENTER) ;
         this.add(jLabel,BorderLayout.NORTH) ;
    }
    public void changeColorToText(Color color){
        this.jLabel.setForeground(color);
    }
    public void changeColorToBackGround(Color color){
        this.jLabel.setOpaque(true);
        this.jLabel.setBackground(color);
    }
}
