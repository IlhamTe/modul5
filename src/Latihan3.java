/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mutiara
 */
public class Latihan3 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan3
     */
    public Latihan3() {
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

        jLabel1 = new javax.swing.JLabel();
        Bilangan1 = new javax.swing.JTextField();
        Bilangan2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnkali = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        Operator = new javax.swing.JLabel();
        btnkurang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 110, 20);

        Bilangan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bilangan1);
        Bilangan1.setBounds(170, 60, 140, 30);

        Bilangan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan2ActionPerformed(evt);
            }
        });
        getContentPane().add(Bilangan2);
        Bilangan2.setBounds(170, 100, 140, 30);

        jLabel2.setText("Bilangan1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(74, 60, 70, 20);

        jLabel3.setText("Bilangan2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 80, 30);

        btnkali.setText("X");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkali);
        btnkali.setBounds(60, 170, 50, 50);

        btnbagi.setText(":");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnbagi);
        btnbagi.setBounds(140, 170, 50, 50);

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah);
        btntambah.setBounds(220, 170, 50, 50);

        Operator.setText("Operator");
        getContentPane().add(Operator);
        Operator.setBounds(164, 140, 50, 20);

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnkurang);
        btnkurang.setBounds(300, 170, 50, 50);

        jLabel5.setText("Hasil");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 234, 50, 20);

        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });
        getContentPane().add(Hasil);
        Hasil.setBounds(79, 260, 220, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        // TODO add your handling code here:
        double bil1 = Double.parseDouble(Bilangan1.getText());
        double bil2 = Double.parseDouble(Bilangan2.getText());
        int hasil2 = (int) (bil1 / bil2);
        Hasil.setText(String.valueOf(hasil2));
    }//GEN-LAST:event_btnbagiActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HasilActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil2 = bil1*bil2;
        Hasil.setText(String.valueOf(hasil2));
        
    }//GEN-LAST:event_btnkaliActionPerformed

    private void Bilangan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bilangan1ActionPerformed

    private void Bilangan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bilangan2ActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil2 = bil1+bil2;
        Hasil.setText(String.valueOf(hasil2));
        
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil2 = bil1-bil2;
        Hasil.setText(String.valueOf(hasil2));
    }//GEN-LAST:event_btnkurangActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bilangan1;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JLabel Operator;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}