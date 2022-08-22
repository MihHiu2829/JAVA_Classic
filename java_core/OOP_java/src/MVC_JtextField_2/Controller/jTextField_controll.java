package MVC_JtextField_2.Controller;

import MVC_JtextField_2.View.jTextField_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jTextField_controll implements ActionListener {
    private String src_2nd ;
    private jTextField_view jTextField_view  ;

    public jTextField_controll(MVC_JtextField_2.View.jTextField_view jTextField_view) {
        this.jTextField_view = jTextField_view;
    }

    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("+"))
            this.jTextField_view.plus();
        if (src.equals("-"))
            this.jTextField_view.minus();
        if (src.equals("*"))
            this.jTextField_view.multiply();
        if (src.equals("/"))
            this.jTextField_view.divide();
        if (src.equals("^"))
            this.jTextField_view.pow();
        if (src.equals("%"))
            this.jTextField_view.mod();
        if (src.equals("Push"))
            this.jTextField_view.push();
        if (src.equals("Repeat")) {
            this.jTextField_view.push_up();
            if (src_2nd.equals("+"))
                this.jTextField_view.plus();
            if (src_2nd.equals("-"))
                this.jTextField_view.minus();
            if (src_2nd.equals("*"))
                this.jTextField_view.multiply();
            if (src_2nd.equals("/"))
                this.jTextField_view.divide();
            if (src_2nd.equals("^"))
                this.jTextField_view.pow();
            if (src_2nd.equals("%"))
                this.jTextField_view.mod();
            if (src_2nd.equals("Push"))
                this.jTextField_view.push();
        }
        if (src.compareTo("Repeat") != 0){
               src_2nd = src;
        }
    }
}
