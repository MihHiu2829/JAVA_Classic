package MVC_6.Controller;

import MVC_6.View.counter_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class counter_controller implements ActionListener {
    private counter_view ctv ;

    public counter_controller(counter_view ctv) {
        this.ctv  = ctv ;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
         String src = e.getActionCommand()  ;
         if(src.equalsIgnoreCase("UP"))
                this.ctv.Increment();
         else if (src.equalsIgnoreCase("DOWN"))
             this.ctv.Decrement();
         else if (src.equalsIgnoreCase("RESET"))
             this.ctv.Reset();
    }
}
