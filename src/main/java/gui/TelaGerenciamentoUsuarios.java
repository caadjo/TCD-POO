/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import Emprestimo.EmprestimoDao;
import credential.CredentialDao;
import java.awt.Label;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import librarian.Librarian;
import librarian.LibrarianDao;
import reader.Reader;
import reader.ReaderDao;
import role.RoleDao;
import user.User;
import user.UserDao;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class TelaGerenciamentoUsuarios extends javax.swing.JDialog {
 
    
    
    private Long id;
    private  User user1;
    private String nameRole;
    
    /**
     * Creates new form TelaGerenciamentoUsuarios
     */
    public TelaGerenciamentoUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

      public TelaGerenciamentoUsuarios(User e,String nameRole){
        initComponents();
        this.nameRole=nameRole;
        setLocationRelativeTo(null);
        setTitle("Gerenciar usuários");
        
        
        
        this.user1 = e;
        String aux = String.valueOf(e.getId());
        String dataFormatada = e.getBirthdate().toString();
        
        
        txtNome.setText(e.getName());
        lblTest.setText(aux);
        txtEmail.setText(e.getEmail());
        txtDataNascimento.setText(dataFormatada);
      
        
        
    }
    
   
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAniversario = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        btnAdministrador = new javax.swing.JRadioButton();
        btnLeitor = new javax.swing.JRadioButton();
        btnBibliotecario = new javax.swing.JRadioButton();
        lblSelecioneRole = new javax.swing.JLabel();
        lblTest = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        lbl_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ID.setText("Id:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("Email:");

        lblAniversario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAniversario.setText("Data de Nascimento:");

        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        btnGroup.add(btnAdministrador);
        btnAdministrador.setText("Administrador");
        btnAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdministradorMouseReleased(evt);
            }
        });

        btnGroup.add(btnLeitor);
        btnLeitor.setText("Leitor");
        btnLeitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLeitorMouseReleased(evt);
            }
        });

        btnGroup.add(btnBibliotecario);
        btnBibliotecario.setText("Bibliotecario");
        btnBibliotecario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBibliotecarioMouseReleased(evt);
            }
        });

        lblSelecioneRole.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSelecioneRole.setText("Selecione a Role desejada:");

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExcluirMouseReleased(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlterarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTest))
                            .addComponent(lblSelecioneRole)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdministrador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLeitor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBibliotecario))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblAniversario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDataNascimento))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmail)
                                        .addComponent(lblNome))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ID)
                    .addComponent(lblTest))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAniversario)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblSelecioneRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdministrador)
                    .addComponent(btnLeitor)
                    .addComponent(btnBibliotecario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void btnAdministradorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministradorMouseReleased
        // TODO add your handling code here:
        
        this.id = 1L;
    }//GEN-LAST:event_btnAdministradorMouseReleased

    private void btnLeitorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeitorMouseReleased
        // TODO add your handling code here:
        this.id = 2L;
        
    }//GEN-LAST:event_btnLeitorMouseReleased

    private void btnBibliotecarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBibliotecarioMouseReleased
        // TODO add your handling code here:
        this.id = 3L;
        
    }//GEN-LAST:event_btnBibliotecarioMouseReleased

    private void btnAlterarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseReleased
        // TODO add your handling code here:
        
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
           LocalDate localDate = LocalDate.parse(txtDataNascimento.getText(), formatter);
            
            
        user1.setName(txtNome.getText());
        
        user1.setBirthdate(localDate);
        
        user1.setEmail(txtEmail.getText());
        String auxiliarl="Leitor";
        String auxiliarb="Bibliotecario";
        if(user1.getRole().getName().equals(auxiliarl)){
            new ReaderDao().delete(user1.getId()); 
        }
        
        if(user1.getRole().getName().equals(auxiliarb)){
            new LibrarianDao().delete(user1.getId());
        }
                   
        user1.setRole(new RoleDao().findById(id));
        
        if(user1.getRole().getName().equals(auxiliarl)){
            Reader leitor = new Reader(user1.getId(),user1.getName(),user1.getEmail(),user1.getBirthdate());
            new ReaderDao().save(leitor);      
        }
        
        
        if(user1.getRole().getName().equals(auxiliarb)){
            Librarian biblio = new Librarian(user1.getId(),user1.getName(),user1.getEmail(),user1.getBirthdate());
            new LibrarianDao().save(biblio);
        } 


        new UserDao().Update(user1);
        
        
         dispose();
        
        TelaPrincipal newTela = new TelaPrincipal(nameRole);
        newTela.setVisible(true);
        
        
        
        }
      
       catch(Exception e){
                 System.out.println("");
               }
       
        
     
        
        
        
    }//GEN-LAST:event_btnAlterarMouseReleased

    private void btnExcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseReleased
        // TODO add your handling code here:
        
        
        
        new LibrarianDao().delete(user1.getId());
        
        new ReaderDao().delete(user1.getId());
        
        new CredentialDao().delete(user1.getId());
       
        new EmprestimoDao().delete(user1.getId());
           
        new UserDao().delete(user1.getId());
        
        dispose();
        
        TelaPrincipal newTela = new TelaPrincipal(nameRole);
        newTela.setVisible(true);
       
            
        
    }//GEN-LAST:event_btnExcluirMouseReleased

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        // TODO add your handling code here:
        
        dispose();
        TelaPrincipal newTela = new TelaPrincipal();
        newTela.setVisible(true);
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        dispose();
        
        TelaPrincipal newTela = new TelaPrincipal();
        newTela.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaGerenciamentoUsuarios dialog = new TelaGerenciamentoUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton btnAdministrador;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JRadioButton btnBibliotecario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JRadioButton btnLeitor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAniversario;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSelecioneRole;
    private javax.swing.JLabel lblTest;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
