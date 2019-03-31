package controller;

import model.Tour;
import model.TourFilter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;


public class SearchTest {

    private TourFilter filter;
    private DatabaseInterfaceResult databaseManagerResult;
    private DatabaseInterfaceNoResult databaseManagerNoResult;
    private TourController tourController1;
    private TourController tourController2;
    private Tour tour1;
    private Tour tour2;
    private Tour tour3;
    private ArrayList<Tour> expectedResult;


    @Before
    public void setUp() throws Exception {
        Date dateStart = new Calendar.Builder()
                .setDate(2012, 2, 21)
                .setTimeOfDay(14, 0, 0)
                .build().getTime();

        Date dateFinish = new Calendar.Builder()
                .setDate(2012, 2, 21)
                .setTimeOfDay(22, 0, 0)
                .build().getTime();


        filter = new TourFilter(25000,15000, 8,
                "Reykjavík", "food", dateStart, dateFinish,
                true, false, true);

        tour1 = new Tour(1,"foo", 20000, "food",
                "Reykjavík", "foo bar lorem ipsum", dateStart,
                dateFinish, true, false, true);

        tour2 = new Tour(1,"foo", 22000, "food",
                "Reykjavík", "hello world", dateStart,
                dateFinish, true, false, true);

        tour3 = new Tour(1,"foo", 18000, "food",
                "Reykjavík", "hello world og sigga", dateStart,
                dateFinish, true, false, true);

        expectedResult = new ArrayList<Tour>();

        expectedResult.add(tour1);
        expectedResult.add(tour2);
        expectedResult.add(tour3);

        databaseManagerResult = new DatabaseInterfaceResult();
        databaseManagerNoResult = new DatabaseInterfaceNoResult();
        databaseManagerResult.openDB();
        databaseManagerNoResult.openDB();

        tourController1 = new TourController(databaseManagerResult);
        tourController2 = new TourController(databaseManagerNoResult);
    }

    @After
    public void tearDown() throws Exception {
        databaseManagerResult.closeDB();
        databaseManagerNoResult.closeDB();
    }

    @Test
    public void searchTest1() throws Exception {
        ArrayList<Tour> result = tourController1.search(filter);
        //(expectedResult, samePropertyValuesAs(result));
    }

    @Test
    public void searchTest2() {

    }
}