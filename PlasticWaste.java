/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pollution;

/**
 *
 * @author Virginiah
 */
public class PlasticWaste extends Pollution{
    
    //constructor
    public PlasticWaste(String location, String userId, int rating) {
        super("Plastic Waste", location, userId, rating);
        
    }
    
    //Method that calculates Pollution level 
    @Override
    public void pollutionLevel(){
       if (rating <= 3) {
           pollutionLevel = 1.5;
       }
       else if (rating <= 6) {
           pollutionLevel = 3.0;
       }
       else {
           pollutionLevel = 5.0;
       }
       
    }
    
    @Override
    public String cleanUpRecommendation(){
        return "Organize a community cleanup and recycle the collected plastic waste. \nDispose of non-recyclable items responsibly.";
    }
    
    @Override
    public String details(){
        pollutionLevel();
        return "User ID: " + getUserId() +
               "\nLocation: " + getLocation() +
               "\nPollution Type: " + getPollutionType() +
               "\nRating: " + getRating() +
               "\nPollution Level: " + getPollutionLevel() +
               "\nCleanup Recommendation: " + cleanUpRecommendation();
    }
}
