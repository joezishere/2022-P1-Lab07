import java.awt.*;
import java.applet.*;
public class Sponge {
    public static void drawBody(Graphics g){
        g.setColor(new Color(251, 236, 93));
        g.fillRect(550, 400, 150, 250);

    }
    public static void drawHoles(Graphics g){
    g.setColor(new Color(244, 187, 68));
    g.fillOval(650, 400, 25, 25 );
    g.fillOval(560, 500, 25, 25 );
    g.fillOval(600, 450, 25, 25 );
    g.fillOval(600, 400, 25, 25 );
    g.fillOval(550, 600, 25, 25 );
    g.fillOval(600, 480, 25, 25 );
    g.fillOval(650, 475, 25, 25 );
    g.fillOval(600, 555, 25, 25 );
    }
    public static void drawEyes(Graphics g) {
        g.setColor(new Color(255, 255, 255));
        g.fillOval(550, 450, 50, 50);
        g.fillOval(650, 450, 50, 50);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(660, 460, 25, 25);
        g.fillOval(560, 460, 25, 25);

    }

    public static void drawMouth(Graphics g){
   g.drawLine(575,550,675 , 550);
   g.setColor(new Color(255, 255, 255));
   g.fillRect(600,551, 20, 30  );
   g.fillRect(625,551, 20, 30  );
    }
}
