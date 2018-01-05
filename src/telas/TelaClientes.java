package telas;

import banco.ArquivoCliente;
import banco.Banco;
import conta.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author kalebe
 */
public class TelaClientes extends javax.swing.JFrame {

    private final Cliente c = new Cliente();
    private final Conta contac = new ContaCorrente(0);
    private final Conta contap = new ContaPoupanca(0);

    public TelaClientes() {
        initComponents();
        novaTela();
        carregaMascaras();
        Random random = new Random();
        jTextPaneContaNumero.setText(String.valueOf(random.nextInt(1000)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jFormattedTextCPF = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonCC = new javax.swing.JRadioButton();
        jRadioButtonCP = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneContaNumero = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cliente");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jButtonSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSalvarKeyPressed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });

        jTextFieldSobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSobrenomeKeyPressed(evt);
            }
        });

        jFormattedTextCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextCPFKeyPressed(evt);
            }
        });

        jLabel2.setText("Sobrenome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Senha:");

        jRadioButtonCC.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jRadioButtonCC.setSelected(true);
        jRadioButtonCC.setText("Conta Corrente");
        jRadioButtonCC.setAutoscrolls(true);

        jRadioButtonCP.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jRadioButtonCP.setText("Conta Poupança");

        jTextPaneContaNumero.setEditable(false);
        jScrollPane1.setViewportView(jTextPaneContaNumero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jRadioButtonCC)
                        .addGap(8, 8, 8)
                        .addComponent(jRadioButtonCP))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldSobrenome)
                            .addComponent(jPasswordFieldSenha)
                            .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCC)
                    .addComponent(jRadioButtonCP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvarCliente();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        if (isKeyPressedEnterOrTab(evt)) {
            jTextFieldSobrenome.setFocusable(true);
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jTextFieldSobrenomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeKeyPressed
        if (isKeyPressedEnterOrTab(evt)) {
            jFormattedTextCPF.setFocusable(true);
        }
    }//GEN-LAST:event_jTextFieldSobrenomeKeyPressed

    private void jFormattedTextCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextCPFKeyPressed
        if (isKeyPressedEnterOrTab(evt)) {
            jPasswordFieldSenha.setFocusable(true);
        }
    }//GEN-LAST:event_jFormattedTextCPFKeyPressed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        if (isKeyPressedEnterOrTab(evt)) {
            jButtonSalvar.setFocusable(true);
        }
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jButtonSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSalvarKeyPressed
        if (isKeyPressedEnter(evt)) {
            salvarCliente();
        }
    }//GEN-LAST:event_jButtonSalvarKeyPressed

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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButtonCC;
    private javax.swing.JRadioButton jRadioButtonCP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    private javax.swing.JTextPane jTextPaneContaNumero;
    // End of variables declaration//GEN-END:variables

    private void carregaMascaras() {
        try {
            MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
            JFormattedTextField cpf = new JFormattedTextField(mascaraCpf);
            jFormattedTextCPF.add(cpf);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível carregar máscaras " + ex, "Atenção !!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Cliente setCliente() {
        c.setNome(jTextFieldNome.getText());
        c.setSobrenome(jTextFieldSobrenome.getText());
        c.setCpf(jFormattedTextCPF.getText().trim());
        c.setNumeroConta(jTextPaneContaNumero.getText());
        if (jRadioButtonCC.isSelected()) {
            c.setTipoDeConta("Conta Corrente");
        } else if (jRadioButtonCP.isSelected()) {
            c.setTipoDeConta("Conta Poupança");
        } else {
            c.setTipoDeConta("Não Selecionado");
        }

        return c;
    }

    public final void novaTela() {
        jFormattedTextCPF.setText("");
        jPasswordFieldSenha.setText("");
        jTextFieldNome.setText("");
        jTextFieldSobrenome.setText("");
    }

    public static boolean isCPF(String CPF) {
        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            // Calculo do 1º Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {

// converte o i-esimo caractere do CPF em um numero: por exemplo, transforma o caractere '0' no inteiro 0(48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }

            // Calculo do 2º Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    private void chamaTelaConta() {
        if (jRadioButtonCC.isSelected()) {
            setContaCorrente();
            TelaContas tc = new TelaContas(c, contac);
            tc.setVisible(true);
            tc.setFocusable(true);
        } else if (jRadioButtonCP.isSelected()) {
            setContaPoupanca();
            TelaContas tc = new TelaContas(c, contap);
            tc.setVisible(true);
            tc.setFocusable(true);
        }
    }

    public void setContaCorrente() {
        contac.setNumero(Integer.parseInt(c.getNumeroConta()));
        contac.setTitular(c.getNome());
        contac.setLimite(800.0);
    }

    public void setContaPoupanca() {
        contap.setNumero(Integer.parseInt(c.getNumeroConta()));
        contap.setTitular(c.getNome());
        contap.setLimite(500.0);
    }

    public void fechaTela() {
        TelaClientes.this.dispose();
    }

    public boolean verificaCampos() {
        if ((jTextFieldNome.getText().trim().isEmpty())
                && jTextFieldSobrenome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencher os campos obrigatoriamente. ", "Atenção !!!", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaNumero() {
        if (contemSomenteNumeros(jTextFieldNome.getText()) || contemSomenteNumeros(jTextFieldSobrenome.getText())) {
            JOptionPane.showMessageDialog(this, "Digite somente letras, por favor. ", "Atenção !!", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    public boolean contemSomenteNumeros(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            //Se encontrar um não-caractere retornará falso
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isKeyPressedEnterOrTab(KeyEvent event) {
        return event.getKeyCode() == KeyEvent.VK_ENTER || event.getKeyCode() == KeyEvent.VK_TAB;
    }

    public static boolean isKeyPressedEnter(KeyEvent event) {
        return event.getKeyCode() == KeyEvent.VK_ENTER;
    }

    public void salvarCliente() {
        if (!verificaCampos() && isCPF(jFormattedTextCPF.getText())) {
            try {
                setCliente();
                if (!verificaNumero()) {
                    JFileChooser arquivo = new JFileChooser();
                    arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    arquivo.showOpenDialog(this);
                    File file = arquivo.getSelectedFile();
                    if (file != null) {
                        ArquivoCliente aqc = new ArquivoCliente(c);
                        aqc.lerConteudoArquivo(file);
                        aqc.gravaArquivoCliente("ArquivoCliente", c, true);
                        try {
                            aqc.gerarArquivoCopia(c);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(this, "Não foi possível gerar arquivo cópia " + ex, "Atenção !!", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Selecione um arquivo texto pra gravação do cliente. ", "Atenção !!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else {
                    return;
                }
                novaTela();
                chamaTelaConta();
                fechaTela();
            } catch (IOException ex) {
                Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "CPF não é válido");
        }
    }
}
