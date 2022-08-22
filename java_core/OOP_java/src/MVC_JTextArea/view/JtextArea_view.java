package MVC_JTextArea.view;

import MVC_JTextArea.controller.JtextArea_controller;
import MVC_JTextArea.model.JtextArea_model;

import javax.swing.*;
import java.awt.*;

public class JtextArea_view extends JFrame {
    private JtextArea_model jtextAreaModel ;
    private JTextArea jTextArea_vanBan;
    private JTextField jTextField_tuKoa;
    private JLabel jLabel_ketQua;

    public JtextArea_view() throws HeadlessException {
        this.jtextAreaModel = new JtextArea_model() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Tim kiem");
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font =  new Font("Arial", Font.BOLD,40) ;


        JLabel jLabel_vanBan = new JLabel("Văn bản");
        jLabel_vanBan.setFont(font);
         jTextArea_vanBan = new JTextArea(50,50);
        jTextArea_vanBan.setFont(font);



          //footer
        JtextArea_controller  ac = new JtextArea_controller(this)  ;

        JLabel jLabel_tukhoa = new JLabel("Từ khóa");
        jLabel_tukhoa.setFont(font);
        jTextField_tuKoa = new JTextField();
        jTextField_tuKoa.setFont(font);



        JButton jButton_thongke = new JButton("Thống kê") ;
        jButton_thongke.setFont(font);
        jButton_thongke.addActionListener(ac);
        jButton_thongke.setBackground(Color.BLUE);

         jLabel_ketQua = new JLabel() ;
         jLabel_ketQua.setFont(font);
         jLabel_ketQua.setOpaque(true);
         jLabel_ketQua.setBackground(Color.YELLOW);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2,2));
        jPanel_footer.add(jLabel_tukhoa);
        jPanel_footer.add(jTextField_tuKoa);
        jPanel_footer.add(jButton_thongke);
        jPanel_footer.add(jLabel_ketQua);



        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jTextArea_vanBan, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
    }
    public void timkiem(){
        this.jtextAreaModel.setVanBan(jTextArea_vanBan.getText());
        this.jtextAreaModel.setTuKhoa(jTextField_tuKoa.getText());
        this.jtextAreaModel.timkiem();
        this.jLabel_ketQua.setText(this.jtextAreaModel.getKetQua());
    }
}
