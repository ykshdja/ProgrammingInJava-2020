package threeteams;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
 * Wheel of the player
 */

/**
 *
 *
 *
 *
 *
 * @author  Yash Khanduja, 000826385
 *
 *
 */
public class Wheel {
    /**
     * Constructor for head
     *
     * @param x  top left x coordinate of the player
     * @param y  top left y coordinate of the player
     */
    private double x, y;
    public Wheel(double x,double y){
        this.x=x;
        this.y=y;
    }
    /**
     * @param gc the graphic context to draw wheels for player on canvas
     */
    public void draw(GraphicsContext gc) {
        //wheel color
        gc.setFill(Color.BLACK);
        //creating the wheel
        gc.fillOval(x, y, 7, 60);
    }

}
