/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicine.FrontEnd;

import javax.swing.JFrame;

/**
 *
 * @author Apirak Oulis
 */
public class LOGIN extends javax.swing.JFrame {

    
    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
                this.setLocationRelativeTo(null); // set center on my screen 
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
        HEADER = new javax.swing.JLabel();
        TAB_WINDOW = new javax.swing.JPanel();
        MIN = new javax.swing.JLabel();
        CLOSE = new javax.swing.JLabel();
        LOGIN_LAYER = new javax.swing.JPanel();
        TEXT_LOGIN = new javax.swing.JLabel();
        BOX_ID = new javax.swing.JTextField();
        BOX_PW = new javax.swing.JPasswordField();
        Button_LOGIN = new javax.swing.JButton();
        Button_CANCLE = new javax.swing.JButton();
        TEXT_ID = new javax.swing.JLabel();
        TEXT_PW = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        PIC_LEFT = new javax.swing.JPanel();
        GIF_0 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setTitle("LOGIN");
        setBounds(new java.awt.Rectangle(60, 122, 60, 122));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 650));
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        getContentPane().setLayout(null);

        HEADER.setBackground(new java.awt.Color(140, 163, 65));
        HEADER.setFont(new java.awt.Font("OCR A Std", 1, 48)); // NOI18N
        HEADER.setForeground(new java.awt.Color(187, 127, 187));
        HEADER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADER.setText("Medicine CENTRE");
        getContentPane().add(HEADER);
        HEADER.setBounds(10, 60, 670, 100);

        TAB_WINDOW.setBackground(new java.awt.Color(0, 153, 153));
        TAB_WINDOW.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MIN.setBackground(new java.awt.Color(0, 255, 51));
        MIN.setDisplayedMnemonic('3');
        MIN.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        MIN.setForeground(new java.awt.Color(51, 255, 204));
        MIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MIN.setText("-");
        MIN.setToolTipText("Minimize");
        MIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINMouseClicked(evt);
            }
        });

        CLOSE.setBackground(new java.awt.Color(160, 63, 65));
        CLOSE.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(51, 255, 204));
        CLOSE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CLOSE.setText("X");
        CLOSE.setToolTipText("Close");
        CLOSE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLOSEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TAB_WINDOWLayout = new javax.swing.GroupLayout(TAB_WINDOW);
        TAB_WINDOW.setLayout(TAB_WINDOWLayout);
        TAB_WINDOWLayout.setHorizontalGroup(
            TAB_WINDOWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB_WINDOWLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(MIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        TAB_WINDOWLayout.setVerticalGroup(
            TAB_WINDOWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_WINDOWLayout.createSequentialGroup()
                .addGroup(TAB_WINDOWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MIN)
                    .addComponent(CLOSE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MIN.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(TAB_WINDOW);
        TAB_WINDOW.setBounds(290, 0, 410, 40);

        LOGIN_LAYER.setBackground(new java.awt.Color(51, 51, 51));

        TEXT_LOGIN.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        TEXT_LOGIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXT_LOGIN.setText("~ LOGIN ~");

        BOX_ID.setToolTipText("Enter Your ID");
        BOX_ID.setActionCommand("<Not Set>");
        BOX_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 1, 1, 5, new javax.swing.ImageIcon(getClass().getResource("/Medicine/FrontEnd/Images/BG_LOGIN.png")))); // NOI18N
        BOX_ID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BOX_ID.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BOX_ID.setName("scsc"); // NOI18N
        BOX_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOX_IDActionPerformed(evt);
            }
        });

        BOX_PW.setToolTipText("PASSWORD");
        BOX_PW.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 1, 1, 5, new javax.swing.ImageIcon(getClass().getResource("/Medicine/FrontEnd/Images/BG_LOGIN.png")))); // NOI18N
        BOX_PW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOX_PWActionPerformed(evt);
            }
        });

        Button_LOGIN.setText("SIGN IN");
        Button_LOGIN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_LOGIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_LOGINMouseClicked(evt);
            }
        });
        Button_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LOGINActionPerformed(evt);
            }
        });

        Button_CANCLE.setText("CANCLE");
        Button_CANCLE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_CANCLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CANCLEMouseClicked(evt);
            }
        });
        Button_CANCLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CANCLEActionPerformed(evt);
            }
        });

        TEXT_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TEXT_ID.setText("USER  :");

        TEXT_PW.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TEXT_PW.setText("Password :");

        jButton1.setText("create new account >> click");
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/FrontEnd/Images/BG_LOGIN.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/FrontEnd/Images/GIF1.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout LOGIN_LAYERLayout = new javax.swing.GroupLayout(LOGIN_LAYER);
        LOGIN_LAYER.setLayout(LOGIN_LAYERLayout);
        LOGIN_LAYERLayout.setHorizontalGroup(
            LOGIN_LAYERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN_LAYERLayout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(LOGIN_LAYERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGIN_LAYERLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(TEXT_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LOGIN_LAYERLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TEXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BOX_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LOGIN_LAYERLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TEXT_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BOX_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LOGIN_LAYERLayout.createSequentialGroup()
                        .addComponent(Button_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Button_CANCLE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LOGIN_LAYERLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LOGIN_LAYERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LOGIN_LAYERLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LOGIN_LAYERLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        LOGIN_LAYERLayout.setVerticalGroup(
            LOGIN_LAYERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN_LAYERLayout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addComponent(TEXT_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LOGIN_LAYERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOX_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(LOGIN_LAYERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEXT_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOX_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(LOGIN_LAYERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CANCLE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        BOX_ID.getAccessibleContext().setAccessibleName("ID");

        getContentPane().add(LOGIN_LAYER);
        LOGIN_LAYER.setBounds(290, 40, 410, 610);

        PIC_LEFT.setBackground(new java.awt.Color(57, 57, 57));
        PIC_LEFT.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        GIF_0.setBackground(new java.awt.Color(255, 255, 255));
        GIF_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIF_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/FrontEnd/Images/GIF1.gif"))); // NOI18N
        GIF_0.setText("jLabel7");

        javax.swing.GroupLayout PIC_LEFTLayout = new javax.swing.GroupLayout(PIC_LEFT);
        PIC_LEFT.setLayout(PIC_LEFTLayout);
        PIC_LEFTLayout.setHorizontalGroup(
            PIC_LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PIC_LEFTLayout.createSequentialGroup()
                .addComponent(GIF_0, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PIC_LEFTLayout.setVerticalGroup(
            PIC_LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PIC_LEFTLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(GIF_0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        getContentPane().add(PIC_LEFT);
        PIC_LEFT.setBounds(0, 0, 290, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        // TODO add your handling code here:

    }//GEN-LAST:event_formAncestorResized

    private void BOX_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOX_IDActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_BOX_IDActionPerformed

    private void BOX_PWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOX_PWActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BOX_PWActionPerformed

    private void CLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseClicked
      
        System.exit(0);
        
    }//GEN-LAST:event_CLOSEMouseClicked

    private void MINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseClicked
       
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MINMouseClicked

    private void Button_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LOGINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_LOGINActionPerformed

    private void Button_CANCLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CANCLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_CANCLEActionPerformed

    private void Button_LOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LOGINMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_LOGINMouseClicked

    private void Button_CANCLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CANCLEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_CANCLEMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LOGIN().setVisible(true);
        });
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BOX_ID;
    private javax.swing.JPasswordField BOX_PW;
    private javax.swing.JButton Button_CANCLE;
    private javax.swing.JButton Button_LOGIN;
    private javax.swing.JLabel CLOSE;
    private javax.swing.JLabel GIF_0;
    private javax.swing.JLabel HEADER;
    private javax.swing.JPanel LOGIN_LAYER;
    private javax.swing.JLabel MIN;
    private javax.swing.JPanel PIC_LEFT;
    private javax.swing.JPanel TAB_WINDOW;
    private javax.swing.JLabel TEXT_ID;
    private javax.swing.JLabel TEXT_LOGIN;
    private javax.swing.JLabel TEXT_PW;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

/*
class musicLogin{
    void playmusic(String musicLocation){
        
        try {
            File musicPath = new File(musicLocation);
            
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(clip.LOOP_CONTINUOUSLY);
                
                JOptionPane.showMessageDialog(null, "หยุดดดดดดดดดด");
                long clipTimePosition = clip.getMicrosecondPosition();
                clip.stop();
                
                JOptionPane.showMessageDialog(null, "ปลาหยุดดดดดดดดดดดดดดดด");
                clip.setMicrosecondPosition(clipTimePosition);
                clip.start();
                
                JOptionPane.showMessageDialog(null,"ยุทย?");
            }
            else{
                System.out.println("ERROR");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
*/

//class PlayMusic {
//   
//}