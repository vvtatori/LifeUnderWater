/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pollution;

/**
 *
 * @author Virginiah, Gavin, Dylan
 */
public class OceanicApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //When the application is run, it sets the main GUI visible.
        MainAppGUI mainGUI = new MainAppGUI();
        mainGUI.setVisible(true);
        
        //Setting all other GUI's to be hidden.
        CleanUpGUI cleanUpFrame = new CleanUpGUI();
        cleanUpFrame.setVisible(false);
        
        PollutionGUI pollutionGUI = new PollutionGUI();
        pollutionGUI.setVisible(false);
    }
    
}
