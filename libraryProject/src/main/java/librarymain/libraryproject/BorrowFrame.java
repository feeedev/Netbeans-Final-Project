/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymain.libraryproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static librarymain.libraryproject.homeJF.AllBorrowAlluserAcc;
import static librarymain.libraryproject.homeJF.AllBorrowAlluserAuthor;
import static librarymain.libraryproject.homeJF.AllBorrowAlluserBdate;
import static librarymain.libraryproject.homeJF.AllBorrowAlluserID;
import static librarymain.libraryproject.homeJF.AllBorrowAlluserName;
import static librarymain.libraryproject.homeJF.AllBorrowAlluserPhone;
import static librarymain.libraryproject.homeJF.AllBorrowAlluserRedate;
import static librarymain.libraryproject.homeJF.BorrowHisArray;
import static librarymain.libraryproject.homeJF.BorrowHisAuthor;
import static librarymain.libraryproject.homeJF.BorrowHisBorrowDate;
import static librarymain.libraryproject.homeJF.BorrowHisID;
import static librarymain.libraryproject.homeJF.BorrowHisName;
import static librarymain.libraryproject.homeJF.BorrowHisReturnDate;
import static librarymain.libraryproject.homeJF.tableBkBorrow;
import static librarymain.libraryproject.homeJF.userNameInput;

/**
 *
 * @author wenda
 */
public class BorrowFrame extends javax.swing.JFrame {
    public static String selectedItemStr;
    public static int indexBK;
    public static String selectedbkName;
    public static String selectedbkAuthor;
    List<String> AllBookID = new ArrayList<>();
    List<String> AllBookName = new ArrayList<>();
    List<String> AllBookAuthor = new ArrayList<>();
    String inputbookPhone; // phoneNoInput
    Object selectedItem;
    /**
     * Creates new form NewJFrame
     */
    public BorrowFrame() {
        initComponents();
        AllBook();
    }
    
    private void AllBook() {
        String[] AllbookArray = null;
        
        try {
            Scanner AllbookFile = new Scanner(new File("BookList.txt"));
            while (AllbookFile.hasNextLine())
            {
              String s = AllbookFile.nextLine();  
              AllbookArray = s.split(",");
              AllBookID.add(AllbookArray[0]);
              AllBookName.add(AllbookArray[1]);
              AllBookAuthor.add(AllbookArray[2]);
            } //papatsiri.apip Poxxy8990
            AllbookFile.close();
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "User Database Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        String [] ComboID = new String[AllBookID.size()+1];
        ComboID[0] = "Select Book";
        int indexget = 0;
        for(int i = 0; i < AllBookID.size(); i++) {
            ComboID[i+1] = AllBookID.get(indexget);
            indexget = indexget + 1;
        }
        bkIDcombo.setSelectedItem(ComboID[0]);
        bkIDcombo.setBackground(Color.white);
        bkIDcombo.setForeground(Color.black);
        bkIDcombo.setModel(new javax.swing.DefaultComboBoxModel(ComboID));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borrowPanel = new javax.swing.JPanel();
        lblBorrowHead = new javax.swing.JLabel();
        phoneNoInput = new javax.swing.JTextField();
        bkNameInput = new javax.swing.JTextField();
        labelBookID = new javax.swing.JLabel();
        labelBookName = new javax.swing.JLabel();
        labelPhoneNo = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        bkIDcombo = new javax.swing.JComboBox<>();
        bkAuthorLabel = new javax.swing.JLabel();
        bkAuthortxtF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(584, 413));
        setMinimumSize(new java.awt.Dimension(584, 413));
        setResizable(false);

        borrowPanel.setBackground(new java.awt.Color(255, 227, 227));
        borrowPanel.setMaximumSize(new java.awt.Dimension(584, 413));
        borrowPanel.setMinimumSize(new java.awt.Dimension(584, 413));

        lblBorrowHead.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBorrowHead.setText("Borrow Book");

        bkNameInput.setEditable(false);
        bkNameInput.setBackground(new java.awt.Color(255, 255, 255));
        bkNameInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        labelBookID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelBookID.setText("Book ID");

        labelBookName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelBookName.setText("Book Name");

        labelPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPhoneNo.setText("Phone NO.");

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        bkIDcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bkIDcombo.setActionCommand("idListener");
        bkIDcombo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bkIDcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bkIDcomboItemStateChanged(evt);
            }
        });
        bkIDcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkIDcomboActionPerformed(evt);
            }
        });

        bkAuthorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bkAuthorLabel.setText("Book Author");

        bkAuthortxtF.setEditable(false);
        bkAuthortxtF.setBackground(new java.awt.Color(255, 255, 255));
        bkAuthortxtF.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout borrowPanelLayout = new javax.swing.GroupLayout(borrowPanel);
        borrowPanel.setLayout(borrowPanelLayout);
        borrowPanelLayout.setHorizontalGroup(
            borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowPanelLayout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(lblBorrowHead)
                .addGap(218, 218, 218))
            .addGroup(borrowPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(borrowPanelLayout.createSequentialGroup()
                        .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPhoneNo)
                            .addComponent(labelBookName)
                            .addComponent(labelBookID)
                            .addComponent(bkAuthorLabel))
                        .addGap(18, 18, 18)
                        .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneNoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(bkNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(bkIDcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bkAuthortxtF, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        borrowPanelLayout.setVerticalGroup(
            borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblBorrowHead)
                .addGap(36, 36, 36)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bkIDcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBookID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bkNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBookName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bkAuthortxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bkAuthorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhoneNo))
                .addGap(73, 73, 73)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(borrowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        inputbookPhone = phoneNoInput.getText();
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yy");  
        String formattedDate = myDateObj.format(myFormatObj);
        int indexBRID = BorrowHisID.indexOf(selectedItem);
        if (selectedItem == "Select Book" || inputbookPhone.equals("") || bkNameInput.getText() == null || bkAuthortxtF.getText() == null) {
                JOptionPane.showMessageDialog(null,
                    "Please complete the information.", "Borrow Book",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (BorrowHisID.contains(selectedItem)){
                JOptionPane.showMessageDialog(null,
                    "You have already borrowed this book.", "Borrow Book",
                    JOptionPane.INFORMATION_MESSAGE);
        } else{
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("BorrowList.txt", true));
                if (AllBorrowAlluserID.isEmpty()){
                    writer.append(AllBookID.get(indexBK)+","+selectedbkName+","+selectedbkAuthor+","+formattedDate+","+"not returned yet"+","+homeJF.userNameInput+","+inputbookPhone);
                } else {
                    writer.append("\n"+AllBookID.get(indexBK)+","+selectedbkName+","+selectedbkAuthor+","+formattedDate+","+"not returned yet"+","+homeJF.userNameInput+","+inputbookPhone);
                }
                writer.close();
                JOptionPane.showMessageDialog(null,
                    "Successfully! Borrow", "Successfully",
                    JOptionPane.INFORMATION_MESSAGE);
                bkIDcombo.setSelectedIndex(0);
                bkNameInput.setText(null);
                bkAuthortxtF.setText(null);
                phoneNoInput.setText(null);
                UpdateBorrow();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                    "An error occurred.", "Error",
                    JOptionPane.ERROR_MESSAGE);
                System.out.println("An error occurred.");
            }
        }
    }//GEN-LAST:event_btnSubmitMouseClicked
    
    public void UpdateBorrow(){
        DefaultTableModel BorrowModel = (DefaultTableModel) tableBkBorrow.getModel();
        BorrowModel.setRowCount(0);
        BorrowHisArray = null;
        BorrowHisID.removeAll(BorrowHisID);
        BorrowHisName.removeAll(BorrowHisName);
        BorrowHisAuthor.removeAll(BorrowHisAuthor);
        BorrowHisBorrowDate.removeAll(BorrowHisBorrowDate);
        BorrowHisReturnDate.removeAll(BorrowHisReturnDate);
        AllBorrowAlluserID.removeAll(AllBorrowAlluserID);
        AllBorrowAlluserName.removeAll(AllBorrowAlluserName);
        AllBorrowAlluserAuthor.removeAll(AllBorrowAlluserAuthor);
        AllBorrowAlluserBdate.removeAll(AllBorrowAlluserBdate);
        AllBorrowAlluserRedate.removeAll(AllBorrowAlluserRedate);
        AllBorrowAlluserAcc.removeAll(AllBorrowAlluserAcc);
        AllBorrowAlluserPhone.removeAll(AllBorrowAlluserPhone);
        try {
            Scanner BorrowFile = new Scanner(new File("BorrowList.txt"));
            while (BorrowFile.hasNextLine())
            {
                String s = BorrowFile.nextLine();  
                BorrowHisArray = s.split(",");
                if (userNameInput.equals(BorrowHisArray[5])) {
                        BorrowHisID.add(BorrowHisArray[0]);
                        BorrowHisName.add(BorrowHisArray[1]);
                        BorrowHisAuthor.add(BorrowHisArray[2]);
                        BorrowHisBorrowDate.add(BorrowHisArray[3]);
                        BorrowHisReturnDate.add(BorrowHisArray[4]);
                }
                AllBorrowAlluserID.add(BorrowHisArray[0]);
                AllBorrowAlluserName.add(BorrowHisArray[1]);
                AllBorrowAlluserAuthor.add(BorrowHisArray[2]);
                AllBorrowAlluserBdate.add(BorrowHisArray[3]);
                AllBorrowAlluserRedate.add(BorrowHisArray[4]);
                AllBorrowAlluserAcc.add(BorrowHisArray[5]);
                AllBorrowAlluserPhone.add(BorrowHisArray[6]);
            } //papatsiri.apip Poxxy8990
            BorrowFile.close();
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "User Database Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        for (int i = 0; i < BorrowHisID.size(); i++){
            Object[] BorrowRow = { BorrowHisID.get(i), BorrowHisName.get(i), 
                BorrowHisAuthor.get(i), BorrowHisBorrowDate.get(i), BorrowHisReturnDate.get(i)};
            BorrowModel.addRow(BorrowRow);
        }
    }
    private void bkIDcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkIDcomboActionPerformed
        // TODO add your handling code here:
         bkIDcombo.addActionListener (new ActionListener () {
         @Override
         public void actionPerformed(ActionEvent e) {
                selectedItem = bkIDcombo.getSelectedItem();
                if (selectedItem != "Select Book")
                {
                    selectedItemStr = selectedItem.toString();
                    indexBK = AllBookID.indexOf(selectedItem);
                    selectedbkName = AllBookName.get(indexBK);
                    selectedbkAuthor = AllBookAuthor.get(indexBK);
                    bkNameInput.setText(selectedbkName);
                    bkAuthortxtF.setText(selectedbkAuthor);
                } else {
                    bkNameInput.setText(null);
                    bkAuthortxtF.setText(null);
                }
            }
        });
    }//GEN-LAST:event_bkIDcomboActionPerformed

    private void bkIDcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bkIDcomboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bkIDcomboItemStateChanged

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
            java.util.logging.Logger.getLogger(BorrowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkAuthorLabel;
    private javax.swing.JTextField bkAuthortxtF;
    private javax.swing.JComboBox<String> bkIDcombo;
    private javax.swing.JTextField bkNameInput;
    private javax.swing.JPanel borrowPanel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel labelBookID;
    private javax.swing.JLabel labelBookName;
    private javax.swing.JLabel labelPhoneNo;
    private javax.swing.JLabel lblBorrowHead;
    private javax.swing.JTextField phoneNoInput;
    // End of variables declaration//GEN-END:variables
}
