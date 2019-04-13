package controller.test_files;

import controller.DatabaseManagerInterface;
import model.Tour;
import model.TourFilter;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class DatabaseManagerSuccess implements DatabaseManagerInterface {

    @Override
    public LinkedList<Tour> selectTours(TourFilter filter) {
        Tour tour1 = new Tour();
        tour1.setLocation("Reykjavík");
        tour1.setTourType("Food Tour");
        tour1.setGuidedTour(1);
        tour1.setAccessibility(1);
        tour1.setPrivateTour(1);
        tour1.setPrice(20000);
        tour1.setSeatsLeft(20);

        LinkedList<Tour> result = new LinkedList<Tour>();
        result.add(tour1);

        return result;
    }

    @Override
    public LinkedList<Tour> searchByDate(TourFilter filter) {
        return null;
    }

    @Override
    public void removeSeats(int numSeatsBooked, int tourId, int seatsLeft) {

    }
}