package MVC_2.Controller;

import MVC_2.View.Counter_View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter_controller implements ActionListener {
    private Counter_View ctv ;

    public Counter_controller(Counter_View ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand() ;
       if(src.equals("UP")){
           this.ctv.increment();
       }else if(src.equals("DOWN"))
           this.ctv.decrement();
    }
}
