/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pollution;

/**
 *
 * @author Virginiah
 */
public abstract class Pollution {
    protected String pollutionType;
    protected String location;
    protected String userId;
    protected double pollutionLevel;
    protected int rating;
    
    //constructor
    public Pollution(String pollutionType, String location, String userId, int rating) {
        this.pollutionType = pollutionType;
        this.location = location;
        this.userId = userId;
        this.rating = rating;
    }
    
    //set methods for data required from the user
    public void setPollutionType(String pollutionType) {
        this.pollutionType = pollutionType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    //method that calculates the pollution level based on pollution type
    public abstract void pollutionLevel();
    
    //method that displays the recommended method of cleaning based on the pollution type selected
    public abstract String cleanUpRecommendation();
    
    //get methods
    public String getPollutionType() {
        return pollutionType;
    }

    public String getLocation() {
        return location;
    }

    public String getUserId() {
        return userId;
    }

    public double getPollutionLevel() {
        return pollutionLevel;
    }

    public int getRating() {
        return rating;
    }
    
    
    //Method that displays the details to the user
    public String details(){
        return "";
    }
}
