package hidroponiksahabat;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GantiPassword extends javax.swing.JFrame {

    /**
     * Creates new form GantiPassword
     */
    public GantiPassword() {
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

        jSeparator1 = new javax.swing.JSeparator();
        background1 = new hidroponiksahabat.Background();
        jLabel1 = new javax.swing.JLabel();
        jButtonMin = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        ButtonCancel = new javax.swing.JButton();
        ButtonGantiPass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 320, 10));

        background1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Form Ganti Password");

        jButtonMin.setBackground(new java.awt.Color(16, 203, 22));
        jButtonMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMin.setText("—");
        jButtonMin.setFocusable(false);
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });

        jButtonClose.setBackground(new java.awt.Color(255, 0, 0));
        jButtonClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClose.setText("X");
        jButtonClose.setFocusable(false);
        jButtonClose.setMaximumSize(new java.awt.Dimension(49, 31));
        jButtonClose.setMinimumSize(new java.awt.Dimension(49, 31));
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password Baru");

        ButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonGantiPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonGantiPass.setText("Ganti Password");
        ButtonGantiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGantiPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonMin))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(ButtonGantiPass))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(ButtonCancel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMin)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(ButtonGantiPass)
                .addGap(27, 27, 27)
                .addComponent(ButtonCancel)
                .addGap(37, 37, 37))
        );

        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGantiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGantiPassActionPerformed
        if (password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kolom Password Tidak Boleh Kosong!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Statement stat = (Statement) koneksi.koneksiDB().createStatement();
                String sql = "Update password SET password='" + password.getText() + "' WHERE no='1'";
                stat.execute(sql);
                JOptionPane.showMessageDialog(this, "Password Berhasil Diganti!");

            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());
            }
            
            this.setVisible(false);
            new Home().setVisible(true);
        }
    }//GEN-LAST:event_ButtonGantiPassActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

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
            java.util.logging.Logger.getLogger(GantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GantiPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonGantiPass;
    private hidroponiksahabat.Background background1;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
