/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pollution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Virginiah
 */
public class PollutionGUI extends javax.swing.JFrame {
    ArrayList<Pollution> pollutionList;
    /**
     * Creates new form PollutionGUI
     */
    public PollutionGUI() {
        initComponents();
        pollutionList = new ArrayList<>();
        loadFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPollution = new javax.swing.JLabel();
        lblPollution2 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPollutionType = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        cmbPollutionType = new javax.swing.JComboBox<>();
        txtUserId = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtRating = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();
        lblCleanUp = new javax.swing.JLabel();
        btnCleanUp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblPollution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pollution icon.png"))); // NOI18N
        lblPollution.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPollution2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPollution2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pollution icon.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTitle.setText("Report to us any Pollution Encountred Below");

        lblPollutionType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPollutionType.setText("Pollution Type");

        lblUserId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserId.setText("User Id");

        lblLocation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLocation.setText("Location");

        lblRating.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRating.setText("Rating");

        cmbPollutionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chemical Water", "Oil Spillage", "Plastic Waste" }));
        cmbPollutionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPollutionTypeActionPerformed(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pollution buttons.png"))); // NOI18N
        btnReport.setText("Submit Report ");
        btnReport.setBorder(null);
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        lblCleanUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCleanUp.setText("Participate in our cleanUp Activities:");

        btnCleanUp.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        btnCleanUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pollution buttons.png"))); // NOI18N
        btnCleanUp.setText("Sign Up");
        btnCleanUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255)));
        btnCleanUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCleanUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanUpActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(204, 204, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("SAVE REPORT");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDisplay.setBackground(new java.awt.Color(204, 204, 255));
        btnDisplay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDisplay.setText("DISPLAY REPORTS");
        btnDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisplay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPollution2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPollution, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPollutionType, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(lblUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUserId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRating, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPollutionType, javax.swing.GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCleanUp, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnCleanUp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPollution, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblPollution2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPollutionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPollutionType))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserId)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRating)
                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCleanUp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCleanUp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPollutionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPollutionTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPollutionTypeActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        //This button collects the records the pollution report input by the user
        String userId = txtUserId.getText();
        String location = txtLocation.getText();
        int rating;
        String type = cmbPollutionType.getSelectedItem().toString();
        
        //declaring an instance of pollution which would then be either of the 3 types
        Pollution pollution;
        
        //checking if the rating entered is an integer
        try{
            rating = Integer.parseInt(txtRating.getText());
            if(rating < 1 || rating > 10) {
                JOptionPane.showMessageDialog(this, "Rating must be between 1 and 10.");
                return;
            }  
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Input" + "Rating must be a valid integer.");
            return;
        }
        
        //Creating an instance of the pollution subclasses based on the input on the combo box
        switch (type) {
        case "Oil Spillage":
            pollution = new OilSpillage(location, userId, rating);
            break;
        case "Chemical Water":
            pollution = new ChemicalWater(location, userId, rating);
            break;
        case "Plastic Waste":
            pollution = new PlasticWaste(location, userId, rating);
            break;
        default:
            JOptionPane.showMessageDialog(this, "Invalid pollution type!");
            return;
        }
        
        //adding the object to the arrayList
        pollutionList.add(pollution);
        JOptionPane.showMessageDialog(this, pollution.details());
    }//GEN-LAST:event_btnReportActionPerformed

    //This load file method creates the file for the reports to be read into and allows the user reports to be saved into the file
    private void loadFile() {
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        f = new File("pollution.dat");
        //Checking if the file exists before trying to load the file
        if (!f.exists()) {
            System.out.println("File does not exist. It will be created when data is saved.");
            //return;
        }
        try {
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            // Read the pollution object from the file
            pollutionList = (ArrayList<Pollution>)oStream.readObject();
            System.out.println("Pollution deatails loaded: ");
            oStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File input error on loading file: " + e);
        }
    }
    
    private void btnCleanUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanUpActionPerformed
        //When clicked the pollution GUI is hidden and the cleanUpRegistration displayed
        CleanUpGUI cleanUpFrame= new CleanUpGUI();
        cleanUpFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCleanUpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Brings the user back to the Main Page
        MainAppGUI mainGUI = new MainAppGUI();
        mainGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //Exits program when button is clocked
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        try {
            f = new File("pollution.dat");
            // Append to the file if it exists, otherwise create a new one
            fStream = new FileOutputStream(f, true);
            oStream = new ObjectOutputStream(fStream);
            // Write the pollution object to the file
            oStream.writeObject(pollutionList);
            oStream.close();
            System.out.println("Pollution report saved successfully.");
            JOptionPane.showMessageDialog(this, "Saved!");
            
            //Clearing text fields for the next items
            txtUserId.setText("");
            txtLocation.setText("");
            txtRating.setText("");
            cmbPollutionType.setSelectedIndex(0);
        } catch (IOException e) {
            System.out.println("Error saving pollution object: " + e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        //looping through the arraylist to display pollution Object
        for (Pollution p : pollutionList){
            displayTA.setText(p.details() + "\n");
        }
        
        //Displaying objects without using array of objects
//        File f;
//        FileInputStream fStream;
//        ObjectInputStream oStream;
//
//        try {
//            f = new File("pollution.dat");
//            fStream = new FileInputStream(f);
//            oStream = new ObjectInputStream(fStream);
//
//            // Read the objects from the file and display them
//           // Pollution pollution;
//            while (true) {
//                try {
//                    // Read the Pollution object from the file
//                    Pollution pollution = (Pollution) oStream.readObject();
//                    // Append the Pollution object data to the JTextArea
//                    displayTA.append("\n" + pollution.details());
//                } catch (EOFException e) {
//                    // End of file reached, exit the loop
//                    break;
//                }
//            }
//
//            // Close the input stream
//            oStream.close();
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Error reading from file: " + e.getMessage());
//        }
          
    }//GEN-LAST:event_btnDisplayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PollutionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PollutionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PollutionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PollutionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PollutionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCleanUp;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbPollutionType;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCleanUp;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPollution;
    private javax.swing.JLabel lblPollution2;
    private javax.swing.JLabel lblPollutionType;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
