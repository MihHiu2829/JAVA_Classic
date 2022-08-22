package MVC_Jtext_Area_2.Controller;

import MVC_Jtext_Area_2.View.jTextArea_view;

import javax.accessibility.AccessibleAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jTextArea_controller implements ActionListener {
    private jTextArea_view jTextAreaView ;

    public jTextArea_controller(jTextArea_view jTextAreaView) {
        this.jTextAreaView = jTextAreaView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                this.jTextAreaView.timkiem();
    }
}
