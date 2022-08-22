package MVC_3.Controller;

import MVC_3.View.Counter_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter_controller implements ActionListener {
    private Counter_view ctv ;

    public Counter_controller(Counter_view ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("Ban vua nhan nut! ");
             String str = e.getActionCommand() ;
        System.out.println("Ban da nhan nut "+ str);
        if(str.equals("UP")){
            this.ctv.increment();
        }else if(str.equals("DOWN"))
            this.ctv.decrement();
        else if(str.equalsIgnoreCase("RESET"))
            this.ctv.reset();
    }
}
