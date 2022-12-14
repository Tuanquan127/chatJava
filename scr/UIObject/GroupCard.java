/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIObject;

import entity.NhomChat;
import entity.TaiKhoan;
import entity.ThanhVienNhomChat;
import event.PublicEvent;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class GroupCard extends javax.swing.JPanel {

    boolean role;
    NhomChat group;
    boolean isClick = false;

    public GroupCard(NhomChat group, boolean role) {
        initComponents();
        txtGroupName.setText(group.getTenNhom());

        if (!role) {
            txtGroupName.setEditable(false);
        }
        this.group = group;
        this.role = role;
        showMember(false);

        sp.setViewportView(listGroupMemberTable);
    }

    public NhomChat getGroup() {
        return this.group;
    }

    public void showMember(boolean flag) {
        adminPanel.setVisible(flag);
        if (role) {
            adminSubPanel.setVisible(true);
        } else {
            adminSubPanel.setVisible(false);
        }
    }


    private void addRow(JTable table, int size) {
        var model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int adds = abs(size - model.getRowCount());
        for (int count = 1; count <= adds; count++) {
            model.addRow(new Object[]{"", "", "", "", ""});
            // System.out.println(table.getRowCount());
        }
        table.setModel(model);

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }

    }

    public void setMemberList(ArrayList<ThanhVienNhomChat> members) {
        addRow(listGroupMemberTable, members.size());
        String chucNang;
        for (int i = 0; i < members.size(); i++) {

            if (members.get(i).getChucNang()) {
                chucNang = "Admin";
            } else {
                chucNang = "Thành viên";
            }
            listGroupMemberTable.setValueAt(members.get(i).getUsername(), i, 0);
            listGroupMemberTable.setValueAt(chucNang, i, 1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtGroupName = new javax.swing.JTextField();
        deleteChatButton = new javax.swing.JButton();
        viewMemberButton = new javax.swing.JButton();
        adminPanel = new javax.swing.JPanel();
        sp = new javax.swing.JScrollPane();
        listGroupMemberTable = new javax.swing.JTable();
        adminSubPanel = new javax.swing.JPanel();
        deleteGroupChatMemberButton = new javax.swing.JButton();
        addAdminButton = new javax.swing.JButton();
        renameGroupButton = new javax.swing.JButton();
        renameGroupButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtGroupName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGroupName.setText("Tên nhóm");
        txtGroupName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtGroupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroupNameActionPerformed(evt);
            }
        });

        deleteChatButton.setText("Xóa");
        deleteChatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteChatButtonActionPerformed(evt);
            }
        });

        viewMemberButton.setText("Xem thành viên");
        viewMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMemberButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGroupName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteChatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteChatButton)
                    .addComponent(viewMemberButton)))
        );

        adminPanel.setBackground(new java.awt.Color(255, 255, 255));

        listGroupMemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên", "Chức năng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp.setViewportView(listGroupMemberTable);

        adminSubPanel.setBackground(new java.awt.Color(255, 255, 255));

        deleteGroupChatMemberButton.setText("Xóa thành viên");
        deleteGroupChatMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupChatMemberButtonActionPerformed(evt);
            }
        });

        addAdminButton.setText("Update admin");
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminButtonActionPerformed(evt);
            }
        });

        renameGroupButton.setText("Đổi tên");

        renameGroupButton1.setText("Thêm");

        javax.swing.GroupLayout adminSubPanelLayout = new javax.swing.GroupLayout(adminSubPanel);
        adminSubPanel.setLayout(adminSubPanelLayout);
        adminSubPanelLayout.setHorizontalGroup(
            adminSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminSubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(renameGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(renameGroupButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteGroupChatMemberButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        adminSubPanelLayout.setVerticalGroup(
            adminSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminSubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addAdminButton)
                    .addComponent(renameGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteGroupChatMemberButton)
                    .addComponent(renameGroupButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminSubPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteChatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteChatButtonActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(getRootPane(), "Bạn có chắc chắn không?", ""
                + "Xóa lịch sử nhóm chat", dialogButton);
        if (result == 1) {
            PublicEvent.getInstance().getEventGroupChat().deleteCurrentGroupData(group);
        }
    }//GEN-LAST:event_deleteChatButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        PublicEvent.getInstance().getEventGroupChat().requestGroupData(group);
        PublicEvent.getInstance().getEventGroupChat().setGroup(group);
    }//GEN-LAST:event_formMouseClicked

    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminButtonActionPerformed
        ArrayList<TaiKhoan> users = new ArrayList<>();

        PublicEvent.getInstance().getEventGroupChat().setAdmin(group, users);
    }//GEN-LAST:event_addAdminButtonActionPerformed

    private void txtGroupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroupNameActionPerformed
        if (role) {
            String newName = txtGroupName.getText();
            PublicEvent.getInstance().getEventGroupChat().setNewGroupName(group, newName);
        }
    }//GEN-LAST:event_txtGroupNameActionPerformed

    private void deleteGroupChatMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGroupChatMemberButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteGroupChatMemberButtonActionPerformed

    private void viewMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMemberButtonActionPerformed
        if (isClick == true) {
            //sp.setViewportView(null);
            showMember(false);
            isClick = false;
        } else {
            System.out.println("not clicked yet");
            //sp.setViewportView(listGroupMemberTable);
            isClick = true;
            showMember(true);
        }
        PublicEvent.getInstance().getEventGroupChat().requestMemberData(group);
    }//GEN-LAST:event_viewMemberButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdminButton;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JPanel adminSubPanel;
    private javax.swing.JButton deleteChatButton;
    private javax.swing.JButton deleteGroupChatMemberButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable listGroupMemberTable;
    private javax.swing.JButton renameGroupButton;
    private javax.swing.JButton renameGroupButton1;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextField txtGroupName;
    private javax.swing.JButton viewMemberButton;
    // End of variables declaration//GEN-END:variables

}
