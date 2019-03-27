package main;

public class Customer {

    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String mobile;
    public TourFilter filter;

    /**
     * Constructor for Customer class
     * @param id
     * @param firstName
     * @param lastName
     * @param email
     * @param mobile
     * @param filter
     */
    public Customer(String id, String firstName, String lastName,
                    String email, String mobile, TourFilter filter) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.filter = filter;
    }
}
