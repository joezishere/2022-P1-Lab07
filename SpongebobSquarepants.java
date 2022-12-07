import java.awt.*;
import java.applet.*;

public class SpongebobSquarepants extends Applet {

    public void paint(Graphics g ){

        House.drawPineapple(g);
        House.drawCrown(g);

        Sponge.drawBody(g);
        Sponge.drawHoles(g);
        Sponge.drawEyes(g);
        Sponge.drawMouth(g);

        Pants.drawPant(g);
        Pants.drawBelt(g);
        Pants.drawTie(g);



    }


}
