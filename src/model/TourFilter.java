package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class TourFilter {

    public int priceHigh;
    public int priceLow;
    public int groupSize;
    public String location;
    public String tourType;
    public String groupType;
    public Date timeStart;
    public Date timeFinish;

    private ArrayList<Tour> tourList;
    private int totalPrice;

    /**
     * Constructor for tour TourFilter class
     * @param priceHigh
     * @param priceLow
     * @param groupSize
     * @param location
     * @param tourType
     * @param groupType
     * @param timeStart
     * @param timeFinish
     */
    public TourFilter(int priceHigh, int priceLow, int groupSize, String location,
                           String tourType, String groupType, Date timeStart, Date timeFinish) {
        this.priceHigh = priceHigh;
        this.priceLow = priceLow;
        this.groupSize = groupSize;
        this.location = location;
        this.tourType = tourType;
        this.groupType = groupType;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
    }

    public void TourFound(ArrayList<Tour> tours) {
        this.tourList = tours;
        calculatePrice();
    }

    private void calculatePrice() {
        totalPrice = 0;
        for (int i = 0; i < tourList.size(); i++) {
            totalPrice += tourList.get(i).getPrice();
        }
    }

    public int getTourCount() {
        return tourList.size();
    }

    public void showTour() {
        for (int i = 0; i < tourList.size(); i++) {
            System.out.println("Name of your: " + tourList.get(i).getTourName()
                    + "with the total price of: " + tourList.get(i).getPrice());
        }
    }


    /*ættum að bæta við setters sem athuga hvort að parametrarnir séu réttir
    * þ.e. að priceHigh sé í rauninni tala og sé stærri en price low o.s.fv.
    * þá er það bara búið hérna og ekkert vesen seinna meir*/

}