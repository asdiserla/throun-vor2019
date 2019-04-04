package model;

import javafx.scene.image.Image;

import java.util.Date;

import controller.TourController;

public class Tour {

    public int id;              // aukalega
    public String tourName;
    public int price;
    public String tourType;
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

    private TourController tourController;


    public Tour (int id, String tourName, int price, String tourType,
                String location, String about, Date timeStart,
                Date timeFinish,/*Image image, */boolean guidedTour,
                 boolean privateTour, boolean accessibility) {

        this.id = id;
        this.tourName = tourName;
        this.price = price;
        this.tourType = tourType;
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
        // DONE lagaði þannig að price í tour er ekki lengur low eða high það er bara eitt verð, hitt meikaði ekki sense
        return price;
    }

    public String getTourName() {
        return tourName;
    }
}