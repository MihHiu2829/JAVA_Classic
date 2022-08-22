package MVC_6.View;

import MVC_6.Controller.counter_controller;
import MVC_6.Model.counter_model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class counter_view extends JFrame{
    private counter_model ctm  ;
    private JButton jButton_up ;
    private JButton jButton_down ;
    private JButton jButton_reset ;
    private JLabel jLabel_value ;

    public counter_view() {
        ctm = new counter_model() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        ActionListener ac = new counter_controller(this) ;
        jButton_up = new JButton("UP") ;
        jButton_up.addActionListener(ac);
        jButton_down =  new JButton("DOWN")  ;
        jButton_down.addActionListener(ac);
        jLabel_value = new JLabel(this.ctm.getValue()+"",JLabel.CENTER) ;
        jButton_reset = new JButton("RESET") ;
        jButton_reset.addActionListener(ac);
        JPanel jPanel = new JPanel() ;
        jPanel.setLayout(new BorderLayout()) ;
        jPanel.add(jButton_up,BorderLayout.EAST)  ;
        jPanel.add(jButton_down,BorderLayout.WEST) ;
        jPanel.add(jButton_reset,BorderLayout.SOUTH) ;
        jPanel.add(jLabel_value,BorderLayout.CENTER) ;
        this.setLayout(new BorderLayout())  ;
        this.add(jPanel,BorderLayout.CENTER) ;
    }
    public void Increment(){
        this.ctm.Increment();
        this.jLabel_value.setText(this.ctm.getValue()+"");
    }
    public void Decrement(){
        this.ctm.Decrement();
        this.jLabel_value.setText(this.ctm.getValue()+"");
    }
    public void Reset(){
        this.ctm.Reset();
        this.jLabel_value.setText(this.ctm.getValue()+"");
    }
}
