package MVC_phim_tat_4.controller;

import MVC_phim_tat_4.view.view_phimtat;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class controoler_chuot implements MouseListener {
    private view_phimtat view_phimtat ;

    public controoler_chuot(MVC_phim_tat_4.view.view_phimtat view_phimtat) {
        this.view_phimtat = view_phimtat;

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if(e.isPopupTrigger())
            this.view_phimtat.jPopupMenu.show(e.getComponent(),e.getX(),e.getY());

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
