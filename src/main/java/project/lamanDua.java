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
    
    total i = new total();
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
        jPanel3 = new javax.swing.JPanel();
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
        imgPak = new javax.swing.JLabel();
        imgTek = new javax.swing.JLabel();
        imgOto = new javax.swing.JLabel();
        imgKos = new javax.swing.JLabel();
        imgMak = new javax.swing.JLabel();
        imgSpo = new javax.swing.JLabel();
        imgPera = new javax.swing.JLabel();
        imgPer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hai, Selamat Datang");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 1024));

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));
        jPanel3.setForeground(new java.awt.Color(102, 255, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(1280, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
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

        imgPak.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\pakaian.jpeg"));
        imgPak.setText("imgPak");

        imgTek.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\tekno.jpeg"));
        imgTek.setText("imgTek");

        imgOto.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\pakaian.jpeg"));
        imgOto.setText("imgOto");

        imgKos.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\Kosmetik.jpeg"));
        imgKos.setPreferredSize(new java.awt.Dimension(300, 210));

        imgMak.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\makanan.jpeg"));

        imgSpo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\olahraga.jpeg"));

        imgPera.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\perabotan.jpeg"));

        imgPer.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\image\\peralatan.jpeg"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pakaian)
                            .addComponent(imgPak, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teknologi)
                            .addComponent(imgTek, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otomotif)
                            .addComponent(imgOto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgKos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kosmetik)
                            .addComponent(imgMak, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bahanMakanan)
                            .addComponent(sport)
                            .addComponent(imgSpo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(furniture)
                            .addComponent(tukang)
                            .addComponent(imgPera, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgPer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonlam2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pakaian)
                            .addComponent(kosmetik))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgPak, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgKos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teknologi)
                            .addComponent(bahanMakanan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgTek, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgMak, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(furniture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgPera, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tukang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgPer, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otomotif)
                    .addComponent(sport))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgOto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgSpo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(buttonlam2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Hai, Selamat Datang");

        name.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
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
            imgTek.setEnabled(false);
            imgOto.setEnabled(false);
            imgMak.setEnabled(false);
            imgKos.setEnabled(false);
            imgSpo.setEnabled(false);
            imgPera.setEnabled(false);
            imgPer.setEnabled(false);
        }else{
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
            imgTek.setEnabled(true);
            imgOto.setEnabled(true);
            imgMak.setEnabled(true);
            imgKos.setEnabled(true);
            imgSpo.setEnabled(true);
            imgPera.setEnabled(true);
            imgPer.setEnabled(true);
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
            imgPak.setEnabled(false);
            imgOto.setEnabled(false);
            imgMak.setEnabled(false);
            imgKos.setEnabled(false);
            imgSpo.setEnabled(false);
            imgPera.setEnabled(false);
            imgPer.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
            imgPak.setEnabled(true);
            imgOto.setEnabled(true);
            imgMak.setEnabled(true);
            imgKos.setEnabled(true);
            imgSpo.setEnabled(true);
            imgPera.setEnabled(true);
            imgPer.setEnabled(true);
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
            imgPak.setEnabled(false);
            imgOto.setEnabled(false);
            imgMak.setEnabled(false);
            imgKos.setEnabled(false);
            imgTek.setEnabled(false);
            imgPera.setEnabled(false);
            imgPer.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
            imgPak.setEnabled(true);
            imgOto.setEnabled(true);
            imgMak.setEnabled(true);
            imgKos.setEnabled(true);
            imgTek.setEnabled(true);
            imgPera.setEnabled(true);
            imgPer.setEnabled(true);
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
            imgPak.setEnabled(false);
            imgOto.setEnabled(false);
            imgSpo.setEnabled(false);
            imgKos.setEnabled(false);
            imgTek.setEnabled(false);
            imgPera.setEnabled(false);
            imgPer.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
            imgPak.setEnabled(true);
            imgOto.setEnabled(true);
            imgSpo.setEnabled(true);
            imgKos.setEnabled(true);
            imgTek.setEnabled(true);
            imgPera.setEnabled(true);
            imgPer.setEnabled(true);
        }
    }//GEN-LAST:event_bahanMakananActionPerformed

    private void buttonlam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonlam2ActionPerformed
        // TODO add your handling code here:
        if(pakaian.isSelected()){
            a.setVisible(true);
            a.nama(name.getText());
            a.totalHar(i.getInvoice());
        }else if(teknologi.isSelected()){
            b.setVisible(true);
            b.nama(name.getText());
            b.totalHar(i.getInvoice());
        }else if(otomotif.isSelected()){
            c.setVisible(true);
            c.nama(name.getText());
            c.totalHar(i.getInvoice());
        }else if (bahanMakanan.isSelected()){
            d.setVisible(true);
            d.nama(name.getText());
            d.totalHar(i.getInvoice());
        }else if (kosmetik.isSelected()){
            e.setVisible(true);
            e.nama(name.getText());
            e.totalHar(i.getInvoice());
        }else if(sport.isSelected()){
            f.setVisible(true);
            f.nama(name.getText());
            f.totalHar(i.getInvoice());
        }else if(furniture.isSelected()){
            g.setVisible(true);
            g.nama(name.getText());
            g.totalHar(i.getInvoice());
        }else if(tukang.isSelected()){
            h.setVisible(true);
            h.nama(name.getText());
            h.totalHar(i.getInvoice());
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
            imgPak.setEnabled(false);
            imgMak.setEnabled(false);
            imgSpo.setEnabled(false);
            imgKos.setEnabled(false);
            imgTek.setEnabled(false);
            imgPera.setEnabled(false);
            imgPer.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
            imgPak.setEnabled(true);
            imgMak.setEnabled(true);
            imgSpo.setEnabled(true);
            imgKos.setEnabled(true);
            imgTek.setEnabled(true);
            imgPera.setEnabled(true);
            imgPer.setEnabled(true);
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
            imgPak.setEnabled(false);
            imgMak.setEnabled(false);
            imgSpo.setEnabled(false);
            imgOto.setEnabled(false);
            imgTek.setEnabled(false);
            imgPera.setEnabled(false);
            imgPer.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            tukang.setEnabled(true);
            imgPak.setEnabled(true);
            imgMak.setEnabled(true);
            imgSpo.setEnabled(true);
            imgOto.setEnabled(true);
            imgTek.setEnabled(true);
            imgPera.setEnabled(true);
            imgPer.setEnabled(true);
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
            imgPak.setEnabled(false);
            imgMak.setEnabled(false);
            imgSpo.setEnabled(false);
            imgOto.setEnabled(false);
            imgTek.setEnabled(false);
            imgKos.setEnabled(false);
            imgPer.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            tukang.setEnabled(true);
            imgPak.setEnabled(true);
            imgMak.setEnabled(true);
            imgSpo.setEnabled(true);
            imgOto.setEnabled(true);
            imgTek.setEnabled(true);
            imgKos.setEnabled(true);
            imgPer.setEnabled(true);
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
            imgPak.setEnabled(false);
            imgMak.setEnabled(false);
            imgSpo.setEnabled(false);
            imgOto.setEnabled(false);
            imgTek.setEnabled(false);
            imgKos.setEnabled(false);
            imgPera.setEnabled(false);
        }else{
            pakaian.setEnabled(true);
            teknologi.setEnabled(true);
            otomotif.setEnabled(true);
            bahanMakanan.setEnabled(true);
            kosmetik.setEnabled(true);
            sport.setEnabled(true);
            furniture.setEnabled(true);
            imgPak.setEnabled(true);
            imgMak.setEnabled(true);
            imgSpo.setEnabled(true);
            imgOto.setEnabled(true);
            imgTek.setEnabled(true);
            imgKos.setEnabled(true);
            imgPera.setEnabled(true);
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
    private javax.swing.JLabel imgKos;
    private javax.swing.JLabel imgMak;
    private javax.swing.JLabel imgOto;
    private javax.swing.JLabel imgPak;
    private javax.swing.JLabel imgPer;
    private javax.swing.JLabel imgPera;
    private javax.swing.JLabel imgSpo;
    private javax.swing.JLabel imgTek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton kosmetik;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton otomotif;
    private javax.swing.JRadioButton pakaian;
    private javax.swing.JRadioButton sport;
    private javax.swing.JRadioButton teknologi;
    private javax.swing.JRadioButton tukang;
    // End of variables declaration//GEN-END:variables

    void nama(String nama1){
        name.setText(nama1);
    }
}
