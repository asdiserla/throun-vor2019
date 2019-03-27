package main;

import javafx.scene.image.Image;

import java.util.Date;

public class Tour {

    public int id;              // aukalega
    public int priceLow;
    public int priceHigh;
    public int groupSize;
    public String type;
    public String location;
    public String groupType;
    public String about;        // aukalega
    public Date timeStart;
    public Date timeFinish;
    public Image image;         // aukalega

    /**
     * Constructor for Tour class
     * @param id
     * @param priceLow
     * @param priceHigh
     * @param groupSize
     * @param type
     * @param location
     * @param groupType
     * @param about
     * @param timeStart
     * @param timeFinish
     * @param image
     */
    public Tour (int id, int priceLow, int priceHigh, int groupSize, String type,
                String location, String groupType, String about, Date timeStart,
                Date timeFinish, Image image) {
        this.id = id;
        this.priceLow = priceLow;
        this.priceHigh = priceHigh;
        this.groupSize = groupSize;
        this.type = type;
        this.location = location;
        this.groupType = groupType;
        this.about = about;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.image = image;
    }

    /**
    public Tour getTour(int tourId) {
        ...
        return Tour;
    }
     */
}