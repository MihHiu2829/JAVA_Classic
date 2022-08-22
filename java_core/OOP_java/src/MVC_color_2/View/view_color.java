package MVC_color_2.View;

import MVC_color_1.Controller.control_color;
import MVC_color_1.Model.model_color;
import MVC_color_2.controller.controll_color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view_color extends JFrame{
    private model_color model_color ;
    private JLabel jLabel ;
    public view_color(){
        model_color = new model_color() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Custom color!");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new controll_color(this) ;
        Font font = new Font("Arial",Font.BOLD,50);
        Font text = new Font("Times New Roman",Font.BOLD,60)  ;

        jLabel =  new JLabel("Minh Hieu dang hoc code, lam on hay hoc code ;)");
        jLabel.setFont(text);

          JPanel jPanel_text = new JPanel() ;
          JPanel jPanel_background = new JPanel() ;
          JPanel jPanel_all_function = new JPanel() ;


        JButton jButton_text_red = new JButton("to red");
        jButton_text_red.setFont(font);
        jButton_text_red.addActionListener(ac);
         jButton_text_red.setForeground(Color.RED);
        jButton_text_red.setBackground(Color.WHITE);


        JButton jButton_text_green = new JButton("to green");
        jButton_text_green.addActionListener(ac);
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.GREEN);
        jButton_text_green.setBackground(Color.WHITE);


        JButton jButton_text_yellow = new JButton("to yellow");
        jButton_text_yellow.addActionListener(ac);
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setForeground(Color.YELLOW);
        jButton_text_yellow.setBackground(Color.WHITE);


        JButton jButton_text_violet = new JButton("to violer");
        jButton_text_violet.addActionListener(ac);
        jButton_text_violet.setFont(font);
        jButton_text_violet.setForeground(Color.MAGENTA);
        jButton_text_violet.setBackground(Color.WHITE);


        JButton jButton_background_yellow = new JButton("Yellow");
        jButton_background_yellow.setFont(font);
        jButton_background_yellow.setBackground(Color.YELLOW);
        jButton_background_yellow.addActionListener(ac);

        JButton jButton_background_while = new JButton("While");
        jButton_background_while.addActionListener(ac);
        jButton_background_while.setFont(font);
        jButton_background_while.setBackground(Color.WHITE);

        JButton jButton_background_green = new JButton("Green");
        jButton_background_green.setFont(font);
        jButton_background_green.setBackground(Color.green);
        jButton_background_green.addActionListener(ac);

        JButton jButton_reset = new JButton("Reset");
        jButton_reset.addActionListener(ac);
        jButton_reset.setFont(font);

        jPanel_text.setLayout(new GridLayout(4,1));
        jPanel_text.add(jButton_text_red);
        jPanel_text.add(jButton_text_green);
        jPanel_text.add(jButton_text_yellow);
        jPanel_text.add(jButton_text_violet);

        jPanel_background.setLayout(new GridLayout(4,1));
        jPanel_background.add(jButton_background_yellow) ;
        jPanel_background.add(jButton_background_while) ;
        jPanel_background.add(jButton_background_green) ;
        jPanel_background.add(jButton_reset) ;

        jPanel_all_function.setLayout(new GridLayout(1,1));
        jPanel_all_function.add(jPanel_background);
        jPanel_all_function.add(jPanel_text);

        this.setLayout(new BorderLayout());
        this.add(jPanel_all_function,BorderLayout.CENTER);
        this.add(jLabel,BorderLayout.NORTH);
    }
    public void changeText(Color color){
        this.jLabel.setForeground(color);
    }
    public void changeBackground(Color color){
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
}
