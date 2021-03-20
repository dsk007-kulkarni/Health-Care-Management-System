
import java.awt.Color;

public class DRPATIENTDETAILS extends javax.swing.JFrame {

    /**
     * Creates new form DRPATIENTDETAILS
     */
    public DRPATIENTDETAILS() {
        initComponents();
         j1.setBackground(new Color(255,255,255,100));
         j2.setBackground(new Color(255,255,255,100));
           J3.setBackground(new Color(255,255,255,100));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        j1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        j2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        J3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADD (6).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("ADD PATIENT DETAILS");

        javax.swing.GroupLayout j1Layout = new javax.swing.GroupLayout(j1);
        j1.setLayout(j1Layout);
        j1Layout.setHorizontalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(j1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(j1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 390, 300));

        j2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HISTORY.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("CHECK PATIENT HISTORY");

        javax.swing.GroupLayout j2Layout = new javax.swing.GroupLayout(j2);
        j2.setLayout(j2Layout);
        j2Layout.setHorizontalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j2Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(j2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        j2Layout.setVerticalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(j2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 390, 300));

        J3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("PATIENT'S PORTAL");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (2).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout J3Layout = new javax.swing.GroupLayout(J3);
        J3.setLayout(J3Layout);
        J3Layout.setHorizontalGroup(
            J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        J3Layout.setVerticalGroup(
            J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, J3Layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );

        jPanel1.add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pat.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        doctoractivity da=new doctoractivity();
        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       drpatientadddetail dp=new drpatientadddetail();
       dp.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       history h=new history();
       h.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(DRPATIENTDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DRPATIENTDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DRPATIENTDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DRPATIENTDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DRPATIENTDETAILS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel J3;
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
