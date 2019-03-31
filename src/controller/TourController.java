package controller;

import model.TourFilter;
import model.Tour;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TourController {

    public DatabaseManager databaseManager;
    public ArrayList<Tour> resultArrayList;

    public TourController(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    /**
     * The search method for day tours
     * @param filter
     * @return
     */
    public ArrayList<Tour> search(TourFilter filter) {
        ArrayList<Tour> listOfTours = new ArrayList<Tour>();



        return listOfTours;
    }


    /*
    public void bookTour() {

    }

    public void payTour() {

    }*/
}