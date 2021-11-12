package threeteams;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 *
 * @author  Yash Khanduja, 000826385
 *
 *
 */

public class Head {
    /**
     * Constructor for head
     *
     * @param x  top left x coordinate of the player
     * @param y  top left y coordinate of the player
     */
    private double x, y;
    public Head(double x,double y){
        this.x=x;
        this.y=y;
    }


    public void draw(GraphicsContext gc) {
        //setting the head color to black
        gc.setFill(Color.BLACK);
        // drawing the head rectangle
        gc.fillRect(x+25, y, 30, 30);
        //drawing the neck part
        gc.fillRect(x+7.5+25, y+30, 15,10 );
    }

}

