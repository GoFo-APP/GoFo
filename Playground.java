/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zainab
 */
public class Playground {

    private String Name;
    private String Location;
    private double pricePerHour;
    private int cancellationPeriod;
    private String status;
    private int startTime;
    private int endTime;
    private int Time[];
    private static int playgroundId;
    Lists list = new Lists();

    public Playground() {
    }

    /**
     * Playground parametrized constructor to initialize the attributes
     *
     * @param Name
     * @param Location
     * @param pricePerHour
     * @param cancellationPeriod
     * @param startTime
     * @param endTime
     */
    public Playground(String Name, String Location, double pricePerHour, int cancellationPeriod, int startTime, int endTime) {
        this.Name = Name;
        this.Location = Location;
        this.pricePerHour = pricePerHour;
        this.cancellationPeriod = cancellationPeriod;
        this.startTime = startTime;
        this.endTime = endTime;
        playgroundId++;
        int arraySize = endTime - startTime;
        Time = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            Time[i] = 1;
        }
    }

    /**
     * setName a setter to private attribute "Name"
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * setLocation a setter to private attribute "Location"
     *
     * @param Location
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * setPricePerHour a setter to private attribute "pricePerHour"
     *
     * @param pricePerHour
     */
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    /**
     * setCancellationPeriod a setter to private attribute "cancellationPeriod"
     *
     * @param cancellationPeriod
     */
    public void setCancellationPeriod(int cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    /**
     * setStatus a setter to private attribute "status"
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * setStartTime a setter to private attribute "startTime"
     *
     * @param startTime
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    /**
     * setEndTime a setter to private attribute "endTime"
     *
     * @param endTime
     */
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    /**
     * setTime a setter to timeSlots
     *
     * @param val
     * @param index
     */
    public void setTime(int val, int index) {
        Time[index] = val;
    }

    /**
     * setId a setter to playgroundId
     *
     * @param in
     */
    public void setId(int in) {
        playgroundId = in;
    }

    /**
     * getName a getter to private attribute "Name"
     *
     * @return String
     */
    public String getName() {
        return Name;
    }

    /**
     * getLocation a getter to private attribute "Location"
     *
     * @return String
     */
    public String getLocation() {
        return Location;
    }

    /**
     * getPricePerHour a getter to private attribute "pricePerHour"
     *
     * @return double
     */
    public double getPricePerHour() {
        return pricePerHour;
    }

    /**
     * getCancellationPeriod a getter to private attribute "cancellationPeriod"
     *
     * @return int
     */
    public int getCancellationPeriod() {
        return cancellationPeriod;
    }

    /**
     * getStatus a getter to private attribute "status"
     *
     * @return string
     */
    public String getStatus() {
        return status;
    }

    /**
     * getStartTime a getter to private attribute "startTime"
     *
     * @return int
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * getEndTime a getter to private attribute "endTime"
     *
     * @return int
     */
    public int getEndTime() {
        return endTime;
    }

    public int getTime(int index) {
        return Time[index];
    }

    /**
     * getPlaygroundId a getter to private attribute "playgroundId"
     *
     * @return int
     */
    public int getPlaygroundId() {
        return playgroundId;
    }

    /**
     * toString An overridden method from class object.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "The playground is called: " + Name + "\n with an Id " + playgroundId + "\n Located in: " + Location + "\n Price per Hour: " + pricePerHour + "\n The cancellation period: " + cancellationPeriod + " days" + "\n Open at: " + startTime + "\n Close at: " + endTime + "\n";
    }

}
