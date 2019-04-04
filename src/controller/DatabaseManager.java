package controller;

import model.Tour;
import model.TourFilter;
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

        // load the sqlite-JDBC driver using the current class loader
        Class.forName("org.sqlite.JDBC");

        int id;
        int seatsLeft;
        String tourName;
        String tourType;
        String location;
        String aboutTour;
        String timeStart;
        String timeFinish;
        int privateTour;
        int guidedTour;
        int accessibility;
        int price;

        try {
            // create the database connection
            connection = DriverManager.getConnection(databaseUrl);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM DAYTOURS WHERE location = 'Reykjavík'");
            while(rs.next())
            {
                id = rs.getInt("id");
                tourName = rs.getString("tourName");
                tourType = rs.getString("tourType");
                location = rs.getString("location");
                aboutTour = rs.getString("aboutTour");
                timeStart = rs.getString("timeStart");
                timeFinish = rs.getString("timeFinish");
                seatsLeft = rs.getInt("seatsLeft");
                privateTour = rs.getInt("privateTour");
                guidedTour = rs.getInt("guidedTour");
                accessibility = rs.getInt("accessibility");
                seatsLeft = rs.getInt("seatsLeft");
                price = rs.getInt("price");


                System.out.println("id = " + rs.getInt("id"));
            }

        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }

        return result;
    }
}