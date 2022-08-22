package MVC_3.View;

import MVC_3.Controller.Counter_controller;
import MVC_3.Model.Counter_Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Counter_view extends JFrame {
    private Counter_Model ctm ;
    private JButton jButton_up ;
    private JButton jButton_down ;
    private JButton jButton_reset ;
    private JLabel jLabel_value ;

    public Counter_view() {
         this.ctm = new Counter_Model() ;
             this.init() ;
             this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener ac = new Counter_controller(this) ;
        jButton_reset = new JButton("Reset") ;
        jButton_reset.addActionListener(ac);
        jButton_up = new JButton("UP") ;
        jButton_up.addActionListener(ac);
        jButton_down =  new JButton("DOWN");
        jButton_down.addActionListener(ac);
        jLabel_value = new JLabel(this.ctm.getValue()+"",JLabel.CENTER);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_reset,BorderLayout.SOUTH) ;
        jPanel.add(jButton_up,BorderLayout.EAST);
         jPanel.add(jButton_down,BorderLayout.WEST);
         jPanel.add(jLabel_value,BorderLayout.CENTER) ;
         this.setLayout(new BorderLayout());
         this.add(jPanel) ;
    }
    public void increment(){
        this.ctm.Increment();
        this.jLabel_value.setText(this.ctm.getValue()+"");
    }
    public void decrement(){
        this.ctm.Decrement();
        this.jLabel_value.setText(this.ctm.getValue()+"");
    }
    public void reset(){
        this.ctm.Reset();
        this.jLabel_value.setText(this.ctm.getValue()+"");
    }
}
