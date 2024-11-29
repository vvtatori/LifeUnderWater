/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pollution;

/**
 *
 * @author Virginiah
 */

import java.util.ArrayList;

public class CleanUp {
    //Data members
    private String name;
    private String contactInfo;
    private String locationSelected;
    private String date;
    private String time;
    private char groupAssigned;
    private final int maxNum = 10; //There can only be 10 people in a group. Initializes the maximum number to 10
    
    //ArrayLists to store the groups for registration. There only five groups A - E
    private ArrayList<String> groupA = new ArrayList<>();
    private ArrayList<String> groupB = new ArrayList<>();
    private ArrayList<String> groupC = new ArrayList<>();
    private ArrayList<String> groupD = new ArrayList<>();
    private ArrayList<String> groupE = new ArrayList<>();
    
    //Constructor
    public CleanUp(String name, String contactInfo, String locationSelected, String date, String time) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.locationSelected = locationSelected;
        this.date = date;
        this.time = time;
    }
    
    //Set methods to set the values to be acquired from the user to create a user's deatails
    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setLocationSelected(String locationSelected) {
        this.locationSelected = locationSelected;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    //Compute method - calculates the number of people in a group to check whether the group is full
    //Assigns the group to the user if the group is not full
    public void assignGroup(){
        if (groupA.size() < maxNum) {
            groupA.add(this.name); // Using the user's input name as the identifier to add the names to a group.
            groupAssigned = 'A';
        } else if (groupB.size() < maxNum) {
            groupB.add(this.name);
            groupAssigned = 'B';
        } else if (groupC.size() < maxNum) {
            groupC.add(this.name);
            groupAssigned = 'C';
        } else if (groupD.size() < maxNum) {
            groupD.add(this.name);
            groupAssigned = 'D';
        } else if (groupE.size() < maxNum) {
            groupE.add(this.name);
            groupAssigned = 'E';
        } else {
            groupAssigned = '!';
        }
    }
    
    //get methods to get the data input from the user
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getLocationSelected() {
        return locationSelected;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public char getGroupAssigned() {
        return groupAssigned;
    }
    
    //Method that outputs all the registration deatils to the user
    public String returnDetails(){
        assignGroup();
        if(groupAssigned == '!'){
            return "Registration failed: All groups are full.";
        }
        else{
            return "Registered successfully! Group: " + groupAssigned +
               "\nName: " + name +
               "\nContact: " + contactInfo +
               "\nDate: " + date +
               "\nTime: " + time +
               "\nLocation Selected: " + locationSelected;
        }
    }
}
