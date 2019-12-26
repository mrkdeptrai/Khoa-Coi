/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ws.BrandDBO;
import ws.CarWebService;
import ws.CarWebService_Service;

/**
 *
 * @author mrkho
 */
public class BrandFrame extends javax.swing.JFrame {
    
    private CarWebService_Service carServices;
    private CarWebService port;
    /**
     * Creates new form SourceFrame
     */
    public BrandFrame() {
        carServices = new CarWebService_Service();
        port = carServices.getCarWebServicePort();
        
        initComponents();
        loadAllBrand();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdSearchSource = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBrand = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBrandID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtBrandName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rdBrandID = new javax.swing.JRadioButton();
        rdBrandName = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnBackToMainMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBrandDes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listBrand.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listBrandValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listBrand);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search");

        jLabel3.setText("Brand ID");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        jLabel4.setText("Brand Name");

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Brand Management");

        rdSearchSource.add(rdBrandID);
        rdBrandID.setText("Brand ID");

        rdSearchSource.add(rdBrandName);
        rdBrandName.setText("Brand Name");

        jLabel5.setText("Description");

        btnBackToMainMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackToMainMenu.setText("Back To Menu");
        btnBackToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMainMenuActionPerformed(evt);
            }
        });

        txtBrandDes.setColumns(20);
        txtBrandDes.setRows(5);
        jScrollPane2.setViewportView(txtBrandDes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBrandName)
                                    .addComponent(txtBrandID)
                                    .addComponent(jScrollPane2))
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(rdBrandID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdBrandName)
                        .addContainerGap(78, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdBrandID)
                    .addComponent(rdBrandName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtBrandID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == 10) { //enter is pressed
            if (rdBrandID.isSelected()) {
                searchByBrandID();
            } else {
                searchByBrandName();
            }
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(checkInputValue()){  
            String brandID = txtBrandID.getText();
            String brandName = txtBrandName.getText();
            String brandDescription = txtBrandDes.getText();
            String add = port.insertBrand(brandID, brandName, brandDescription);
            JOptionPane.showMessageDialog(rootPane, add);
            //refresh listbox to update data from database
            loadAllBrand();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(listBrand.getSelectedIndex() !=-1){
            if(checkInputValue()){
                String brandID = txtBrandID.getText();
                String brandName = txtBrandName.getText();
                String brandDescription = txtBrandDes.getText();
                String update = port.updateBrand(brandID, brandName, brandDescription);
                JOptionPane.showMessageDialog(rootPane, update);
            loadAllBrand();
            }
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Please select a brand");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(listBrand.getSelectedIndex() != -1){
            String brandID = txtBrandID.getText();
            String delete = port.deleteBrand(brandID);
            JOptionPane.showMessageDialog(rootPane, delete);
            loadAllBrand();
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Please select a brand");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void listBrandValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listBrandValueChanged
        if(listBrand.getSelectedIndex() != -1){
            BrandDBO brand = listBrand.getSelectedValue();
            txtBrandID.setText(brand.getBrandID());
            txtBrandName.setText(brand.getBrandName());
            txtBrandDes.setText(brand.getBrandDescription());
        }
    }//GEN-LAST:event_listBrandValueChanged

    private void btnBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMainMenuActionPerformed
        MainMenuFrame mainFrame = new MainMenuFrame();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_btnBackToMainMenuActionPerformed
    private void searchByBrandID() {
        String brandID = txtSearch.getText();
        if (!getValidNumber(brandID)) {
            loadAllBrand();
        } else {
            ArrayList<BrandDBO> brand = (ArrayList<BrandDBO>) port.getBrandByID(brandID);
            DefaultListModel<BrandDBO> defaultModel = new DefaultListModel<>();

            for (BrandDBO bra : brand) {
                defaultModel.addElement(bra);
            }

            listBrand.setModel(defaultModel);
        }
    }

    private void searchByBrandName() {
        String brandName = txtSearch.getText();
        if (brandName.equals("")) {
            loadAllBrand();
        } else {
            ArrayList<BrandDBO> brand = (ArrayList<BrandDBO>) port.getBrandByName(brandName);
            DefaultListModel<BrandDBO> defaultModel = new DefaultListModel<>();
            
            for (BrandDBO bra : brand) {
                defaultModel.addElement(bra);
            }

            listBrand.setModel(defaultModel);
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackToMainMenu;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<BrandDBO> listBrand;
    private javax.swing.JRadioButton rdBrandID;
    private javax.swing.JRadioButton rdBrandName;
    private javax.swing.ButtonGroup rdSearchSource;
    private javax.swing.JTextArea txtBrandDes;
    private javax.swing.JTextField txtBrandID;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    private void loadAllBrand() {
        ArrayList<BrandDBO> brand = (ArrayList<BrandDBO>) port.getAllBrand();
        DefaultListModel<BrandDBO> defaultModel = new DefaultListModel<>();

        for (BrandDBO bra : brand) {
            defaultModel.addElement(bra);
        }

        listBrand.setModel(defaultModel);
    }
    
    public boolean checkInputValue() {
        String brandID = txtBrandID.getText();
        if (!getValidNumber(brandID)) {
            JOptionPane.showMessageDialog(rootPane, " brandID is not null value and must be numeric!");
            return false;
        }
        try {
            String brandName = txtBrandName.getText();
            if (getValidString(brandName) == true) {
            } else {
                JOptionPane.showMessageDialog(rootPane, " Brand name is not null value & Brand name isn't containts numbers. Please input name of brand correctly");
                return false;
            }
        } catch (InputMismatchException ea) {
                JOptionPane.showMessageDialog(rootPane, " Brand name isn't containts numbers. Please input name of brand correctly");
        }
        return true;
    }
    
    public static boolean getValidNumber(String str1) {
        return str1.matches("\\d+");
    }

    public static boolean getValidString(String str2) {
        return str2.matches("\\D+");
    }
}
