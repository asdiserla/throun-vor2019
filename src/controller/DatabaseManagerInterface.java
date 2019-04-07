package controller;

import model.Tour;
import model.TourFilter;

import java.util.LinkedList;

interface DatabaseManagerInterface {
    public void openDB() throws ClassNotFoundException;
    public void closeDB();
    public LinkedList<Tour> selectTours(TourFilter filter) throws ClassNotFoundException;
}