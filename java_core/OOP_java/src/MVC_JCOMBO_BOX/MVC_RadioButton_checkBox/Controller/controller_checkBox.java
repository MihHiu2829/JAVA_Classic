package MVC_JCOMBO_BOX.MVC_RadioButton_checkBox.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class controller_checkBox implements ActionListener {
    private MVC_JCOMBO_BOX.MVC_RadioButton_checkBox.View.view_checkBox view_checkBox ;

    public controller_checkBox(MVC_JCOMBO_BOX.MVC_RadioButton_checkBox.View.view_checkBox view_checkBox) {
        this.view_checkBox = view_checkBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Enumeration<AbstractButton> buttons_monChin =  view_checkBox.buttonGroup_monChinh.getElements() ;
      String monChinh = "" ;
        while(buttons_monChin.hasMoreElements()){

            AbstractButton b = buttons_monChin.nextElement() ;
            if(b.isSelected())
            {
                monChinh = b.getText() ;
            }
        }
        String monPhu = "" ;
        for(AbstractButton g : view_checkBox.list_buttonGroup_MonPhu ){
            if(g.isSelected())
            {
                monPhu = monPhu + ";  " + g.getText() ;
            }
        }

//        Enumeration<AbstractButton> buttons_monPhu =  view_checkBox.buttonGroup_monChinh.getElements() ;
//
//        while(buttons_monPhu.hasMoreElements()){
//            AbstractButton b = buttons_monPhu.nextElement() ;
//            if(b.isSelected())
//            {
//                monPhu = monPhu + ";  " + b.getText() ;
//            }
//        }

        view_checkBox.model_CB.setLuachon_MonCHinh(monChinh);
        view_checkBox.model_CB.setLuachon_MonPhu(monPhu);
        view_checkBox.model_CB.tinhTongTien();
        view_checkBox.hienthiKetQua();

    }
}
