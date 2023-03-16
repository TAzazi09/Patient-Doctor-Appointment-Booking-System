package GUIs;

/**
 * @author Nikola
 */
public class ArrangeBooking extends javax.swing.JFrame {

    public ArrangeBooking() {
        initComponents();
    }

    private void initComponents() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));

        panel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        arrangeButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        timeText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        mainLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setName(""); // NOI18N

        panel.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setBackground(new java.awt.Color(65, 175, 255));
        backButton.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton.setLabel("Back");
        backButton.setMaximumSize(new java.awt.Dimension(68, 27));
        backButton.setMinimumSize(new java.awt.Dimension(68, 27));
        backButton.setPreferredSize(new java.awt.Dimension(68, 27));

        arrangeButton.setBackground(new java.awt.Color(65, 175, 255));
        arrangeButton.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        arrangeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        arrangeButton.setLabel("Arrange");
        arrangeButton.setMaximumSize(new java.awt.Dimension(68, 27));
        arrangeButton.setMinimumSize(new java.awt.Dimension(68, 27));
        arrangeButton.setPreferredSize(new java.awt.Dimension(68, 27));
        arrangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrangeButtonActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        timeLabel.setText("Time");

        timeText.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        timeText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTextActionPerformed(evt);
            }
        });

        dateText.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        dateText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dateLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        dateLabel.setText("Date");

        mainLabel.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        mainLabel.setText("Arrange a booking");

        instructionLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        instructionLabel.setText("Please enter your desired date and time");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(mainLabel)
                                                .addGap(20, 20, 20))
                                        .addComponent(instructionLabel))
                                .addGap(27, 27, 27))
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(arrangeButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(panelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                .addComponent(dateLabel)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(dateText,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                .addComponent(timeLabel)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(timeText,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(70, 70, 70)));
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(mainLabel)
                                .addGap(5, 5, 5)
                                .addComponent(instructionLabel)
                                .addGap(75, 75, 75)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateLabel))
                                .addGap(10, 10, 10)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(timeLabel)
                                        .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(arrangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 429,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(300, 300, 300)));

        pack();
    }// </editor-fold>                        

    private void timeTextActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void arrangeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(ArrangeBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArrangeBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArrangeBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArrangeBooking.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArrangeBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton arrangeButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateText;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField timeText;
    // End of variables declaration                   
}
