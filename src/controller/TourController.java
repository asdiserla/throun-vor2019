package controller;

import model.TourFilter;
import model.Tour;

import java.util.LinkedList;

public class TourController {

    public DatabaseManagerInterface databaseManagerInterface;
    public LinkedList<Tour> result;

    public TourController(DatabaseManagerInterface databaseManagerInterface) {
        this.databaseManagerInterface = databaseManagerInterface;
    }

    /**
     * The search method for day tours
     * @param filter the tour filter that the user chooses
     * @return
     */
    public LinkedList<Tour> search(TourFilter filter) throws Exception {
        result = databaseManagerInterface.selectTours(filter);
        return result;
    }


    /*
    public void bookTour() {

    }

    public void payTour() {

    }*/
}