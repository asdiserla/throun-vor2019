package model;

import java.lang.reflect.Array;
import java.util.Date;

public class TourFilter {

    public int priceHigh;
    public int priceLow;
    public int groupSize;
    public String location;
    public String tourType;
    public Date timeStart;
    public Date timeFinish;
    public boolean guidedTour;
    public boolean privateTour;
    public boolean accessibility;


    //private int totalPrice;

    public TourFilter(int priceHigh, int priceLow, int groupSize,
                      String location, String tourType,
                      Date timeStart, Date timeFinish, boolean guidedTour,
                      boolean privateTour, boolean accessibility) {

        this.priceHigh = priceHigh;
        this.priceLow = priceLow;
        this.groupSize = groupSize;
        this.location = location;
        this.tourType = tourType;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.guidedTour = guidedTour;
        this.privateTour = privateTour;
        this.accessibility = accessibility;
    }


    /*
>>>>>>> 711fdc71af12584065c3c744cd345fb80fcfdf6c
    public void TourFound(ArrayList<Tour> tours) {
        this.tourList = tours;
        calculatePrice();
    }
    */
    /*
    private void calculatePrice() {
        totalPrice = 0;
        for (int i = 0; i < tourList.size(); i++) {
            totalPrice += tourList.get(i).getPrice();
        }
    }
    */
    /*
    public int getTourCount() {
        return tourList.size();
    }*/

    /*
    public void showTour() {
        for (int i = 0; i < tourList.size(); i++) {
            System.out.println("Name of your: " + tourList.get(i).getTourName()
                    + "with the total price of: " + tourList.get(i).getPrice());
        }
    }*/


    /*ættum að bæta við setters sem athuga hvort að parametrarnir séu réttir
    * þ.e. að priceHigh sé í rauninni tala og sé stærri en price low o.s.fv.
    * þá er það bara búið hérna og ekkert vesen seinna meir*/

}