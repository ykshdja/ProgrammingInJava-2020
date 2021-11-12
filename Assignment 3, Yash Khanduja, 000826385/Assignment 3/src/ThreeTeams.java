/*
 * Main class to create the complete GUI
 */
package threeteams;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;

/**
 * @author  Yash Khanduja, 000826385
 *
 *
 */
public class ThreeTeams extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(600, 600); // Set canvas Size in Pixels
        stage.setTitle("Robot Olympics"); // Set window title

        root.getChildren().add(canvas);

        stage.setScene(scene);
        //to set background color of the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0,600,600);


        Random rand=new Random();
        //to store team names
        String[] teams=new String[3];
        teams[0]="Dalekhs";
        teams[1]="Cybermen";
        teams[2]="Mechanoids";

        Color c1,c2,c3;
        //random team colors
        c1=Color.color(Math.random(), Math.random(), Math.random());
        c2=Color.color(Math.random(), Math.random(), Math.random());
        c3=Color.color(Math.random(), Math.random(), Math.random());
        Team team1,team2,team3;
        //randomly setting team name
        if(rand.nextInt(3)==0){
            team1 = new Team(50,30,teams[0],c1);
            team2 = new Team(50,200,teams[1],c2);
            team3 = new Team(50,400,teams[2],c3);
        }else if(rand.nextInt(3)==1){
            team1 = new Team(50,30,teams[1],c2);
            team2 = new Team(50,200,teams[0],c1);
            team3 = new Team(50,400,teams[2],c3);
        }else{
            team1 = new Team(50,30,teams[2],c3);
            team2 = new Team(50,200,teams[1],c2);
            team3 = new Team(50,400,teams[0],c1);
        }

        //drawing teams
        team1.draw(gc);
        team2.draw(gc);
        team3.draw(gc);

        //selecting random refree
        Player ref;
        int refTeam=rand.nextInt(3);
        if(refTeam==0){
            ref=new Player(450,200,c1,"Head "+teams[0]);
        }else if(refTeam==1){
            ref=new Player(450,200,c2,"Head "+teams[1]);
        }else{
            ref=new Player(450,200,c3,"Head "+teams[2]);
        }
        //drawing refree
        ref.draw(gc);


        stage.show();

    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }

}
