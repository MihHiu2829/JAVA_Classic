package Java_graphic_basic;

import javax.swing.*;
import java.awt.*;

public class Jpanel_lôk_and_feel_3 extends JFrame {
    public Jpanel_lôk_and_feel_3(){
              this.setTitle("My Caculator");
              this.setSize(1280,720);
              this.setLocationRelativeTo(null);
              JTextField jTextField = new JTextField("Thực Hiện phép tính: ",200) ;
              JPanel jPanel_head = new JPanel() ;
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

        JPanel jPanel_buttons = new JPanel() ;
        jPanel_buttons.setLayout(new GridLayout(5,3));
        jPanel_buttons.add(jButton) ;
        jPanel_buttons.add(jButton_1) ;
        jPanel_buttons.add(jButton_2) ;
        jPanel_buttons.add(jButton_3) ;
        jPanel_buttons.add(jButton_4) ;
        jPanel_buttons.add(jButton_5) ;
        jPanel_buttons.add(jButton_6) ;
        jPanel_buttons.add(jButton_7) ;
        jPanel_buttons.add(jButton_8) ;
        jPanel_buttons.add(jButton_9) ;
        jPanel_buttons.add(jButton_cong) ;
        jPanel_buttons.add(jButton_tru) ;
        jPanel_buttons.add(jButton_nhan) ;
        jPanel_buttons.add(jButton_chia) ;
        jPanel_buttons.add(jButton_bang) ;

        this.add(jPanel_head,BorderLayout.CENTER) ;
        this.add(jPanel_buttons,BorderLayout.SOUTH) ;




        this.setVisible(true);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
          new Jpanel_lôk_and_feel_3() ;
    }
}
