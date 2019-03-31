package controller;

import controller.DatabaseManager;
import model.Tour;
import model.TourFilter;

import java.util.ArrayList;

public class DatabaseInterfaceNoResult implements DatabaseManager {

    @Override
    public void openDB() {
        // gerir ekki neitt og skilar engu
    }

    @Override
    public void closeDB() {
        // gerir ekki neitt og skilar engu
    }

    @Override
    public ArrayList<Tour> selectTours(TourFilter filter) {
        // skilar tómum array lista
        ArrayList<Tour> result = new ArrayList<Tour>();
        return result;
    }
}