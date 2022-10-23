import com.sun.media.sound.FFT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    Point p=new Point(200,200);
    Point p2 = new Point(50,50);
    Color c=new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
    Circle cir = new Circle(p,c,100);
    Rect rectan = new Rect(p2, c, 200,100);
    private Frame f;

    //constructor
    public Drawing() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE);
        setSize(400, 400);

    }

    public void paint(Graphics g) {
        cir.draw(g);
        rectan.draw(g);
    }

}