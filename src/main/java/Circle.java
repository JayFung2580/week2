import java.awt.*;

public class Circle {
    private int rad;	// Fields
    private Point pos;	// AWT class Point
    private Color col;     // AWT class Color

    public Circle(Point initPos, Color col, int radius){ // The constructor
        rad=radius;	// Initialize the fields of the object
        pos=initPos;
        this.col=col;
    }

    public void draw(Graphics g) {	// A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }

}
