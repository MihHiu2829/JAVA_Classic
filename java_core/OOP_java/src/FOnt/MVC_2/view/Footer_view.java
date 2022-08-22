package FOnt.MVC_2.view;

import FOnt.MVC_2.controller.footer_controller;
import FOnt.MVC_2.model.Footer_model;
import MVC_6.Controller.counter_controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Footer_view extends JFrame {
    Footer_model footer_model  ;
    private JButton jButton_1 ;
    private JButton jButton_2 ;
    private JButton jButton_3 ;
    private JButton jButton_4 ;
    private JButton jButton_show;
    private JLabel jLabel_text ;
    public Footer_view(){
        this.footer_model = new Footer_model() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Footer");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
         Font font = new Font("Arial",Font.BOLD,30);
         ActionListener ac = new footer_controller(this) ;
        jButton_1 =  new JButton("1");
        jButton_1.setFont(font);
        jButton_1.addActionListener(ac);
        jButton_2 =  new JButton("2");
        jButton_2.setFont(font);
        jButton_2.addActionListener(ac);

        jButton_3 =  new JButton("3");
        jButton_3.setFont(font);
        jButton_3.addActionListener(ac);

        jButton_4 =  new JButton("4");
        jButton_4.setFont(font);
        jButton_4.addActionListener(ac);
        jButton_show = new JButton("Show number")  ;
        jButton_show.setFont(font);
        jButton_show.addActionListener(ac);
        JPanel jPanel = new JPanel() ;
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(jButton_1);
        jPanel.add(jButton_2);
        jPanel.add(jButton_3);
        jPanel.add(jButton_4);
        jLabel_text = new JLabel("----------------------",JLabel.CENTER) ;
        jLabel_text.setFont(font);
//        JPanel jPanel1_footer = new JPanel() ;
//        jPanel1_footer.add(jLabel_text);
        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
        this.add(jLabel_text,BorderLayout.NORTH);
        this.add(jButton_show,BorderLayout.SOUTH) ;
    }
    public void footer_1(){
        this.footer_model.setValue(1);
        this.jLabel_text.setText(this.footer_model.getValue()+"");
    }
    public void footer_2(){
        this.footer_model.setValue(2);
        this.jLabel_text.setText(this.footer_model.getValue()+"");
    }
    public void footer_3(){
        this.footer_model.setValue(3);
        this.jLabel_text.setText(this.footer_model.getValue()+"");
    }
    public void footer_4(){
        this.footer_model.setValue(4);
        this.jLabel_text.setText(this.footer_model.getValue()+"");
    }
    public void FiLL(String a){
        this.jLabel_text.setText(a);
    }
}
