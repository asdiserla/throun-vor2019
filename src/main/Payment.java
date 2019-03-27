package main;

import java.util.Date;

public class Payment {

    public int price;
    public int tourId;
    public String customerId;
    public String customerName;
    public Date date;

    /**
     * Constructor for payment class
     * @param price
     * @param tourId
     * @param customerId
     * @param customerName
     * @param date
     */
    public Payment(int price, int tourId, String customerId,
                   String customerName, Date date) {
        this.price = price;
        this.tourId = tourId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.date = date;
    }
}