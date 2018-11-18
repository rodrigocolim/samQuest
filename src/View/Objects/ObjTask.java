/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Objects;

import Control.EditQuestionnaireControl;
import Model.Questionnaire.TaskModel;

/**
 *
 * @author rodri
 */
public class ObjTask extends javax.swing.JPanel {
    TaskModel task;
    /**
     * Creates new form ObjTask
     */
    public ObjTask(TaskModel task) {
        initComponents();
        this.task=task;
        taskName.setText(task.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRenameItem = new javax.swing.JMenuItem();
        jDeleteItem = new javax.swing.JMenuItem();
        taskName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseClicked(evt);
            }
        });

        jRenameItem.setText("Renomear");
        jRenameItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRenameItemMousePressed(evt);
            }
        });
        jRenameItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRenameItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jRenameItem);

        jDeleteItem.setText("Excluir");
        jDeleteItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDeleteItemMousePressed(evt);
            }
        });
        jPopupMenu1.add(jDeleteItem);

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(92, 93));
        setMinimumSize(new java.awt.Dimension(92, 93));
        setPreferredSize(new java.awt.Dimension(92, 93));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taskName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taskName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskName.setText("tarefa");
        taskName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(taskName, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 68, 80, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_task_2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void jRenameItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRenameItemMousePressed
        // TODO add your handling code here:
        EditQuestionnaireControl.getInstance().renameTask(task);
    }//GEN-LAST:event_jRenameItemMousePressed

    private void jDeleteItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeleteItemMousePressed
        // TODO add your handling code here:
        EditQuestionnaireControl.getInstance().deleteTask(task);
    }//GEN-LAST:event_jDeleteItemMousePressed

    private void jPopupMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseClicked
        // TODO add your handling code here:
        jPopupMenu1.show(this,50,50);
    }//GEN-LAST:event_jPopupMenu1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        jPopupMenu1.show(this,50,50);
    }//GEN-LAST:event_formMouseClicked

    private void jRenameItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRenameItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRenameItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jDeleteItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jRenameItem;
    private javax.swing.JLabel taskName;
    // End of variables declaration//GEN-END:variables
}
