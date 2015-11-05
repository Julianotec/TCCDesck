/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.SaldoDAO;
import entity.Saldo;
import javax.swing.JOptionPane;

/**
 *
 * @author juliano_ferreira2
 */
public class MenuPrincipal extends javax.swing.JDialog {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSacar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnNovoFuncionario = new javax.swing.JButton();
        btnFecharCaixa = new javax.swing.JButton();
        btnAbriGaveta = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        btnAdiantamento = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        btnSacar.setBackground(new java.awt.Color(255, 255, 255));
        btnSacar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sacar.png"))); // NOI18N
        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnDepositar.setBackground(new java.awt.Color(255, 255, 255));
        btnDepositar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Depositar.png"))); // NOI18N
        btnDepositar.setText("Depositar");
        btnDepositar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnNovoFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoFuncionario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnNovoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/NovoFuncionario.png"))); // NOI18N
        btnNovoFuncionario.setText("Adicionar Funcionario");
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnFecharCaixa.setBackground(new java.awt.Color(255, 255, 255));
        btnFecharCaixa.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnFecharCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/FecharCaxia.png"))); // NOI18N
        btnFecharCaixa.setText("Fechar Caixa");
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });

        btnAbriGaveta.setBackground(new java.awt.Color(255, 255, 255));
        btnAbriGaveta.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAbriGaveta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Gaveta.png"))); // NOI18N
        btnAbriGaveta.setText("Abrir Gaveta");

        btnSaldo.setBackground(new java.awt.Color(255, 255, 255));
        btnSaldo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Saldo.png"))); // NOI18N
        btnSaldo.setText("Saldo");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        btnAdiantamento.setBackground(new java.awt.Color(255, 255, 255));
        btnAdiantamento.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAdiantamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/adiantamento.png"))); // NOI18N
        btnAdiantamento.setText("Adiantamento");
        btnAdiantamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiantamentoActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAbriGaveta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdiantamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFecharCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbriGaveta, btnAdiantamento, btnDepositar, btnFecharCaixa, btnNovoFuncionario, btnSacar, btnSair, btnSaldo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacar)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFecharCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbriGaveta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdiantamento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAbriGaveta, btnAdiantamento, btnDepositar, btnFecharCaixa, btnNovoFuncionario, btnSacar, btnSair, btnSaldo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        
        Saldo s = new Saldo();
        SaldoDAO dao = new SaldoDAO();
        s = dao.getSaldoById(1);
        double ValorSaldo; 
        ValorSaldo = s.getValor();
        JOptionPane.showMessageDialog(null, "Saldo: R$ " + ValorSaldo);
        
        
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
        FecharCaixa nomeVariavel = new FecharCaixa(null, rootPaneCheckingEnabled);
        nomeVariavel.setVisible(true);
    }//GEN-LAST:event_btnFecharCaixaActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        SacarDepositar nomeVariavel = new SacarDepositar(null, rootPaneCheckingEnabled);
        nomeVariavel.setVisible(true);
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
        NovoFuncionario nomeVariavel = new NovoFuncionario(null, rootPaneCheckingEnabled);
        nomeVariavel.setVisible(true);


    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnAdiantamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiantamentoActionPerformed

        Adiantamento nomeVariavel = new Adiantamento(null, rootPaneCheckingEnabled);
        nomeVariavel.setVisible(true);

    }//GEN-LAST:event_btnAdiantamentoActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        SacarDepositar nomeVariavel = new SacarDepositar(null, rootPaneCheckingEnabled);
        nomeVariavel.setVisible(true);
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal dialog = new MenuPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbriGaveta;
    private javax.swing.JButton btnAdiantamento;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSaldo;
    // End of variables declaration//GEN-END:variables
}
