package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Customer;
import model.Payment;
import model.Tour;
import view.Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class searchController {
    public Slider chosenPrice;
    public CheckBox disabilityFriendly;
    public CheckBox choosePrivat;
    public CheckBox chooseTourguide;
    public DatePicker startTrip;
    public ChoiceBox chosenLocation;
    public Button findMyTourButton;
    public Slider chosenGroupSize;
    public ChoiceBox chosenTourType;
    public Label currentPrice;
    public Label currentGroupSize;


    public void getFilters(ActionEvent actionEvent) throws Exception {
        // using the customer created in main - always using the same customer
        Customer customer = Main.customer;

        customer.filter.setTimeStart(startTrip.getValue().toString());
        customer.filter.setPrice(chosenPrice.getValue());
        customer.filter.setAccessibility(disabilityFriendly.isSelected());
        customer.filter.setGuidedTour(chooseTourguide.isSelected());
        customer.filter.setPrivateTour(choosePrivat.isSelected());
        customer.filter.setLocation(chosenLocation.getValue());
        customer.filter.setGroupSize(chosenGroupSize.getValue());
        customer.filter.setTourType(chosenTourType.getValue().toString());

        // using db created in Main
        LinkedList<Tour> result = Main.db.searchByDate(customer.filter);

        // using tourController created in Main
        Main.tourController.result = result;

        /** to see results from search on the command line*/
        if (result.size() > 0) {
            Tour selected = result.getFirst();
            System.out.println("Here is all the information about the first tour found that matches your wishes: ");
            System.out.println("The tour starts at: " + selected.getStartTime() + " o'clock");
            System.out.println("The tour finishes at: " + selected.getFinishTime() + " o'clock");
            System.out.println("The date of the tour is: " + selected.getDate());
            System.out.println("The location of your tour is: " +  selected.getLocation());
            System.out.println("The price for your group is: " + selected.getPriceForGroup());
            System.out.println("Here is a description of the tour: " + selected.getAbout());
            System.out.println("The tour is guided (true/false): " +  selected.isGuidedTour());
            System.out.println("The tour is accessible (true/false): " +  selected.isAccessibility());
            System.out.println("The tour is private (true/false): " +  selected.isPrivateTour());
        } else {
            System.out.println("No tour found that matches your wishes, sorry!");
        }
    }

    // activated on window onload
    @FXML
    protected void initialize(){
        // initialize the choiceBox chosenLocation choices
        chosenLocation.setItems(FXCollections.observableArrayList(
                "Reykjavík", "Akureyri"));

        chosenTourType.setItems(FXCollections.observableArrayList(
                "Bus Tour", "Car Ride", "Adventure", "Bar Crawl", "Food Tour", "Jeep Ride", "Beer Tour"));


        // initialise all filter values so we are able to pick date
        // and filters that exist in the database
        chosenTourType.setValue("Food Tour");
        chosenPrice.setValue(20000);
        startTrip.setValue(LocalDate.of(2019, 7, 5));
        chosenGroupSize.setValue(2);
        choosePrivat.setSelected(true);
        chooseTourguide.setSelected(true);
        disabilityFriendly.setSelected(true);
        chosenLocation.setValue("Reykjavík");
    }

    public void currentPriceHandler(MouseEvent mouseEvent) {
    }
}
