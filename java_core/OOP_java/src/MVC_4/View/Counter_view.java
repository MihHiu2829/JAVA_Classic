package MVC_4.View;

import MVC.controller.CounterListener;
import MVC.model.CounterModel;
import MVC_4.Controller.Counter_Listener;
import MVC_4.Model.Counter_Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Counter_view extends JFrame {
    private Counter_Model counterModel  ;
    private JButton jButton_up ;
    private JButton jButton_down ;
    private JLabel jLabel_value ;
    private JButton jButton_Reset ;

    public Counter_view(){
         this.counterModel = new Counter_Model() ;
         this.init() ;
          this.setVisible(true);
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ActionListener ac = new Counter_Listener(this) ;
        jButton_up = new JButton("UP") ;
        jButton_up.addActionListener(ac);
        jButton_down = new JButton("DOWN") ;jButton_down.addActionListener(ac);
        jButton_Reset = new JButton("RESET") ;jButton_Reset.addActionListener(ac);
        jLabel_value = new JLabel(this.counterModel.getValue()+"",JLabel.CENTER) ;
        JPanel jPanel = new JPanel() ;
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_Reset,BorderLayout.SOUTH) ;
        jPanel.add(jButton_up,BorderLayout.EAST) ;
        jPanel.add(jButton_down,BorderLayout.WEST) ;
        jPanel.add(jLabel_value,BorderLayout.CENTER) ;
        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER) ;

    }
    public void Increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void Decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void reset(){
        this.counterModel.reset();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
}
