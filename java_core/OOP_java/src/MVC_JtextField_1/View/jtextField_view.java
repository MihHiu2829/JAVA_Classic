package MVC_JtextField_1.View;

import MVC_JtextField_1.Controll.jtextField_controll;
import MVC_JtextField_1.Model.jtextField_model;

import javax.swing.*;
import java.awt.*;

public class jtextField_view extends JFrame {
    private jtextField_model jtextField_model ;
    private JTextField jTextField_first;
    private JTextField jTextField_second;
    private JTextField jTextField_result;

    public jtextField_view() {
        this.jtextField_model = new jtextField_model();

        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Calculator! ");
        this.setSize(1280,720) ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,40) ;
        Font font2 = new Font("Times New Roman",Font.PLAIN,40) ;


        JLabel jLabel_first = new JLabel("First value:  ");
        jLabel_first.setFont(font);
        JLabel jLabel_second = new JLabel("Second value:  ");
        jLabel_second.setFont(font);
        JLabel jLabel_result = new JLabel("Result: ");
        jLabel_result.setFont(font);


         jTextField_first = new JTextField(50) ;
        jTextField_first.setFont(font2);
        jTextField_second = new JTextField(50);
        jTextField_second.setFont(font2);
         jTextField_result = new JTextField(50);
        jTextField_result.setFont(font2);

        JPanel jPanel_center = new JPanel()  ;
        JPanel jPanel_funtion = new JPanel() ;

        jPanel_center.setLayout(new GridLayout(3,2));
        jPanel_funtion.setLayout(new GridLayout(3,2,5,5));
        jtextField_controll jtextField_controll = new jtextField_controll(this) ;

        jPanel_center.add(jLabel_first);
        jPanel_center.add(jTextField_first);
        jPanel_center.add(jLabel_second);
        jPanel_center.add(jTextField_second);
        jPanel_center.add(jLabel_result);
        jPanel_center.add(jTextField_result);

        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(jtextField_controll);


        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(jtextField_controll);


        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(jtextField_controll);


        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(jtextField_controll);


        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(jtextField_controll);


        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(jtextField_controll);


        jPanel_funtion.add(jButton_plus);
        jPanel_funtion.add(jButton_minus);
        jPanel_funtion.add(jButton_multiply);
        jPanel_funtion.add(jButton_divide);
        jPanel_funtion.add(jButton_mod);
        jPanel_funtion.add(jButton_pow);

        this.setLayout(new BorderLayout());
        this.add(jPanel_center,BorderLayout.CENTER) ;
        this.add(jPanel_funtion,BorderLayout.EAST);
    }
    public void plus(){
        double firstValue = Double.valueOf(jTextField_first.getText()) ;
        double secondValue = Double.valueOf(jTextField_second.getText()) ;
        this.jtextField_model.setFirstValue(firstValue);
        this.jtextField_model.setSecondValue(secondValue);
        this.jtextField_model.plus();
        this.jTextField_result.setText(this.jtextField_model.getResult()+"");
    }
    public void pow(){
        double firstValue = Double.valueOf(jTextField_first.getText()) ;
        double secondValue = Double.valueOf(jTextField_second.getText()) ;
        this.jtextField_model.setFirstValue(firstValue);
        this.jtextField_model.setSecondValue(secondValue);
        this.jtextField_model.power();
        this.jTextField_result.setText(this.jtextField_model.getResult()+"");
    }
    public void minus(){
        double firstValue = Double.valueOf(jTextField_first.getText()) ;
        double secondValue = Double.valueOf(jTextField_second.getText()) ;
        this.jtextField_model.setFirstValue(firstValue);
        this.jtextField_model.setSecondValue(secondValue);
        this.jtextField_model.minus();
        this.jTextField_result.setText(this.jtextField_model.getResult()+"");
    }
    public void multiply(){
        double firstValue = Double.valueOf(jTextField_first.getText()) ;
        double secondValue = Double.valueOf(jTextField_second.getText()) ;
        this.jtextField_model.setFirstValue(firstValue);
        this.jtextField_model.setSecondValue(secondValue);
        this.jtextField_model.multiply();
        this.jTextField_result.setText(this.jtextField_model.getResult()+"");
    }
    public void divide(){
        double firstValue = Double.valueOf(jTextField_first.getText()) ;
        double secondValue = Double.valueOf(jTextField_second.getText()) ;
        this.jtextField_model.setFirstValue(firstValue);
        this.jtextField_model.setSecondValue(secondValue);
        this.jtextField_model.divide();
        this.jTextField_result.setText(this.jtextField_model.getResult()+"");
    }
    public void mod(){
        double firstValue = Double.valueOf(jTextField_first.getText()) ;
        double secondValue = Double.valueOf(jTextField_second.getText()) ;
        this.jtextField_model.setFirstValue(firstValue);
        this.jtextField_model.setSecondValue(secondValue);
        this.jtextField_model.mod();
        this.jTextField_result.setText(this.jtextField_model.getResult()+"");
    }
}
