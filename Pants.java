import java.awt.*;
import java.applet.*;
public class Pants {
    public static void drawPant(Graphics g){
        g.setColor(new Color(123, 83, 0));
        g.fillRect(550, 575, 150, 75);

    }
    public static void drawBelt(Graphics g){
        g.setColor(new Color(0, 0, 0));
        g.fillRect(550, 575, 40, 10);
        g.fillRect(650, 575, 40, 10);
        g.fillRect(600, 575, 40, 10);
    }
    public static void drawTie(Graphics g){
        g.setColor(new Color(255, 2, 2));
        g.fillOval(610, 575, 20, 75);

    }

}
