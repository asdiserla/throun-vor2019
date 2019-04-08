package controller;

import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.ContextMenuEvent;

public class searchResultsController {
    public Label tourName;
    public Label tourType;
    public Label location;
    public Label about;
    public Label date;
    public Label timeStart;
    public Label timeFinish;
    public Label guidedTour;
    public Label accessibleTour;
    public Label privateTour;
    public Label price;
    public ListView resultList;


    public void showSelectedTour(ContextMenuEvent contextMenuEvent) {
        System.out.print("hello click on list view");
    }

    public static void setUp() {
        //DialogPane resultPane = new DialogPane();
        //resultPane.setVisible(true);
    }
}
