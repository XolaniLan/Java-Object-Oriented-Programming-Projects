package com.AirlineManagementSystem;

/**
 * The Passenger class represents an individual traveling on an airline.
 * It encapsulates information such as passenger ID, first name, last name,
 * telephone number, and email address.
 */
public class Passenger {

    private int id;
    private String firstName;
    private String lastName;
    private String telNo;
    private String email;

    /**
     * Constructs a new Passenger with default values.
     */
    public Passenger() {}

    /**
     * Constructs a new Passenger with specified values.
     * @param id        The unique identifier for the passenger.
     * @param firstName The first name of the passenger.
     * @param lastName  The last name of the passenger.
     * @param telNo     The telephone number of the passenger.
     * @param email     The email address of the passenger.
     */
    public Passenger(int id, String firstName, String lastName,
                     String telNo, String email) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNo = telNo;
        this.email = email;
    }

    /**
     * Gets the passenger ID.
     *
     * @return The passenger ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the passenger ID.
     *
     * @param id The new passenger ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the first name of the passenger.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the passenger.
     *
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the passenger.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the passenger.
     *
     * @param lastName The new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the telephone number of the passenger.
     *
     * @return The telephone number.
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * Sets the telephone number of the passenger.
     *
     * @param telNo The new telephone number.
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * Gets the email address of the passenger.
     *
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the passenger.
     *
     * @param email The new email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
