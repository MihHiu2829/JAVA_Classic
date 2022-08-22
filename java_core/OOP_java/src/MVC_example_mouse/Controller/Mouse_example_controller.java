package MVC_example_mouse.Controller;

import MVC_example_mouse.View.Mouse_example_view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse_example_controller implements MouseListener , MouseMotionListener {
    private Mouse_example_view mouse_example_view ;

    public Mouse_example_controller(Mouse_example_view mouse_example_view) {
        this.mouse_example_view = mouse_example_view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouse_example_view.addClick();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouse_example_view.enter();
        int x = e.getX() ;
        int y = e.getY();
        this.mouse_example_view.update(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
            this.mouse_example_view.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX() ;
        int y = e.getX() ;
        this.mouse_example_view.update(x,y);
    }
}
