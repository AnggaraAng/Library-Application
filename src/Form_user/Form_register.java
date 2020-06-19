/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Connection.connection;
import Menu.Menu_Admin;
import Menu.Menu_Mahasiswa;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class Form_register extends javax.swing.JFrame {
    public Menu_Mahasiswa masuk;
    public Menu_Admin masuk2;
    public Connection con;
    public PreparedStatement pst;
    ResultSet rs;
    
    public Form_register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Combo_hak_akses = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_pass1 = new javax.swing.JLabel();
        label_login_id = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        btn_Cancel = new javax.swing.JButton();
        text_full_name = new javax.swing.JTextField();
        label_username = new javax.swing.JLabel();
        Click_here_to_login = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_pass2 = new javax.swing.JLabel();
        label_full_name = new javax.swing.JLabel();
        text_email = new javax.swing.JTextField();
        text_pass1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btn_Create = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_pass2 = new javax.swing.JPasswordField();
        text_option = new javax.swing.JComboBox<>();

        Combo_hak_akses.setEditable(true);
        Combo_hak_akses.setForeground(new java.awt.Color(27, 188, 155));
        Combo_hak_akses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

        jPanel2.setBackground(new java.awt.Color(27, 188, 155));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        label_pass1.setBackground(new java.awt.Color(255, 255, 255));
        label_pass1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        label_pass1.setForeground(new java.awt.Color(255, 255, 255));
        label_pass1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_pass1.setText("Password");

        label_login_id.setBackground(new java.awt.Color(255, 255, 255));
        label_login_id.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        label_login_id.setForeground(new java.awt.Color(255, 255, 255));
        label_login_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_login_id.setText("User ID");

        text_id.setForeground(new java.awt.Color(27, 188, 155));
        text_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_idActionPerformed(evt);
            }
        });

        btn_Cancel.setBackground(new java.awt.Color(101, 198, 187));
        btn_Cancel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        btn_Cancel.setForeground(new java.awt.Color(1, 50, 67));
        btn_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        text_full_name.setForeground(new java.awt.Color(27, 188, 155));
        text_full_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_full_nameActionPerformed(evt);
            }
        });

        label_username.setBackground(new java.awt.Color(255, 255, 255));
        label_username.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        label_username.setForeground(new java.awt.Color(255, 255, 255));
        label_username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_username.setText("Options");

        Click_here_to_login.setBackground(new java.awt.Color(255, 255, 255));
        Click_here_to_login.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        Click_here_to_login.setForeground(new java.awt.Color(255, 255, 255));
        Click_here_to_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Click_here_to_login.setText("Click here to Login");
        Click_here_to_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Click_here_to_loginMouseClicked(evt);
            }
        });

        label_email.setBackground(new java.awt.Color(255, 255, 255));
        label_email.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        label_email.setForeground(new java.awt.Color(255, 255, 255));
        label_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_email.setText("E-mail");

        label_pass2.setBackground(new java.awt.Color(255, 255, 255));
        label_pass2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        label_pass2.setForeground(new java.awt.Color(255, 255, 255));
        label_pass2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_pass2.setText("Confirm Password");

        label_full_name.setBackground(new java.awt.Color(255, 255, 255));
        label_full_name.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        label_full_name.setForeground(new java.awt.Color(255, 255, 255));
        label_full_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_full_name.setText("Full Name");

        text_email.setForeground(new java.awt.Color(27, 188, 155));
        text_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_emailActionPerformed(evt);
            }
        });

        text_pass1.setForeground(new java.awt.Color(27, 188, 155));
        text_pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pass1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REGISTER FORM");

        btn_Create.setBackground(new java.awt.Color(101, 198, 187));
        btn_Create.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        btn_Create.setForeground(new java.awt.Color(1, 50, 67));
        btn_Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Create.png"))); // NOI18N
        btn_Create.setText("Create");
        btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Digital");

        jLabel3.setBackground(new java.awt.Color(27, 188, 155));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 188, 155));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Library");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Satya Wacana Christian University");

        text_pass2.setForeground(new java.awt.Color(27, 188, 155));
        text_pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pass2ActionPerformed(evt);
            }
        });

        text_option.setEditable(true);
        text_option.setForeground(new java.awt.Color(27, 188, 155));
        text_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Student" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_full_name)
                                    .addComponent(label_login_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_email)
                                    .addComponent(label_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_username))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_pass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(text_full_name)
                                        .addComponent(text_id)
                                        .addComponent(text_email)
                                        .addComponent(text_option, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_pass2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Click_here_to_login)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_login_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_full_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_option, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_username))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btn_Create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Click_here_to_login, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_idActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        Form_login rgs = new Form_login();
        rgs.setVisible(true);
        rgs.pack();
        rgs.setLocationRelativeTo(null);
        rgs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void text_full_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_full_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_full_nameActionPerformed

    private void Click_here_to_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Click_here_to_loginMouseClicked
        Form_login rgs = new Form_login();
        rgs.setVisible(true);
        rgs.pack();
        rgs.setLocationRelativeTo(null);
        rgs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Click_here_to_loginMouseClicked

    private void text_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_emailActionPerformed

    private void text_pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pass1ActionPerformed

    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
         String user_id="", full_name="", option="", email="", password="", confirm_password="";
         
        user_id = text_id.getText();
        full_name = text_full_name.getText();
        option = (String) text_option.getSelectedItem();
        email = text_email.getText();
        password = text_pass1.getText();
        confirm_password = text_pass2.getText();
        
        con = connection.getConnection();
        try {
            String sql = "insert into tb_user values (?,?,?,?,?,?)";
            PreparedStatement stat = (PreparedStatement) 
            con.prepareStatement(sql);
            
            stat.setString(1, user_id);
            stat.setString(2, full_name);
            stat.setString(3, option);
            stat.setString(4, email);
            stat.setString(5, password);
            stat.setString(6, confirm_password);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            reset();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_CreateActionPerformed
public void reset(){
        text_id.setText(null);
        text_full_name.setText(null);
        text_email.setText(null);
        text_pass1.setText(null);
        text_pass2.setText(null);
    }
    private void text_pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pass2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Click_here_to_login;
    private javax.swing.JComboBox<String> Combo_hak_akses;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Create;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_full_name;
    private javax.swing.JLabel label_login_id;
    private javax.swing.JLabel label_pass1;
    private javax.swing.JLabel label_pass2;
    private javax.swing.JLabel label_username;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_full_name;
    private javax.swing.JTextField text_id;
    private javax.swing.JComboBox<String> text_option;
    private javax.swing.JPasswordField text_pass1;
    private javax.swing.JPasswordField text_pass2;
    // End of variables declaration//GEN-END:variables
}
