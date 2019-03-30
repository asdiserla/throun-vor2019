package main;

import java.sql.ResultSet;
import java.util.Date;


//Interface sem mock object-ið þarf að uppfylla fyrir leit
public interface tripLookup {

    public ResultSet results(int priceHigh, int priceLow, int groupSize, String location,
                           String tourType, String groupType, Date timeStart, Date timeFinish);
}
