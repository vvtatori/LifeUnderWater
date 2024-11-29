/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pollution;

/**
 *
 * @author Virginiah
 */
public class OilSpillage extends Pollution{
      
    //constructor
    public OilSpillage(String location, String userId, int rating) {
        super("Oil Spillage", location, userId, rating);
    }
    
    //Method that calculates Pollution level 
    @Override
    public void pollutionLevel(){
       if (rating <= 3) {
           pollutionLevel = 1.0;
       }
       else if (rating <= 7) {
           pollutionLevel = 1.0;
       }
       else {
           pollutionLevel = 4.0;
       }
       
    }
    
    @Override
    public String cleanUpRecommendation(){
        return "Use absorbents and skimmers to clean up the spill.";
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
