package MVC_Menu.controller;

import MVC_Menu.View.MenuExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleController implements ActionListener {
    private  MenuExample menuExample ;

    public MenuExampleController(MenuExample menuExample) {
        this.menuExample = menuExample;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("Open")) {
            this.menuExample.setTextJlabel("Ban da click JmenuItem Open");
        } else if (button.equals("Exit")){
            this.menuExample.setTextJlabel("Ban da click JmenuItem Exit");
            System.exit(0); // ngat ngang khoi chuong trinh
        }

        if(button.equals("Welcone")){
            this.menuExample.setTextJlabel("Ban da clcik JmenuItem Welcome");
        }
    }
}
