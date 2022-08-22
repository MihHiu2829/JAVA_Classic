package FOnt.MVC_3.controller;

import FOnt.MVC_3.model.model_footer;
import FOnt.MVC_3.view.view_footer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class controller_footer implements ActionListener {
    private view_footer viewFooter;

    public controller_footer(view_footer viewFooter) {
        this.viewFooter = viewFooter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String src = e.getActionCommand() ;
       if(src.equalsIgnoreCase("1"))
           this.viewFooter.mot();
        if(src.equalsIgnoreCase("2"))
            this.viewFooter.hai();
        if(src.equalsIgnoreCase("3"))
            this.viewFooter.ba();
        if(src.equalsIgnoreCase("4"))
            this.viewFooter.bon();
     }

    }

