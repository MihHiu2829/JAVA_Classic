package MVC_Jtext_Area_3.View;

import MVC_Jtext_Area_3.Controller.JtextArea_controll;
import MVC_Jtext_Area_3.Model.JtextArea_model;

import javax.swing.*;
import java.awt.*;

public class JtextArea_view extends JFrame {
    private JtextArea_model jtextAreaModel ;
    private JTextArea text ;
    private JTextField keyword ;
    private JLabel jLabel_result;

    public JtextArea_view() {
        this.jtextAreaModel = new JtextArea_model() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Thống Kê ");
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Times New Roman",Font.BOLD,40);
        JtextArea_controll ac = new JtextArea_controll(this);


        JLabel jLabel_text = new JLabel("Văn bản") ;
        jLabel_text.setFont(font);
        text = new JTextArea(10,5);
        text.setFont(font);


        JLabel jLabel_keyword = new JLabel("Từ khóa") ;
        jLabel_keyword.setFont(font);
        keyword = new JTextField() ;
        keyword.setFont(font);



         jLabel_result = new JLabel();
         jLabel_result.setFont(font);
         JButton jButton = new JButton("Thống kê");
         jButton.setFont(font);
         jButton.setBackground(Color.cyan);
         jButton.addActionListener(ac);

         JPanel jPanel_function = new JPanel();
         jPanel_function.setLayout(new GridLayout(2,2,2,2));
        jPanel_function.add(jLabel_keyword);
        jPanel_function.add(keyword);
        jPanel_function.add(jButton);
        jPanel_function.add(jLabel_result);


        this.setLayout(new BorderLayout());
        this.add(jLabel_text,BorderLayout.NORTH);
        this.add(text,BorderLayout.CENTER);
        this.add(jPanel_function,BorderLayout.SOUTH);
    }

    public void statistics(){
        this.jtextAreaModel.setText(this.text.getText());
        this.jtextAreaModel.setKeyword(this.keyword.getText());
        this.jtextAreaModel.timkiem();
        this.jLabel_result.setText(this.jtextAreaModel.getResult());
    }

}
