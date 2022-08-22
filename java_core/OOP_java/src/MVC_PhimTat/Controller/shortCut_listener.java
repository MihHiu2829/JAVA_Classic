package MVC_PhimTat.Controller;

import MVC_PhimTat.View.shortCut;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shortCut_listener implements ActionListener {
    private shortCut shortCut ;

    public shortCut_listener(MVC_PhimTat.View.shortCut shortCut) {
        this.shortCut = shortCut;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand() ;
        if(src.equals("Open"))
            shortCut.setTextJlabel("Ban vua nhan nut open");
        if(src.equals("Close"))
            shortCut.setTextJlabel("Ban vua nhan nut Close");
        if(src.equals("Display file"))
            shortCut.setTextJlabel("Ban vua nhan nut hien thi file ra man hinh");
        if(src.equals("Exit on clsoe"))
            shortCut.setTextJlabel("Ban vua nhan nut thoat ra man hinh nhma fake nka :))) ");
        if(src.equals("fake"))
            System.exit(3);
        else this.shortCut.setTextJlabel("Ban da nhan "+ src);
    }
}
