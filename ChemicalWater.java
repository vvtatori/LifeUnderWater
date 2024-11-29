/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pollution;

/**
 *
 * @author Virginiah
 */
public class ChemicalWater extends Pollution{
    //Constructor
    public ChemicalWater(String location, String userId, int rating) {
        super("Chemical Water", location, userId, rating);
    }
    
   //Method that calculates Pollution level 
    @Override
    public void pollutionLevel(){
       if (rating <= 3) {
           pollutionLevel = 2.0;
       }
       else if (rating <= 7) {
           pollutionLevel = 4.0;
       }
       else {
           pollutionLevel = 6.0;
       }
       
    }
    
    @Override
    public String cleanUpRecommendation(){
        return "Contact hazardous waste management authorities. \nUse proper containers and follow safety guidelines for disposal.";
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
