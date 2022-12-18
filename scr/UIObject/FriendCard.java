/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIObject;

import database.DAO_BanBe;
import entity.BanBe;
import entity.TaiKhoan;
import event.PublicEvent;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class FriendCard extends javax.swing.JPanel {

    /**
     * Creates new form friendCard
     */
    private BanBe user;
    
    public FriendCard(BanBe user) {
        initComponents();
        this.user = user;
        lblUsername.setText(user.getUsernameBanBe());
        lblBeFriendDate.setText("Ngày kết bạn: " + user.getNgayKetBan().toString());
    }
    
    public void setStatus(int active){
        switch (active) {
            case 1 -> {
                lblStatus.setText("Active now");
                lblStatus.setForeground(new java.awt.Color(40, 147, 59));
            }
            case -1 -> {
                lblStatus.setText("Locked");
                lblStatus.setForeground(Color.YELLOW);
            }
            default -> {
                lblStatus.setText("Offline");
                lblStatus.setForeground(new Color(160, 160, 160));
            }
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

        lblUsername = new javax.swing.JLabel();
        btnUnfriend = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblBeFriendDate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setText("Username");

        btnUnfriend.setText("Hủy kết bạn");
        btnUnfriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnfriendActionPerformed(evt);
            }
        });

        btnChat.setText("Chat");
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        lblStatus.setForeground(new java.awt.Color(0, 204, 0));
        lblStatus.setText("active");

        lblBeFriendDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBeFriendDate.setText("Ngày kết bạn");
        lblBeFriendDate.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUnfriend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChat, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblBeFriendDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(btnUnfriend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(lblBeFriendDate))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnfriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnfriendActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(getRootPane(), "Bạn có chắc muốn hủy kết bạn với " + this.user.getUsernameBanBe()+ "?", ""
                + "Hủy kết bạn", dialogButton);
        if(result == JOptionPane.YES_OPTION){
            removeAll();
            PublicEvent.getInstance().getEventFriend().unfriend(this.user);
        }   
    }//GEN-LAST:event_btnUnfriendActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        PublicEvent.getInstance().getEventChat().requestData(new TaiKhoan(user.getUsernameBanBe(), "", ""));
        PublicEvent.getInstance().getEventChat().setUser(new TaiKhoan(user.getUsernameBanBe(), "", ""));
        PublicEvent.getInstance().getEventMain().navigateToChatPage();
    }//GEN-LAST:event_btnChatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnUnfriend;
    private javax.swing.JLabel lblBeFriendDate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
