package FOnt.MVC_4.controller;

import FOnt.MVC_4.view.view_fonter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller_fonter implements ActionListener {
    private view_fonter ctv ;

    public controller_fonter(view_fonter ctv) {
        this.ctv = ctv ;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      String src = e.getActionCommand() ;
      if(src.equalsIgnoreCase("1"))
                       this.ctv.PRINTFs(src);
        if(src.equalsIgnoreCase("2"))
            this.ctv.PRINTFs(src);
        if(src.equalsIgnoreCase("3"))
            this.ctv.PRINTFs(src);
        if(src.equalsIgnoreCase("4"))
            this.ctv.PRINTFs(src);
    }
}
