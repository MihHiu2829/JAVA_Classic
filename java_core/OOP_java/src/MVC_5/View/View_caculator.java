package MVC_5.View;

import MVC.controller.CounterListener;
import MVC_5.Controller.Controller_caculator;
import MVC_5.Model.Model_caculolar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View_caculator extends JFrame {
    Model_caculolar model_caculolar ;
     JButton jButton_0 ;
    JButton jButton_1 ;
    JButton jButton_2 ;
    JButton jButton_3 ;
    JButton jButton_4 ;
    JButton jButton_5 ;
    JButton jButton_6 ;
    JButton jButton_7 ;
    JButton jButton_8 ;
    JButton jButton_9 ;
    JButton jButton_cong ;
    JButton jButton_tru  ;
    JButton jButton_nhan ;
    JLabel jLabel_value ;
    JButton jButton_bang ;
    JButton jButton_AC ;
    public View_caculator(){
            Model_caculolar model_caculolar = new Model_caculolar() ;
            this.init() ;
            this.setVisible(true);
    }
    public void init(){
           this.setTitle("CACULATOR");
           this.setSize(300,300);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setLocationRelativeTo(null);
           ActionListener ac = new Controller_caculator(this) ;
           jButton_0 = new JButton("0") ;
           jButton_0.addActionListener(ac);
           jButton_1 = new JButton("1");
        jButton_1.addActionListener(ac);
           jButton_2 = new JButton("2");
        jButton_2.addActionListener(ac);
           jButton_3 = new JButton("3") ;
        jButton_3.addActionListener(ac);
           jButton_4 = new JButton("4");
        jButton_4.addActionListener(ac);
           jButton_5 = new JButton("5") ;
        jButton_5.addActionListener(ac);
           jButton_6 = new JButton("6")  ;
        jButton_6.addActionListener(ac);
           jButton_7 = new JButton("7") ;
        jButton_7.addActionListener(ac);
           jButton_8 = new JButton("8") ;
        jButton_8.addActionListener(ac);
           jButton_9 = new JButton("9") ;
        jButton_9.addActionListener(ac);
           jButton_cong = new JButton("+") ;
        jButton_cong.addActionListener(ac);
           jButton_tru = new JButton("-") ;
        jButton_tru.addActionListener(ac);
           jButton_nhan = new JButton("*") ;
        jButton_nhan.addActionListener(ac);
           jButton_bang = new JButton("=") ;
        jButton_bang.addActionListener(ac);
           jButton_AC = new JButton("AC") ;
        jButton_AC.addActionListener(ac);
           JPanel jPanel_keyboard = new JPanel() ;
           jPanel_keyboard.setLayout(new GridLayout(3,3));
        jPanel_keyboard.add(jButton_1) ;
        jPanel_keyboard.add(jButton_2) ;
        jPanel_keyboard.add(jButton_3) ;
        jPanel_keyboard.add(jButton_4) ;
        jPanel_keyboard.add(jButton_5) ;
        jPanel_keyboard.add(jButton_6) ;
        jPanel_keyboard.add(jButton_7) ;
        jPanel_keyboard.add(jButton_8) ;
        jPanel_keyboard.add(jButton_9) ;
        JPanel jPanel_function = new JPanel() ;
        jPanel_function.setLayout(new GridLayout(3,2));
        jPanel_function.add(jButton_cong);
        jPanel_function.add(jButton_tru) ;
        jPanel_function.add(jButton_nhan);
        jPanel_function.add(jButton_bang);
        jPanel_function.add(jButton_0);
        jPanel_function.add(jButton_AC) ;
        jLabel_value = new JLabel("Nhap thong tin: ",JLabel.CENTER);
        JPanel jPanel_value = new JPanel();
        jPanel_value.setLayout(new BorderLayout());
        jPanel_value.add(jLabel_value,BorderLayout.CENTER) ;
        this.setLayout(new BorderLayout());
        this.add(jPanel_function,BorderLayout.NORTH) ;
        this.add(jPanel_function,BorderLayout.EAST) ;
        this.add(jPanel_keyboard,BorderLayout.CENTER) ;
    }
}
