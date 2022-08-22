package MVC_color_2.controller;

import MVC_color_2.View.view_color;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controll_color implements ActionListener {
    private view_color viewColor ;

    public controll_color(view_color viewColor) {
        this.viewColor = viewColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          String src = e.getActionCommand() ;
          if(src.equalsIgnoreCase("to red")){
                       this.viewColor.changeText(Color.RED);
          }
        if(src.equalsIgnoreCase("to green")){
            this.viewColor.changeText(Color.GREEN);
        }
        if(src.equalsIgnoreCase("to yellow")){
            this.viewColor.changeText(Color.YELLOW);
        }
        if(src.equalsIgnoreCase("to violer")){
            this.viewColor.changeText(Color.MAGENTA);
        }
        if(src.equalsIgnoreCase("Yellow")){
            this.viewColor.changeBackground(Color.ORANGE);
        }
        if(src.equalsIgnoreCase("While"))
            this.viewColor.changeBackground(Color.WHITE);
        if(src.equalsIgnoreCase("green"))
            this.viewColor.changeBackground(Color.green);
        if(src.equalsIgnoreCase("Reset")){
            this.viewColor.changeBackground(Color.WHITE);
            this.viewColor.changeText(Color.BLACK);
        }


    }
}
