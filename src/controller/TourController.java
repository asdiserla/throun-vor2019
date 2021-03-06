package controller;

import model.TourFilter;
import model.Tour;
import java.util.LinkedList;

public class TourController {

    public DatabaseManagerInterface databaseManagerInterface;
    public LinkedList<Tour> result;
    public int numTripsFound;

    public TourController(DatabaseManagerInterface databaseManagerInterface) {
        this.databaseManagerInterface = databaseManagerInterface;
    }

    // FUNCTIONS ---------------------------------------------------------------

    /**
     * The search method for day tours filtering with all variables
     * @param filter the tour filter that the user chooses
     * @return
     */
    public LinkedList<Tour> search(TourFilter filter) throws Exception {
        result = databaseManagerInterface.selectTours(filter);
        return result;
    }

    /**
     * filtering without boolean variables: accessible, guided, private
     * @param filter
     * @return
     * @throws Exception
     */
    public LinkedList<Tour> searchByDate(TourFilter filter) throws Exception {
        result = databaseManagerInterface.searchByDate(filter);
        return result;
    }

    // SETTERS ------------------------------------------------------------------

    public void setNumTripsFound(int numTripsFound) {
        this.numTripsFound = numTripsFound;
    }

    // GETTERS ------------------------------------------------------------------

    public int getNumTripsFound() {
        return numTripsFound;
    }
}