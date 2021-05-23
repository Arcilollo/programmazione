package com.company;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    private Data today;
	private Garage garage;

    public Main() {
		initComponents();
		today = new Data(19, 5, 2021);
		garage = new Garage(10, 20, 20, 10, 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCarBtn = new javax.swing.JButton();
        todayLabel = new javax.swing.JLabel();
        removeVehicleBtn = new javax.swing.JButton();
        nextDayBtn = new javax.swing.JButton();
        carListLabel = new javax.swing.JLabel();
        motorbikeListLabel = new javax.swing.JLabel();
        addMotorbikeBtn = new javax.swing.JButton();
        carPlate = new javax.swing.JTextField();
        motorbikePlate = new javax.swing.JTextField();
        removePlate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Garage");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        addCarBtn.setText("Aggiungi automobile");
        addCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarBtnActionPerformed(evt);
            }
        });

        todayLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        todayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        todayLabel.setText("DD/MM/YYYY");
        todayLabel.setToolTipText("");
        todayLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        removeVehicleBtn.setText("Rimuovi veicolo");
        removeVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeVehicleBtnActionPerformed(evt);
            }
        });

        nextDayBtn.setText("Avanti di un giorno");
        nextDayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextDayBtnActionPerformed(evt);
            }
        });

        carListLabel.setText("LISTA AUTO");
        carListLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        motorbikeListLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        motorbikeListLabel.setText("LISTA MOTO");
        motorbikeListLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        addMotorbikeBtn.setText("Aggiungi motociclo");
        addMotorbikeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMotorbikeBtnActionPerformed(evt);
            }
        });

        carPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carPlateActionPerformed(evt);
            }
        });

        removePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(todayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextDayBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(carListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(motorbikeListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(removeVehicleBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addMotorbikeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carPlate)
                            .addComponent(motorbikePlate)
                            .addComponent(removePlate))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(todayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCarBtn)
                    .addComponent(carPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMotorbikeBtn)
                    .addComponent(motorbikePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeVehicleBtn)
                    .addComponent(removePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nextDayBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(motorbikeListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVehicleBtnActionPerformed
		JOptionPane.showConfirmDialog(rootPane, garage.removeVehicle(removePlate.getText(), today));
		carListLabel.setText(garage.viewCarList());
		motorbikeListLabel.setText(garage.viewMotorbikeList());
    }//GEN-LAST:event_removeVehicleBtnActionPerformed

    private void addCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarBtnActionPerformed
		garage.addVeichle(new Car(carPlate.getText(), 1, new Data(today.getDay(), today.getMonth(), today.getYear())));
		carListLabel.setText(garage.viewCarList());
    }//GEN-LAST:event_addCarBtnActionPerformed

    private void nextDayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextDayBtnActionPerformed
		today.nextDay();
		todayLabel.setText(today.toString());
    }//GEN-LAST:event_nextDayBtnActionPerformed
 
    private void addMotorbikeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMotorbikeBtnActionPerformed
        garage.addVeichle(new Motorbike(motorbikePlate.getText(), new Data(today.getDay(), today.getMonth(), today.getYear())));
		motorbikeListLabel.setText(garage.viewMotorbikeList());
    }//GEN-LAST:event_addMotorbikeBtnActionPerformed

    private void carPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carPlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carPlateActionPerformed

    private void removePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removePlateActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main menu = new Main();
				menu.todayLabel.setText(menu.today.toString());
				menu.carListLabel.setText(menu.garage.viewCarList());
				menu.motorbikeListLabel.setText(menu.garage.viewMotorbikeList());
				menu.setVisible(true);
				
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarBtn;
    private javax.swing.JButton addMotorbikeBtn;
    private javax.swing.JLabel carListLabel;
    private javax.swing.JTextField carPlate;
    private javax.swing.JLabel motorbikeListLabel;
    private javax.swing.JTextField motorbikePlate;
    private javax.swing.JButton nextDayBtn;
    private javax.swing.JTextField removePlate;
    private javax.swing.JButton removeVehicleBtn;
    private javax.swing.JLabel todayLabel;
    // End of variables declaration//GEN-END:variables
}
