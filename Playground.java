/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;

/**
 *
 * @author Zainab
 */
public class Playground {
    private String Name;
    private String Location;
    private double pricePerHour;
    private double availableHours;
    private int cancellationPeriod;
    private String status;
    ArrayList<Playground> playgroundList = new ArrayList<Playground>();
    
/**
 * playground Parameterized constructor that sets the class data.
 * @param Name
 * @param Location
 * @param pricePerHour
 * @param availableHours
 * @param cancellationPeriod
 */
    public Playground(String Name, String Location, double pricePerHour, double availableHours, int cancellationPeriod) {
        this.Name = Name;
        this.Location = Location;
        this.pricePerHour = pricePerHour;
        this.availableHours = availableHours;
        this.cancellationPeriod = cancellationPeriod;
    }
/**
 * setName a setter to private attribute "Name"
 * @param Name 
 */
    public void setName(String Name) {
        this.Name = Name;
    }
    /**
     * setLocation a setter to private attribute "Location"
     * @param Location 
     */

    public void setLocation(String Location) {
        this.Location = Location;
    }
    /**
     * setPricePerHour a setter to private attribute "pricePerHour"
     * @param pricePerHour 
     */

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    /**
     * setAvailbeHours a setter to private attribute"availableHours" 
     * @param availableHours 
     */

    public void setAvailableHours(double availableHours) {
        this.availableHours = availableHours;
    }
    /**
     * setCancellationPeriod a setter to private attribute "cancellationPeriod"
     * @param cancellationPeriod 
     */

    public void setCancellationPeriod(int cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }
/**
 * setStatus a setter to private attribute "status"
 * @param status 
 */
    public void setStatus(String status) {
        this.status = status;
    }
/**
 * getName a getter to private attribute "Name"
 * @return String
 */
    public String getName() {
        return Name;
    }
/**
 * getLocation a getter to private attribute "Location"
 * @return String
 */
    public String getLocation() {
        return Location;
    }
/**
 * getPricePerHour a getter to private attribute "pricePerHour"
 * @return double
 */
    public double getPricePerHour() {
        return pricePerHour;
    }
/**
 * getAvailableHours a getter to private attribute "availableHours"
 * @return int
 */
    public double getAvailableHours() {
        return availableHours;
    }
/**
 * getCancellationPeriod a getter to private attribute "cancellationPeriod"
 * @return int
 */
    public int getCancellationPeriod() {
        return cancellationPeriod;
    }
/**
 * getStatus a getter to private attribute "status"
 * @return string
 */
    public String getStatus() {
        return status;
    }
    
    
}
