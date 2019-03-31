package controller;

import model.Tour;
import model.TourFilter;

import java.util.LinkedList;

public class DatabaseManagerEmpty implements DatabaseManagerInterface {

    @Override
    public void openDB() {
        // gerir ekki neitt og skilar engu
    }

    @Override
    public void closeDB() {
        // gerir ekki neitt og skilar engu
    }

    @Override
    public LinkedList<Tour> selectTours(TourFilter filter) {
        LinkedList<Tour> result = new LinkedList<Tour>();
        return result;
    }
}