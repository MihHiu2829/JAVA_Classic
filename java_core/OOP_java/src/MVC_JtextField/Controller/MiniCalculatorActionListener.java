package MVC_JtextField.Controller;

import MVC_JtextField.View.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorActionListener implements ActionListener {
    private MiniCalculatorView miniCalculatorView ;

    public MiniCalculatorActionListener(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if(button.equals("+")){
                this.miniCalculatorView.plus() ;
            }else if(button.equals("-"))
                        this.miniCalculatorView.minus();
            else if(button.equals("*"))
                        this.miniCalculatorView.multiply();
            else if(button.equals("/"))
                this.miniCalculatorView.divide();
            else if(button.equals("^"))
                this.miniCalculatorView.power();
            else if(button.equals("%"))
                this.miniCalculatorView.mod();
    }

}
