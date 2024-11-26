/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;


public class lamanDua extends javax.swing.JFrame {
    private lamanTigaPak a;
    private lamanTigaTek b;
    private lamanTigaOto c;
    private lamanTigaMak d;
    private lamanTigaKos e;
    private lamanTigaSpo f;
    private lamanTigaPer g;
    private lamanTigaPera h;
    /**
     * Creates new form lamanDua
     */
    public lamanDua() {
        initComponents();
        a = new lamanTigaPak();
        b = new lamanTigaTek();
        c = new lamanTigaOto();
        d = new lamanTigaMak();
        e = new lamanTigaKos();
        f = new lamanTigaSpo();
        g = new lamanTigaPer();
        h = new lamanTigaPera();
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
        nama = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pakaian = new javax.swing.JRadioButton();
        kosmetik = new javax.swing.JRadioButton();
        teknologi = new javax.swing.JRadioButton();
        sport = new javax.swing.JRadioButton();
        otomotif = new javax.swing.JRadioButton();
        furniture = new javax.swing.JRadioButton();
        bahanMakanan = new javax.swing.JRadioButton();
        tukang = new javax.swing.JRadioButton();
        buttonlam2 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hai, Selamat Datang");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Hai, Selamat Datang");

        nama.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Adobe Fangsong Std R", 0, 12)); // NOI18N
        jLabel4.setText("Pilih kategori yang kamu suka :");

        pakaian.setText("Pakaian");
        pakaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pakaianActionPerformed(evt);
            }
        });

        kosmetik.setText("Kosmetik");
        kosmetik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosmetikActionPerformed(evt);
            }
        });

        teknologi.setText("Teknologi");
        teknologi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teknologiActionPerformed(evt);
            }
        });

        sport.setText("Olahraga");
        sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportActionPerformed(evt);
            }
        });

        otomotif.setText("Otomotif");
        otomotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otomotifActionPerformed(evt);
            }
        });

        furniture.setText("Perabotan");
        furniture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furnitureActionPerformed(evt);
            }
        });

        bahanMakanan.setText("Bahan Makanan");
        bahanMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bahanMakananActionPerformed(evt);
            }
        });

        tukang.setText("Peralatan Tukang");
        tukang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tukangActionPerformed(evt);
            }
        });

        buttonlam2.setText("Submit");
        buttonlam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonlam2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pakaian)
                    .addComponent(otomotif)
                    .addComponent(teknologi)
                    .addComponent(bahanMakanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tukang)
                    .addComponent(sport)
                    .addComponent(kosmetik)
                    .addComponent(furniture))
                .addGap(148, 148, 148))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(buttonlam2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kosmetik)
                    .addComponent(pakaian))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sport)
                    .addComponent(teknologi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otomotif)
                    .addComponent(furniture))
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tukang)
                    .addComponent(bahanMakanan))
                .addGap(44, 44, 44)
                .addComponent(buttonlam2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pakaianActionPerformed
        // TODO add your handling code here:
        if(pakaian.isSelected()){
            teknologi.setEnabled(false);
            otomotif.setEnabled(false);
            bahanMakanan.setEnabled(false);
            kosmetik.setEnabled(false);
            sport.setEnabled(false);
            furniture.setEnabled(false);
            tukang.setEnabled(false);
        }else{
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
        }
    }//GEN-LAST:event_pakaianActionPerformed

    private void teknologiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teknologiActionPerformed
        // TODO add your handling code here:
        if(teknologi.isSelected()){
            pakaian.setEnabled(false);
            otomotif.setEnabled(false);
            bahanMakanan.setEnabled(false);
            kosmetik.setEnabled(false);
            sport.setEnabled(false);
            furniture.setEnabled(false);
            tukang.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
        }
    }//GEN-LAST:event_teknologiActionPerformed

    private void sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportActionPerformed
        // TODO add your handling code here:
        if(sport.isSelected()){
            pakaian.setEnabled(false);
            teknologi.setEnabled(false);
            otomotif.setEnabled(false);
            bahanMakanan.setEnabled(false);
            kosmetik.setEnabled(false);
            furniture.setEnabled(false);
            tukang.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
        }
    }//GEN-LAST:event_sportActionPerformed

    private void bahanMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bahanMakananActionPerformed
        // TODO add your handling code here:
        if(bahanMakanan.isSelected()){
            pakaian.setEnabled(false);
            teknologi.setEnabled(false);
            otomotif.setEnabled(false);
            kosmetik.setEnabled(false);
            sport.setEnabled(false);
            furniture.setEnabled(false);
            tukang.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
        }
    }//GEN-LAST:event_bahanMakananActionPerformed

    private void buttonlam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonlam2ActionPerformed
        // TODO add your handling code here:
        if(pakaian.isSelected()){
            a.setVisible(true);
        }else if(teknologi.isSelected()){
            b.setVisible(true);
        }else if(otomotif.isSelected()){
            c.setVisible(true);
        }else if (bahanMakanan.isSelected()){
            d.setVisible(true);
        }else if (kosmetik.isSelected()){
            e.setVisible(true);
        }else if(sport.isSelected()){
            f.setVisible(true);
        }else if(furniture.isSelected()){
            g.setVisible(true);
        }else if(tukang.isSelected()){
            h.setVisible(true);
        }
    }//GEN-LAST:event_buttonlam2ActionPerformed

    private void otomotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otomotifActionPerformed
        // TODO add your handling code here:
        if(otomotif.isSelected()){
            pakaian.setEnabled(false);
            teknologi.setEnabled(false);
            bahanMakanan.setEnabled(false);
            kosmetik.setEnabled(false);
            sport.setEnabled(false);
            furniture.setEnabled(false);
            tukang.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
        }
    }//GEN-LAST:event_otomotifActionPerformed

    private void kosmetikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosmetikActionPerformed
        // TODO add your handling code here:
        if(kosmetik.isSelected()){
            pakaian.setEnabled(false);
            teknologi.setEnabled(false);
            otomotif.setEnabled(false);
            bahanMakanan.setEnabled(false);
            sport.setEnabled(false);
            furniture.setEnabled(false);
            tukang.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
        }
    }//GEN-LAST:event_kosmetikActionPerformed

    private void furnitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furnitureActionPerformed
        // TODO add your handling code here:
        if(furniture.isSelected()){
            pakaian.setEnabled(false);
            teknologi.setEnabled(false);
            otomotif.setEnabled(false);
            bahanMakanan.setEnabled(false);
            kosmetik.setEnabled(false);
            sport.setEnabled(false);
            tukang.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            tukang.setEnabled(true);
        }
    }//GEN-LAST:event_furnitureActionPerformed

    private void tukangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tukangActionPerformed
        // TODO add your handling code here:
         if(tukang.isSelected()){
            pakaian.setEnabled(false);
            teknologi.setEnabled(false);
            otomotif.setEnabled(false);
            bahanMakanan.setEnabled(false);
            kosmetik.setEnabled(false);
            sport.setEnabled(false);
            furniture.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
        }
    }//GEN-LAST:event_tukangActionPerformed

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
            java.util.logging.Logger.getLogger(lamanDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lamanDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lamanDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lamanDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lamanDua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bahanMakanan;
    private javax.swing.JButton buttonlam2;
    private javax.swing.JRadioButton furniture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton kosmetik;
    private javax.swing.JLabel nama;
    private javax.swing.JRadioButton otomotif;
    private javax.swing.JRadioButton pakaian;
    private javax.swing.JRadioButton sport;
    private javax.swing.JRadioButton teknologi;
    private javax.swing.JRadioButton tukang;
    // End of variables declaration//GEN-END:variables

    void nama(String nama1){
        nama.setText(nama1);
    }
}
