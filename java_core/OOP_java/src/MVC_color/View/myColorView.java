package MVC_color.View;

import MVC_color.Controller.myColorListener;
import MVC_color.Model.myColorModel;

import javax.swing.*;
import java.awt.*;

public class myColorView extends JFrame {
    private myColorModel myColorModel ;
    private JLabel jLabel ;
    public myColorView(){
        this.myColorModel = new myColorModel() ;
        this.init() ;
        this.setVisible(true);
    }
    private void init(){
        this.setTitle("My color");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD,40)  ;
        Font font_text = new Font("Arial",Font.BOLD,60) ;
        myColorListener ml = new myColorListener(this);


        jLabel = new JLabel("TEXT") ;
        jLabel.setFont(font_text);
        JPanel jPanel = new JPanel() ;
        jPanel.setLayout(new GridLayout(2,3));


        JButton jButton_text_red = new JButton("Red Text") ;
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.RED);
        jButton_text_red.setBackground(Color.white);
        jButton_text_red.addActionListener(ml);

        JButton jButton_text_yellow = new JButton("Yellow Text") ;
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setForeground(Color.YELLOW);
        jButton_text_yellow.setBackground(Color.white);
        jButton_text_yellow.addActionListener(ml);


        JButton jButton_text_green = new JButton("Green Text") ;
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.GREEN);
        jButton_text_green.setBackground(Color.white);
        jButton_text_green.addActionListener(ml);


        JButton jButton_background_red = new JButton("Red Background") ;
        jButton_background_red.setFont(font);
        jButton_background_red.setBackground(Color.RED);
        jButton_background_red.addActionListener(ml);

        JButton jButton_background_yellow = new JButton("Yellow Background") ;
        jButton_background_yellow.setFont(font);
        jButton_background_yellow.setBackground(Color.YELLOW);
        jButton_background_yellow.addActionListener(ml);

        JButton jButton_background_green = new JButton("Green Background") ;
        jButton_background_green.setFont(font);
        jButton_background_green.setBackground(Color.GREEN);
        jButton_background_green.addActionListener(ml);

        jPanel.add(jButton_text_red) ;
        jPanel.add(jButton_text_yellow) ;
        jPanel.add(jButton_text_green) ;
        jPanel.add(jButton_background_green) ;
        jPanel.add(jButton_background_red) ;
        jPanel.add(jButton_background_yellow) ;

        this.setLayout(new BorderLayout());
        this.add(jLabel,BorderLayout.NORTH);
        this.add(jPanel,BorderLayout.CENTER);
    }

    public void changeTextColor(Color color) {
        this.jLabel.setForeground(color);
    }
    public void changeBackgroundColor(Color color){
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);  // => 2 cai nay p di chung voi nhau
    }
}
