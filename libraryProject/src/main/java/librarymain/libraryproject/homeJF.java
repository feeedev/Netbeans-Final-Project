/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymain.libraryproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author palat
 */
public class homeJF extends javax.swing.JFrame {

    /**
     * Creates new form mainJF
     */
    public homeJF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtWelcome = new javax.swing.JLabel();
        LabelUsername = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        LabelMadewith = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBkHistoryHead = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBkBorrow = new javax.swing.JTable();
        btnSearchBk = new javax.swing.JButton();
        btnBorrowBk = new javax.swing.JButton();
        btnReturnBk = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setBackground(new java.awt.Color(255, 227, 227));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        panel1.setPreferredSize(new java.awt.Dimension(1040, 570));

        jDesktopPane1.setBackground(new java.awt.Color(255, 227, 227));

        txtWelcome.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        txtWelcome.setText("Welcome! Bangkok University Student");

        LabelUsername.setText("Username");

        inputUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        LabelPassword.setText("Password");

        btnLogin.setBackground(new java.awt.Color(255, 128, 128));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        LabelMadewith.setText("Made with ❤");

        jDesktopPane1.setLayer(txtWelcome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(inputUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(inputPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelMadewith, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelPassword)
                            .addComponent(LabelUsername)
                            .addComponent(txtWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputUsername)
                            .addComponent(inputPassword)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(LabelMadewith)
                                .addGap(15, 15, 15)))))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(txtWelcome)
                .addGap(26, 26, 26)
                .addComponent(LabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMadewith)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        getContentPane().add(panel1, "card3");

        panel2.setBackground(new java.awt.Color(255, 227, 227));
        panel2.setMaximumSize(new java.awt.Dimension(1040, 570));
        panel2.setMinimumSize(new java.awt.Dimension(1040, 570));
        panel2.setPreferredSize(new java.awt.Dimension(1040, 570));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Welcome Palatip Jantawong (1640704027)");

        lblBkHistoryHead.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBkHistoryHead.setText("Book borrowing history");

        tableBkBorrow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Author", "Borrow Date", "Returned Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBkBorrow);
        if (tableBkBorrow.getColumnModel().getColumnCount() > 0) {
            tableBkBorrow.getColumnModel().getColumn(0).setResizable(false);
            tableBkBorrow.getColumnModel().getColumn(1).setResizable(false);
        }

        btnSearchBk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearchBk.setText("Search Book");
        btnSearchBk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchBkMouseClicked(evt);
            }
        });
        btnSearchBk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBkActionPerformed(evt);
            }
        });

        btnBorrowBk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrowBk.setText("Borrow Book");
        btnBorrowBk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrowBkMouseClicked(evt);
            }
        });

        btnReturnBk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReturnBk.setText("Return book");
        btnReturnBk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnBkMouseClicked(evt);
            }
        });
        btnReturnBk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBkActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBkHistoryHead)
                                    .addComponent(jLabel1)))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(btnSearchBk)
                                .addGap(99, 99, 99)
                                .addComponent(btnBorrowBk)
                                .addGap(118, 118, 118)
                                .addComponent(btnReturnBk)))
                        .addGap(0, 271, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(lblBkHistoryHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchBk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrowBk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturnBk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(panel2, "card3");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        String userNameInput = inputUsername.getText();
        String passwordInput = inputPassword.getText();
        String[] sArray = null;
        List<String> UsernameAll = new ArrayList<>();
        List<String> PasswordAll = new ArrayList<>();
        //System.out.println(userNameInput + "  " +passwordInput);
        try {
            Scanner in = new Scanner(new File("login.txt"));
            while (in.hasNextLine())
            {
              String s = in.nextLine();  
              sArray = s.split(",");
              UsernameAll.add(sArray[0]);
              PasswordAll.add(sArray[1]);
              
            } //papatsiri.apip Poxxy8990
            in.close();
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "User Database Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        System.out.println(UsernameAll + "\n" + PasswordAll); 
        //Just to verify that file is being read
        if (UsernameAll.contains(userNameInput) && PasswordAll.contains(passwordInput)) {
            JOptionPane.showMessageDialog(null,"Login Successful", "Success",JOptionPane.INFORMATION_MESSAGE);
            panel2.setVisible(true);
            panel1.setVisible(false);
         }
         else {
            JOptionPane.showMessageDialog(null,"Invalid Username / Password Combo", "Error",JOptionPane.ERROR_MESSAGE);
         }
          
        
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnReturnBkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReturnBkActionPerformed

    private void btnSearchBkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchBkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchBkMouseClicked

    private void btnSearchBkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBkActionPerformed
        // TODO add your handling code here:
        SearchFrame searchShow = new SearchFrame();
        searchShow.setVisible(true);
        searchShow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnSearchBkActionPerformed

    private void btnBorrowBkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowBkMouseClicked
        // TODO add your handling code here:
        BorrowFrame borrowShow = new BorrowFrame();
        borrowShow.setVisible(true);
        borrowShow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBorrowBkMouseClicked

    private void btnReturnBkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBkMouseClicked
        // TODO add your handling code here:
        ReturnFrame returnShow = new ReturnFrame();
        returnShow.setVisible(true);
        returnShow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnReturnBkMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
       // TODO add your handling code here:
       inputUsername.setText(null);
       inputPassword.setText(null);
       panel1.setVisible(true);
       panel2.setVisible(false);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(homeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMadewith;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JButton btnBorrowBk;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReturnBk;
    private javax.swing.JButton btnSearchBk;
    public javax.swing.JPasswordField inputPassword;
    public javax.swing.JTextField inputUsername;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBkHistoryHead;
    public javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable tableBkBorrow;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
