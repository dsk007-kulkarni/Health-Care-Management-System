
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class bed extends javax.swing.JFrame {

    public bed() {
        initComponents();
        panel2.setBackground(new Color(255,255,255,100));
         showTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        bedno = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        depttable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        category = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setOpaque(false);

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(24, 24, 25));
        jLabel35.setText("Bed Number");

        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomrefActionPerformed(evt);
            }
        });

        bedno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bednonameActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(9, 13, 16));
        jLabel36.setText("Room No.");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(9, 16, 22));
        jLabel37.setText("Category");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setText("ADD BED");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3jButton1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 204));
        jButton8.setText("REMOVE BED");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton4ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 204));
        jButton9.setText("UPDATE BED");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9jButton5ActionPerformed(evt);
            }
        });

        depttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        depttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depttableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(depttable);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 23, 27));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("BED DETAILS");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (2).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "ICU", "CCU", "Genernal Ward", "Emergency", "NIL" }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BEDDETAILS.png"))); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bedno, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addGap(34, 34, 34)
                            .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bedno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(131, 131, 131)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1250, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bed (2).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void roomrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomrefActionPerformed

    private void bednonameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bednonameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bednonameActionPerformed

    private void jButton3jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3jButton1ActionPerformed
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
             PreparedStatement pst = conn.prepareStatement("insert into bed"+"(BedNo,category,room)"+" values(?,?,?)");
            pst.setString(1,bedno.getText());
            pst.setString(2,category.getSelectedItem().toString());
            pst.setString(3,room.getText());
            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"BED Added Sucessfully");
            showTableData();
            bedno.setText(null);
            category.setSelectedIndex(0);
            room.setText(null);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_jButton3jButton1ActionPerformed
public void showTableData(){
    try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hms_project.bed");
 ResultSet rs=pst.executeQuery();         
 depttable.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}
    private void jButton8jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton4ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
             PreparedStatement pst = conn.prepareStatement("delete from bed where BedNo=?");
            pst.setString(1,bedno.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Deleted Sucessfully");
            showTableData();
            bedno.setText(null);
            category.setSelectedIndex(0);
            room.setText(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton8jButton4ActionPerformed

    private void jButton9jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9jButton5ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
            PreparedStatement pst = conn.prepareStatement("UPDATE bed SET category=?,room=? WHERE BedNo=?");

            pst.setString(2,room.getText());
            pst.setString(1,category.getSelectedItem().toString());
 pst.setString(3,bedno.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Updated Sucessfully");
            showTableData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton9jButton5ActionPerformed

    private void depttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depttableMouseClicked
        int SelectedRow =depttable.getSelectedRow();
        DefaultTableModel table=(DefaultTableModel)depttable.getModel();
        bedno.setText(table.getValueAt(SelectedRow, 0).toString());
        category.setSelectedItem(table.getValueAt(SelectedRow, 1).toString());
       
        room.setText(table.getValueAt(SelectedRow, 2).toString());
    }//GEN-LAST:event_depttableMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        adminpanel ap=new adminpanel();
        ap.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bedno;
    private javax.swing.JComboBox category;
    private javax.swing.JTable depttable;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField room;
    // End of variables declaration//GEN-END:variables
}
