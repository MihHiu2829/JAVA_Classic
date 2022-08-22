package Java_graphic_basic;

import javax.swing.*;
import java.awt.*;

public class Jpanel_look_and_feel_2 extends JFrame {
    public Jpanel_look_and_feel_2(){
        this.setTitle("MY Caculator! ");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        JPanel jPanel_head = new JPanel() ;
        JTextField jTextField = new JTextField(50) ;
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField,BorderLayout.CENTER) ;
        JButton jButton = new JButton("0");
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        JButton jButton_6 = new JButton("6");
        JButton jButton_7 = new JButton("7");
        JButton jButton_8 = new JButton("8");
        JButton jButton_9 = new JButton("9");
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("*");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");
        JPanel jPanel_button  = new JPanel()  ;
        jPanel_button.setLayout(new GridLayout(5,3));
//        jPanel_button.add(jTextField) ;
        jPanel_button.add(jButton)  ;
        jPanel_button.add(jButton_1)  ;
        jPanel_button.add(jButton_2)  ;
        jPanel_button.add(jButton_3)  ;
        jPanel_button.add(jButton_4)  ;
        jPanel_button.add(jButton_5)  ;
        jPanel_button.add(jButton_6)  ;
        jPanel_button.add(jButton_7)  ;
        jPanel_button.add(jButton_8)  ;
        jPanel_button.add(jButton_9)  ;
        jPanel_button.add(jButton_cong)  ;
        jPanel_button.add(jButton_tru)  ;
        jPanel_button.add(jButton_nhan)  ;
        jPanel_button.add(jButton_chia)  ;
        jPanel_button.add(jButton_bang)  ;
        this.setLayout(new BorderLayout());
        this.add(jPanel_button,BorderLayout.CENTER)  ;
        this.add(jPanel_head,BorderLayout.NORTH)  ;;
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
                  new Jpanel_look_and_feel_2() ;
    }
}
