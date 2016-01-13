/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import bll.Film;
import dal.FilmBewerking;
import javax.swing.JOptionPane;

/**
 *
 * @author Helix
 */
public class FilmToevoegen extends javax.swing.JFrame {

    private AdminPanel _aPanel;
    private Film _tempFilm;

    /**
     * Creates new form FilmToevoegen
     *
     *
     * @param a
     */
    public FilmToevoegen(AdminPanel a) {
        initComponents();
        this._aPanel = a;
    }

    public FilmToevoegen(AdminPanel a, Film f) {
        initComponents();
        this._aPanel = a;
        txtNaam.setText(f.getNaam());
        txtBeschrijving.setText(f.getBeschrijving());
        cbGenre.setSelectedItem(f.getGenre());
        txtFoto.setText(f.getFoto());
        txtPrijs.setText(Double.toString(f.getPrijs()));
        _tempFilm = f;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNaam = new javax.swing.JTextField();
        txtFoto = new javax.swing.JTextField();
        txtPrijs = new javax.swing.JTextField();
        btnOpslaan = new javax.swing.JButton();
        lblNaam = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblGenre = new javax.swing.JLabel();
        lblJaar = new javax.swing.JLabel();
        lblSpeelduur = new javax.swing.JLabel();
        cbGenre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBeschrijving = new javax.swing.JTextArea();
        btnAnnuleer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Film toevoegen");
        setResizable(false);

        txtFoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFotoKeyReleased(evt);
            }
        });

        btnOpslaan.setText("Opslaan");
        btnOpslaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpslaanActionPerformed(evt);
            }
        });

        lblNaam.setText("Naam");

        lblDirector.setText("Beschrijving");

        lblGenre.setText("Genre");

        lblJaar.setText("Foto");

        lblSpeelduur.setText("Prijs");

        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Comedy", "Fantasy", "Horror", "Drama", "Romance", "Documentary" }));

        txtBeschrijving.setColumns(20);
        txtBeschrijving.setLineWrap(true);
        txtBeschrijving.setRows(5);
        txtBeschrijving.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBeschrijvingKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtBeschrijving);

        btnAnnuleer.setText("Annuleer");
        btnAnnuleer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnuleerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDirector)
                            .addComponent(lblNaam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNaam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOpslaan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnnuleer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblJaar)
                            .addComponent(lblGenre)
                            .addComponent(lblSpeelduur))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFoto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbGenre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrijs, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNaam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDirector)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJaar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrijs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSpeelduur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpslaan)
                    .addComponent(btnAnnuleer))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpslaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpslaanActionPerformed

        if (txtNaam.getText().isEmpty() || txtBeschrijving.getText().isEmpty() || txtPrijs.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Gelieve alle velden in te vullen!");
        } else if (_tempFilm != null) {
            filmBewerken();
        } else {
            nieuweFilmToevoegen();
        }
    }//GEN-LAST:event_btnOpslaanActionPerformed

    private void nieuweFilmToevoegen() {
        Film f = new Film();
        f.setNaam(txtNaam.getText());
        f.setBeschrijving(txtBeschrijving.getText());
        f.setGenre(cbGenre.getSelectedItem().toString());
        f.setFoto(txtFoto.getText());
        try {
            f.setPrijs(Double.parseDouble(txtPrijs.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gelieve een getal in te geven!");
            return;
        }
        FilmBewerking.filmToevoegen(f);
        _aPanel.vulListBox();
        dispose();
    }

    private void filmBewerken() {
        Film f = new Film();
        f.setNaam(txtNaam.getText());
        f.setBeschrijving(txtBeschrijving.getText());
        f.setGenre(cbGenre.getSelectedItem().toString());
        f.setFoto(txtFoto.getText());
        try {
            f.setPrijs(Double.parseDouble(txtPrijs.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gelieve een getal in te geven!");
            return;
        }
        f.setId(_tempFilm.getId());
        FilmBewerking.filmWijzigen(f);
        _aPanel.vulListBox();
        dispose();
    }

    private void btnAnnuleerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnuleerActionPerformed
        dispose();
    }//GEN-LAST:event_btnAnnuleerActionPerformed

    private void txtBeschrijvingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBeschrijvingKeyReleased
        if (txtBeschrijving.getText().length() > 3000) {
            btnOpslaan.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Max 3000 characters", "Te lang", JOptionPane.OK_OPTION);
            txtBeschrijving.setText(txtBeschrijving.getText().substring(0, txtBeschrijving.getText().length() - 1));
        } else {
            btnOpslaan.setEnabled(true);
        }
    }//GEN-LAST:event_txtBeschrijvingKeyReleased

    private void txtFotoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFotoKeyReleased
        if (txtFoto.getText().length() > 2000) {
            btnOpslaan.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Max 2000 characters", "Te lang", JOptionPane.OK_OPTION);
            txtFoto.setText(txtFoto.getText().substring(0, txtFoto.getText().length() - 1));
        } else {
            btnOpslaan.setEnabled(true);
        }
    }//GEN-LAST:event_txtFotoKeyReleased

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
            java.util.logging.Logger.getLogger(FilmToevoegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmToevoegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmToevoegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmToevoegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

////        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FilmToevoegen().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuleer;
    private javax.swing.JButton btnOpslaan;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblJaar;
    private javax.swing.JLabel lblNaam;
    private javax.swing.JLabel lblSpeelduur;
    private javax.swing.JTextArea txtBeschrijving;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtPrijs;
    // End of variables declaration//GEN-END:variables
}
