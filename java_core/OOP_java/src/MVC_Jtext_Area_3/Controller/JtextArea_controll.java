package MVC_Jtext_Area_3.Controller;

import MVC_Jtext_Area_3.View.JtextArea_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JtextArea_controll implements ActionListener {
    private JtextArea_view jtextAreaView ;


    public JtextArea_controll (JtextArea_view jtextAreaView) {
        this.jtextAreaView = jtextAreaView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            this.jtextAreaView.statistics();
    }
}
