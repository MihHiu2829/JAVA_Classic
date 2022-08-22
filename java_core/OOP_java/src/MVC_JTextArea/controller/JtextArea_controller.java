package MVC_JTextArea.controller;

import MVC_JTextArea.view.JtextArea_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JtextArea_controller implements ActionListener {
    private JtextArea_view jtextArea_view ;

    public JtextArea_controller(JtextArea_view jtextArea_view) {
        this.jtextArea_view = jtextArea_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         this.jtextArea_view.timkiem();
    }
}
