package by.course;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application{
    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "/views/layout_main_controller.fxml";
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation( getClass().getResource(fxmlFile));

        Parent root = loader.load();
        primaryStage.setTitle("IT-news");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}