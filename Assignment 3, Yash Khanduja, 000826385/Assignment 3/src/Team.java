
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

public class Team {

    /**
     * X and Y location of top left of player
     */
    private double x, y;
    //name of the team
    private String name;
    // team players
    private Player player1,player2,player3;


    /**
     * Constructor for refree
     *
     * @param x  top left x coordinate of the first player
     * @param y  top left y coordinate of the players
     * @param color the color team player
     * @param name of the team
     */
    public Team(double x, double y,String name,Color color){
        this.x=x;
        this.y=y;
        this.name=name;
        //creating 3 player from start point in left to right direction
        player1=new Player(x,y,color);
        player2=new Player(x+100,y,color);
        player3=new Player(x+200,y,color);
    }
    /**
     * @param gc the graphic context to draw three player on canvas
     */
    public void draw(GraphicsContext gc) {
        //drawing the players
        player1.draw(gc);
        player2.draw(gc);
        player3.draw(gc);
        //calculating average score
        double avg=(player1.getAverage()+player2.getAverage()+player3.getAverage())/3;
        //displaying average score and team name
        gc.fillText(this.name+"(Team Average "+avg+")", x, y+38+65+20);
    }


}
