/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forSubmitOnly;

import java.util.ArrayList;
import net.miginfocom.swing.MigLayout;
import swing.ModifiedScrollBar;


/**
 *
 * @author ADMIN
 */
public class FriendPage extends javax.swing.JPanel {

    /**
     * Creates new form FriendPage1
     */
    public FriendPage() {
        initComponents();
        
        sp.setVerticalScrollBar(new ModifiedScrollBar());
        sp.setHorizontalScrollBar(new ModifiedScrollBar());
        friendListPanel.setLayout(new MigLayout());
        ArrayList<String> friends = new ArrayList<>();
        friends.add("bao");
        friends.add("quan");
        friends.add("phu");
        for(String name: friends){
            friendListPanel.add(new FriendCard(name),"wrap");
        }
        friendListPanel.repaint();
        friendListPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        sp = new javax.swing.JScrollPane();
        friendListPanel = new javax.swing.JPanel();

        jTextField1.setText("bebaoboy");

        jButton2.setText("Tìm kiếm");

        friendListPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout friendListPanelLayout = new javax.swing.GroupLayout(friendListPanel);
        friendListPanel.setLayout(friendListPanelLayout);
        friendListPanelLayout.setHorizontalGroup(
            friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        friendListPanelLayout.setVerticalGroup(
            friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        sp.setViewportView(friendListPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel friendListPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}