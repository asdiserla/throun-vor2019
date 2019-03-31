package controller;

import model.TourFilter;
import model.Tour;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TourController {

    public DatabaseManager databaseManager;
    public ArrayList<Tour> result;

    public TourController(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    /**
     * The search method for day tours
     * @param filter
     * @return
     */
    public ArrayList<Tour> search(TourFilter filter) throws Exception {
        result = databaseManager.selectTours(filter);
        if (result.isEmpty()) throw new Exception("No tours mathced your preferences");
        else return result;
    }


    /*
    public void bookTour() {

    }

    public void payTour() {

    }*/
}