package MVC_4.Controller;

import MVC.controller.CounterListener;
import MVC_4.View.Counter_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter_Listener implements ActionListener {
     private Counter_view ctv ;
     public Counter_Listener(Counter_view ctv){
         this.ctv = ctv ;
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand() ;
        if(src.equalsIgnoreCase("UP"))
             this.ctv.Increment();
        else if (src.equalsIgnoreCase("DOWN"))
            this.ctv.Decrement();
        else if (src.equalsIgnoreCase("reset"))
             this.ctv.reset() ;
    }
}
