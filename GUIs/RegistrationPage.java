package GUIs;

/**
 * @author krist
 * @cosmetic and functional changes by nik
 * @functional changes by ethan
 */

import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import Functionality.RegistrationCheck;

public class RegistrationPage extends javax.swing.JFrame {
    // Variables declaration
    private javax.swing.JComboBox<String> doctorList;
    private javax.swing.JTextField firstnameInput;
    private javax.swing.JTextField surnameInput;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JTextArea detailsInput;
    private javax.swing.JTextField ageInput;
    public static ButtonGroup totalGroup;

    public RegistrationPage() {
        initComponents();
    }

    public static void main(String[] args) {
        // NetBeans' exception checks
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RegistrationPage().setVisible(true));
    }

    private void initComponents() {
        // Initialise components
        javax.swing.JLabel regLabel = new javax.swing.JLabel("Register");

        javax.swing.JLabel firstnameLabel = new javax.swing.JLabel("First Name");
        firstnameInput = new javax.swing.JTextField();

        javax.swing.JLabel surnameLabel = new javax.swing.JLabel("Surname");
        surnameInput = new javax.swing.JTextField();

        javax.swing.JLabel ageLabel = new javax.swing.JLabel("Age");
        ageInput = new javax.swing.JTextField();

        javax.swing.JLabel genderLabel = new javax.swing.JLabel("Gender");
        javax.swing.JRadioButton maleCheck = new javax.swing.JRadioButton("Male");
        javax.swing.JRadioButton femaleCheck = new javax.swing.JRadioButton("Female");
        javax.swing.JRadioButton otherCheck = new javax.swing.JRadioButton("Other");
        javax.swing.JRadioButton pntsCheck = new javax.swing.JRadioButton("Prefer not to say");

        javax.swing.JLabel phoneLabel = new javax.swing.JLabel("Phone Number");
        phoneInput = new javax.swing.JTextField();

        javax.swing.JLabel doctorLabel = new javax.swing.JLabel("Doctor Chosen");
        doctorList = new javax.swing.JComboBox<>();

        javax.swing.JLabel detailsLabel = new javax.swing.JLabel("Details");
        detailsInput = new javax.swing.JTextArea();

        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JButton backButton = new javax.swing.JButton("Back");
        javax.swing.JButton regButton = new javax.swing.JButton("Register");

        // Set up the form
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setSize(new java.awt.Dimension(900, 900));

        // Set up the components
        regLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 48));
        regLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        firstnameLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));

        surnameLabel.setToolTipText("");
        surnameLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));

        ageLabel.setToolTipText("");
        ageLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));

        genderLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        maleCheck.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        maleCheck.setActionCommand("male");
        femaleCheck.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        femaleCheck.setActionCommand("female");
        otherCheck.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        otherCheck.setActionCommand("other");
        pntsCheck.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        pntsCheck.setActionCommand("pnts");

        ButtonGroup group = new ButtonGroup();
        group.add(femaleCheck);
        group.add(maleCheck);
        group.add(otherCheck);
        group.add(pntsCheck);
        RegistrationPage.totalGroup = group;

        phoneLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));

        doctorLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        doctorList
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr Smith", "Dr Jason", "Dr Andrew" }));
        doctorList.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));

        detailsLabel.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        detailsInput.setColumns(1);
        detailsInput.setLineWrap(true);
        detailsInput.setRows(5);
        detailsInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        detailsInput.setDragEnabled(true);
        detailsInput.setName("");
        jScrollPane1.setViewportView(detailsInput);

        // Set up the buttons
        backButton.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        backButton.addActionListener(this::Back_buttonActionPerformed);

        regButton.setFont(new java.awt.Font("Monospaced", Font.PLAIN, 18));
        regButton.addActionListener(this::Register_buttonActionPerformed);

        // Panel layout code section below
        // -----------------------------------------------------------------------------------------------------------------------------------
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300) // gap between left side of window and left side of panel
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(regLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(doctorLabel)
                                        .addComponent(phoneLabel)
                                        .addComponent(genderLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(maleCheck)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(femaleCheck)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(otherCheck)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pntsCheck))
                                        .addComponent(surnameLabel)
                                        .addComponent(surnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstnameLabel)
                                        .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageLabel)
                                        .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detailsLabel)
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(backButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(5, 5, 5) // gap between buttons
                                                                .addComponent(regButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(doctorList,
                                                                        javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(phoneInput,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 254,
                                                                        Short.MAX_VALUE)))))
                                .addGap(328, 328, 328))); // I don't know what this gap is for
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50) // gap between top of window and top of panel

                                .addComponent(regLabel)
                                .addGap(30, 30, 30) // gap between title and first input

                                .addComponent(firstnameLabel)
                                .addGap(1, 1, 1) // gap between first name label and input
                                .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10) // gap between first name input and surname label

                                .addComponent(surnameLabel)
                                .addGap(1, 1, 1) // gap between surname label and input
                                .addComponent(surnameInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10) // gap between surname input and age label

                                .addComponent(ageLabel)
                                .addGap(1, 1, 1) // gap between age label and input
                                .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10) // gap between age input and details label

                                .addComponent(genderLabel)
                                .addGap(1, 1, 1) // gap between gender label and checkboxes
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(maleCheck)
                                        .addComponent(femaleCheck)
                                        .addComponent(otherCheck)
                                        .addComponent(pntsCheck))
                                .addGap(10, 10, 10) // gap between checkboxes and phone label

                                .addComponent(phoneLabel)
                                .addGap(1, 1, 1) // gap between phone label and input
                                .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10) // gap between phone input and doctor label

                                .addComponent(doctorLabel)
                                .addGap(1, 1, 1) // gap between doctor label and list
                                .addComponent(doctorList, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10) // gap between doctor list and details label

                                .addComponent(detailsLabel)
                                .addGap(1, 1, 1) // gap between details label and input
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20) // gap between details input and buttons

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(regButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(191, Short.MAX_VALUE))); // I don't know what this gap is for

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }
    // -----------------------------------------------------------------------------------------------------------------------------------

    // Button actions
    // Back button - returns to the general page
    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        new GeneralPage().setVisible(true);
        dispose();
    }

    // Register button - checks if all fields are filled in and sends the data to Registration class for further processing
    // Also checks if there are any errors in the data that may result in an SQL error due to our database constraints
    private void Register_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        if (firstnameInput == null) {
            JOptionPane.showMessageDialog(null, "First name is missing!");
        } else if (surnameInput == null) {
            JOptionPane.showMessageDialog(null, "Surname is missing!");
        } else if (ageInput.getText() == null) {
            JOptionPane.showMessageDialog(null, "Age is missing!");
        } else if (RegistrationPage.totalGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Gender is missing!");
        } else if (phoneInput.getText() == null) {
            JOptionPane.showMessageDialog(null, "Phone number is missing!");
        } else if (doctorList.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Doctor is missing!");
        } else if (!ageInput.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Age must be a number!");
        } else if (detailsInput.getText().length() > 100) {
            JOptionPane.showMessageDialog(null, "Details must be less than 100 characters!");
        } else if (firstnameInput.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "First name must be less than or equal to 15 characters!");
        } else if (surnameInput.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Surname must be less than or equal to 15 characters!");
        } else if (phoneInput.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Phone number must be less than or equal to 12 digits!");
        } else if (Integer.parseInt(ageInput.getText()) > 999) {
            JOptionPane.showMessageDialog(null, "Age can be at most a 3-digit number!");
        } else if (Integer.parseInt(ageInput.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "Age must be greater than 0!");
        } else {
            String selection = RegistrationPage.totalGroup.getSelection().getActionCommand();
            boolean outcome = RegistrationCheck.test(firstnameInput.getText(), surnameInput.getText(), selection,
                    Integer.parseInt(ageInput.getText()), phoneInput.getText(),
                    String.valueOf(doctorList.getSelectedItem()), detailsInput.getText());
            if (outcome) {
                RegistrationCheck.sendData(firstnameInput.getText(), surnameInput.getText(), selection,
                        Integer.parseInt(ageInput.getText()), phoneInput.getText(),
                        String.valueOf(doctorList.getSelectedItem()), detailsInput.getText());
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Some error occurred!");
            }
        }
    }
}