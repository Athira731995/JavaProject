package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Sample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Line line=new Line();
        line.setStartX(100.0);
        line.setStartY(150);
        line.setEndX(500.0);
        line.setEndY(150.0);
        Group group=new Group(line);
        Scene scene=new Scene(group,600,300);
        scene.setFill(Color.WHITESMOKE);
        primaryStage.setTitle("first title");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
