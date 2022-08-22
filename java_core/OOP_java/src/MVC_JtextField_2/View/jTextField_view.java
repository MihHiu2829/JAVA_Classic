package MVC_JtextField_2.View;

import MVC_JtextField_2.Controller.jTextField_controll;
import MVC_JtextField_2.Model.jTextField_model;

import javax.swing.*;
import java.awt.*;

public class jTextField_view extends JFrame {
    private jTextField_model jTextField_model ;
    private JTextField firstValue ;
    private JTextField secondValue ;
    private JTextField result ;

    public jTextField_view() {
        this.jTextField_model = new jTextField_model() ;
        this.init() ;
        this.setVisible(true);
    }

    public void init(){
        this.setTitle("My calculator! ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);

        Font font_Arial = new Font("Arial",Font.BOLD,40);
        Font font_TNR = new Font("Times New Roman",Font.PLAIN,50) ;

        JLabel jLabel_first = new JLabel("First Number: ") ;
        jLabel_first.setFont(font_Arial);
        JLabel jLabel_second = new JLabel("Second Number: ") ;
        jLabel_second.setFont(font_Arial);
        JLabel jLabel_result = new JLabel("Result: ") ;
        jLabel_result.setFont(font_Arial);

        firstValue = new JTextField(40);
        firstValue.setFont(font_Arial);
        secondValue = new JTextField(40) ;
        secondValue.setFont(font_Arial); ;
        result = new JTextField(40) ;
        result.setFont(font_Arial);

        JPanel jPanel_center = new JPanel() ;
        jPanel_center.setLayout(new GridLayout(3,2));

        jPanel_center.add(jLabel_first);
        jPanel_center.add(firstValue);
        jPanel_center.add(jLabel_second);
        jPanel_center.add(secondValue);
        jPanel_center.add(jLabel_result);
        jPanel_center.add(result);

        JPanel jPanel_function = new JPanel() ;
        jPanel_function.setLayout(new GridLayout(2,3));
        jTextField_controll ac = new jTextField_controll(this) ;

        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font_TNR);
        jButton_plus.addActionListener(ac);

        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font_TNR);
        jButton_minus.addActionListener(ac);

        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font_TNR);
        jButton_multiply.addActionListener(ac);

        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font_TNR);
        jButton_divide.addActionListener(ac);

        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font_TNR);
        jButton_mod.addActionListener(ac);

        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font_TNR);
        jButton_pow.addActionListener(ac);

        jPanel_function.add(jButton_plus);
        jPanel_function.add(jButton_minus);
        jPanel_function.add(jButton_multiply);
        jPanel_function.add(jButton_divide);
        jPanel_function.add(jButton_mod);
        jPanel_function.add(jButton_pow);

        JButton jButton_push = new JButton("Push") ;
        jButton_push.setFont(font_Arial);
        jButton_push.addActionListener(ac);

        JButton jButton_repeat = new JButton("Repeat") ;
        jButton_repeat.setFont(font_Arial);
        jButton_repeat.addActionListener(ac);

        JPanel jPanel_Function_right = new JPanel() ;
        jPanel_Function_right.setLayout(new GridLayout(2,1));
        jPanel_Function_right.add(jButton_repeat) ;
        jPanel_Function_right.add(jButton_push) ;

        this.setLayout(new BorderLayout());
        this.add(jPanel_center,BorderLayout.CENTER) ;
        this.add(jPanel_function,BorderLayout.SOUTH) ;
        this.add(jPanel_Function_right,BorderLayout.EAST);

    }
    public void plus(){
    this.jTextField_model.setFirstValue(Double.valueOf(firstValue.getText()));
    this.jTextField_model.setSecondValue(Double.valueOf(secondValue.getText()));
    this.jTextField_model.plus();
    this.result.setText(this.jTextField_model.getResult()+"");
    }
    public void minus(){
        this.jTextField_model.setFirstValue(Double.valueOf(firstValue.getText()));
        this.jTextField_model.setSecondValue(Double.valueOf(secondValue.getText()));
        this.jTextField_model.minus();
        this.result.setText(this.jTextField_model.getResult()+"");
    }
    public void multiply(){
        this.jTextField_model.setFirstValue(Double.valueOf(firstValue.getText()));
        this.jTextField_model.setSecondValue(Double.valueOf(secondValue.getText()));
        this.jTextField_model.multiply();
        this.result.setText(this.jTextField_model.getResult()+"");
    }
    public void divide(){
        this.jTextField_model.setFirstValue(Double.valueOf(firstValue.getText()));
        this.jTextField_model.setSecondValue(Double.valueOf(secondValue.getText()));
        this.jTextField_model.divide();
        this.result.setText(this.jTextField_model.getResult()+"");
    }
    public void mod(){
        this.jTextField_model.setFirstValue(Double.valueOf(firstValue.getText()));
        this.jTextField_model.setSecondValue(Double.valueOf(secondValue.getText()));
        this.jTextField_model.mod();
        this.result.setText(this.jTextField_model.getResult()+"");
    }
    public void pow(){
        this.jTextField_model.setFirstValue(Double.valueOf(firstValue.getText()));
        this.jTextField_model.setSecondValue(Double.valueOf(secondValue.getText()));
        this.jTextField_model.pow();
        this.result.setText(this.jTextField_model.getResult()+"");
    }
    public void push(){
        this.firstValue.setText(this.jTextField_model.getResult()+"");
        this.secondValue.setText("");
        this.result.setText("");
    }
    public void push_up(){
     this.firstValue.setText(this.jTextField_model.getResult()+"");

    }
}
