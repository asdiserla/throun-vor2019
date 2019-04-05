package controller;

import model.Customer;
import model.Tour;
import model.TourFilter;
import view.Main;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.LinkedList;
import java.sql.*;

public class DatabaseManager implements DatabaseManagerInterface {

    private Connection connection = null;
    private String databaseUrl = "jdbc:sqlite:db/Database.db";;
    private LinkedList<Tour> result = new LinkedList<Tour>();


    @Override
    public void openDB() throws ClassNotFoundException {

    }

    @Override
    public void closeDB() {

    }

    @Override
    public LinkedList<Tour> selectTours(TourFilter filter) throws ClassNotFoundException {

        String filterLocation = filter.getLocation();
        String filterTimeStart = filter.getTimeStart();
        int filterPrivateTour = filter.isPrivateTour();
        int filterAccessibility = filter.isAccessibility();
        int filterGuidedTour = filter.isGuidedTour();
        String filterTourType = filter.getTourType();
        int filterGroupSize = filter.getGroupSize();
        int filterPrice = filter.getPrice();

        int inaccuracy = 1000;
        int numTripsFound = 0;

        String sqlString = "SELECT * FROM DAYTOURS WHERE " +
                "location LIKE ? AND " +        // 1
                "timeStart LIKE ? AND " +       // 2
                "tourType LIKE ? AND " +        // 3
                "privateTour LIKE ? AND " +     // 4
                "accessibility LIKE ? AND " +   // 5
                "guidedTour LIKE ? AND " +      // 6
                "seatsLeft >= ? AND " +         // 7
                "price <= ?";                   // 8


        try {
            connection = DriverManager.getConnection(databaseUrl);
            PreparedStatement preparedStatement = connection.prepareStatement(sqlString);;

            preparedStatement.setString(1, filterLocation);
            preparedStatement.setString(2, filterTimeStart.concat("%"));
            preparedStatement.setString(3, filterTourType);
            preparedStatement.setInt(4, filterPrivateTour);
            preparedStatement.setInt(5, filterAccessibility);
            preparedStatement.setInt(6, filterGuidedTour);
            preparedStatement.setInt(7, filterGroupSize);
            preparedStatement.setInt(8, filterPrice+inaccuracy);

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next())
            {
                Tour tour = new Tour();

                numTripsFound++;

                tour.setId(rs.getInt("id"));
                tour.setTourName(rs.getString("tourName"));
                tour.setTourType(rs.getString("tourType"));
                tour.setLocation(rs.getString("location"));
                tour.setAbout(rs.getString("aboutTour"));
                tour.setTimeStart(rs.getString("timeStart"));
                tour.setTimeFinish(rs.getString("timeFinish"));
                tour.setSeatsLeft(rs.getInt("seatsLeft"));
                tour.setPrivateTour(rs.getInt("privateTour"));
                tour.setGuidedTour(rs.getInt("guidedTour"));
                tour.setAccessibility(rs.getInt("accessibility"));
                tour.setPrice(rs.getInt("price"));

                result.add(tour);
            }

        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }

        Main.tourController.setNumTripsFound(numTripsFound);

        return result;
    }

    public void removeSeats(int numSeats) {

    }
}