/*
 *
 *
 */
package TicTacToe;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Yash Khanduja, 000826385
 * @author Yash Khanduja, 000826385.
 */
public class SquarePiece extends TicTacToe.Piece {
    //to set color of piece
    private Color color;
    /**
     * Constructor Piece
     *
     * @param x  cell coordinate on the grid
     * @param y  cell coordinate on the grid
     * @param color of the piece
     */
    public SquarePiece(int x,int y,Color color){
        super(x,y);
        this.color=color;
    }

    /**
     * TO draw square piece
     */
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.setLineWidth(3);
        gc.fillRect((x*200)+75,(y*200)+75, 48, 48);
        gc.setStroke(Color.BLACK);
        //to draw red border if piece is selected
        if(super.isSelected){
            gc.setStroke(Color.RED);
        }
        gc.strokeRect((x*200)+75,(y*200)+75, 48, 48);
    }


}

