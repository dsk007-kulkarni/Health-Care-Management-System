
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class choosepatient extends javax.swing.JFrame {

    java.util.Date date1;
    java.sql.Date sqldate;
      String dname;
      String D_id;
    public choosepatient() {
        initComponents();
        
     panel2.setBackground(new Color(0,153,204,200));
        searchkey.setBackground(new Color(255,255,255,100));
       
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        searchkey = new javax.swing.JPanel();
        dASearchbtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        apTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DRNAME = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        time = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Set Appointment");

        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(457, 457, 457)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1280, 60));

        searchkey.setBackground(new java.awt.Color(255, 255, 255));

        dASearchbtn1.setBackground(new java.awt.Color(255, 255, 255));
        dASearchbtn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dASearchbtn1.setForeground(new java.awt.Color(0, 102, 255));
        dASearchbtn1.setText("NEXT");
        dASearchbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dASearchbtn1MouseClicked(evt);
            }
        });
        dASearchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dASearchbtn1ActionPerformed(evt);
            }
        });

        apTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "First Name", "SecondName", "Age", "Blood Group", "Gender", "Specialization", "Address", "Cnic", "Phoneno", "Maritialstatus", "City", "Joining date", "Leaving date", "Username", "Password"
            }
        ));
        apTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(apTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("DATE");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("TIMING");

        DRNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRNAMEActionPerformed(evt);
            }
        });
        DRNAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DRNAMEKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("PATIENT ID");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchuser.png"))); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        date.setBackground(new java.awt.Color(255, 255, 255));

        time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Time", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM", "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM", "11:00 PM", "12:00 AM", " " }));

        javax.swing.GroupLayout searchkeyLayout = new javax.swing.GroupLayout(searchkey);
        searchkey.setLayout(searchkeyLayout);
        searchkeyLayout.setHorizontalGroup(
            searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(searchkeyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(time, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(dASearchbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
            .addGroup(searchkeyLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(DRNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchkeyLayout.setVerticalGroup(
            searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchkeyLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DRNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchkeyLayout.createSequentialGroup()
                        .addGroup(searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dASearchbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(searchkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        jPanel1.add(searchkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 1180, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked

    }//GEN-LAST:event_jLabel19MouseClicked

    private void dASearchbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dASearchbtn1MouseClicked

    }//GEN-LAST:event_dASearchbtn1MouseClicked

    private void dASearchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dASearchbtn1ActionPerformed
   int row = apTable.getSelectedRow();
   
        String P_id = (apTable.getValueAt(row, 0).toString());    
        String pname1 = (apTable.getValueAt(row, 1).toString());
        String pname2 = (apTable.getValueAt(row, 2).toString());
         try{
           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
            PreparedStatement pst = conn.prepareStatement( "insert into appointment"+"(D_id,dname,P_id,pname,pname2,date,time)"+" values(?,?,?,?,?,?,?)");
           
         date1=date.getDate();
         sqldate =new java.sql.Date(date1.getTime());
String timey=time.getSelectedItem().toString();
   
           pst.setString(1,D_id);
          pst.setString(2,dname);
          pst.setString(3,P_id);
          pst.setString(4,pname1);
          pst.setString(5,pname2);
          pst.setDate(6,sqldate);
      pst.setString(7,timey);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "PATIENT " + pname1 + "  "+ pname2 +" Appointmented with DOCTOR  " + dname+" On  "+sqldate+" At  "+timey);
           date.setDate(null);
           time.setSelectedIndex(0);
         }
            
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
      
                                    
    }//GEN-LAST:event_dASearchbtn1ActionPerformed
public void showTableData(){
    try{
           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM hms_project.patient");
 ResultSet rs=pst.executeQuery();         
 apTable.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
    private void apTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apTableMouseClicked
        int SelectedRow =apTable.getSelectedRow();
        DefaultTableModel table=(DefaultTableModel)apTable.getModel();

    }//GEN-LAST:event_apTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     ReceptionitActivity ra=new ReceptionitActivity();
     ra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DRNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DRNAMEActionPerformed

    private void DRNAMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DRNAMEKeyReleased

    }//GEN-LAST:event_DRNAMEKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
            PreparedStatement pst = conn.prepareStatement( "SELECT * FROM hms_project.patient where P_id=?");
            pst.setString(1,DRNAME.getText());
            ResultSet rs=pst.executeQuery();
            apTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choosepatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DRNAME;
    private javax.swing.JTable apTable;
    private javax.swing.JButton dASearchbtn1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel searchkey;
    private javax.swing.JComboBox time;
    // End of variables declaration//GEN-END:variables
}
