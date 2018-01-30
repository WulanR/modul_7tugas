
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Frame1 extends javax.swing.JFrame {
    String temp ="";
    Double ti, bt, h1;

    public Frame1(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BeratBadan = new javax.swing.JTextField();
        Pr = new javax.swing.JRadioButton();
        Lk = new javax.swing.JRadioButton();
        Hitung = new javax.swing.JButton();
        Coba = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Ideal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Hasil1 = new javax.swing.JTextField();
        Hasil2 = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(153, 19, 87, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(64, 54, 27, 14);

        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(63, 85, 28, 14);

        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(64, 117, 59, 14);

        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(64, 156, 63, 14);
        getContentPane().add(Nama);
        Nama.setBounds(150, 50, 130, 30);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(149, 82, 70, 30);

        jLabel7.setText("cm");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(223, 85, 13, 14);

        jLabel8.setText("kg");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(223, 117, 11, 14);
        getContentPane().add(BeratBadan);
        BeratBadan.setBounds(149, 114, 70, 30);

        Pr.setText("Perempuan");
        getContentPane().add(Pr);
        Pr.setBounds(186, 152, 79, 23);

        Lk.setText("Laki-laki");
        getContentPane().add(Lk);
        Lk.setBounds(267, 152, 63, 23);

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(87, 182, 63, 23);

        Coba.setText("Coba Lagi");
        Coba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobaActionPerformed(evt);
            }
        });
        getContentPane().add(Coba);
        Coba.setBounds(168, 182, 79, 23);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(265, 182, 63, 23);

        jLabel9.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(77, 226, 146, 14);

        Ideal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdealActionPerformed(evt);
            }
        });
        getContentPane().add(Ideal);
        Ideal.setBounds(230, 220, 50, 30);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 230, 20, 20);

        jLabel11.setText("Hasil Dianogsa Kesehatan");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(154, 273, 123, 14);

        Hasil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil1ActionPerformed(evt);
            }
        });
        getContentPane().add(Hasil1);
        Hasil1.setBounds(30, 290, 370, 30);
        getContentPane().add(Hasil2);
        Hasil2.setBounds(30, 330, 370, 30);

        setBounds(0, 0, 439, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void Hasil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hasil1ActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        if(Nama.getText().equals("") || Tinggi.getText().equals("") || BeratBadan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data inputkan harus diisi");
        }else if(Pr.isSelected() || Lk.isSelected()){
            try{
                Proses();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data inputan salah");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Jenis kelamin belum dipilih");
        }
    }//GEN-LAST:event_HitungActionPerformed

    private void CobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobaActionPerformed
        Nama.setText("");
        Tinggi.setText("");
        BeratBadan.setText("");
        Ideal.setText("");
        Hasil1.setText("");
        Hasil2.setText("");
        buttonGroup2.clearSelection();
        Pr.setSelected(false);
        Lk.setSelected(false);
    }//GEN-LAST:event_CobaActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void IdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdealActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BeratBadan;
    private javax.swing.JButton Coba;
    private javax.swing.JTextField Hasil1;
    private javax.swing.JTextField Hasil2;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Ideal;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton Lk;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton Pr;
    private javax.swing.JTextField Tinggi;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        ti = Double.valueOf(Tinggi.getText());
        bt = Double.valueOf(BeratBadan.getText());
        
        if(Lk.isSelected()){
            h1 = (ti - 100) * 1;
        }else if(Pr.isSelected()){
            h1 = (ti - 104) * 1;
        }
        temp = Double.toString(h1.intValue());
        
        if (h1 < bt){
            Ideal.setText(temp);
            Hasil1.setText("Maaf " + Nama.getText() + " , Sepertinya anda overweight :( ");
            Hasil2.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
        }else if (h1 > bt){
            Ideal.setText(temp);
            Hasil1.setText("Maaf " + Nama.getText() + " , Sepertinya anda underweight :( ");
            Hasil2.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        }else{
            Ideal.setText(temp);
            Hasil1.setText("Hallo " + Nama.getText() + " , Berat badan anda sudah ideal :( ");
            Hasil2.setText("Lanjutkan pola makan teratur dan gaya hidup sehat :) ");
        }
    }
}
