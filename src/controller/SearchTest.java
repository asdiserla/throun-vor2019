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

    private LinkedList<Tour> expectedResult;

    @Before
    public void setUp() throws Exception {

        filter = new TourFilter(25000, "2","Akureyri",
                "Bus ride", "06/09/19", true, false,
                false);

        expectedResult = new LinkedList<Tour>();

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
        for (int i = 0; i < expectedResult.size(); i++) {
            assertSame(filter.getLocation(), result.get(i).getLocation());
            assertSame(filter.getTourType(), result.get(i).getTourType());
            assertSame(filter.isAccessibility(), result.get(i).isAccessibility());
            assertSame(filter.isGuidedTour(), result.get(i).isGuidedTour());
            assertSame(filter.isPrivateTour(), result.get(i).isAccessibility());
            //assertSame("true", filter.getTimeStart().equals(result.get(i).getTimeStart()));
        }
    }

    @Test
    public void searchTestEmpty() throws Exception {
        LinkedList<Tour> result = tourControllerEmpty.search(filter);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}