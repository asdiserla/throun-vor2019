package main;

import java.util.Date;

public class Booking {

    public int tourId;
    public int price;
    public String customerId;
    public Date time;
    public int bookingStatus; //breyta þessu síðar kannsk

    /**
     * Constructor for Booking class
     * @param tourId
     * @param price
     * @param customerId
     * @param time
     * @param bookingStatus
     */
    public Booking(int tourId, int price, String customerId,
                   Date time, int bookingStatus) {
        this.tourId = tourId;
        this.price = price;
        this.customerId = customerId;
        this.time = time;
        this.bookingStatus = bookingStatus;
    }


}