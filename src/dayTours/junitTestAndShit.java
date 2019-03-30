// simulates a given trip

public class DBMock {
        private String tourType;
        private int groupSize;
        private int ageGroup; //3 eða 4 hópar
        private int priceRLow;
        private int priceRHigh;
        private String location;
        private boolean guidedTour;
        private boolean privateTour;
        private boolean accessibility; 

        public tripDBMock(String tourType, int groupSize, int ageGroup, int priceRLow, 
        int priceRHigh, String location, boolean guidedTour, boolean privateTour, boolean accessibility){
            this.tourType = tourType;
            this.groupSize = groupSize;
            this.ageGroup = ageGroup;
            this.priceRLow = priceRLow;
            this.priceRHigh = priceRHigh;
            this.location = location;
            this.guidedTour = guidedTour; 
            this.privateTour =privateTour;
            this.accessibility = accessibility;
        }

        public tripDBMock getTrip(){
            return tripDBMock(tourType, groupSize, ageGroup, priceRLow, priceRHigh, location, guidedTour, privateTour, accessibility);
        }
    }

