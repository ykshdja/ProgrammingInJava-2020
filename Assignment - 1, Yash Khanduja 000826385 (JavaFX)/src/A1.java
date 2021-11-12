
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javafx.application.Application.launch;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Yash Khanduja, 000826385
 */
public class A1 extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(800, 700); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 
        String title = JOptionPane.showInputDialog("Enter the Title:");
        gc.setFont(Font.font("Arial", 30));
        gc.setFill(Color.DEEPPINK);
        gc.setTextAlign(TextAlignment.CENTER);
        gc.strokeText(title, 300, 50);
        //Draw Lines
        ArrayList<Integer> cooridnates = new ArrayList<Integer>();
        String[] names = new String[]{"Jan", "Feb", "Mar", "Apr", "May"};
        int month = 140;
        int seed = 0;
        //INPUT MIN AND MAX
        String min = JOptionPane.showInputDialog("Enter the Minimum Value:");
        String max = JOptionPane.showInputDialog("Enter the Maximum Value:");
        int min_parsed = Integer.parseInt(min);
        int max_parsed = Integer.parseInt(max);
        int y = 500;
        int interval;
        interval = (max_parsed - min_parsed) / 4;
        for (int i = 100; i < 600; i += 100) {

            Line line1 = new Line(100, i, 600, i);
            line1.setStroke(Color.DARKSLATEBLUE);
            Group root_line = new Group(line1);
            //Text label = new Text(String.format("%d",i));
            Text months = new Text(names[seed]);
            //label.setX(70);
            //label.setY(y);
            cooridnates.add(month);
            months.setX(month);
            months.setY(520);
            //months.setY(min_parsed);
            //  Label label = new Label("Label");
            root.getChildren().addAll(line1, months);
            //y-=100;
            month += 80;
            seed++;
        }

        //lABELS
        for (int i = min_parsed; i < max_parsed + 1; i += interval) {
            Text label = new Text(String.format("%d", i));
            label.setX(70);
            label.setY(y );
            root.getChildren().addAll(label);
            y -= 100;
            //Rectangle r = new Rectangle(a-10,500-setY+100,10,setY-100);
            //Rectangle r = new Rectangle(a-10,max_parsed-setY+min_parsed,10,setY-min_parsed);
            //Rectangle r = new Rectangle(a-10,max_parsed-setY+min_parsed,10,setY-min_parsed);
        }


        String tile = JOptionPane.showInputDialog("Enter the number of tiles:");
        int tiles = -1;
        try {
            //tiles = Integer.parseInt(tile);
            for (int a : cooridnates) {
                String height = JOptionPane.showInputDialog("Enter the Value please :");

                int set_y = Integer.parseInt(height);
                while (set_y > max_parsed || set_y < min_parsed)
                {
                    height = JOptionPane.showInputDialog("Invalid! Please Enter Another Value:");
                    set_y = Integer.parseInt(height);

                }
                gc.setFill(Color.YELLOWGREEN);
                Rectangle r = new Rectangle();
                r.setX(a - 10);
                r.setY(500-set_y+100);
                r.setWidth(10);
                r.setHeight(set_y-min_parsed);
                //Rectangle r = new Rectangle(a-10,500,10,setY/*min_parsed*/);
                root.getChildren().add(r);

            }
            gc.strokeText("A Program by Yash Khanduja", 200, 670);
            //Scene scene = new Scene(label,200,100);

        } catch (Exception e) {

        }

        finally {
            stage.setScene(scene);
            stage.show();
        }


        // YOUR CODE STOPS HERE

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
