package controller;

import controller.DatabaseManager;
import model.Tour;
import model.TourFilter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DatabaseInterfaceResult implements DatabaseManager {

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

        Date dateStart = new Calendar.Builder()
                        .setDate(2012, 2, 21)
                        .setTimeOfDay(14, 0, 0)
                        .build().getTime();

        Date dateFinish = new Calendar.Builder()
                        .setDate(2012, 2, 21)
                        .setTimeOfDay(22, 0, 0)
                        .build().getTime();



        Tour tour1 = new Tour(1,"foo", 20000, "food",
                             "Reykjavík", "foo bar lorem ipsum", dateStart,
                              dateFinish, true, false, true);

        Tour tour2 = new Tour(1,"foo", 22000, "food",
                            "Reykjavík", "hello world", dateStart,
                            dateFinish, true, false, true);

        Tour tour3 = new Tour(1,"foo", 18000, "food",
                    "Reykjavík", "hello world og sigga", dateStart,
                            dateFinish, true, false, true);

        ArrayList<Tour> result = new ArrayList<Tour>();


        result.add(tour1);
        result.add(tour2);
        result.add(tour3);

        return result;
    }
}