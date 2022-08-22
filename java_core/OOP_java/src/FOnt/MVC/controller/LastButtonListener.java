package FOnt.MVC.controller;

import FOnt.MVC.view.lastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonListener implements ActionListener {
    private lastButtonView lastButtonView ;

    public LastButtonListener(FOnt.MVC.view.lastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        if (nguonSuKien.equalsIgnoreCase("1")) {
            this.lastButtonView.changeTo_1();
        } else if (nguonSuKien.equalsIgnoreCase("2"))
            this.lastButtonView.changeTo_2();
    else if(nguonSuKien.equalsIgnoreCase("3"))
        this.lastButtonView.changeTo_3();
     else if(nguonSuKien.equalsIgnoreCase("4"))
         this.lastButtonView.changeTo_4();
    }
    }
