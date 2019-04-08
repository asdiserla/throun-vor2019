package controller;

import model.Tour;
import model.TourFilter;

import java.util.LinkedList;

interface DatabaseManagerInterface {
    public LinkedList<Tour> selectTours(TourFilter filter) throws ClassNotFoundException;
    LinkedList<Tour> searchByDate(TourFilter filter) throws ClassNotFoundException;
}