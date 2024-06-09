/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kk.pe;

import java.awt.Component;
import java.awt.event.KeyEvent;
import kk.pe.dialog.AboutUsDialog;
import kk.pe.dialog.LoginDialog;
import kk.pe.dialog.SettingDialog;
import kk.pe.tabs.AddExpenditurePane;
import kk.pe.tabs.AddExpenditureTypePane;
import kk.pe.tabs.AddReceiptPane;
import kk.pe.tabs.AddReceiptTypePane;
import kk.pe.tabs.ListExpenditureTypesPane;
import kk.pe.tabs.ListExpendituresPane;
import kk.pe.tabs.ListReceiptTypesPane;
import kk.pe.tabs.ListReceiptsPane;

/**
 *
 * @author songk
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tbrAddExpenditure = new javax.swing.JButton();
        tbrListExpenditure = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        tbrAddReceipt = new javax.swing.JButton();
        tbrListReceipt = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        tbrLock = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        tbrCloseTab = new javax.swing.JButton();
        tpnBoard = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        menuLock = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuSettings = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAddExpenditureType = new javax.swing.JMenuItem();
        menuListExpenditureTypes = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuAddExpenditure = new javax.swing.JMenuItem();
        menuListExpenditure = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menuAddReceiptType = new javax.swing.JMenuItem();
        menuListReceiptTypes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuAddNewReceipt = new javax.swing.JMenuItem();
        menuListReceipt = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuContent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Expenditure");
        setSize(new java.awt.Dimension(920, 700));

        jToolBar1.setRollover(true);

        tbrAddExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_32.png"))); // NOI18N
        tbrAddExpenditure.setText("Add Expenditure");
        tbrAddExpenditure.setFocusable(false);
        tbrAddExpenditure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAddExpenditure.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAddExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAddExpenditureActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAddExpenditure);

        tbrListExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expenditure_32.png"))); // NOI18N
        tbrListExpenditure.setText("List Expenditure");
        tbrListExpenditure.setFocusable(false);
        tbrListExpenditure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrListExpenditure.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrListExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrListExpenditureActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrListExpenditure);
        jToolBar1.add(jSeparator5);

        tbrAddReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_32.png"))); // NOI18N
        tbrAddReceipt.setText("Add Receipt");
        tbrAddReceipt.setFocusable(false);
        tbrAddReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAddReceipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAddReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAddReceiptActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAddReceipt);

        tbrListReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt_32.png"))); // NOI18N
        tbrListReceipt.setText("List Receipt");
        tbrListReceipt.setFocusable(false);
        tbrListReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrListReceipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrListReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrListReceiptActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrListReceipt);
        jToolBar1.add(jSeparator6);

        tbrLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_32.png"))); // NOI18N
        tbrLock.setText("Lock");
        tbrLock.setFocusable(false);
        tbrLock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLock.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLockActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLock);
        jToolBar1.add(jSeparator7);

        tbrCloseTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_32.png"))); // NOI18N
        tbrCloseTab.setText("Close Tab");
        tbrCloseTab.setFocusable(false);
        tbrCloseTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrCloseTab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrCloseTabActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrCloseTab);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        tpnBoard.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/icons/home_32.png")), jPanel2); // NOI18N

        jMenu1.setMnemonic(KeyEvent.VK_F);
        jMenu1.setText("File");

        menuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login_20.png"))); // NOI18N
        menuLogin.setText("Login");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogin);

        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogout);

        menuLock.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_20.png"))); // NOI18N
        menuLock.setText("Lock");
        menuLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLockActionPerformed(evt);
            }
        });
        jMenu1.add(menuLock);
        jMenu1.add(jSeparator3);

        menuSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting_20.png"))); // NOI18N
        menuSettings.setText("Settings");
        menuSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSettingsActionPerformed(evt);
            }
        });
        jMenu1.add(menuSettings);
        jMenu1.add(jSeparator4);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_20.png"))); // NOI18N
        menuExit.setMnemonic(KeyEvent.VK_ESCAPE);
        menuExit.setText("Exit");
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic(KeyEvent.VK_M);
        jMenu2.setText("Manager");

        menuAddExpenditureType.setText("Add Expenditure Type");
        menuAddExpenditureType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddExpenditureTypeActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddExpenditureType);

        menuListExpenditureTypes.setText("List Expenditure Types");
        menuListExpenditureTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListExpenditureTypesActionPerformed(evt);
            }
        });
        jMenu2.add(menuListExpenditureTypes);
        jMenu2.add(jSeparator8);

        menuAddExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_20.png"))); // NOI18N
        menuAddExpenditure.setText("Add New Expenditure");
        menuAddExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddExpenditureActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddExpenditure);

        menuListExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list_20.png"))); // NOI18N
        menuListExpenditure.setText("List Expenditure");
        menuListExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListExpenditureActionPerformed(evt);
            }
        });
        jMenu2.add(menuListExpenditure);
        jMenu2.add(jSeparator9);

        menuAddReceiptType.setText("Add Receipt Type");
        menuAddReceiptType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddReceiptTypeActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddReceiptType);

        menuListReceiptTypes.setText("List Receipt Types");
        menuListReceiptTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListReceiptTypesActionPerformed(evt);
            }
        });
        jMenu2.add(menuListReceiptTypes);
        jMenu2.add(jSeparator2);

        menuAddNewReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new_20.png"))); // NOI18N
        menuAddNewReceipt.setText("Add New Receipt");
        menuAddNewReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNewReceiptActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddNewReceipt);

        menuListReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt_20.png"))); // NOI18N
        menuListReceipt.setText("List Receipt");
        menuListReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListReceiptActionPerformed(evt);
            }
        });
        jMenu2.add(menuListReceipt);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        menuContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/content_20.png"))); // NOI18N
        menuContent.setText("Content");
        menuContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuContentActionPerformed(evt);
            }
        });
        jMenu3.add(menuContent);
        jMenu3.add(jSeparator1);

        menuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about_20.png"))); // NOI18N
        menuAboutUs.setText("About us");
        menuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(menuAboutUs);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpnBoard)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tpnBoard)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuContentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuContentActionPerformed

    private void menuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutUsActionPerformed
        AboutUsDialog dialog = new AboutUsDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuAboutUsActionPerformed

    private void menuListExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListExpenditureActionPerformed
       tbrListExpenditureActionPerformed(evt);
    }//GEN-LAST:event_menuListExpenditureActionPerformed

    private void menuAddNewReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNewReceiptActionPerformed
        tbrAddReceiptActionPerformed(evt);
    }//GEN-LAST:event_menuAddNewReceiptActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLoginActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        LoginDialog dialog = new LoginDialog(this,true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLockActionPerformed
        menuLogoutActionPerformed(evt);
    }//GEN-LAST:event_menuLockActionPerformed

    private void tbrListExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrListExpenditureActionPerformed
        ListExpendituresPane pane = new ListExpendituresPane(this);
        tpnBoard.addTab("List Expenditures", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_tbrListExpenditureActionPerformed

    private void tbrAddExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAddExpenditureActionPerformed
        AddExpenditurePane pane = new AddExpenditurePane(this);
        
        tpnBoard.addTab("Add Expenditure", pane);
        tpnBoard.setSelectedComponent(pane);
        
    }//GEN-LAST:event_tbrAddExpenditureActionPerformed

    private void tbrCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrCloseTabActionPerformed
        int selectedIndex = tpnBoard.getSelectedIndex();
        if(selectedIndex >0){
            tpnBoard.remove(selectedIndex);
        }
    }//GEN-LAST:event_tbrCloseTabActionPerformed

    private void menuAddExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddExpenditureActionPerformed
        tbrAddExpenditureActionPerformed(evt);
    }//GEN-LAST:event_menuAddExpenditureActionPerformed

    private void tbrAddReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAddReceiptActionPerformed
        AddReceiptPane pane = new AddReceiptPane();
        tpnBoard.addTab("Add Receipt", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_tbrAddReceiptActionPerformed

    private void tbrListReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrListReceiptActionPerformed
        ListReceiptsPane pane = new ListReceiptsPane();
        tpnBoard.addTab("List Receipts", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_tbrListReceiptActionPerformed

    private void menuListReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListReceiptActionPerformed
       tbrListReceiptActionPerformed(evt);
    }//GEN-LAST:event_menuListReceiptActionPerformed

    private void menuSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSettingsActionPerformed
        SettingDialog dialog = new SettingDialog(this, true);
        
        dialog.setVisible(true);
    }//GEN-LAST:event_menuSettingsActionPerformed

    private void tbrLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLockActionPerformed
        menuLogoutActionPerformed(evt);
    }//GEN-LAST:event_tbrLockActionPerformed

    private void menuListReceiptTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListReceiptTypesActionPerformed
        ListReceiptTypesPane pane = new ListReceiptTypesPane();
        tpnBoard.addTab("List Receipt Types", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuListReceiptTypesActionPerformed

    private void menuAddExpenditureTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddExpenditureTypeActionPerformed
        AddExpenditureTypePane pane = new AddExpenditureTypePane(this);
        tpnBoard.addTab("Add Expenditure Type", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuAddExpenditureTypeActionPerformed
   
    public void showListExpenditureTypes() {
        menuListExpenditureTypesActionPerformed(null);
    }
    
    public void showListExpenditure() {
        tbrListExpenditureActionPerformed(null);
    }
    
    public void showEditExpenditure(int id) {
        AddExpenditurePane pane = new AddExpenditurePane(this,id);
        tpnBoard.addTab("Edit Expenditure", pane);
        tpnBoard.setSelectedComponent(pane);
    }
    
    public void showEditExpenditureType(int id) {
        AddExpenditureTypePane pane = new AddExpenditureTypePane(this,id);
        tpnBoard.addTab("Edit Expenditure Types", pane);
        tpnBoard.setSelectedComponent(pane);
    }
    
    private void menuListExpenditureTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListExpenditureTypesActionPerformed
        ListExpenditureTypesPane pane = new ListExpenditureTypesPane(this);
        tpnBoard.addTab("List Expenditure Types", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuListExpenditureTypesActionPerformed

    private void menuAddReceiptTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddReceiptTypeActionPerformed
        AddReceiptTypePane pane = new AddReceiptTypePane();
        tpnBoard.addTab("Add Receipt Type", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuAddReceiptTypeActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
                LoginDialog dialog = new LoginDialog(null, true);
                
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuAboutUs;
    private javax.swing.JMenuItem menuAddExpenditure;
    private javax.swing.JMenuItem menuAddExpenditureType;
    private javax.swing.JMenuItem menuAddNewReceipt;
    private javax.swing.JMenuItem menuAddReceiptType;
    private javax.swing.JMenuItem menuContent;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuListExpenditure;
    private javax.swing.JMenuItem menuListExpenditureTypes;
    private javax.swing.JMenuItem menuListReceipt;
    private javax.swing.JMenuItem menuListReceiptTypes;
    private javax.swing.JMenuItem menuLock;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuSettings;
    private javax.swing.JButton tbrAddExpenditure;
    private javax.swing.JButton tbrAddReceipt;
    private javax.swing.JButton tbrCloseTab;
    private javax.swing.JButton tbrListExpenditure;
    private javax.swing.JButton tbrListReceipt;
    private javax.swing.JButton tbrLock;
    private javax.swing.JTabbedPane tpnBoard;
    // End of variables declaration//GEN-END:variables
}
