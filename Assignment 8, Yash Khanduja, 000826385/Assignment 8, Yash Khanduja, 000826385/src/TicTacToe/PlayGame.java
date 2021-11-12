/*
 * @author : Yash Khanduja, 000826385.
 */
package TicTacToe;


import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Yash
 */
public class PlayGame extends Application {

    int turn=0;
    //to store the pieces for tic tac toe
    public static TicTacToe.Piece[][] board = new TicTacToe.Piece[3][3];
    public static Button addBtn,removeBtn;
    public static Label title,turnlbl,xlabel,ylabel;
    public static TextField xVal,yVal;
    @Override
    public void start(Stage stage) {

        Group root = new Group();
        Scene scene = new Scene(root,800,800);
        Canvas canvas = new Canvas(600, 600); // Set canvas Size in Pixels
        title=new Label("Tic Tac Toe Game");
        turnlbl=new Label("Player 1(Circle)");
        title.setFont(new Font("Arial", 24));
        addBtn=new Button("Add");
        addBtn.setLayoutX(200);
        addBtn.setLayoutY(50);

        removeBtn=new Button("Remove");
        removeBtn.setLayoutX(250);
        removeBtn.setLayoutY(50);

        xlabel=new Label("X:");
        xlabel.setLayoutX(50);
        xlabel.setLayoutY(50);
        ylabel=new Label("Y:");
        ylabel.setLayoutX(130);
        ylabel.setLayoutY(50);


        xVal=new TextField();
        xVal.setMaxWidth(30);
        xVal.setLayoutX(70);
        xVal.setLayoutY(50);
        yVal=new TextField();
        yVal.setLayoutX(150);
        yVal.setLayoutY(50);
        yVal.setMaxWidth(30);

        title.setLayoutX(50);
        title.setLayoutY(5);
        turnlbl.setLayoutX(350);
        turnlbl.setLayoutY(50);
        canvas.setLayoutX(100);
        canvas.setLayoutY(100);
        stage.setTitle("Connect 4"); // Set window title

        root.getChildren().add(canvas);
        root.getChildren().add(title);
        root.getChildren().add(turnlbl);
        root.getChildren().add(xlabel);
        root.getChildren().add(ylabel);
        root.getChildren().add(yVal);
        root.getChildren().add(xVal);
        root.getChildren().add(addBtn);
        root.getChildren().add(removeBtn);
        stage.setScene(scene);
        //to set background color of the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=null;

            }
        }

        drawBoard(gc);

        stage.show();
        //to add piece or select based on users click on the board
        canvas.setOnMouseClicked(event -> {

            int x=(int)(event.getX()/200);
            int y=(int)(event.getY()/200);
            System.out.println(event.getX()+" "+event.getY());
            System.out.println(x+" "+y);
            if(turn==1){
                if(board[x][y]==null){
                    board[x][y]=new SquarePiece(x,y,Color.GREEN);
                    turn=0;
                    turnlbl.setText("Player 1(Circle)");
                }else{
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(x==i && j==y){
                                board[i][j].setIsSelected(true);
                            }else{
                                if(board[i][j]!=null){
                                    board[i][j].setIsSelected(false);
                                }
                            }


                        }
                    }
                }
            }else{
                if(board[x][y]==null){
                    board[x][y]=new TicTacToe.CirclePiece(x,y,Color.BLUE);
                    turn=1;
                    turnlbl.setText("Player 2(Square)");
                }else{
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(x==i && j==y){
                                board[i][j].setIsSelected(true);
                            }else{
                                if(board[i][j]!=null){
                                    board[i][j].setIsSelected(false);
                                }
                            }


                        }
                    }
                }

            }
            drawBoard(gc);
        });


        //to add a piece
        EventHandler<ActionEvent> addBtnEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                int x,y;
                try{
                    x=Integer.parseInt(xVal.getText());
                    y=Integer.parseInt(yVal.getText());
                }catch(NumberFormatException ex){
                    new Alert(Alert.AlertType.WARNING, "Please enter with number for X and Y").showAndWait();
                    return;
                }

                if(x>2 ||x<0){
                    new Alert(Alert.AlertType.WARNING, "Please enter value between 0-2 for X").showAndWait();

                    return;
                }

                if(y>2 ||y<0){
                    new Alert(Alert.AlertType.WARNING, "Please enter value between 0-2 for Y").showAndWait();

                    return;
                }
                if(board[x][y]!=null){
                    new Alert(Alert.AlertType.WARNING, "Already has a piece").showAndWait();

                }else{
                    if(turn==1)
                    {
                        turn=0;
                        turnlbl.setText("Player 1(Circle)");
                        board[x][y]=new TicTacToe.SquarePiece(x,y,Color.GREEN);}
                    else{
                        turn=1;

                        turnlbl.setText("Player 2(Square)");
                        board[x][y]=new TicTacToe.CirclePiece(x,y,Color.BLUE);   }
                }

                drawBoard(gc);
            }

        };

        //to remove a piece
        EventHandler<ActionEvent> removeBtnEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                int x,y;
                try{
                    x=Integer.parseInt(xVal.getText());
                    y=Integer.parseInt(yVal.getText());
                }catch(NumberFormatException ex){
                    new Alert(Alert.AlertType.WARNING, "Please enter with number for X and Y").showAndWait();
                    return;
                }

                if(x>2 ||x<0){
                    new Alert(Alert.AlertType.WARNING, "Please enter value between 0-2 for X").showAndWait();

                    return;
                }

                if(y>2 ||y<0){
                    new Alert(Alert.AlertType.WARNING, "Please enter value between 0-2 for Y").showAndWait();
                    return;
                }


                if(board[x][y]!=null){
                    if(turn==1){
                        if(board[x][y] instanceof TicTacToe.SquarePiece){
                            board[x][y]=null;
                            turn=0;
                            turnlbl.setText("Player 1(Circle)");
                        }else{
                            new Alert(Alert.AlertType.WARNING, "Cannot remove other player piece").showAndWait();

                        }
                    }else{
                        if(board[x][y] instanceof TicTacToe.CirclePiece){
                            board[x][y]=null;
                            turn=1;
                            turnlbl.setText("Player 2(Square)");
                        }else{
                            new Alert(Alert.AlertType.WARNING, "Cannot remove other player piece").showAndWait();
                        }
                    }
                }else{
                    new Alert(Alert.AlertType.WARNING, "No piece to be removed remove other player piece").showAndWait();

                }
                drawBoard(gc);
            }
        };


        addBtn.setOnAction(addBtnEvent);
        removeBtn.setOnAction(removeBtnEvent);
    }

    /*
     * To draw the entire board  with pieces
     */
    public static void drawBoard(GraphicsContext gc){
        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0,600,600);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(4);
        //drawing the grid
        for(int i=0;i<=600;){

            gc.strokeLine(i,0,i,600);
            i=i+200;
        }

        for(int i=0;i<=600;){

            gc.strokeLine(0,i,600,i);
            i=i+200;
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if( board[i][j]!=null){
                    board[i][j].draw(gc);
                }
            }

        }
        checkWinnerSquare();
        checkWinnerCircle();
    }

    public static void checkWinnerSquare(){

        int inLine = 0;
        //row check
        for (int i = 0; i < board.length; i++) {
            inLine = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (null == board[i][j]) {
                    continue;
                }
                if (board[i][j] instanceof SquarePiece) {
                    inLine++;

                }

            }
            if (inLine == 3) {
                new Alert(Alert.AlertType.WARNING, "Player 2(Square) is the winner").showAndWait();
                return;
            }
        }
        //coloumn check
        for (int i = 0; i < board.length; i++) {
            inLine = 0;
            for (int j = 0; j < board.length; j++) {
                if (null == board[j][i]) {
                    continue;
                }
                if (board[j][i] instanceof TicTacToe.SquarePiece) {
                    inLine++;

                }

            }
            if (inLine == 3) {
                new Alert(Alert.AlertType.WARNING, "Player 2(Square) is the winner").showAndWait();
                return;
            }
        }
        //diagonal check
        if(board[0][0]!=null && board[1][1]!=null  && board[2][2]!=null){
            if (board[0][0] instanceof TicTacToe.SquarePiece) {
                new Alert(Alert.AlertType.WARNING, "Player 2(Square) is the winner").showAndWait();
                return;
            }
        }
        //diagonal check
        if(board[0][2]!=null && board[1][1]!=null  && board[2][0]!=null){
            if (board[0][2] instanceof TicTacToe.SquarePiece) {
                new Alert(Alert.AlertType.WARNING, "Player 2(Square) is the winner").showAndWait();
                return;
            }
        }





    }

    public static void checkWinnerCircle(){

        int inLine = 0;
        //row check
        for (int i = 0; i < board.length; i++) {
            inLine = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (null == board[i][j]) {
                    continue;
                }
                if (board[i][j] instanceof TicTacToe.CirclePiece) {
                    inLine++;

                }

            }
            if (inLine == 3) {
                new Alert(Alert.AlertType.WARNING, "Player 1(Circle) is the winner").showAndWait();
                return;
            }
        }
        //coloumn check
        for (int i = 0; i < board.length; i++) {
            inLine = 0;
            for (int j = 0; j < board.length; j++) {
                if (null == board[j][i]) {
                    continue;
                }
                if (board[j][i] instanceof TicTacToe.CirclePiece) {
                    inLine++;

                }

            }
            if (inLine == 3) {
                new Alert(Alert.AlertType.WARNING, "Player 1(Circle) is the winner").showAndWait();
                return;
            }
        }
        //diagonal check
        if(board[0][0]!=null && board[1][1]!=null  && board[2][2]!=null){
            if (board[0][0] instanceof TicTacToe.CirclePiece) {
                new Alert(Alert.AlertType.WARNING, "Player 1(Circle) is the winner").showAndWait();
                return;
            }
        }

        //diagonal check
        if(board[0][2]!=null && board[1][1]!=null  && board[2][0]!=null){
            if (board[0][2] instanceof TicTacToe.CirclePiece) {
                new Alert(Alert.AlertType.WARNING, "Player 1(Circle) is the winner").showAndWait();
                return;
            }
        }

    }




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
