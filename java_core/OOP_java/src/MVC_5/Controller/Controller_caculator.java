package MVC_5.Controller;

        import MVC_5.View.View_caculator;

        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Controller_caculator implements ActionListener {
    private View_caculator view_caculator ;

    public Controller_caculator(View_caculator view_caculator) {
        this.view_caculator = view_caculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
