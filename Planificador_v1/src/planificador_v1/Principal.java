/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificador_v1;

/**
 *
 * @author MrCante
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnSjfApropiativo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnSjfApropiativo1 = new javax.swing.JButton();
        BtnRR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BtnHDD = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("PLANIFICACIÓN DE DISCO");

        BtnSjfApropiativo.setBackground(new java.awt.Color(51, 102, 255));
        BtnSjfApropiativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnSjfApropiativo.setForeground(new java.awt.Color(255, 255, 255));
        BtnSjfApropiativo.setText("Sjf Apropiativo");
        BtnSjfApropiativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSjfApropiativoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("By. Melvin Canté");

        BtnSjfApropiativo1.setBackground(new java.awt.Color(51, 102, 255));
        BtnSjfApropiativo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnSjfApropiativo1.setForeground(new java.awt.Color(255, 255, 255));
        BtnSjfApropiativo1.setText("Prioridad Apropiativo");
        BtnSjfApropiativo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSjfApropiativo1ActionPerformed(evt);
            }
        });

        BtnRR.setBackground(new java.awt.Color(51, 102, 255));
        BtnRR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnRR.setForeground(new java.awt.Color(255, 255, 255));
        BtnRR.setText("Round Robin");
        BtnRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRRActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("ALGORITMOS DE PLANIFICACIÓN");

        BtnHDD.setBackground(new java.awt.Color(51, 102, 255));
        BtnHDD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnHDD.setForeground(new java.awt.Color(255, 255, 255));
        BtnHDD.setText("Algoritmos de HDD");
        BtnHDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHDDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnSjfApropiativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnSjfApropiativo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnRR, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(211, 211, 211))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnHDD, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(192, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(170, 170, 170)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(BtnSjfApropiativo)
                .addGap(18, 18, 18)
                .addComponent(BtnSjfApropiativo1)
                .addGap(18, 18, 18)
                .addComponent(BtnRR)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnHDD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel4)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSjfApropiativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSjfApropiativoActionPerformed
        sjfApropiativo mostrarSfj = new sjfApropiativo();
        mostrarSfj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnSjfApropiativoActionPerformed

    private void BtnSjfApropiativo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSjfApropiativo1ActionPerformed
        PrioridadApropiativo mostrarP = new PrioridadApropiativo();
        mostrarP.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnSjfApropiativo1ActionPerformed

    private void BtnRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRRActionPerformed
        RoundRobin mostrarRR = new RoundRobin();
        mostrarRR.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRRActionPerformed

    private void BtnHDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHDDActionPerformed
        Disco mostrarD = new Disco();
        mostrarD.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnHDDActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHDD;
    private javax.swing.JButton BtnRR;
    private javax.swing.JButton BtnSjfApropiativo;
    private javax.swing.JButton BtnSjfApropiativo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}