package MVC_color.Controller;

import MVC_color.View.myColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myColorListener implements ActionListener {
          private myColorView myColorView ;

    public myColorListener(MVC_color.View.myColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src =  e.getActionCommand();
        if(src.equalsIgnoreCase("Red text")){
            this.myColorView.changeTextColor(Color.RED);
        }else if(src.equalsIgnoreCase("Yellow text")) {
            this.myColorView.changeTextColor(Color.YELLOW);
        }else if(src.equalsIgnoreCase("Green text")){
            this.myColorView.changeTextColor(Color.GREEN);
        }else if (src.equalsIgnoreCase("Red Background")){
            this.myColorView.changeBackgroundColor(Color.RED);
        }else if (src.equalsIgnoreCase("Yellow Background")){
            this.myColorView.changeBackgroundColor(Color.YELLOW);
        }else if (src.equalsIgnoreCase("Green Background")){
            this.myColorView.changeBackgroundColor(Color.GREEN);
        }
    }
}
