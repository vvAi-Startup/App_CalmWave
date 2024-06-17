/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fatec-dsm2
 */
public class FListarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FListarUsuarios
     */
    public FListarUsuarios() {
        initComponents();
        refreshar();
    }
    
    Usuarios usu = new Usuarios();
    
    public String user;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_fundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_voltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_usuarios = new javax.swing.JTable();
        btn_refresh = new javax.swing.JButton();
        btn_ordenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_alterar = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JLabel();
        lbl_tempo = new javax.swing.JLabel();
        btn_sair = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/menu/nav_menu.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/cadusu/btn_voltar.png"))); // NOI18N
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
        });

        tbl_usuarios.setForeground(new java.awt.Color(12, 69, 72));
        tbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome Usuário", "Senha", "Nome Completo", "Email", "Telefone"
            }
        ));
        tbl_usuarios.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_usuarios.setRowHeight(40);
        tbl_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_usuarios);

        btn_refresh.setText("Crescente");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_ordenar.setText("Decrescente");
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 21, 21));
        jLabel1.setText("Listagem de Usuários");

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/cadusu/btn_alterar.png"))); // NOI18N
        btn_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alterarMouseClicked(evt);
            }
        });

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/btn_excluir.png"))); // NOI18N
        btn_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_excluirMouseClicked(evt);
            }
        });

        lbl_tempo.setForeground(new java.awt.Color(21, 21, 21));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_tempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(201, 201, 201)
                        .addComponent(btn_voltar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_excluir)
                .addGap(140, 140, 140)
                .addComponent(btn_alterar)
                .addGap(266, 266, 266))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_voltar)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbl_tempo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_excluir)
                    .addComponent(btn_alterar))
                .addGap(73, 73, 73))
        );

        btn_sair.setOpaque(false);
        btn_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_sairLayout = new javax.swing.GroupLayout(btn_sair);
        btn_sair.setLayout(btn_sairLayout);
        btn_sairLayout.setHorizontalGroup(
            btn_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        btn_sairLayout.setVerticalGroup(
            btn_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(960, Short.MAX_VALUE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img_fundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(662, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1040, 792));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void refreshar(){
        ResultSet tabela;
        tabela = null;
        
        tabela = usu.listarusuarios();
        DefaultTableModel modelo = (DefaultTableModel) tbl_usuarios.getModel();
        modelo.setNumRows(0);
        
        try{
            do{
                modelo.addRow(new String[]{tabela.getString(1), tabela.getString(2), tabela.getString(3), tabela.getString(4), tabela.getString(5), tabela.getString(6)});
            }while(tabela.next());
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela "+erro);
        }
    }
    
    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        // TODO add your handling code here:
        FCreateUser create = new FCreateUser();
        create.user = user;
        create.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarMouseClicked

    private void tbl_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_usuariosMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_tbl_usuariosMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        refreshar();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloTabela = (DefaultTableModel) tbl_usuarios.getModel();
        int rowCount = modeloTabela.getRowCount();
        int colCount = modeloTabela.getColumnCount();

        // Extrair os dados da tabela para um array
        Object[][] data = new Object[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i][j] = modeloTabela.getValueAt(i, j);
            }
        }

        // Medir o tempo de ordenação com maior precisão
        long startTime = System.nanoTime();
        quickSort(data, 0, rowCount - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Atualizar a tabela com os dados ordenados
        modeloTabela.setRowCount(0); // Limpar a tabela
        for (Object[] row : data) {
            modeloTabela.addRow(row);
        }
        
        lbl_tempo.setText("Tempo de ordenação: " + duration / 1000 + " µs");
    }//GEN-LAST:event_btn_ordenarActionPerformed

     private void quickSort(Object[][] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    private int partition(Object[][] data, int low, int high) {
        int mid = low + (high - low) / 2;  // Calcula o índice do meio
        int pivot = Integer.parseInt(data[mid][0].toString());  // Pivô é o elemento do meio

        // Trocar o pivô com o último elemento
        Object[] temp = data[mid];
        data[mid] = data[high];
        data[high] = temp;

        int i = (low - 1);  // Índice do menor elemento

        for (int j = low; j < high; j++) {
            if (Integer.parseInt(data[j][0].toString()) > pivot) {  // Ordenar em ordem decrescente
                i++;

                // Trocar data[i] com data[j]
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        // Trocar data[i + 1] com data[high] (ou seja, o pivô)
        temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
    
    private void btn_alterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alterarMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tbl_usuarios.getModel();
       // modelo.setNumRows(0);

        int linhaSelecionada = tbl_usuarios.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um Usuário para Editar.");
            refreshar();
            return;
        } else {
        // Obtendo o ID da playlist selecionada a partir da tabela
   
      FEditUser FEdit = new FEditUser();
    
     //    Passando o ID da playlist para a próxima janela
        FEdit.user = user;
        FEdit.id = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
        FEdit.txt_nomeuser.setText(modelo.getValueAt(linhaSelecionada, 1).toString());
        FEdit.txt_senha.setText(modelo.getValueAt(linhaSelecionada, 2).toString());
        FEdit.txt_nome.setText(modelo.getValueAt(linhaSelecionada, 3).toString());
        FEdit.txt_email.setText(modelo.getValueAt(linhaSelecionada, 4).toString());
        FEdit.txt_telefone.setText(modelo.getValueAt(linhaSelecionada, 5).toString());
        
    
        FEdit.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btn_alterarMouseClicked

    private void btn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_sairMouseClicked

    private void btn_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_excluirMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tbl_usuarios.getModel();
       // modelo.setNumRows(0);

        int linhaSelecionada = tbl_usuarios.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um Usuário para Excluir.");
            refreshar();
            return;
        } else {
        // Obtendo o ID da playlist selecionada a partir da tabela
            
            String nome = modelo.getValueAt(linhaSelecionada, 3).toString();
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Deseja excluir o desenvolvedor "+nome+"??\n"+
                     "1 - Sim\n"+
                     "2 - Não"));
            switch(escolha){
                case 1:
                     usu.excluirusuario(Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString()));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Certo! O desenvolvedor " +nome+" não será Excluído!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
                    break;
            }
        }
    }//GEN-LAST:event_btn_excluirMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(FListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FListarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_alterar;
    private javax.swing.JLabel btn_excluir;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JPanel btn_sair;
    private javax.swing.JLabel btn_voltar;
    private javax.swing.JLabel img_fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tempo;
    private javax.swing.JTable tbl_usuarios;
    // End of variables declaration//GEN-END:variables
}
