package controller;

import model.Tour;
import model.TourFilter;

import java.util.ArrayList;

interface DatabaseManager {
    public void openDB();
    public void closeDB();
    public ArrayList<Tour> selectTours(TourFilter filter);
}