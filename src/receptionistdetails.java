
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class receptionistdetails extends javax.swing.JFrame {

    /**
     * Creates new form receptionistdetails
     */
    public receptionistdetails() {
        initComponents();
        showTableData();
    }
String s;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        age = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cnic = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        rphoto = new javax.swing.JLabel();
        adddoctor = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        search = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 150, 1303, 766));

        jPanel1.setBackground(new java.awt.Color(93, 154, 244));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RECEPTIONIST DETAILS");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 667, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("RECEPTIONIST ID");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Age");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Second Name");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Gender");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Address");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Adhar");

        cnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("City");

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 204));
        jLabel18.setText("Phone no");

        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });

        rphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECETIONISTDETAILS.png"))); // NOI18N
        rphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adddoctor.setBackground(new java.awt.Color(255, 255, 255));
        adddoctor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adddoctor.setForeground(new java.awt.Color(0, 102, 204));
        adddoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adduser.png"))); // NOI18N
        adddoctor.setText("ADD RECEPT");
        adddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DELETESMALL.png"))); // NOI18N
        jButton4.setText("REMOVE RECEP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UPDATESMALL.png"))); // NOI18N
        update.setText("UPDATE RECEP");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("Password");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setText("Username");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 204));
        jLabel20.setText("SEARCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(firstname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(phoneno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(secondname, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addComponent(rphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(220, 220, 220)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adddoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secondname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap=new adminpanel();
        ap.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void cnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnicActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed
public void showTableData(){
    try{
           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM hms_project.receptionist");
 ResultSet rs=pst.executeQuery();         
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
    private void adddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorActionPerformed
  
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
            PreparedStatement pst = conn.prepareStatement( "insert into receptionist"+"(R_id,firstname,secondname,address,cnic,age,gender,phoneno,city,username,password)"+" values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,rid.getText());
            pst.setString(2,firstname.getText());
            pst.setString(3,secondname.getText());
            pst.setString(4,address.getText());
            pst.setString(5,cnic.getText());
            pst.setString(6,age.getText());
            pst.setString(7, (String) gender.getSelectedItem());
             pst.setString(8,phoneno.getText());
          pst.setString(9,city.getText());
           
             pst.setString(10,username.getText());
             pst.setString(11,password.getText());
              
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Inserted Sucessfully");
            showTableData();
           rid.setText(null);
           firstname.setText(null);
           secondname.setText(null);
            address.setText(null);
           cnic.setText(null);
           age.setText(null);
           gender.setSelectedIndex(0);
          phoneno.setText(null);
           city.setText(null);
           username.setText(null);
            password.setText(null);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_adddoctorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
             PreparedStatement pst = conn.prepareStatement("delete from receptionist where R_id =?");
            pst.setString(1,rid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Deleted Sucessfully");
            showTableData();
             rid.setText(null);
           firstname.setText(null);
           secondname.setText(null);
            address.setText(null);
           cnic.setText(null);
           age.setText(null);
           gender.setSelectedIndex(0);
          phoneno.setText(null);
           city.setText(null);
           username.setText(null);
            password.setText(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
                                    
       try{
         Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_project?useSSL=false","root","qwerty");
            PreparedStatement pst = conn.prepareStatement("UPDATE receptionist SET firstname=?,secondname=?,address=?,cnic=?,age=?,gender=?,phoneno=?,city=?,username=?,password=? WHERE R_id=?");
           
            pst.setString(1,firstname.getText());
            pst.setString(2,secondname.getText());
            pst.setString(3,address.getText());
            pst.setString(4,cnic.getText());
            pst.setString(5,age.getText());
            pst.setString(6, (String) gender.getSelectedItem());
        
            pst.setString(7,phoneno.getText());
               pst.setString(8,city.getText());
            pst.setString(9,username.getText());
            pst.setString(10,password.getText());
            pst.setString(11,rid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Updated Sucessfully");
             showTableData();
 
           
       }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int SelectedRow =jTable1.getSelectedRow();
           DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
           rid.setText(table.getValueAt(SelectedRow, 0).toString());
            firstname.setText(table.getValueAt(SelectedRow, 1).toString());
             secondname.setText(table.getValueAt(SelectedRow, 2).toString()); 
             
address.setText(table.getValueAt(SelectedRow, 3).toString());
cnic.setText(table.getValueAt(SelectedRow, 4).toString());
age.setText(table.getValueAt(SelectedRow, 5).toString());
gender.setSelectedItem(table.getValueAt(SelectedRow, 6).toString());
phoneno.setText(table.getValueAt(SelectedRow, 7).toString());
city.setText(table.getValueAt(SelectedRow, 8).toString());   
username.setText(table.getValueAt(SelectedRow, 9).toString());
password.setText(table.getValueAt(SelectedRow, 10).toString()); 

// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        String search1=search.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1));   // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyReleased

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(receptionistdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receptionistdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receptionistdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receptionistdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receptionistdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddoctor;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField city;
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField rid;
    private javax.swing.JLabel rphoto;
    private javax.swing.JTextField search;
    private javax.swing.JTextField secondname;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(rphoto.getWidth(), rphoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
}}
