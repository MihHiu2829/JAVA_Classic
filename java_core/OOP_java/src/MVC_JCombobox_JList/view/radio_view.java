package MVC_JCombobox_JList.view;

import MVC_JCombobox_JList.controller.radio_controller;
import MVC_JCombobox_JList.model.radio_model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class radio_view extends JFrame {
    public final ButtonGroup buttonGroup_monAnChinh;
    public final ArrayList<JCheckBox> list_MonPhu;
    private final JLabel jLabel_bill;
    public radio_model radio_model = new radio_model() ;
    public radio_view(){
        this.setTitle("Thiet ke menu ban do an! ");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        Font font = new Font("Arial",Font.BOLD,12) ;
        Font font_select = new Font("Arial",Font.BOLD,40) ;
        ActionListener ac = new radio_controller(this) ;

        JRadioButton jRadioButton_com =  new JRadioButton("Com") ;
        jRadioButton_com.setFont(font_select);
        JRadioButton jRadioButton_pho =  new JRadioButton("Pho") ;
        jRadioButton_pho.setFont(font_select);
        JRadioButton jRadioButton_banhMi =  new JRadioButton("Banh Mi") ;
        jRadioButton_banhMi.setFont(font_select);

         buttonGroup_monAnChinh = new ButtonGroup() ;
        buttonGroup_monAnChinh.add(jRadioButton_com);
        buttonGroup_monAnChinh.add(jRadioButton_pho);
        buttonGroup_monAnChinh.add(jRadioButton_banhMi);

        JPanel jPanel_center = new JPanel(new GridLayout(2 ,1));
        JPanel jPanel_monChinh = new JPanel(new GridLayout(1,3)) ;
        jPanel_monChinh.add(jRadioButton_com);
        jPanel_monChinh.add(jRadioButton_pho);
        jPanel_monChinh.add(jRadioButton_banhMi);

       JCheckBox jCheckBox_traSua = new JCheckBox("Tra sua");
       jCheckBox_traSua.setFont(font_select);
       JCheckBox jCheckBox_coCa = new JCheckBox("Co ca");
        jCheckBox_coCa.setFont(font_select);
        JCheckBox jCheckBox_banhNgot = new JCheckBox("Banh ngot");
        jCheckBox_banhNgot.setFont(font_select);
        JCheckBox jCheckBox_iceCream = new JCheckBox("Kem");
        jCheckBox_iceCream.setFont(font_select);

        list_MonPhu = new ArrayList<JCheckBox>() ;
        list_MonPhu.add(jCheckBox_traSua) ;
        list_MonPhu.add(jCheckBox_coCa) ;
        list_MonPhu.add(jCheckBox_banhNgot) ;
        list_MonPhu.add(jCheckBox_iceCream) ;

        JPanel jPanel_monPhu = new JPanel(new GridLayout(2,2));
        jPanel_monPhu.add(jCheckBox_coCa);
        jPanel_monPhu.add(jCheckBox_traSua);
        jPanel_monPhu.add(jCheckBox_banhNgot);
        jPanel_monPhu.add(jCheckBox_iceCream);

        jPanel_center.add(jPanel_monChinh) ;
        jPanel_center.add(jPanel_monPhu);

        JButton jButton_thanh_toan = new JButton("Thanh Toan")  ;
        jButton_thanh_toan.setFont(font_select);
        jButton_thanh_toan.addActionListener(ac);
         jLabel_bill = new JLabel() ;
        jLabel_bill.setFont(font);

        JPanel jPanel_funtion = new JPanel(new GridLayout(1,2)) ;
        jPanel_funtion.add(jLabel_bill) ;
        jPanel_funtion.add(jButton_thanh_toan) ;




        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_funtion,BorderLayout.SOUTH) ;


        this.setVisible(true);
    }

    public void hienthiketqua() {
        String kq = "Mon chinh: " + this.radio_model.getMonAnChinh()
                  + " Mon Phu: " + this.radio_model.getMonAnPhu()
                +  " Tong tien: " + this.radio_model.getTongTien() ;
        jLabel_bill.setText(kq);
    }
}
