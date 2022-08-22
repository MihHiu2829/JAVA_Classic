package MVC_color_2.Model;

import java.awt.*;

public class model_color {
    private Color   color_background ;
    private Color color_fbreground ;
    private boolean opaque ;
    public model_color(){
        color_background = Color.white ;
        color_fbreground = Color.black ;
        this.opaque = true ;
    }

    public Color getColor_background() {
        return color_background;
    }

    public void setColor_background(Color color_background) {
        this.color_background = color_background;
    }

    public Color getColor_fbreground() {
        return color_fbreground;
    }

    public void setColor_fbreground(Color color_fbreground) {
        this.color_fbreground = color_fbreground;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }
}
