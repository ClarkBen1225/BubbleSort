/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author becla2307
 */
public class showWhatYouKnowUI extends javax.swing.JFrame {

    /**
     * Creates new form showWhatYouKnowUI
     */
    public showWhatYouKnowUI() {
        initComponents();
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
        backPanel = new javax.swing.JPanel();
        titleLable = new javax.swing.JLabel();
        genBtn = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();
        mainLabel2 = new javax.swing.JLabel();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setBackground(new java.awt.Color(255, 0, 255));

        titleLable.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        titleLable.setText("Min to Max Generator");

        genBtn.setBackground(new java.awt.Color(255, 0, 255));
        genBtn.setText("Generate");
        genBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(genBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainLabel2)
                    .addComponent(titleLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLable)
                .addGap(31, 31, 31)
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(genBtn)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genBtnActionPerformed
        //Declare variables 
        char n = 10;
        int [] numbers = new int [n];
        int temp = 0;
        //Max and min for the numbers
        final int TOP_LIMIT = 99;
        final int LOW_LIMIT = 1;
        for (int a=0; a<n; a++){
            //picks numbers between one and 99 
            numbers[a] = (int)Math.round(Math.random()*TOP_LIMIT+1);
            System.out.println(numbers[a]);
        }
        //Swap loop
        for(int i=0; i <n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(numbers[j-1] > numbers[j]){  
                                 //swap elements  
                                 temp = numbers[j-1];  
                                 numbers[j-1] = numbers[j];  
                                 numbers[j] = temp;  
                         }  
                          
                 }  
         }
         for (int k=0; k <n; k++){
        //System.out.println(numbers[k]);
        }
        mainLabel.setText("Your min value is" + numbers[0]);
        mainLabel2.setText("Your max value is" +numbers[n-1]);
    }//GEN-LAST:event_genBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(showWhatYouKnowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showWhatYouKnowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showWhatYouKnowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showWhatYouKnowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showWhatYouKnowUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton genBtn;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mainLabel2;
    private javax.swing.JLabel titleLable;
    // End of variables declaration//GEN-END:variables
}
