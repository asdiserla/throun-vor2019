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

        int     tourId;
        int     tourSeatsLeft;
        String  tourName;
        String  tourType;
        String  tourLocation;
        String  tourAbout;
        String  tourTimeStart;
        String  tourTimeFinish;
        boolean tourIsPrivate;
        boolean tourIsGuided;
        boolean tourIsAccessable;
        int     price;

        try {
            // create the database connection
            connection = DriverManager.getConnection(databaseUrl);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM DAYTOURS WHERE location = 'Reykjavík'");
            while(rs.next())
            {
                // read the result set
                System.out.println("id = " + rs.getInt("id"));
            }

        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }

        return result;
    }
}