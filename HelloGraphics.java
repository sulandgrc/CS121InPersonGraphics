import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class HelloGraphics extends GraphicsProgram {

     //override means overwrite the run method in GraphicsProgram
    public void run() {
        // construct/create/instantiate a GLabel object
        // text, x, y
        GLabel myLabel = new GLabel("My awesome label", 100, 350);
        Color purple = new Color(128, 0, 128);
        myLabel.setColor(purple);
        myLabel.setFont("Helvetica-28");
        add(myLabel); // very important so it appears in window

        // construct/create/instantiate a GLine object
        GLine diagonal = new GLine(50, 50, 100, 350);
        diagonal.setColor(Color.RED);
        add(diagonal);
    
    
    }

    public static void main(String[] args) {
         HelloGraphics world = new HelloGraphics();
         world.start();
     

    }

}