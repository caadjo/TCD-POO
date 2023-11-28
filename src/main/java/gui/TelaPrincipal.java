/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class TelaPrincipal extends javax.swing.JFrame {
    

   public TelaPrincipal(){
       initComponents();
       setLocationRelativeTo(null);
   }
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(String nameRole) {
        initComponents();
        setLocationRelativeTo(null);
        
        
        
        System.out.println(">> " + nameRole);
        
        
        if("Administrador".equals(nameRole)){
            System.out.println("chegou ADMIN");

        }
        if("Leitor".equals(nameRole)){
            
            System.out.println("CHEGOU LEITOR");
            itmCadastrarNovoLivro.setVisible(false);
            itmCadastrarNovoUsuario.setVisible(false);
            mnu1Administrador.setVisible(false);
            itmEmprestimo.setVisible(false);
            
            
        }
        if("Bibliotecario".equals(nameRole)){
            
            System.out.println("CHEGOU BIBLIOTECARIO");
            itmCadastrarNovoUsuario.setVisible(false);
            mnu1Administrador.setVisible(false);
            itmAutorizarEmprestimos.setVisible(false);
            itmHistoricoEmprestimos.setVisible(false);
            
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu1Administrador = new javax.swing.JMenu();
        itmCadastrarNovoUsuario = new javax.swing.JMenuItem();
        mnuLivros = new javax.swing.JMenu();
        itmCadastrarNovoLivro = new javax.swing.JMenuItem();
        itmEmprestimo = new javax.swing.JMenuItem();
        itmAutorizarEmprestimos = new javax.swing.JMenuItem();
        itmHistoricoEmprestimos = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenu();
        itmFecharPrograma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        mnu1Administrador.setText("Administrador");

        itmCadastrarNovoUsuario.setText("Cadastrar novo usuário");
        mnu1Administrador.add(itmCadastrarNovoUsuario);

        jMenuBar1.add(mnu1Administrador);

        mnuLivros.setText("Livros");

        itmCadastrarNovoLivro.setText("Cadastrar novo livro");
        mnuLivros.add(itmCadastrarNovoLivro);

        itmEmprestimo.setText("Realizar novo empréstimo");
        mnuLivros.add(itmEmprestimo);

        itmAutorizarEmprestimos.setText("Autorizar empréstimo");
        itmAutorizarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAutorizarEmprestimosActionPerformed(evt);
            }
        });
        mnuLivros.add(itmAutorizarEmprestimos);

        itmHistoricoEmprestimos.setText("Histórico de Emprestimos");
        mnuLivros.add(itmHistoricoEmprestimos);

        jMenuBar1.add(mnuLivros);

        mnuSair.setText("Sair");

        itmFecharPrograma.setText("Fechar");
        itmFecharPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                itmFecharProgramaMouseReleased(evt);
            }
        });
        mnuSair.add(itmFecharPrograma);

        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAutorizarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAutorizarEmprestimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmAutorizarEmprestimosActionPerformed

    private void itmFecharProgramaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmFecharProgramaMouseReleased
        // TODO add your handling code here:
         dispose();
        TelaAutenticacao newTela = new TelaAutenticacao();
        newTela.setVisible(true);
    }//GEN-LAST:event_itmFecharProgramaMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         dispose();
        TelaAutenticacao newTela = new TelaAutenticacao();
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAutorizarEmprestimos;
    private javax.swing.JMenuItem itmCadastrarNovoLivro;
    private javax.swing.JMenuItem itmCadastrarNovoUsuario;
    private javax.swing.JMenuItem itmEmprestimo;
    private javax.swing.JMenuItem itmFecharPrograma;
    private javax.swing.JMenuItem itmHistoricoEmprestimos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnu1Administrador;
    private javax.swing.JMenu mnuLivros;
    private javax.swing.JMenu mnuSair;
    // End of variables declaration//GEN-END:variables
}