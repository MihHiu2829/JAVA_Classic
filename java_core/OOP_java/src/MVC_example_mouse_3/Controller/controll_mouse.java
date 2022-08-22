package MVC_example_mouse_3.Controller;

import MVC_example_mouse_3.Model.model_mouse;
import MVC_example_mouse_3.View.view_mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class controll_mouse implements MouseListener, MouseMotionListener {
    private view_mouse viewMouse ;

    public controll_mouse(view_mouse viewMouse) {
        this.viewMouse = viewMouse;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.viewMouse.addClick();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {
      this.viewMouse.enter();
    }

    @Override
    public void mouseExited(MouseEvent e) {
       this.viewMouse.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
     this.viewMouse.update(x,y) ;
    }
}
