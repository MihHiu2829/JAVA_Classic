package MVC_JscrollArea.Controller;

import MVC_JscrollArea.View.view_SrcollPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controll_ScrollPanel implements ActionListener {
    private view_SrcollPanel view_srcollPanel ;

    public controll_ScrollPanel(view_SrcollPanel view_srcollPanel) {
        this.view_srcollPanel = view_srcollPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           this.view_srcollPanel.Timkiem();
    }
}
