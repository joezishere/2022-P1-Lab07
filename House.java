import java.awt.*;
import java.applet.*;
public class House {
    public static void drawPineapple(Graphics g){
        g.setColor(new Color(0, 111, 255));
        g.fillRect(0,0,1000,650);
        g.setColor(new Color(255,172,28));
        g.fillOval(100, 100, 400, 1000);
        g.setColor(new Color(75, 75, 75));
        g.fillOval(250, 450, 200, 1000);
    }
    public static void drawCrown(Graphics g){
   g.setColor(new Color(34, 139, 34));
    g.fillOval(150, 100, 60, 200);
    g.fillOval(200, 75, 60, 200);
    g.fillOval(250, 50, 60, 200);
    g.fillOval(300, 75, 60, 200);
    g.fillOval(350, 100, 60, 200);
    }
}
