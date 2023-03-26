package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Tare
 * @code quality by Nikola
 */
public class DoctorsDetails extends javax.swing.JFrame {
    private JComboBox<String> doctorDropdown;
    private JTextArea doctorDetails;
    private String[] doctorNames;
    private String[] doctorInfo;

    public DoctorsDetails() {
        super("Doctor Details");

        // Initialize doctor names and info
        doctorNames = new String[] { "Dr. J", "Dr. A", "Dr. M" };
        doctorInfo = new String[] { "Dr. J - 38, Cardiologist Phone: 07555555555",
                "Dr. A - 67, Neurologist,Phone: 0788888888",
                "Dr. M - 54, Osemetrist,Phone: 0799999999" };

        // Create components
        doctorDropdown = new JComboBox<>(doctorNames);
        doctorDetails = new JTextArea(doctorInfo[0], 10, 30);
        doctorDetails.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(doctorDetails);

        // Add components to content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(doctorDropdown);
        contentPane.add(scrollPane);

        // Add event listener to dropdown
        doctorDropdown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = doctorDropdown.getSelectedIndex();
                doctorDetails.setText(doctorInfo[index]);

                setSize(400, 300);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
            }

            private void initComponents() {

                jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
                jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
                jMenuBar1 = new javax.swing.JMenuBar();

                jCheckBoxMenuItem1.setSelected(true);
                jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

                jCheckBoxMenuItem2.setSelected(true);
                jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGap(0, 400, Short.MAX_VALUE));
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGap(0, 299, Short.MAX_VALUE));

                pack();
            }

            public static void main(String args[]) {

                DoctorsDetails doctorMenu = new DoctorsDetails();
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                            .getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(DoctorsDetails.class.getName())
                            .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(DoctorsDetails.class.getName())
                            .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(DoctorsDetails.class.getName())
                            .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(DoctorsDetails.class.getName())
                            .log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new DoctorsDetails().setVisible(true);
                    }
                });
            }
        });
    }

    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenuBar jMenuBar1;
}