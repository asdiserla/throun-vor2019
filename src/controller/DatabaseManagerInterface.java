package controller;

import model.Tour;
import model.TourFilter;
import java.util.LinkedList;

public interface DatabaseManagerInterface {
    public LinkedList<Tour> selectTours(TourFilter filter) throws ClassNotFoundException;
    public LinkedList<Tour> searchByDate(TourFilter filter) throws ClassNotFoundException;
    public void removeSeats(int numSeatsBooked, int tourId, int seatsLeft);
}