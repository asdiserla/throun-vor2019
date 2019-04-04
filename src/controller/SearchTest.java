package controller;

import model.Tour;
import model.TourFilter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


public class SearchTest {

    private TourFilter filter;

    private DatabaseManagerSuccess databaseManagerSuccess;
    private DatabaseManagerEmpty databaseManagerEmpty;

    private TourController tourControllerSuccess;
    private TourController tourControllerEmpty;

    private Tour tour1;
    private Tour tour2;
    private Tour tour3;

    private LinkedList<Tour> expectedResult;

    @Before
    public void setUp() throws Exception {
        Date dateStart = new Calendar.Builder()
                .setDate(2012,2,21)
                .setTimeOfDay(14,0,0)
                .build().getTime();

        Date dateFinish = new Calendar.Builder()
                .setDate(2012,2,21)
                .setTimeOfDay(22,0,0)
                .build().getTime();


        filter = new TourFilter(25000,15000, 8,
                "Reykjavík", "food", dateStart, dateFinish,
                true, false, true);

        tour1 = new Tour(1,"foo", 20000, "food",
                "Reykjavík", "foo bar lorem ipsum", dateStart,
                dateFinish, true, false, true);

        tour2 = new Tour(2,"foo", 22000, "food",
                "Reykjavík", "hello world", dateStart,
                dateFinish, true, false, true);

        tour3 = new Tour(3,"foo", 18000, "food",
                "Reykjavík", "hello world og sigga", dateStart,
                dateFinish, true, false, true);

        expectedResult = new LinkedList<Tour>();

        expectedResult.add(tour1);
        expectedResult.add(tour2);
        expectedResult.add(tour3);

        databaseManagerSuccess = new DatabaseManagerSuccess();
        databaseManagerEmpty = new DatabaseManagerEmpty();

        databaseManagerSuccess.openDB();
        databaseManagerEmpty.openDB();

        tourControllerSuccess = new TourController(databaseManagerSuccess);
        tourControllerEmpty = new TourController(databaseManagerEmpty);
    }

    @After
    public void tearDown() throws Exception {
        databaseManagerSuccess.closeDB();
        databaseManagerEmpty.closeDB();
    }

    @Test
    public void searchTestSucces() throws Exception {
        LinkedList<Tour> result = tourControllerSuccess.search(filter);
        assertSame(expectedResult.size(), result.size());
        for (int i = 0; i < expectedResult.size(); i++) {
            assertSame(filter.location, result.get(i).location);
            assertSame(filter.tourType, result.get(i).tourType);
            assertSame(filter.accessibility, result.get(i).accessibility);
            assertSame(filter.guidedTour, result.get(i).guidedTour);
            assertSame(filter.privateTour, result.get(i).privateTour);
            assertSame(0, filter.timeFinish.compareTo(result.get(i).timeFinish));
            assertSame(0, filter.timeStart.compareTo(result.get(i).timeStart));
        }
    }

    @Test
    public void searchTestEmpty() throws Exception {
        LinkedList<Tour> result = tourControllerEmpty.search(filter);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}