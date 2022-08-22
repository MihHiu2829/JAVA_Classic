package MVC_Jtext_Area_2.View;

import MVC_Jtext_Area_2.Controller.jTextArea_controller;
import MVC_Jtext_Area_2.Model.jTextArea_model;

import javax.swing.*;
import java.awt.*;

public class jTextArea_view extends JFrame {
    private jTextArea_model jml ;
    private JTextArea jTextArea_Text ;
    private JTextField jTextField_Keyword ;
    private JLabel jLabel_ketqua;

    public jTextArea_view() throws HeadlessException {
        this.jml = new jTextArea_model() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Thống kê từ! ");
        this.setSize(1280,720 )  ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Times New Roman",Font.PLAIN,30);
        jTextArea_controller ac = new jTextArea_controller(this);

        JLabel jLabel_vanBan = new JLabel("Văn bản:") ;
        jLabel_vanBan.setFont(font);
        jTextArea_Text = new JTextArea(25,25);
        jTextArea_Text.setFont(font);
//        JPanel jPanel_text = new JPanel();
//        jPanel_text.setLayout(new GridLayout(2,1));
//        jPanel_text.add(jLabel_vanBan) ;
//        jPanel_text.add(jTextArea_Text) ;

        JLabel jLabel_tuKhoa = new JLabel("Từ khóa:") ;
        jLabel_tuKhoa.setFont(font);
        jTextField_Keyword = new JTextField();
        jTextField_Keyword.setFont(font);

        JButton jButton_thongKe = new JButton("Thống kê");
        jButton_thongKe.setBackground(Color.cyan);
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(ac);

         jLabel_ketqua = new JLabel();
        jLabel_ketqua.setFont(font);



        JPanel jPanel_keyWord = new JPanel();
        jPanel_keyWord.setLayout(new GridLayout(2,2));
        jPanel_keyWord.add(jLabel_tuKhoa) ;
        jPanel_keyWord.add(jTextField_Keyword) ;
        jPanel_keyWord.add(jButton_thongKe);
        jPanel_keyWord.add(jLabel_ketqua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan,BorderLayout.NORTH);
        this.add(jTextArea_Text,BorderLayout.CENTER);
        this.add(jPanel_keyWord,BorderLayout.SOUTH);
    }
    public void timkiem(){
        this.jml.setVanBan(this.jTextArea_Text.getText());
        this.jml.setTuKhoa(this.jTextField_Keyword.getText());
        this.jml.timkiem();
        this.jLabel_ketqua.setText(this.jml.getKetQua());
    }
}
