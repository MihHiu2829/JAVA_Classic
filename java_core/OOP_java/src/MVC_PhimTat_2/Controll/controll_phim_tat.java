package MVC_PhimTat_2.Controll;

import MVC_PhimTat_2.View.view_phim_tat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controll_phim_tat implements ActionListener {
    private view_phim_tat view_phim_tat;

    public controll_phim_tat(MVC_PhimTat_2.View.view_phim_tat view_phim_tat) {
        this.view_phim_tat = view_phim_tat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand()  ;
       if(src.equalsIgnoreCase("Exit"))
            System.exit(0);
       else view_phim_tat.setText_jlabel("Ban vua nhan nut "+ src);
    }
}
