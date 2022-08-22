package MVC_2.View;

import MVC.controller.CounterListener;
import MVC.view.CounterView;
import MVC_2.Controller.Counter_controller;
import MVC_2.Model.Counter_Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Counter_View extends JFrame {
    private Counter_Model  counterModel;
    private JButton jButton_up ;
    private JButton jButton_down ;
    private JLabel jLabel_value ;
    public Counter_View(){
       this.counterModel = new Counter_Model()   ;
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          ActionListener ac = new Counter_controller(this);
        jButton_up = new JButton("UP") ;
        jButton_up.addActionListener(ac);
        jButton_down = new JButton("DOWN") ;
        jButton_down.addActionListener(ac);
        jLabel_value = new JLabel(this.counterModel.getValue()+"",JLabel.CENTER) ;
        JPanel jPanel = new JPanel(new BorderLayout()) ;
        jPanel.add(jButton_up,BorderLayout.EAST) ;
        jPanel.add(jButton_down,BorderLayout.WEST) ;
        jPanel.add(jLabel_value,BorderLayout.CENTER) ;
        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER) ;
    }
    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
}
