package MVC_MENU_3.Controller;

import MVC_MENU_3.View.Menu_example_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_controller_example implements ActionListener {
    private Menu_example_view ac ;

    public Menu_controller_example(Menu_example_view ac) {
        this.ac = ac;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand()   ;
        if(button.equalsIgnoreCase("function 1"))
                 this.ac.setText_jlabel("U was enter funtion 1");
        if(button.equalsIgnoreCase("function 2"))
            this.ac.setText_jlabel("U was enter funtion 2");
        if(button.equalsIgnoreCase("function 3"))
            this.ac.setText_jlabel("U was enter funtion 3");
        if(button.equalsIgnoreCase("function 4"))
            this.ac.setText_jlabel("U was enter funtion 4");
        if(button.equalsIgnoreCase("function 5"))
            this.ac.setText_jlabel("U was enter funtion 5");
        if(button.equalsIgnoreCase("function 6"))
            this.ac.setText_jlabel("U was enter funtion 7");
        if(button.equalsIgnoreCase("Exit"))
            System.exit(0);

    }
}
