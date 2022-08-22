package MVC_example_mouse_2.Controller;

import MVC_example_mouse_2.View.mouse_view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class mouse_controller implements MouseMotionListener, MouseListener {

    private mouse_view mouse_view ;

    public mouse_controller(MVC_example_mouse_2.View.mouse_view mouse_view) {
        this.mouse_view = mouse_view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouse_view.addClick();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
            this.mouse_view.enter();
            int x = e.getX() ;
            int y = e.getY() ;
            this.mouse_view.update(x,y);

    }

    @Override
    public void mouseExited(MouseEvent e) {
            this.mouse_view.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX() ;
        int y = e.getY() ;
        this.mouse_view.update(x,y);
    }
}
