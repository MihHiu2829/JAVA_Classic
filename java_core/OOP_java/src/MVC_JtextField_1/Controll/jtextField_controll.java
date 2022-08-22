package MVC_JtextField_1.Controll;

import MVC_JtextField_1.View.jtextField_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jtextField_controll implements ActionListener {
    private jtextField_view jtextField_view ;

    public jtextField_controll(MVC_JtextField_1.View.jtextField_view jtextField_view) {
        this.jtextField_view = jtextField_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String src = e.getActionCommand() ;
       if(src.equals("+"))
             jtextField_view.plus();
        if(src.equals("-"))
            jtextField_view.minus();
        if(src.equals("*"))
            jtextField_view.multiply();
        if(src.equals("/"))
            jtextField_view.divide();
        if(src.equals("^"))
            jtextField_view.pow();
        if(src.equals("%"))
            jtextField_view.mod();
    }
}
