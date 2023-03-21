package GUIs;

import java.awt.Frame;
import java.awt.Window;
import java.awt.Window;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Month;
import Functionality.*;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ks818
 * @functionality Ethan
 */
public class viewBooking extends javax.swing.JFrame {

    public String userId = LoginCheck.getFirstName();

    /**
     * Creates new form viewBooking
     */
    public viewBooking() {
        super("View Bookings");
        initComponents();
        logged_user_text.setText("User: " + userId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Title = new javax.swing.JLabel();
        date_selected_text = new javax.swing.JLabel();
        Confirm_button = new javax.swing.JButton();
        logged_user_text = new javax.swing.JLabel();
        Month_Selector = new javax.swing.JComboBox<>();
        yearInput = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        Title.setText("View your bookings");

        date_selected_text.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        date_selected_text.setText("Month   |   Year");

        Confirm_button.setText("Confirm");
        Confirm_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String Year = (String) yearInput.getText();
                String Month = (String) Month_Selector.getSelectedItem();
                System.out.println(Month_Selector.getSelectedItem());
                if(!(Year.matches("\\d{4}"))) {
                    JOptionPane.showMessageDialog(null, "Invalid year!");
                }
                else{
                    System.out.println("You have selected " + Month + " and " + Year);
                    String combination = Year + "-" + Month;
                    System.out.println(combination);
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
            
                        //Connects to the database
                        Connection connection = DatabaseConnectionFunc.getConnection();
                        Statement statement = connection.createStatement();
                        ResultSet results = statement.executeQuery("SELECT DoctorChosen, Date, Time FROM bookings WHERE Date LIKE '%" + combination + "%';");

                        while (results.next()) {
                            System.out.println(results.getString("DoctorChosen"));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                    // Put code here for DB
                    // if(yearInput.getText() != null /* CHANGE THIS TO SAY IF THE RESULT OF THE DB IS NOT NULL THEN */){
                    //     JDialog results = new JDialog();
                    //     JLabel l = new JLabel("Result");
                    //     // For(i = 0, i < results.db, i++){
                    //         // results.add(i)
                    //     //}
                    //     results.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
                    //     results.setBounds(150,150,50,50);
                    //     results.setSize(getPreferredSize());
                    //     results.setVisible(true);
                    //     results.add(l);
                    // }
                } 
            }
        );
        back.setText("Back");
       back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Window[] windows = Window.getWindows();

                    // Close all windows in the array
                    for (Window window : windows) {
                        window.dispose();
                    }                    
                    MenuPage.main(null);            }
        }
        );
        logged_user_text.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        logged_user_text.setText("User: ");

        Month_Selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        // Year_selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logged_user_text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        // .addComponent(back)
                        .addGap(250, 250, 250)
                        .addComponent(Confirm_button)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Month_Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date_selected_text))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title)
                    .addComponent(logged_user_text))
                .addGap(18, 18, 18)
                .addComponent(date_selected_text)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Month_Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Confirm_button)
                .addComponent(back))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Confirm_button;
    private javax.swing.JComboBox<String> Month_Selector;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField yearInput;
    private javax.swing.JLabel date_selected_text;
    private javax.swing.JLabel logged_user_text;
    private javax.swing.JButton back;
    // End of variables declaration
}
