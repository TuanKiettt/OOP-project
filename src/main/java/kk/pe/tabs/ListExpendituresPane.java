/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kk.pe.tabs;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kk.pe.MainFrame;
import kk.pe.dao.ExpenditureDao;
import kk.pe.dao.ExpenditureTypeDao;
import kk.pe.entity.Expenditure;
import kk.pe.util.MessageBox;

/**
 *
 * @author songk
 */
public class ListExpendituresPane extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private DefaultTableModel model;
    /**
     * Creates new form ListExpenditure
     */
    public ListExpendituresPane(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        
        initComponents();
        
        initTable();
        
        loadAll();
    }
    
    
    private void initTable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Name","Amount","Date","Type"});
        
        tblList.setModel(model);
    }
//     Nạp dữ liệu từ CSDL
    private void loadAll(){
        try{
            ExpenditureDao dao = new ExpenditureDao();
            var list = dao.findAll();
            
            model.setRowCount(0);
//          Hiển thị thông tin
            for(Expenditure item : list){
                Object[] row = new Object[]{
                    item.getId(),
                    item.getName(),
                    item.getAmount(),
                    item.getExpenditureDate(),
                    item.getType(),
                };
                model.addRow(row);
            }
            model.fireTableDataChanged();
            
        }catch(Exception e){
            MessageBox.showErrorMessage(this, e.getMessage());
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppmList = new javax.swing.JPopupMenu();
        ppmViewDetail = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ppmEdit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ppmDelete = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();

        ppmViewDetail.setText("View Detail");
        ppmList.add(ppmViewDetail);
        ppmList.add(jSeparator2);

        ppmEdit.setText("Edit");
        ppmEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppmEditActionPerformed(evt);
            }
        });
        ppmList.add(ppmEdit);
        ppmList.add(jSeparator3);

        ppmDelete.setText("Delete");
        ppmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppmDeleteActionPerformed(evt);
            }
        });
        ppmList.add(ppmDelete);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("List Expenditure");

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblList.setComponentPopupMenu(ppmList);
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 498, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ppmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppmDeleteActionPerformed
        try {
            
            if(MessageBox.showConfirmMessage(this, "Do you want to delete?")
                    == JOptionPane.NO_OPTION){
                return;
            }
            
            ExpenditureDao dao = new ExpenditureDao();
            
            int selectedRow = tblList.getSelectedRow();
            
            Object idObj = tblList.getValueAt(selectedRow,0);
            if (idObj !=null){
                int id = Integer.parseInt(idObj.toString());               
            
                if(dao.delete(id)){
                    MessageBox.showInformationMessage(this, "Information", "Expenditure is deleted");
                    loadAll();
                }else{
                    MessageBox.showErrorMessage(this, "Error", "Expenditure can not be deleted");

                }
            }

        } catch (Exception e){
            e.printStackTrace();//Thông báo lỗi xuất hiện ở dòng code nào
            MessageBox.showErrorMessage(this,"Error", e.getMessage());
        }
    }//GEN-LAST:event_ppmDeleteActionPerformed

    private void ppmEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppmEditActionPerformed
        int selectedRow = tblList.getSelectedRow();
            
            Object idObj = tblList.getValueAt(selectedRow,0);
            if (idObj !=null){
                int id = Integer.parseInt(idObj.toString());
        
        mainFrame.showEditExpenditure(id);
            }
    }//GEN-LAST:event_ppmEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuItem ppmDelete;
    private javax.swing.JMenuItem ppmEdit;
    private javax.swing.JPopupMenu ppmList;
    private javax.swing.JMenuItem ppmViewDetail;
    private javax.swing.JTable tblList;
    // End of variables declaration//GEN-END:variables
}
