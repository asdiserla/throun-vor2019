package main;

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


    /*ættum að bæta við setters sem athuga hvort að parametrarnir séu réttir
    * þ.e. að priceHigh sé í rauninni tala og sé stærri en price low o.s.fv.
    * þá er það bara búið hérna og ekkert vesen seinna meir*/

}
