import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.lang.IllegalArgumentException;
import javax.swing.JOptionPane;
class Tickets extends javax.swing.JFrame {

    public Tickets() {
        initComponents();
        cfn.setSelected(true);
        amn.setSelected(true);
        pcn.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        bntcomprar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        jbcp1 = new javax.swing.JComboBox();
        jbc1 = new javax.swing.JComboBox();
        jbcp2 = new javax.swing.JComboBox();
        jbc2 = new javax.swing.JComboBox();
        jbc3 = new javax.swing.JComboBox();
        jcb4 = new javax.swing.JComboBox();
        jcb5 = new javax.swing.JComboBox();
        jcb6 = new javax.swing.JComboBox();
        cfs = new javax.swing.JRadioButton();
        cfn = new javax.swing.JRadioButton();
        ams = new javax.swing.JRadioButton();
        amn = new javax.swing.JRadioButton();
        pcs = new javax.swing.JRadioButton();
        pcn = new javax.swing.JRadioButton();
        idp = new java.awt.Label();
        idtxt = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        label10 = new java.awt.Label();
        preciolabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        bntcomprar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bntcomprar.setText("Comprar");
        bntcomprar.setActionCommand("btncomprar");
        bntcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntcomprarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Felipe AV");

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("Compra de Tiquetes");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("Origen");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("Destino");

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("Fecha Salida:");

        label6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label6.setText("Fecha Retorno:");

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("Cliente Frecuente.");

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("Adulto mayor");

        label9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label9.setText("Primera Clase");

        jbcp1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belice - BZE", "Guatemala - GUA", "Guatemala - FRS", "El Salvador - SAL", "Honduras - TGU", "Honduras - SPS", "Honduras - RTB", "Nicaragua - MGA", "Costa Rica - SJO", "Costa Rica - LIR", "Panamá - PTY", "Panama - PAC", " " }));
        jbcp1.setKeySelectionManager(null);
        jbcp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcp1ActionPerformed(evt);
            }
        });

        jbc1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jbc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbc1ActionPerformed(evt);
            }
        });

        jbcp2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belice - BZE", "Guatemala - GUA", "Guatemala - FRS", "El Salvador - SAL", "Honduras - TGU", "Honduras - SPS", "Honduras - RTB", "Nicaragua - MGA", "Costa Rica - SJO", "Costa Rica - LIR", "Panamá - PTY", "Panama - PAC", " " }));
        jbcp2.setKeySelectionManager(null);
        jbcp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcp2ActionPerformed(evt);
            }
        });

        jbc2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jbc3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031" }));

        jcb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jcb5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jcb6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031" }));

        cfs.setText("S");
        cfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfsActionPerformed(evt);
            }
        });

        cfn.setText("N");
        cfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfnActionPerformed(evt);
            }
        });

        ams.setText("S");
        ams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amsActionPerformed(evt);
            }
        });

        amn.setText("N");
        amn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amnActionPerformed(evt);
            }
        });

        pcs.setText("S");
        pcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcsActionPerformed(evt);
            }
        });

        pcn.setText("N");
        pcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcnActionPerformed(evt);
            }
        });

        idp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idp.setText("ID Cliente:");

        btncalcular.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncalcular.setText("Calcular Precio");
        btncalcular.setActionCommand("btncomprar");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label10.setText("Total: ");

        preciolabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(jbcp1, 0, 161, Short.MAX_VALUE)
                                    .addComponent(jbcp2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jcb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbc1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbc2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcb5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jbc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(3, 3, 3)))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cfs)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cfn))
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ams)
                                        .addGap(10, 10, 10)
                                        .addComponent(amn))
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preciolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntcomprar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pcs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pcn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncalcular)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbcp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbcp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cfs)
                                    .addComponent(cfn)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ams)
                                    .addComponent(amn))))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcn)
                            .addComponent(pcs)
                            .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preciolabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        bntcomprar.getAccessibleContext().setAccessibleName("btncomprar");
        jbcp1.getAccessibleContext().setAccessibleName("jcbp1");
        jbc1.getAccessibleContext().setAccessibleName("jcb1");
        jbcp2.getAccessibleContext().setAccessibleName("jcbp2");
        jbc2.getAccessibleContext().setAccessibleName("jcb2");
        jbc3.getAccessibleContext().setAccessibleName("jcb3");
        jcb4.getAccessibleContext().setAccessibleName("jcb4");
        jcb5.getAccessibleContext().setAccessibleName("jcb5");
        jcb6.getAccessibleContext().setAccessibleName("jcb6");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcp1ActionPerformed

    private void jbcp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcp2ActionPerformed

    private void jbc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbc1ActionPerformed

    private void cfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfsActionPerformed
        cfn.setSelected(false);
    }//GEN-LAST:event_cfsActionPerformed

    private void bntcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntcomprarActionPerformed
        //llamado de la clase que guarda en jni,
        int origen=0, destino, d1, d2, m1, m2, a1, a2, fs, fr, cl=0, am=0, pc=0, idc=0, precio=0;
        idc= Integer.parseInt(idtxt.getText());
        origen = jbcp1.getSelectedIndex();
        destino = jbcp2.getSelectedIndex();
        //fecha salida
        d1= Integer.parseInt(jbc1.getSelectedItem().toString());
        m1 = Integer.parseInt(jbc2.getSelectedItem().toString());
        a1=Integer.parseInt(jbc3.getSelectedItem().toString());
        
        //fecha retorno
        d2 = Integer.parseInt(jbc1.getSelectedItem().toString());
        m2 = Integer.parseInt(jbc2.getSelectedItem().toString());
        a2 =Integer.parseInt(jbc3.getSelectedItem().toString());
        if(cfs.isSelected()){
            cl=1;
        }else if(cfn.isSelected()){
            cl=2;
        }
        if(ams.isSelected()){
            am=1;
        }else if (amn.isSelected()) {
            am=2;
        }
        if (pcs.isSelected()) {
            pc=1;
        }else if (pcn.isSelected()) {
            pc=2;
        }
        if(existe_fecha(d1,m1,a1) && existe_fecha(d2,m2,a2) && origen!=destino){
            fs = Integer.parseInt(jbc1.getSelectedItem().toString()+jbc2.getSelectedItem().toString()+jbc3.getSelectedItem().toString());
            fr = Integer.parseInt(jcb4.getSelectedItem().toString()+jcb5.getSelectedItem().toString()+jcb6.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Boleto con direccion a "+jbcp2.getSelectedItem().toString()+" el dia"+fs+" ha sido creado bajo el id Cliente de: "+idtxt.getText());
            TicketForce tf= new TicketForce();
            precio = Integer.parseInt(preciolabel.getText());
            if (precio!=0) {
                tf.placeTicket(idc, origen, destino, fs, fr, cl, am, pc, precio);
            }else{
                System.out.println("No se ha calculado el precio");
            }
            
        }else if (origen==destino) {
            JOptionPane.showMessageDialog(null, "El origen y el destino, no pueden ser los mismos");
        }
    }//GEN-LAST:event_bntcomprarActionPerformed

    private void cfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfnActionPerformed
        cfs.setSelected(false);
    }//GEN-LAST:event_cfnActionPerformed

    private void amsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amsActionPerformed
        amn.setSelected(false);
    }//GEN-LAST:event_amsActionPerformed

    private void amnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amnActionPerformed
        ams.setSelected(false);
    }//GEN-LAST:event_amnActionPerformed

    private void pcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcsActionPerformed
        pcn.setSelected(false);
    }//GEN-LAST:event_pcsActionPerformed

    private void pcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcnActionPerformed
        pcs.setSelected(false);
    }//GEN-LAST:event_pcnActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        TicketForce tf= new TicketForce();
        int origen=0, destino, cl=0, am=0, pc=0, idc=0, precio=0;
        origen = jbcp1.getSelectedIndex();
        destino = jbcp2.getSelectedIndex();
        
        if(cfs.isSelected()){
            cl=1;
        }else if(cfn.isSelected()){
            cl=2;
        }
        if(ams.isSelected()){
            am=1;
        }else if (amn.isSelected()) {
            am=2;
        }
        if (pcs.isSelected()) {
            pc=1;
        }else if (pcn.isSelected()) {
            pc=2;
        }
        precio = tf.calcular_precio(origen, destino,cl, am, pc);
        preciolabel.setText(Integer.toString(precio));
    }//GEN-LAST:event_btncalcularActionPerformed
 public boolean existe_fecha(int d, int m, int a){
     if (a < 1900) {
        throw new IllegalArgumentException("Año inválido.");
     }
     try{
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.set(Calendar.YEAR, a);
        calendar.set(Calendar.MONTH, m - 1); // [0,...,11]
        calendar.set(Calendar.DAY_OF_MONTH, d);
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println(sdf.format(date)); // 01/01/2016
     }catch(IllegalArgumentException e){
        JOptionPane.showMessageDialog(null, "Error, fecha no admitida"+e);
        return false;
     }
     return true;
    }
    
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
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amn;
    private javax.swing.JRadioButton ams;
    private javax.swing.JButton bntcomprar;
    private javax.swing.JButton btncalcular;
    private javax.swing.JRadioButton cfn;
    private javax.swing.JRadioButton cfs;
    private java.awt.Choice choice1;
    private java.awt.Label idp;
    private javax.swing.JTextField idtxt;
    private javax.swing.JComboBox jbc1;
    private javax.swing.JComboBox jbc2;
    private javax.swing.JComboBox jbc3;
    private javax.swing.JComboBox jbcp1;
    private javax.swing.JComboBox jbcp2;
    private javax.swing.JComboBox jcb4;
    private javax.swing.JComboBox jcb5;
    private javax.swing.JComboBox jcb6;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JRadioButton pcn;
    private javax.swing.JRadioButton pcs;
    private java.awt.Label preciolabel;
    // End of variables declaration//GEN-END:variables
}
