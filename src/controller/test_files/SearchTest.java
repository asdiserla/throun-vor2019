package controller.test_files;

import controller.TourController;
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
    private TourController tourController;
    private LinkedList<Tour> expectedResult;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void searchTestSuccess() throws Exception {
        filter = new TourFilter();
        filter.setTourType("Food Tour");
        filter.setGroupSize(2);
        filter.setLocation("Reykjavík");
        filter.setPrivateTour(true);
        filter.setGuidedTour(true);
        filter.setAccessibility(true);
        filter.setPrice(20000);

        expectedResult = new LinkedList<Tour>();
        databaseManagerSuccess = new DatabaseManagerSuccess();
        tourController = new TourController(databaseManagerSuccess);

        LinkedList<Tour> result = tourController.search(filter);

        for (int i = 0; i < expectedResult.size(); i++) {
            assertSame(filter.getLocation(), result.get(i).getLocation());
            assertSame(filter.getTourType(), result.get(i).getTourType());
            assertSame(filter.isAccessibility(), result.get(i).isAccessibility());
            assertSame(filter.isGuidedTour(), result.get(i).isGuidedTour());
            assertSame(filter.isPrivateTour(), result.get(i).isAccessibility());
        }
    }

    @Test
    public void searchTestEmpty() throws Exception {
        databaseManagerEmpty = new DatabaseManagerEmpty();
        tourController = new TourController(databaseManagerEmpty);
        LinkedList<Tour> result = tourController.search(filter);
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}