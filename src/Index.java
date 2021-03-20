
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Index extends javax.swing.JFrame {

     
    public Index() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        adminbtn = new javax.swing.JButton();
        adminbtn1 = new javax.swing.JButton();
        adminbtn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adminbtn3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(2000, 1000));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminbtn.setBackground(new java.awt.Color(255, 255, 255));
        adminbtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminbtn.setForeground(new java.awt.Color(51, 153, 255));
        adminbtn.setText("RECEPTIONIST");
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });
        jPanel2.add(adminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 170, 50));

        adminbtn1.setBackground(new java.awt.Color(255, 255, 255));
        adminbtn1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminbtn1.setForeground(new java.awt.Color(51, 153, 255));
        adminbtn1.setText("PHARMACIST");
        adminbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(adminbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, 160, 50));

        adminbtn2.setBackground(new java.awt.Color(255, 255, 255));
        adminbtn2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminbtn2.setForeground(new java.awt.Color(51, 153, 255));
        adminbtn2.setText("ADMIN");
        adminbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminbtn2MouseClicked(evt);
            }
        });
        adminbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(adminbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/receptionist.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 120, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor (4).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 120, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 120, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 130, 140));

        adminbtn3.setBackground(new java.awt.Color(255, 255, 255));
        adminbtn3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminbtn3.setForeground(new java.awt.Color(51, 153, 255));
        adminbtn3.setText("DOCTOR");
        adminbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(adminbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 160, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hcare.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 1040, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hmbackground.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminbtn2MouseClicked
Adminlogin a=new Adminlogin();
a.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_adminbtn2MouseClicked

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
       ReceptionistLogin rl=new ReceptionistLogin();
       rl.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_adminbtnActionPerformed

    private void adminbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtn1ActionPerformed
  medicinedetails1 ma=new medicinedetails1();
        ma.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_adminbtn1ActionPerformed

    private void adminbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminbtn2ActionPerformed

    private void adminbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtn3ActionPerformed
doctorlogin dl=new doctorlogin();
dl.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_adminbtn3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbtn;
    private javax.swing.JButton adminbtn1;
    private javax.swing.JButton adminbtn2;
    private javax.swing.JButton adminbtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}