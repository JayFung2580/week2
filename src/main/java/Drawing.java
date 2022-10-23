import com.sun.media.sound.FFT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    Point p=new Point(200,200);
    Point p2 = new Point(50,50);

    Point p3 = new Point(125,125);
    Color c=new Color(0x5A123B);// The RGB number comprises three bytes: red, green and blue
    Circle cir = new Circle(p,c,100);
    Rect rectan = new Rect(p2, c, 200,100);

    Square sqr  = new Square(p3 ,c, 100,100);
    private Frame f;

    //constructor
    public Drawing() {
        setupFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setupCanvas();

    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }



    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        setupShapes(g);
    }

    private void setupShapes(Graphics g) {
        cir.draw(g);
        rectan.draw(g);
        sqr.draw(g);
    }

}