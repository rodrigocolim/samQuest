/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Objects;

import Control.InsertResponseIdControl;
import Control.MainControl;
import Control.ResponseControl;
import Control.EditQuestionnaireControl;
import Model.Questionnaire.QuestionnaireModel;
import Model.User.ResearcherModel;
import com.itextpdf.text.DocumentException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class ObjQuest extends javax.swing.JPanel {

    private final QuestionnaireModel questionnaire;

    /**
     * Creates new form ObjQuest2
     *
     * @param questionnaire
     */
    public ObjQuest(QuestionnaireModel questionnaire) {
        initComponents();
        this.questionnaire = questionnaire;
        jApplicationName.setText(questionnaire.getApplication());
        if (questionnaire.getTasks().isEmpty()) {
            jMenuReply.setEnabled(false);
        }
        if (questionnaire.getResults().isEmpty()) {
            jMenuResults.setEnabled(false);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuEdit = new javax.swing.JMenuItem();
        jMenuReply = new javax.swing.JMenuItem();
        jMenuResults = new javax.swing.JMenuItem();
        jSavePDFItem = new javax.swing.JMenuItem();
        jMenuDelete = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jApplicationName = new java.awt.Label();

        jMenuEdit.setText("Editar");
        jMenuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuEdit);

        jMenuReply.setText("Responder");
        jMenuReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReplyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuReply);

        jMenuResults.setText("Resultados");
        jMenuResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuResultsActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuResults);

        jSavePDFItem.setText("Salvar PDF");
        jSavePDFItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSavePDFItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jSavePDFItem);

        jMenuDelete.setText("Excluir");
        jMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuDelete);

        setBackground(new java.awt.Color(222, 222, 222));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(90, 100));
        setMinimumSize(new java.awt.Dimension(90, 100));
        setPreferredSize(new java.awt.Dimension(90, 100));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_questionnaire_22.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 70, 60));

        jApplicationName.setAlignment(java.awt.Label.CENTER);
        jApplicationName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jApplicationName.setText("label2");
        add(jApplicationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 68, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        jPopupMenu1.show(this, 50, 50);
    }//GEN-LAST:event_formMouseClicked

    private void jSavePDFItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSavePDFItemActionPerformed
        // TODO add your handling code here:
        ResearcherModel.getInstance().saveQuestPDF(questionnaire);
    }//GEN-LAST:event_jSavePDFItemActionPerformed

    private void jMenuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditActionPerformed
        // TODO add your handling code here:
        MainControl.getInstance().closeMainView();
        EditQuestionnaireControl.getInstance().showView(questionnaire);
    }//GEN-LAST:event_jMenuEditActionPerformed

    private void jMenuResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuResultsActionPerformed
        try {
            ResearcherModel.getInstance().saveResultPDF(questionnaire);
        } catch (DocumentException ex) {
            System.out.println(ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Respostas salvas na pasta Resultados!", null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuResultsActionPerformed

    private void jMenuReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReplyActionPerformed
        // TODO add your handling code here:
        MainControl.getInstance().disableMainView();
        InsertResponseIdControl.getInstance().showView(questionnaire);
//ResponseControl.getInstance().showView(questionnaire);
    }//GEN-LAST:event_jMenuReplyActionPerformed

    private void jMenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteActionPerformed
        // TODO add your handling code here:
        MainControl.getInstance().delete(questionnaire);
    }//GEN-LAST:event_jMenuDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label jApplicationName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuDelete;
    private javax.swing.JMenuItem jMenuEdit;
    private javax.swing.JMenuItem jMenuReply;
    private javax.swing.JMenuItem jMenuResults;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jSavePDFItem;
    // End of variables declaration//GEN-END:variables
}
