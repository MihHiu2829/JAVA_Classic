package MVC_Menu_2.Controll;

import MVC_Menu_2.View.MenuBar_example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar_Controller implements ActionListener {
    private MenuBar_example menuBar_example ;

    public MenuBar_Controller(MenuBar_example menuBar_example) {
        this.menuBar_example = menuBar_example;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand() ;
        if(button.equalsIgnoreCase("Open")) {
            this.menuBar_example.setTextJLabel("BẠN VỪA BẤM VÀO Open");
        }
        if(button.equalsIgnoreCase("Exit")) {
            this.menuBar_example.setTextJLabel("BẠN VỪA BẤM VÀO Exit");
            System.exit(0);
        }
        if(button.equalsIgnoreCase("Contract")) {
            this.menuBar_example.setTextJLabel("BẠN VỪA BẤM VÀO Contract");
        }
    }
}
