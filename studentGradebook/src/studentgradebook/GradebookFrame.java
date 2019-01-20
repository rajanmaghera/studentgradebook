/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradebook;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author rajan
 */
public class GradebookFrame extends javax.swing.JFrame {

    final String[] quotes;
    final String datetime = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
    
    /**
     * Creates new form GradebookFrame
     */
    public GradebookFrame() {
        this.quotes = new String[]{"\"Don't let what you cannot do interfere \nwith what you can do.\" -John Wooden", "\"Successful and unsuccessful people do not vary \ngreatly in their abilities. They vary in their desires to\n reach their potential.\" -John Maxwell", "\"Strive for progress, not perfection.\" -Unknown", "\"There are no shortcuts to any place worth going.\" -Beverly Sills", "\"Failure is the opportunity to begin \nagain more intelligently.\" -Henry Ford", "\"Our greatest weakness lies in giving up.\nThe most certain way to succeed is \nalways to try just one more time.\" -Thomas A. Edison", "\"You've got to get up every morning with determination \nif you're going to go to bed with satisfaction.\" -George Lorimer", "\"Start where you are. \nUse what you have. Do what you can.\" -Arthur Ashe", "\"The secret of success is to do \nthe common things uncommonly well.\" -John D. Rockefeller", "\"Don't wish it were easier; wish \nyou were better.\" -Jim Rohn"};
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        classButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        quoteLabel = new javax.swing.JLabel();
        performanceButton = new javax.swing.JButton();
        datetimeLabel = new javax.swing.JLabel();
        averageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Gradebook");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(750, 400));
        setPreferredSize(new java.awt.Dimension(750, 400));

        classButton.setText("View Classes");
        classButton.setAlignmentX(0.5F);
        classButton.setAutoscrolls(true);
        classButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        classButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classButtonMouseClicked(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Student Gradebook");
        titleLabel.setFocusable(false);
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        quoteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quoteLabel.setText(quotes[(int)Math.floor(Math.random()*quotes.length)]);
        quoteLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        performanceButton.setText("View Performance");
        performanceButton.setAlignmentX(1.0F);
        performanceButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        performanceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                performanceButtonMouseClicked(evt);
            }
        });
        performanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performanceButtonActionPerformed(evt);
            }
        });

        datetimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datetimeLabel.setText(datetime);

        averageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        averageLabel.setText("Current Average: " + StudentGradebook.studentAverage());
        averageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quoteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datetimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(averageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(classButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93)
                .addComponent(performanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(datetimeLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classButton)
                    .addComponent(performanceButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(averageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_classButtonMouseClicked

    private void performanceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performanceButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_performanceButtonMouseClicked

    private void performanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performanceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_performanceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GradebookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradebookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradebookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradebookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradebookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel averageLabel;
    public javax.swing.JButton classButton;
    private javax.swing.JLabel datetimeLabel;
    private javax.swing.JDialog jDialog1;
    public javax.swing.JButton performanceButton;
    private javax.swing.JLabel quoteLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
