/*
 * @author: Yash Khanduja, 000826385
 *
 *
 */
package TicTacToe;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Yash...
 */
public class CirclePiece extends TicTacToe.Piece {
    private Color color;
    public CirclePiece(int x,int y,Color color){
        super(x,y);
        this.color=color;
    }
    /**
     *To draw circle piece
     */
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.fillOval((x*200)+75,(y*200)+75, 48, 48);
        gc.setStroke(Color.BLACK);
        //to draw red border if piece is selected
        if(super.isSelected){
            gc.setStroke(Color.RED);
        }
        gc.strokeOval((x*200)+75,(y*200)+75, 48, 48);
    }





}
