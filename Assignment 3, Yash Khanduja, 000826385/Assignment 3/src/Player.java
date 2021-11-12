
package threeteams;

import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


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
public class Player {

    /**
     * X and Y location of top left of player
     */
    private double x, y;
    /**
     * Average score for the player
     */
    private int average;
    /**
     * Color of the player body
     */
    private Color color;

    /**
     * Title for the player (only for referee player )
     */
    private String title;
    //player head
    private threeteams.Head head;
    //player side wheels
    private Wheel wheel1,wheel2;



    /**
     * Constructor for player
     *
     * @param x  top left coordinate of the player
     * @param y  top left coordinate of the player
     * @param color the color of player body
     */
    public Player(double x, double y,Color color){
        this.x=x;
        this.y=y;
        this.color=color;
        this.title="";
        //setting random score for the player
        Random rand=new Random();
        this.average=rand.nextInt(100)+1;
        head=new Head(x,y);
        wheel1=new Wheel(x,y+38);
        wheel2=new Wheel(x+73,y+38);

    }

    /**
     * Constructor for refree
     *
     * @param x  top left coordinate of the player
     * @param y  top left coordinate of the player
     * @param color the color of player body
     * @param title of the player
     */
    public  Player(double x, double y,Color color,String title){
        this.x=x;
        this.y=y;
        this.color=color;
        this.title=title;
        //score set to 100
        this.average=100;
        head=new Head(x,y);
        wheel1=new Wheel(x,y+38);
        wheel2=new Wheel(x+73,y+38);
    }
    /**
     * @return  average score of the player
     */
    public int getAverage(){
        return this.average;
    }
    /**
     * @param gc the graphic context to draw the player on canvas
     */
    public void draw(GraphicsContext gc) {
        //drawing player with team color
        gc.setFill(color);
        //drawing player body
        gc.fillOval(x+7.5, y+28+10, 65, 65);
        gc.setFill(Color.BLACK);
        //drawing player score
        gc.fillText(average+"", x+32.5, y+38+32.5);
        //drawing player text
        gc.fillText(title, x,y+38+65+10);
        //drawing player's head and side wheels
        head.draw(gc);
        wheel1.draw(gc);
        wheel2.draw(gc);
    }


}

