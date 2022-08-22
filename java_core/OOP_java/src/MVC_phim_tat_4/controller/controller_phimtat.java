package MVC_phim_tat_4.controller;

import MVC_phim_tat_4.view.view_phimtat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller_phimtat implements ActionListener {
    private view_phimtat view_phimtat;

    public controller_phimtat(MVC_phim_tat_4.view.view_phimtat view_phimtat) {
        this.view_phimtat = view_phimtat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String src = e.getActionCommand() ;
            if(src.equalsIgnoreCase("Exit"))
                 System.exit(0) ;
            else this.view_phimtat.setText_view(src);
    }
}
