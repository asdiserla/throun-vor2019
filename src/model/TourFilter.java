package model;

import java.lang.reflect.Array;
import java.util.Date;

public class TourFilter {

    private int priceHigh;
    private int priceLow;
    private int groupSize;
    private String location;
    private String tourType;
    private Date timeStart;
    private Date timeFinish;
    private boolean guidedTour;
    private boolean privateTour;
    private boolean accessibility;

    public TourFilter(String priceHigh, String priceLow, String groupSize,
                      String location, String tourType,
                      Date timeStart, Date timeFinish, boolean guidedTour,
                      boolean privateTour, boolean accessibility) {

        this.priceHigh = priceH(Integer.parseInt(priceLow),Integer.parseInt(priceHigh));
        this.priceLow = priceL(Integer.parseInt(priceLow),Integer.parseInt(priceHigh));
        this.groupSize = gSize(Integer.parseInt(groupSize));
        this.location = location;
        this.tourType = tourType;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.guidedTour = guidedTour;
        this.privateTour = privateTour;
        this.accessibility = accessibility;
    }

    /**
     * Föll sem skoða hvort intak sé rétt
     */

    /**
     * Makes sure PL os lower than PH, if not we return -1
     *
     * @param pL Lower price
     * @param pH Higher price
     * @return pH or -1
     */
    public int priceH(int pL, int pH){
        //Mögulega breyta ef við fáum streng inn
        if (pL < pH){
            return pH;
        }
        return -1;
    }

    /**
     * Makes sure PH is higher than pL, if not we return -1
     *
     * @param pL Lower price
     * @param pH Higher price
     * @return pL or -1
     */

    public int priceL(int pL, int pH){
        //Mögulega breyta ef við fáum streng inn
        if (pL < pH){
            return pL;
        }
        return -1;
    }

    /**
     * Makes sure the group isn't smaller than 0 or larger than 1000
     * @param g
     * @return g or -1
     */

    public int gSize(int g){
        if(g < 1000 && g > 0){
            return g;
        }
        return -1;
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
