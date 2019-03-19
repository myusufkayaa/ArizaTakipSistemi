/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arizatakip;


import java.awt.Color;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author myusu
 */
public class Giris extends javax.swing.JFrame {
static int hangiKullanici=-1; 
         
        
static  EntityManagerFactory emf =Persistence.createEntityManagerFactory("ArizaTakipPU");
static   EntityManager em=emf.createEntityManager(); 
static Query q=em.createQuery("SELECT k FROM Kullanicilar k");
static List <Kullanicilar> kullanicilar=q.getResultList();   

    public Giris() {
        kullanicilar=q.getResultList(); 
        
         initComponents();
        
        
    }
   
        

    

    void Uyari(){
        if (txtusername.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "KULLANICI ADI KISMI BOŞ !!", "HATA!!", 2);
        }else if (txtsifre.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "ŞİFRE KISMI BOŞ !!", "HATA!!", 2);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnykayit = new javax.swing.JButton();
        btngiris = new javax.swing.JButton();
        btnmkayit = new javax.swing.JButton();
        txtsifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(720, 405));
        setName("ARIZA TAKİP SİSTEMİ"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("KULLANICI GİRİŞ EKRANI");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kullanıcı Adı:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Şifre:");

        btnykayit.setText("YÖNETİCİ KAYIT");
        btnykayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnykayitActionPerformed(evt);
            }
        });

        btngiris.setText("GİRİŞ");
        btngiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisActionPerformed(evt);
            }
        });

        btnmkayit.setText("MÜŞERİ KAYIT");
        btnmkayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmkayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addComponent(txtsifre))
                            .addGap(138, 138, 138)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnmkayit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btngiris, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnykayit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmkayit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnykayit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btngiris, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void btnmkayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmkayitActionPerformed
     
        if (txtusername.getText().contains(" ")||txtsifre.getText().contains(" ")) {
            JOptionPane.showMessageDialog(null, "KULLANICI ADI VE ŞİFREDE BOŞLUK KULLANAMZSINIZ !!", "HATA!!", 2);
            return;
        }
        if (txtusername.getText().length()==0||txtsifre.getText().length()==0) {
            Uyari();
            return;
        }
        for (int i = 0; i < kullanicilar.size(); i++) {
            if (kullanicilar.get(i).getAdi().equals(txtusername.getText())) {
                JOptionPane.showMessageDialog(null, "KULLANICI ADI ZATEN VAR !!", "HATA!!", 2);
            return;
            }
        }
    try {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app","app");
        String sqlInsert ="INSERT INTO KULLANICILAR"
                + "(ADI,BIRIM_ID,KULLANICI_ID,SIFRE)"
                + "VALUES(?,?,?,?)";
        PreparedStatement psInsert=con.prepareStatement(sqlInsert);
        psInsert.setString(1, txtusername.getText());
        psInsert.setInt(2, 1);
        Random r=new Random();
        psInsert.setInt(3,r.nextInt(99));
        psInsert.setString(4, txtsifre.getText());
        psInsert.executeUpdate();
          con.commit();
        con.close();
        JOptionPane.showMessageDialog(null, "Müşteri Kaydedildi", "Tebrikler", 1);
         this.setVisible(false);
         
         Giris g=new Giris();
         g.setVisible(true);
    } catch (SQLException ex) {
        System.out.println(ex.getMessage()); 
    }
        
        
        
        
    }//GEN-LAST:event_btnmkayitActionPerformed

    private void btnykayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnykayitActionPerformed
                                           
       
        if (txtusername.getText().contains(" ")||txtsifre.getText().contains(" ")) {
            JOptionPane.showMessageDialog(null, "KULLANICI ADI VE ŞİFREDE BOŞLUK KULLANAMZSINIZ !!", "HATA!!", 2);
            return;
        }
        if (txtusername.getText().length()==0||txtsifre.getText().length()==0) {
            Uyari();
            return;
        }
        for (int i = 0; i < kullanicilar.size(); i++) {
            if (kullanicilar.get(i).getAdi().equals(txtusername.getText())) {
                JOptionPane.showMessageDialog(null, "KULLANICI ADI ZATEN VAR !!", "HATA!!", 2);
            return;
            }
        }
    try {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app","app");
        String sqlInsert ="INSERT INTO KULLANICILAR"
                + "(ADI,BIRIM_ID,KULLANICI_ID,SIFRE)"
                + "VALUES(?,?,?,?)";
        PreparedStatement psInsert=con.prepareStatement(sqlInsert);
        psInsert.setString(1, txtusername.getText());
        psInsert.setInt(2, 2);
        Random r=new Random();
        psInsert.setInt(3,r.nextInt(99999));
        psInsert.setString(4, txtsifre.getText());
        psInsert.executeUpdate();
        con.commit();
        con.close();
        JOptionPane.showMessageDialog(null, "Yönetici Kaydedildi", "Tebrikler", 1);
         this.setVisible(false);
         
         Giris g=new Giris();
         g.setVisible(true);
    } catch (SQLException ex) {
        System.out.println(ex.getMessage()); 
    }
        
        
    }//GEN-LAST:event_btnykayitActionPerformed

    private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisActionPerformed
        
        for (int i = 0; i < kullanicilar.size(); i++) {
            if (txtusername.getText().equals(kullanicilar.get(i).getAdi())) {
                if (txtsifre.getText().equals(kullanicilar.get(i).getSifre())) {
                    if (kullanicilar.get(i).getBirimId()==2) {
                        hangiKullanici=kullanicilar.get(i).getKullaniciId();
                        yoneticiPaneli y=new yoneticiPaneli();
                        y.setVisible(true);
                        this.setVisible(false);
                    }else{
                          hangiKullanici=kullanicilar.get(i).getKullaniciId();
                        musteriPaneli m=new musteriPaneli();
                        m.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            
        }
        if (hangiKullanici==-1) {
            JOptionPane.showMessageDialog(null, "BÖYLE BİR KULLANICI BULUNMAMAKTADIR","HATA", 2);
        }
    }//GEN-LAST:event_btngirisActionPerformed

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
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiris;
    private javax.swing.JButton btnmkayit;
    private javax.swing.JButton btnykayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtsifre;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
