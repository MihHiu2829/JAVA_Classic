package MVC_JCombobox_JList.controller;

import MVC_JCombobox_JList.view.radio_view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class radio_controller implements ActionListener {
    private radio_view radio_view  ;


    public radio_controller(MVC_JCombobox_JList.view.radio_view radio_view) {
        this.radio_view = radio_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Enumeration<AbstractButton> buttons_monCHin = radio_view.buttonGroup_monAnChinh.getElements() ;
        String monChinh = "" ;
        while(buttons_monCHin.hasMoreElements())
        {
            AbstractButton b = buttons_monCHin.nextElement() ;
            if(b.isSelected())
            {
                monChinh = b.getText() ;
            }
        }
        String monPhu = "" ;
        for(AbstractButton b : radio_view.list_MonPhu){
            if(b.isSelected())
            {
                monPhu = monPhu + " ; " + b.getText() ;
            }
        }

        radio_view.radio_model.setMonAnChinh(monChinh);
        radio_view.radio_model.setMonAnPhu(monPhu);
        radio_view.radio_model.TinhTongTien();
        radio_view.hienthiketqua() ;
    }
}
