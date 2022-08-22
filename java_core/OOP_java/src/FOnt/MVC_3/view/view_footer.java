package FOnt.MVC_3.view;

import FOnt.MVC_2.controller.footer_controller;
import FOnt.MVC_3.controller.controller_footer;
import FOnt.MVC_3.model.model_footer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view_footer extends JFrame {
    private model_footer model_footer ;
    private JButton jButton_1 ;
    private JButton jButton_2 ;
    private JButton jButton_3;
    private JButton jButton_4 ;
    private  JLabel jLabel_value ;
    public  view_footer(){
        model_footer =  new model_footer() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Footer");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,50) ;
        ActionListener ac = new controller_footer(this)  ;
        jButton_1 = new JButton("1") ;
        jButton_1.addActionListener(ac);
        jButton_1.setFont(font);
        jButton_2 = new JButton("2") ;
        jButton_2.addActionListener(ac);
        jButton_2.setFont(font);
        jButton_3 = new JButton("3") ;
        jButton_3.addActionListener(ac);
        jButton_3.setFont(font);
        jButton_4 = new JButton("4") ;
        jButton_4.addActionListener(ac);
        jButton_4.setFont(font);
        jLabel_value = new JLabel(this.model_footer.getValue()+"",JLabel.CENTER);
        jLabel_value.setFont(font);

        JPanel jPanel = new JPanel() ;
        jPanel.setLayout(new GridLayout(2,2,20,20));
        jPanel.add(jButton_1);
        jPanel.add(jButton_2);
        jPanel.add(jButton_3);
        jPanel.add(jButton_4);
        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.SOUTH) ;
        this.add(jLabel_value,BorderLayout.NORTH) ;
    }
    public void mot(){
        this.model_footer.setValue(1);
        this.jLabel_value.setText(this.model_footer.getValue()+"");
    }
    public void hai(){
        this.model_footer.setValue(2);
        this.jLabel_value.setText(this.model_footer.getValue()+"");
    }
    public  void ba(){
        this.model_footer.setValue(3);
        this.jLabel_value.setText(this.model_footer.getValue()+"");
    }
    public void bon(){
        this.model_footer.setValue(4);
        this.jLabel_value.setText(this.model_footer.getValue()+"");
    }
}
