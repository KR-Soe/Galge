package vista;
//@author Soe

import java.applet.AudioClip;
import controladores.SaveLoad;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        SaveLoad SaveLoad = new SaveLoad();
        SaveLoad.getSave();
        this.setLocationRelativeTo(null); 
        this.setTitle("Geimuru");
        this.setVisible(true);
        buttonBorder();
        setResizable(false);
        flechas(); 
        soundB("backG");
        int h=600;
        int w= 920;
        setSize(w, h);      
        
    }
    public void buttonBorder(){
        btnPlay.setOpaque(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setBorderPainted(false);
        btnContinue.setOpaque(false);
        btnContinue.setContentAreaFilled(false);
        btnContinue.setBorderPainted(false);
        btnOptions.setOpaque(false);
        btnOptions.setContentAreaFilled(false);
        btnOptions.setBorderPainted(false);
        btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setBorderPainted(false);        
    }
    public void flechas(){
        flechaP.setVisible(false);
        flechaC.setVisible(false);
        flechaS.setVisible(false);
        flechaE.setVisible(false);
    }
    /////////////////////////////////////////////////////////
                        //////AUDIO/////
    String ruta ="/audio/";
    public void sound(String archivo){
        AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource(ruta+archivo+".wav"));
        sound.play();
    }
    public void soundB(String archivo){
        AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource(ruta+archivo+".wav"));
        sound.play();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flechaE = new javax.swing.JLabel();
        flechaS = new javax.swing.JLabel();
        flechaC = new javax.swing.JLabel();
        flechaP = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnOptions = new javax.swing.JButton();
        btnContinue = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 605));
        getContentPane().setLayout(null);

        flechaE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flechaE.setForeground(new java.awt.Color(255, 0, 255));
        flechaE.setText(">");
        getContentPane().add(flechaE);
        flechaE.setBounds(430, 440, 20, 30);

        flechaS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flechaS.setForeground(new java.awt.Color(255, 0, 255));
        flechaS.setText(">");
        getContentPane().add(flechaS);
        flechaS.setBounds(420, 380, 20, 30);

        flechaC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flechaC.setForeground(new java.awt.Color(255, 0, 255));
        flechaC.setText(">");
        getContentPane().add(flechaC);
        flechaC.setBounds(410, 320, 20, 30);

        flechaP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flechaP.setForeground(new java.awt.Color(255, 0, 255));
        flechaP.setText(">");
        getContentPane().add(flechaP);
        flechaP.setBounds(430, 260, 20, 30);

        btnPlay.setFont(new java.awt.Font("Bradley Hand ITC", 1, 28)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(255, 51, 255));
        btnPlay.setText("Play");
        btnPlay.setContentAreaFilled(false);
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.setOpaque(true);
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayMouseEntered(evt);
            }
        });
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay);
        btnPlay.setBounds(430, 260, 100, 35);

        btnOptions.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        btnOptions.setForeground(new java.awt.Color(255, 51, 255));
        btnOptions.setText("Config");
        btnOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOptionsMouseEntered(evt);
            }
        });
        btnOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsActionPerformed(evt);
            }
        });
        getContentPane().add(btnOptions);
        btnOptions.setBounds(420, 380, 110, 39);

        btnContinue.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        btnContinue.setForeground(new java.awt.Color(255, 51, 255));
        btnContinue.setText("Continue");
        btnContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinueMouseEntered(evt);
            }
        });
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinue);
        btnContinue.setBounds(410, 320, 140, 30);

        btnExit.setFont(new java.awt.Font("Bradley Hand ITC", 1, 23)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 255));
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(430, 440, 90, 39);

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Make your dream");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 180, 300, 50);

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gemuru");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 120, 220, 49);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/7deba3605fb956bfda448d11c2df1f6a.jpg"))); // NOI18N
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
        });
        getContentPane().add(background);
        background.setBounds(0, -350, 1730, 1150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
        SaveLoad SL = new SaveLoad();
        SL.getSave();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsActionPerformed
        // config
        sound("popup+runtitle");
        Opciones options = new Opciones();
        options.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnOptionsActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        sound("popup+runtitle");
        Game start = new Game();
        this.dispose();
        start.setVisible(true);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseEntered
        sound("news");
        flechas();
        flechaP.setVisible(true);
    }//GEN-LAST:event_btnPlayMouseEntered

    private void btnContinueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinueMouseEntered
        // TODO add your handling code here:
        sound("news");
        flechas();
        flechaC.setVisible(true);
    }//GEN-LAST:event_btnContinueMouseEntered

    private void btnOptionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOptionsMouseEntered
        // TODO add your handling code here:
        sound("news");
        flechas();
        flechaS.setVisible(true);
    }//GEN-LAST:event_btnOptionsMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        sound("news");
        flechas();
        flechaE.setVisible(true);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundMouseEntered

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOptions;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel flechaC;
    private javax.swing.JLabel flechaE;
    private javax.swing.JLabel flechaP;
    private javax.swing.JLabel flechaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
