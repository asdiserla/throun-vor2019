package controller;

import model.TourFilter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * TODO
 * 1. gera fake TourFilter
 * 2. gera fake gagnagrunn sem skilar amk einum Tour sem er jafnt og TourFilter
 * 3. gera fake gagnagrunn sem skilar engu sem passar
 * 4. ...?
 */

public class TourControllerTest {

    private TourFilter tourfilter;
    private SimpleDateFormat startSDF;
    private SimpleDateFormat finishSDF;
    private Date startD;
    private Date finisD;

    @Before
    public void setUp() throws Exception {
        /*Create a TourFilter that search can use to search for tours in database*/
        SimpleDateFormat startSDF = new SimpleDateFormat("dd/MM/yyyy/HH/mm");
        Date startD = startSDF.parse("12/05/2019/12/30");

        SimpleDateFormat finishSDF = new SimpleDateFormat("dd/MM/yyyy/HH/mm");
        Date finishD = finishSDF.parse("12/05/2019/15/30");

        /*
        TourFilter tourFilter =
                //new TourFilter(50000, 20000, 2, "Reykjavík",
                "food", "family", startD, finishD);
*/
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    //TODO: KALLA Í TEST 1 Í DATABASEMANAGER
    public void searchTest1() {
    }

    @Test
    //TODO: KALLA Í TEST 2 Í DATABASEMANAGER
    public void searchTest2() {
    }
}