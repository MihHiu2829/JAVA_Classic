package FOnt.MVC_2.controller;

import FOnt.MVC_2.view.Footer_view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class footer_controller implements ActionListener {
     private Footer_view footer_view ;
    private       String tmp  = "" ;
    public footer_controller(Footer_view footer_view) {
        this.footer_view = footer_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand() ;
        if(src.equalsIgnoreCase("1"))
        {
            footer_view.footer_1();
            tmp += src;
        }
       else if(src.equalsIgnoreCase("2"))
        {
            footer_view.footer_2();
            tmp += src ;
        }
       else if(src.equalsIgnoreCase("3"))
        {
            footer_view.footer_3();
            tmp += src ;
        }

        else if(src.equalsIgnoreCase("4"))
        {
            tmp += src ;
            footer_view.footer_4();
        }
        else if(src.equalsIgnoreCase("Show number")) {
            footer_view.FiLL(tmp);
            tmp = "";
        }
    }
}
