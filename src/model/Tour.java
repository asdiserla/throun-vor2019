package model;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Date;

import controller.TourController;

public class Tour {

    public int id;              // aukalega
    public String tourName;
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

    // var að bæta við kv ásdis
    private Boolean freeSeat;
    private int seatsLeft; // bætti þessu við, ætti kannski að vera public líka? kv stísa

    private ArrayList<TourFilter> results;
    private TourController tourController;

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
    public Tour (int id, String tourName, int priceLow, int priceHigh, int groupSize, String type,
                String location, String groupType, String about, Date timeStart,
                Date timeFinish, Image image) {
        this.id = id;
        this.tourName = name;
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

    public int getSeatsLeft(int numberOfSeatsLeft) {
        if (numberOfSeatsLeft >= groupSize) {
            updateSeatsLeft(groupSize);
        }

        return seatsLeft;
    }

    private void updateSeatsLeft(int numberOfSeats) {
        for (int i = 0; i < numberOfSeats; i++) {
            if (seatsLeft <= 0) {
                return;
            } else {
                seatsLeft--;
            }
        }
    }

    public int getPrice() {
        return price; // TODO hvar kemur verðið sem notandinn kemur inn??
    }

    public String getTourName() {
        return tourName;
    }
}