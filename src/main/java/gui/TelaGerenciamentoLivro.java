/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import Emprestimo.Emprestimo;
import Emprestimo.EmprestimoDao;
import book.Book;
import book.BookDao;
import static java.lang.Integer.parseInt;
import java.math.BigDecimal;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class TelaGerenciamentoLivro extends javax.swing.JFrame {

    
    private Book livro = new Book();
    private String nameRole;
    
    
    
    /**
     * Creates new form TelaGerenciamentoLivro
     */
    public TelaGerenciamentoLivro(Book e,String nameRole) {
        initComponents();
        this.nameRole=nameRole;
        this.livro=e;
        setTitle("Gerenciar livros");
        lblNomeLivro.setText("Nome do livro: " + e.getNomelivro());
        lblQuantidade.setText("Quantidade de exemplares: " + e.getQuantidadeex());
        lblAutor.setText("Autor: " + e.getAutor());
        lbl_id.setText("ID: " + e.getId().toString());
          
    }
    public TelaGerenciamentoLivro(){
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

        jPanel1 = new javax.swing.JPanel();
        lblNomeLivro = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantEx = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeLivro.setText("Nome do livro:");

        lblAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAutor.setText("Autor:");

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuantidade.setText("Quantidade de exemplares:");

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExcluirMouseReleased(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlterarMouseReleased(evt);
            }
        });

        lbl_id.setText("ID:    ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAutor)
                    .addComponent(lblNomeLivro)
                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuantidade)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantEx, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNomeLivro)
                .addGap(28, 28, 28)
                .addComponent(lblAutor)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseReleased
        // TODO add your handling code here:

        try{
            int  num1 = Integer.parseInt(txtQuantEx.getText());
            livro.setQuantidadeex(num1);       
            new BookDao().Update(livro);

        }
        catch(Exception e){

        }

    }//GEN-LAST:event_btnAlterarMouseReleased

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnExcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseReleased
        // TODO add your handling code here:
        String nomelivro=livro.getNomelivro();
        for(Emprestimo e:new EmprestimoDao().findAll()){
            if(e.getNomelivro().equals(nomelivro)){
                new EmprestimoDao().delete(e.getId());
            }
        }
        new BookDao().delete(livro.getId());
        dispose();
        TelaPrincipal newTela = new TelaPrincipal();
        newTela.setVisible(true);
       
    }//GEN-LAST:event_btnExcluirMouseReleased

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        // TODO add your handling code here:
        dispose();
        TelaPrincipal newTela = new TelaPrincipal(nameRole);
        newTela.setVisible(true);
        
    }//GEN-LAST:event_btnCancelarMouseReleased

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
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciamentoLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblNomeLivro;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTextField txtQuantEx;
    // End of variables declaration//GEN-END:variables
}
