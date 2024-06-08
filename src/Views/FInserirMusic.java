/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Playlists;
import Models.Conexao;
import java.sql.Time;
import java.time.LocalTime;

/**
 *
 * @author fatec-dsm2
 */
public class FInserirMusic extends javax.swing.JFrame {

    /**
     * Creates new form FInserirMusic
     */
    public FInserirMusic() {
        initComponents();
    }
    
    Conexao conexaoDB = new Conexao();
    Playlists play = new Playlists();
    
    private int idPlaylist;
    // Método para definir o ID da playlist
    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }
    public int getIdPlaylist() {
        return idPlaylist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_fundo = new javax.swing.JLabel();
        btn_sair = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_inserirmusica = new javax.swing.JLabel();
        txt_musica = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_artista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_visualizar = new javax.swing.JLabel();
        lbl_playlist = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JLabel();
        txt_duracao = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        img_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/menu/nav_menu.png"))); // NOI18N

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
            .addGap(0, 45, Short.MAX_VALUE)
        );
        btn_sairLayout.setVerticalGroup(
            btn_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/playlists/img_musicas.png"))); // NOI18N

        btn_inserirmusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/playlists/btn_inserir.png"))); // NOI18N
        btn_inserirmusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inserirmusicaMouseClicked(evt);
            }
        });

        txt_musica.setBackground(new java.awt.Color(12, 69, 72));
        txt_musica.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_musica.setForeground(new java.awt.Color(255, 255, 255));
        txt_musica.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_musicaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 21, 21));
        jLabel3.setText("Música:");

        txt_artista.setBackground(new java.awt.Color(12, 69, 72));
        txt_artista.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_artista.setForeground(new java.awt.Color(255, 255, 255));
        txt_artista.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_artistaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 21, 21));
        jLabel4.setText("Artista:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 21, 21));
        jLabel5.setText("Duração:");

        txt_ano.setBackground(new java.awt.Color(12, 69, 72));
        txt_ano.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_ano.setForeground(new java.awt.Color(255, 255, 255));
        txt_ano.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 21, 21));
        jLabel6.setText("Ano:");

        btn_visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/playlists/btn_visualizargrande.png"))); // NOI18N
        btn_visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_visualizarMouseClicked(evt);
            }
        });

        lbl_playlist.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_playlist.setForeground(new java.awt.Color(21, 21, 21));
        lbl_playlist.setText("Placeholder");

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/cadusu/btn_voltar.png"))); // NOI18N
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_voltarMouseEntered(evt);
            }
        });

        txt_duracao.setBackground(new java.awt.Color(12, 69, 72));
        txt_duracao.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txt_duracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(lbl_playlist)
                .addGap(330, 330, 330)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_duracao)
                        .addGap(1337, 1337, 1337))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btn_inserirmusica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_ano, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_artista))
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btn_visualizar)))
                        .addGap(757, 757, 757))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_musica, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_musica, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_artista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btn_inserirmusica)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_voltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_playlist)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_visualizar)
                .addGap(76, 76, 76)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(960, Short.MAX_VALUE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(786, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img_fundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(671, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1021, 796));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_sairMouseClicked

    private void txt_musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_musicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_musicaActionPerformed

    private void txt_artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_artistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_artistaActionPerformed

    private void txt_anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anoActionPerformed

    private void btn_visualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_visualizarMouseClicked
        // TODO add your handling code here:
        FVisualizarMusicas FVisu = new FVisualizarMusicas();
    
     //    Passando o ID da playlist para a próxima janela
        FVisu.setIdPlaylist(idPlaylist);
        FVisu.lbl_nomePlaylist.setText(lbl_playlist.getText());
    
        FVisu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_visualizarMouseClicked

    private void btn_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_voltarMouseEntered

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        // TODO add your handling code here:
        new FPlaylist().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarMouseClicked

    private void btn_inserirmusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inserirmusicaMouseClicked
        // TODO add your handling code here:
        
        LocalTime duracao = LocalTime.parse(txt_duracao.getText());
    
        play.inserir_musica(txt_musica.getText(), txt_artista.getText(), duracao, Integer.parseInt(txt_ano.getText()), idPlaylist);
        txt_musica.setText("");
        txt_artista.setText("");
        txt_duracao.setText("");
        txt_ano.setText("");
        
        
    }//GEN-LAST:event_btn_inserirmusicaMouseClicked

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
            java.util.logging.Logger.getLogger(FInserirMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FInserirMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FInserirMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FInserirMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FInserirMusic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_inserirmusica;
    private javax.swing.JPanel btn_sair;
    private javax.swing.JLabel btn_visualizar;
    private javax.swing.JLabel btn_voltar;
    private javax.swing.JLabel img_fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbl_playlist;
    private javax.swing.JTextField txt_ano;
    private javax.swing.JTextField txt_artista;
    private javax.swing.JFormattedTextField txt_duracao;
    private javax.swing.JTextField txt_musica;
    // End of variables declaration//GEN-END:variables
}
