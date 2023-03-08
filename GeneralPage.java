public class GeneralPage extends javax.swing.JFrame {
        private javax.swing.JButton logButton;
        private javax.swing.JButton regButton;
        private javax.swing.JLabel helloLabel;
        private javax.swing.JPanel generalPanel;

        public GeneralPage() {
                initComponents();
        }

        // -----------------------------------------------------------------------------------------------------------------------------------
        private void initComponents() {
                generalPanel = new javax.swing.JPanel();
                helloLabel = new javax.swing.JLabel("Hello!");
                logButton = new javax.swing.JButton("Log-in");
                regButton = new javax.swing.JButton("Register");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                generalPanel.setBackground(new java.awt.Color(255, 255, 255));

                helloLabel.setFont(new java.awt.Font("Monospaced", 0, 36));

                logButton.setBackground(new java.awt.Color(65, 175, 255));
                logButton.setFont(new java.awt.Font("Monospaced", 0, 18));
                logButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                logButtonActionPerformed(evt);
                        }
                });

                regButton.setBackground(new java.awt.Color(65, 175, 255));
                regButton.setFont(new java.awt.Font("Monospaced", 0, 18));
                regButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                regButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(generalPanel);
                generalPanel.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(44, 44, 44)
                                                                                                .addComponent(logButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                135,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(regButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                135,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(121, 121, 121)
                                                                                                .addComponent(helloLabel)))
                                                                .addContainerGap(70, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(102, 102, 102)
                                                                .addComponent(helloLabel)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(logButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                46,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(regButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                46,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(92, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(generalPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(generalPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }
        // -----------------------------------------------------------------------------------------------------------------------------------

        // Button functionality
        // When clicked, the username and password are extracted and sent for verification
        private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO
        }

        private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO
        }

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(GeneralPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(GeneralPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(GeneralPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(GeneralPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new GeneralPage().setVisible(true);
                        }
                });
        }
}