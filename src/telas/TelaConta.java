package telas;

import banco.ArquivoBanco;
import conta.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author DEV-ITEC
 */
public class TelaConta extends JFrame {

    private Cliente cli;
    private Conta conta;

    public TelaConta() {
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

        jTextFieldDeposita = new javax.swing.JTextField();
        jTextFieldSaca = new javax.swing.JTextField();
        jTextFieldTransfere = new javax.swing.JTextField();
        jButtonDeposita = new javax.swing.JButton();
        jButtonTransfere = new javax.swing.JButton();
        jButtonSaca = new javax.swing.JButton();
        jButtonExtrato = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jTextFieldSaldo = new javax.swing.JTextField();
        jButtonSaldo = new javax.swing.JButton();

        setName("Conta"); // NOI18N

        jTextFieldDeposita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldSaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTransfere.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonDeposita.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonDeposita.setText("Deposita");
        jButtonDeposita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositaActionPerformed(evt);
            }
        });

        jButtonTransfere.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonTransfere.setText("Transfere");
        jButtonTransfere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransfereActionPerformed(evt);
            }
        });

        jButtonSaca.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonSaca.setText("Saca");
        jButtonSaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacaActionPerformed(evt);
            }
        });

        jButtonExtrato.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButtonExtrato.setText("Extrato");
        jButtonExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtratoActionPerformed(evt);
            }
        });

        jButtonFechar.setFont(new java.awt.Font("Segoe WP Black", 1, 14)); // NOI18N
        jButtonFechar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonSaldo.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        jButtonSaldo.setText("Saldo da Conta");
        jButtonSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSaca, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDeposita, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDeposita, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSaca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jTextFieldTransfere, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonTransfere, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDeposita, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeposita, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSaca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTransfere, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTransfere, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jTextFieldSaldo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        TelaConta.this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonDepositaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositaActionPerformed
        if (cli.getTipoDeConta().equals("Conta Corrente")) {
            Conta cont = new ContaCorrente(Integer.parseInt(cli.getNumeroConta()));
            cont.setSaldo(Double.parseDouble(jButtonDeposita.getText()));
            conta.deposita(Double.parseDouble(jButtonDeposita.getText()));
        } else {
            Conta cont = new ContaPoupanca(Integer.parseInt(cli.getNumeroConta()));
            cont.setSaldo(Double.parseDouble(jButtonDeposita.getText()));
            conta.deposita(Double.parseDouble(jButtonDeposita.getText()));
        }
    }//GEN-LAST:event_jButtonDepositaActionPerformed

    private void jButtonSacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacaActionPerformed
        conta.saca(Double.parseDouble(jButtonSaca.getText()));
    }//GEN-LAST:event_jButtonSacaActionPerformed

    private void jButtonTransfereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransfereActionPerformed
        if (cli.getTipoDeConta().equals("Conta Corrente")) {
            Conta cont = new ContaCorrente(Integer.parseInt(cli.getNumeroConta()));
            conta.transfere(cont, Double.parseDouble(jButtonTransfere.getText()));
            conta.atualiza(0.06);
        } else {
            Conta cont = new ContaPoupanca(Integer.parseInt(cli.getNumeroConta()));
            conta.transfere(cont, Double.parseDouble(jButtonTransfere.getText()));
            conta.atualiza(0.03);
        }
    }//GEN-LAST:event_jButtonTransfereActionPerformed

    private void jButtonSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaldoActionPerformed
        if (cli.getTipoDeConta().equals("Conta Corrente")) {
            conta.getSaldo();
        } else {
            conta.getSaldo();
        }
    }//GEN-LAST:event_jButtonSaldoActionPerformed

    private void jButtonExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtratoActionPerformed
        JFileChooser arquivo = new JFileChooser();
        File file = arquivo.getSelectedFile();
        
        ArquivoBanco arqb = new ArquivoBanco();
        arqb.gerarExtrato(file);
    }//GEN-LAST:event_jButtonExtratoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeposita;
    private javax.swing.JButton jButtonExtrato;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonSaca;
    private javax.swing.JButton jButtonSaldo;
    private javax.swing.JButton jButtonTransfere;
    private javax.swing.JTextField jTextFieldDeposita;
    private javax.swing.JTextField jTextFieldSaca;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldTransfere;
    // End of variables declaration//GEN-END:variables
}
