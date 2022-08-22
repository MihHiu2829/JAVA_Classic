package MVC_phim_tat_3.Controller;

import MVC_phim_tat_3.View.view_phim_tat;

import javax.swing.*;
import java.awt.event.*;

public class controller_phim_tat implements ActionListener, MouseListener, MouseMotionListener {
    private view_phim_tat view_phim_tat ;

    public controller_phim_tat(MVC_phim_tat_3.View.view_phim_tat view_phim_tat) {
        this.view_phim_tat = view_phim_tat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand() ;
         if(src.equals("Dont exit! "))
               System.exit(0);
         else view_phim_tat.setTExt_jlabel("Ban vua nhan nut "+ src );
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger()){
                    this.view_phim_tat.jPopupMenu.show(e.getComponent(),e.getX(),e.getY()) ;
                }
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

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
