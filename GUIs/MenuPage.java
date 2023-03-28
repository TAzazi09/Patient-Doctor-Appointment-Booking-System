package GUIs;

// imports from the java library
import java.sql.ResultSet;

// imports from the project
import Functionality.DatabaseConnectionFunc;
import Session.Info;

/**
 * @author Ethan
 * @minor code quality changes by Nikola
 */
public class MenuPage extends javax.swing.JFrame {
    public MenuPage() {
        initComponents();
    }

    private void initComponents() {
        javax.swing.JLabel welcomeLabel = new javax.swing.JLabel();
        javax.swing.JButton createBooking = new javax.swing.JButton();
        javax.swing.JButton changeDoctor = new javax.swing.JButton();
        javax.swing.JButton viewBookings = new javax.swing.JButton();
        javax.swing.JButton viewBookingDetails = new javax.swing.JButton();
        javax.swing.JButton viewAllDoctors = new javax.swing.JButton();
        javax.swing.JButton viewDoctorButton = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextArea jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Welcome " + Info.firstname + " " + Info.surname + "!");

        createBooking.setText("Create a booking");
        createBooking.addActionListener(this::createBookingAction);

        changeDoctor.setText("Change your doctor");
        changeDoctor.addActionListener(this::changeDoctorActionPerformed);

        viewBookings.setText("View bookings");
        viewBookings.addActionListener(this::viewBookingsActionPerformed);

        viewBookingDetails.setText("View past booking");

        viewAllDoctors.setText("View all doctors");

        viewDoctorButton.setText("View current doctor");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        try {
            //Selects messages for the patient
            ResultSet message = Info.statement
                    .executeQuery("select messages from patients where patientID = '" + Info.backgroundID + "'");
            while (message.next()) {
                //Adds the messages to the unmodifiable text area
                jTextArea1.append(" - " + message.getString("messages") + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(createBooking)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(viewBookings))
                                        .addComponent(viewDoctorButton)
                                        .addComponent(welcomeLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(viewDoctorButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(changeDoctor))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(viewAllDoctors)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(welcomeLabel)
                                                .addGap(26, 26, 26)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(createBooking)
                                                        .addComponent(viewBookings))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(viewDoctorButton)
                                                        .addComponent(changeDoctor))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(viewAllDoctors))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewDoctorButton)))
                                .addContainerGap(30, Short.MAX_VALUE)));

        pack();
    }

    private void createBookingAction(java.awt.event.ActionEvent evt) {
        dispose();
        BookingPage.main(null);
    }

    private void changeDoctorActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        ChangeDoctorPage.main(null);
    }

    private void viewBookingsActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        ViewBookingPage.main(null);
    }

    public static void main(String[] args) {
       if (DatabaseConnectionFunc.connected) {
            /* Set the Nimbus look and feel */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                        ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                        ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                        ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                        ex);
            }

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> new MenuPage().setVisible(true));
        } else {
            GeneralPage.main(null);
        }
    }
}