package model;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Date;

import controller.TourController;

public class Tour {

    public int id;              // aukalega
    public String tourName;
    public int price;
    public String type;
    public String location;
    public String about;        // aukalega
    public Date timeStart;
    public Date timeFinish;
    public boolean guidedTour;
    public boolean privateTour;
    public boolean accessibility;
    //public Image image;         // aukalega
    //Nennti ekki að implementa fyrir þetta verkefni hehehe

    // var að bæta við kv ásdis
    // private Boolean freeSeat;
    private int seatsLeft; // bætti þessu við, ætti kannski að vera public líka? kv stísa

    // private ArrayList<TourFilter> results;
    private TourController tourController;

    /**
     * Constructor for Tour class
     * @param id
     * @param tourName
     * @param price
     * @param type
     * @param location
     * @param about
     * @param timeStart
     * @param timeFinish
     * @param //image
     */
    public Tour (int id, String tourName, int price, String type,
                String location, String about, Date timeStart,
                Date timeFinish,/*Image image, */boolean guidedTour,
                 boolean privateTour, boolean accessibility) {
        this.id = id;
        this.tourName = tourName;
        this.price = price;
        this.type = type;
        this.location = location;
        this.about = about;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        //this.image = image;
        this.guidedTour  = guidedTour;
        this.privateTour = privateTour;
        this.accessibility = accessibility;
    }

    /**
     *
     * Á líklega heima einhverstaðar annarsstaðar
     *
    public int getSeatsLeft(int numberOfSeatsLeft) {
        if (numberOfSeatsLeft >= groupSize) {
            updateSeatsLeft(groupSize);
        }

        return seatsLeft;
    }

    */
    public void updateSeatsLeft(int reservedSeats) {
        this.seatsLeft = seatsLeft-reservedSeats;
        /*
        for (int i = 0; i < numberOfSeats; i++) {
            if (seatsLeft <= 0) {
                return;
            } else {
                seatsLeft--;
            }
        }*/
    }

    public int getPrice() {
        return price; // TODO hvar kemur verðið sem notandinn kemur inn??
    }

    public String getTourName() {
        return tourName;
    }
}