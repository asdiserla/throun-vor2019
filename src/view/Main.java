package view;

import controller.DatabaseManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.TourFilter;

import java.util.Calendar;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World og sigga");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        TourFilter filter;

        Date dateStart = new Calendar.Builder()
                .setDate(2012,2,21)
                .setTimeOfDay(14,0,0)
                .build().getTime();

        Date dateFinish = new Calendar.Builder()
                .setDate(2012,2,21)
                .setTimeOfDay(22,0,0)
                .build().getTime();

        filter = new TourFilter(25000,15000, 8,
                "Reykjavík", "food", dateStart, dateFinish,
                true, false, true);

        DatabaseManager db = new DatabaseManager();
        db.selectTours(filter);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
