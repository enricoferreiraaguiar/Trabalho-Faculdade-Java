/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Produtos.Produto;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrico Ferreira
 */
public class InterfaceAdmRelatorio extends javax.swing.JFrame {
 DefaultListModel dlm;
    /**
     * Creates new form InterfaceAdmRelatorio
     */
    public InterfaceAdmRelatorio() {
        dlm = new DefaultListModel();
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFecharLogin = new javax.swing.JLabel();
        jLabelMinLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbLucroFutebol = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDados = new javax.swing.JTextArea();
        rbLucroBasquete = new javax.swing.JRadioButton();
        btVt = new javax.swing.JButton();
        btGerar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRelatório = new javax.swing.JList<>();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Relatório de Produtos");

        jLabelFecharLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFecharLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecharLogin.setText("X");
        jLabelFecharLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFecharLoginMouseClicked(evt);
            }
        });

        jLabelMinLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMinLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinLogin.setText("-");
        jLabelMinLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabelMinLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFecharLogin)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecharLogin)
                    .addComponent(jLabelMinLogin)
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 70);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Qual relatório deseja gerar?");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 220, 17);

        rbLucroFutebol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbLucroFutebol.setForeground(new java.awt.Color(236, 240, 241));
        rbLucroFutebol.setText("Lucro de Venda da Bola de Futebol");
        rbLucroFutebol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLucroFutebolActionPerformed(evt);
            }
        });
        jPanel2.add(rbLucroFutebol);
        rbLucroFutebol.setBounds(20, 100, 260, 20);

        txtDados.setBackground(new java.awt.Color(108, 122, 137));
        txtDados.setColumns(20);
        txtDados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDados.setForeground(new java.awt.Color(236, 240, 241));
        txtDados.setRows(5);
        jScrollPane4.setViewportView(txtDados);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(510, 30, 170, 190);

        rbLucroBasquete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbLucroBasquete.setForeground(new java.awt.Color(236, 240, 241));
        rbLucroBasquete.setText("Lucro de Venda da Bola de Basquete");
        jPanel2.add(rbLucroBasquete);
        rbLucroBasquete.setBounds(20, 70, 260, 21);

        btVt.setBackground(new java.awt.Color(255, 0, 0));
        btVt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVt.setForeground(new java.awt.Color(255, 255, 255));
        btVt.setText("Voltar");
        btVt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVtActionPerformed(evt);
            }
        });
        jPanel2.add(btVt);
        btVt.setBounds(10, 200, 80, 23);

        btGerar.setBackground(new java.awt.Color(0, 102, 102));
        btGerar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btGerar.setForeground(new java.awt.Color(255, 255, 255));
        btGerar.setText("Gerar");
        btGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarActionPerformed(evt);
            }
        });
        jPanel2.add(btGerar);
        btGerar.setBounds(100, 200, 80, 23);

        btExcluir.setBackground(new java.awt.Color(192, 57, 43));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btExcluir);
        btExcluir.setBounds(190, 200, 80, 23);

        listaRelatório.setBackground(new java.awt.Color(108, 122, 137));
        listaRelatório.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaRelatório.setForeground(new java.awt.Color(236, 240, 241));
        jScrollPane1.setViewportView(listaRelatório);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(290, 10, 180, 200);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 480, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFecharLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelFecharLoginMouseClicked

    private void jLabelMinLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinLoginMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinLoginMouseClicked

    private void rbLucroFutebolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLucroFutebolActionPerformed
       
    }//GEN-LAST:event_rbLucroFutebolActionPerformed

    private void btVtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVtActionPerformed
      
 InterfaceAdm iadm = new InterfaceAdm();
        iadm.setVisible(true);
        iadm.pack();
        iadm.setLocationRelativeTo(null);
        iadm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btVtActionPerformed

    private void btGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarActionPerformed
Produto p = new Produto ("Bola de Futebol" , "432" , (float) 30,(float) 15,"7/05/2022");
Produto p2 = new Produto ("Bola de Basquete", "931" , (float) 20, (float)10,"13/04/2022");
        
        
        
        String divisao = "----------------";
if(!rbLucroFutebol.isSelected() && !rbLucroBasquete.isSelected()){
JOptionPane.showMessageDialog(null,"Selecione um dado", "Aviso", JOptionPane.WARNING_MESSAGE);
}
        
        
        if(rbLucroFutebol.isSelected()){
        
          dlm.addElement( "O Lucro da Bola de Futebol é : " + "R$" + p.imprimirRelatorioLucro(p.getPreco(), p.getPrecoCompra()));
          listaRelatório.setModel(dlm);
          rbLucroFutebol.setSelected(false);
           
       }
       
        if (rbLucroBasquete.isSelected())     {
        
        dlm.addElement("O Lucro da Bola de Basquete é : " + "R$" + p2.imprimirRelatorioLucro(p2.getPreco(),p2.getPrecoCompra()));
        listaRelatório.setModel(dlm);
        rbLucroBasquete.setSelected(false);
        }
    }//GEN-LAST:event_btGerarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        dlm.removeElementAt(listaRelatório.getSelectedIndex());
        listaRelatório.clearSelection();
        JOptionPane.showMessageDialog(null, "Dado excluído com sucesso", null, WIDTH);
    }//GEN-LAST:event_btExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAdmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAdmRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGerar;
    private javax.swing.JButton btVt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFecharLogin;
    private javax.swing.JLabel jLabelMinLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listaRelatório;
    private javax.swing.JRadioButton rbLucroBasquete;
    private javax.swing.JRadioButton rbLucroFutebol;
    private javax.swing.JTextArea txtDados;
    // End of variables declaration//GEN-END:variables
}