package model;

public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private TourFilter filter;

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

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public TourFilter getFilter() {
        return filter;
    }

    public void setFilter(TourFilter filter) {
        this.filter = filter;
    }
}
