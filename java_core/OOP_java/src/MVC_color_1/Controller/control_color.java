package MVC_color_1.Controller;

import MVC_color_1.View.view_color;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class control_color implements ActionListener {
    private view_color viewColor   ;

    public control_color(view_color viewColor) {
        this.viewColor = viewColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand() ;
        if(src.equalsIgnoreCase("to red"))
            this.viewColor.changeColorToText(Color.RED);
        if(src.equalsIgnoreCase("to blue"))
            this.viewColor.changeColorToText(Color.BLUE);
        if(src.equalsIgnoreCase("to yellow"))
            this.viewColor.changeColorToText(Color.YELLOW);
        if(src.equalsIgnoreCase("to while"))
            this.viewColor.changeColorToText(Color.WHITE);
        if(src.equalsIgnoreCase("to black"))
            this.viewColor.changeColorToText(Color.BLACK);
        if(src.equalsIgnoreCase("background to red"))
            this.viewColor.changeColorToBackGround(Color.RED);
        if(src.equalsIgnoreCase("background to blue"))
            this.viewColor.changeColorToBackGround(Color.BLUE);
        if(src.equalsIgnoreCase("background to yellow"))
            this.viewColor.changeColorToBackGround(Color.YELLOW);
        if(src.equalsIgnoreCase("background to while"))
            this.viewColor.changeColorToBackGround(Color.WHITE);
        if(src.equalsIgnoreCase("background to black"))
            this.viewColor.changeColorToBackGround(Color.BLACK);

    }
}
