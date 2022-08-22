package MVC_RadioButton_checkBox.View;

import MVC_RadioButton_checkBox.Controller.controller_checkBox;
import MVC_RadioButton_checkBox.Model.model_checkBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class view_checkBox extends JFrame {
     public JList<String> jList_MonPhu;
    public  ArrayList<JCheckBox> list_buttonGroup_MonPhu ;
    public  JComboBox<String> jComboBox_MonChinh;
    public  JRadioButton jRadioButton_com;
    public JRadioButton jRadioButton_pho;
    public JRadioButton jRadioButton_banhMi;
    public JCheckBox jCheckBox_nem;
    public JCheckBox jCheckBox_TraSua;
    public JCheckBox jCheckBox_CoCa;
    public JCheckBox jCheckBox_banhNgot;
    public ButtonGroup buttonGroup_monChinh;
//    public ButtonGroup buttonGroup_MonPhu;
    public JLabel jLabel_thongTin;
    public model_checkBox model_CB = new model_checkBox() ;
    public view_checkBox(){
        this.setTitle("Thuc don");
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        Font font = new Font("Arial", Font.BOLD,40);
        Font font_2 = new Font("Arial", Font.BOLD,10);


        JLabel header = new JLabel("Thuc don nha hang TITV") ;
        header.setFont(font);

        JPanel jPanel_tieude = new JPanel() ;
        jPanel_tieude.add(header);
        this.add(jPanel_tieude,BorderLayout.NORTH);


        JPanel jPanel_MonChinh = new JPanel() ;
        jPanel_MonChinh.setLayout(new FlowLayout());
        String[] cacMonChinh = new String[] {"com","pho","banh mi"} ;
        jComboBox_MonChinh = new JComboBox<String>(cacMonChinh)  ;
        jPanel_MonChinh.add(jComboBox_MonChinh) ;
////         jRadioButton_com = new JRadioButton("com");
////        jRadioButton_com.setFont(font);
////        jRadioButton_com.setForeground(Color.GREEN);
////         jRadioButton_pho = new JRadioButton("pho");
////        jRadioButton_pho.setFont(font);
////         jRadioButton_banhMi = new JRadioButton("banh mi");
////        jRadioButton_banhMi.setFont(font);
//         buttonGroup_monChinh = new ButtonGroup() ;
//        buttonGroup_monChinh.add(jRadioButton_com);
//        buttonGroup_monChinh.add(jRadioButton_banhMi);
//        buttonGroup_monChinh.add(jRadioButton_pho);
//        jPanel_MonChinh.add(jRadioButton_com);
//        jPanel_MonChinh.add(jRadioButton_banhMi);
//        jPanel_MonChinh.add(jRadioButton_pho);


        JPanel jPanel_MonPhi = new JPanel() ;
        jPanel_MonPhi.setLayout(new GridLayout(2,2));

        String[] cacMonPhu = new String[] {"Tra sua","Co ca","banh ngot","Nem"} ;
        jList_MonPhu = new JList<String>(cacMonPhu) ;
        jList_MonPhu.setFont(font);
        jPanel_MonPhi.add(jList_MonPhu) ;
//        jCheckBox_TraSua = new JCheckBox("Tra sua");
//        jCheckBox_TraSua.setFont(font);
//         jCheckBox_CoCa = new JCheckBox("Co ca");
//        jCheckBox_CoCa.setFont(font);
//         jCheckBox_banhNgot = new JCheckBox("banh ngot");
//        jCheckBox_banhNgot.setFont(font);
//         jCheckBox_nem = new JCheckBox("Nem");
//        jCheckBox_nem.setFont(font);
//         list_buttonGroup_MonPhu = new ArrayList<JCheckBox>() ;
//        list_buttonGroup_MonPhu.add(jCheckBox_TraSua);
//        list_buttonGroup_MonPhu.add(jCheckBox_CoCa);
//        list_buttonGroup_MonPhu.add(jCheckBox_banhNgot);
//        list_buttonGroup_MonPhu.add(jCheckBox_nem);
//
//        jPanel_MonPhi.add(jCheckBox_TraSua);
//        jPanel_MonPhi.add(jCheckBox_CoCa);
//        jPanel_MonPhi.add(jCheckBox_banhNgot);
//        jPanel_MonPhi.add(jCheckBox_nem);




        JPanel jPanel_luachon = new JPanel();
        jPanel_luachon.setLayout(new GridLayout(2,1));
        jPanel_luachon.add(jPanel_MonChinh)  ;
        jPanel_luachon.add(jPanel_MonPhi)  ;
        this.add(jPanel_luachon,BorderLayout.CENTER) ;

        JPanel jPanel_thanhtoan = new JPanel();
        jPanel_thanhtoan.setLayout(new GridLayout(1,2));
         jLabel_thongTin = new JLabel() ;
        jLabel_thongTin.setFont(font_2);

        ActionListener ac = new controller_checkBox(this);

        JButton jButton_thanhtoan = new JButton("Thanh Toan");
        jButton_thanhtoan.setFont(font);
        jPanel_thanhtoan.add(jLabel_thongTin);
        jPanel_thanhtoan.add(jButton_thanhtoan);
        jButton_thanhtoan.addActionListener(ac);

        this.add(jPanel_thanhtoan,BorderLayout.SOUTH) ;

        this.setVisible(true);
    }

    public void hienthiKetQua() {
        String kq ="Mon chinh: " + this.model_CB.getLuachon_MonCHinh()
                + "  Mon phu: "+ this.model_CB.getLuachon_MonPhu()
                + " Tong tien: " + this.model_CB.getTongTien() ;
        this.jLabel_thongTin.setText(kq);
    }
}
